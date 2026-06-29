INSERT INTO users (email, password, nickname, profile_image, created_at) VALUES ('chris@test.com', '1234', 'Chris', null, now());
INSERT INTO users (email, password, nickname, profile_image, created_at) VALUES ('alice@test.com', '1234', 'Alice', null, now());

INSERT INTO posts (author_id, title, content, image, view_count, created_at) VALUES (1, '첫 번째 게시글', '안녕하세요.', null, 0, now());
INSERT INTO posts (author_id, title, content, image, view_count, created_at) VALUES (2, '두 번째 게시글', 'Spring Boot 공부중', null, 0, now());

INSERT INTO comments (post_id, author_id, parent_id, content, created_at) VALUES (1, 2, null, '댓글입니다!', now());
INSERT INTO comments (post_id, author_id, parent_id, content, created_at) VALUES (1, 1, 1, '대댓글입니다!', now());

INSERT INTO post_likes (post_id, user_id, created_at) VALUES (1, 2, now());