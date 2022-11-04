Imported dependencies:
- implementation 'org.springframework.boot:spring-boot-starter-web'
- implementation 'io.springfox:springfox-boot-starter:3.0.0'
- implementation 'io.springfox:springfox-swagger-ui:3.0.0'



Cannot run error, solution:
- in application.properties:
    - spring.mvc.pathmatch.matching-strategy=ant_path_matcher



After running open:
- http://localhost:8080/v2/api-docs (json version, no ui)
- http://localhost:8080/swagger-ui/ (UI version)
