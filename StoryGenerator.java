public class StoryGenerator {

    public static String generateStory(String template, String[] words) {
        // Store the original template string in a mutable local variable
        String story = template;
        
        // Loop through each replacement word in the array
        for (int i = 0; i < words.length; i++) {
            // Replace the first remaining "%s" placeholder with the current word
            story = story.replaceFirst("%s", words[i]);
        }

        return story;
    }
}
