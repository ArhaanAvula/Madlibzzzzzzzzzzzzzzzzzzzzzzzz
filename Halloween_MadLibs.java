public class Halloween_MadLibs {

    public static void main(String[] args) {

        // Collect words from the user
        String[] words = InputCollector.collectWords();

        // Get the story template
        String template = StoryTemplate.getTemplate();

        // Generate the completed story
        String story = StoryGenerator.generateStory(template, words);

        // Display the final story
        System.out.println("\nYour Mad Libs Story:");
        System.out.println(story);
    }
}
