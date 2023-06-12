INSERT INTO Users(name)
VALUES ('John Smith'),
       ('Emma Johnson'),
       ('Michael Brown'),
       ('Olivia Davis'),
       ('William Wilson'),
       ('Sophia Martinez'),
       ('James Taylor'),
       ('Daniel Lee'),
       ('Mia Thomas');


INSERT INTO Post (title, content, author, user_id)
VALUES ('Exciting Adventure',
        'Embarking on thrilling adventures around the world, seeking adrenaline and unforgettable experiences.',
        'John Smith', 1),
       ('Delicious Recipes',
        'Discovering mouthwatering recipes from different cuisines and exploring the art of cooking.', 'Emma Johnson',
        2),
       ('The Art of Photography',
        'Exploring the world of photography, from composition techniques to advanced post-processing.',
        'Michael Brown', 3),
       ('Gardening Tips and Tricks',
        'Sharing practical tips and tricks for gardening enthusiasts to nurture beautiful plants and landscapes.',
        'Olivia Davis', 4),
       ('Fitness Journey',
        'Documenting the personal journey towards achieving physical fitness and overall well-being.',
        'William Wilson', 5),
       ('Exploring New Horizons',
        'Venturing into uncharted territories, discovering new cultures, and embracing diversity.', 'Sophia Martinez',
        6),
       ('Life Lessons', 'Reflecting on valuable life lessons learned through experiences and personal growth.',
        'James Taylor', 7),
       ('Creative Writing',
        'Unleashing creativity through various writing styles, storytelling techniques, and literary exploration.',
        'James Taylor', 7),
       ('Healthy Living',
        'Promoting a holistic approach to living a healthy lifestyle, encompassing nutrition, fitness, and mental well-being.',
        'Daniel Lee', 8),
       ('Tech Innovations', 'Exploring the latest technological advancements and innovations shaping the future.',
        'Mia Thomas', 9);

INSERT INTO comment (name, post_id)
VALUES ('Great post!', 1),
       ('I completely agree with you.', 1),
       ('Thanks for sharing this valuable information.', 2),
       ('Beautifully written!', 3),
       ('I learned a lot from this post.', 4),
       ('Keep up the good work!', 5),
       ('This inspired me to start gardening.', 4),
       ('I m excited to try out your recipe.', 2),
       ('Amazing photography!', 3),
       ('I enjoyed reading this.', 6);

