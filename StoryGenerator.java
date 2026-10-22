public class StoryGenerator {

    public static String generateStory(String template, String[] words) {
        String story = template;

        for (int i = 0; i < words.length; i++) {
            story = story.replaceFirst("%s", words[i]);
        }

        return story;
    }
}
