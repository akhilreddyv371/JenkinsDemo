// vars/loadConfig.groovy
import groovy.json.JsonSlurper

def call(String fileName) {
    def fileContent = libraryResource(fileName) // Reads the file from resources/
    return new JsonSlurper().parseText(fileContent)
}
