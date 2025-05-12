# .env 파일 로드
Get-Content .env | ForEach-Object {
    if ($_ -match '^\s*#') { return }  # 주석 무시
    if ($_ -match '^\s*$') { return }  # 빈 줄 무시
    $parts = $_ -split '=', 2
    if ($parts.Length -eq 2) {
        [System.Environment]::SetEnvironmentVariable($parts[0], $parts[1])
    }
}

# Docker Compose 실행
docker-compose up -d

# Spring Boot 실행
.\gradlew.bat bootRun
