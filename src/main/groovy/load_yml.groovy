import groovy.transform.ToString
import org.yaml.snakeyaml.Yaml

Yaml parser = new Yaml()
Config config = parser.load(("../resources/application.yml" as File).text)

println config.database

@ToString(includeNames=true)
class Config{
    Database database;
}

@ToString(includeNames=true)
class Database {
    String url;
    String username;
    String password;

}