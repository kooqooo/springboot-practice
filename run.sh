#!/bin/bash

# 환경변수 자동 export 시작
set -a
source .env
set +a

# MySQL 컨테이너 실행
docker-compose up -d

# Spring Boot 실행
./gradlew bootRun
