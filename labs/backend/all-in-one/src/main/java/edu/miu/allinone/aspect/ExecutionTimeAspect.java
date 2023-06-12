package edu.miu.allinone.aspect;

import edu.miu.allinone.entity.Logger;
import edu.miu.allinone.service.LoggerService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Aspect
@Component
public class ExecutionTimeAspect {

    private final LoggerService loggerService;

    @Autowired
    public ExecutionTimeAspect(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @Pointcut("@annotation(edu.miu.allinone.aspect.annotation.ExecutionTime)")
    public void executionTimePointcut() {
    }

    @Around("executionTimePointcut()")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        String methodName = joinPoint.getSignature().getName();
        String transactionId = "fakeTransactionId";
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        String principle = "fakePrinciple";
        String operation = joinPoint.getSignature().toShortString();

        Logger logger = new Logger(null, transactionId, date, time, principle, operation);
        loggerService.saveLogger(logger);

        long executionTime = endTime - startTime;
        System.out.println("Execution Time of " + methodName + ": " + executionTime + "ms");

        return result;
    }
}
