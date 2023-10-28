package com.example.finalcsp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {

    private Button generate;
    private EditText ingredientsList;
    private TextView ingredientsText;



        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        generate = findViewById(R.id.generate);
        ingredientsList = findViewById(R.id.ingredients);
        ingredientsText = findViewById(R.id.ingredientsText);

            generate.setOnClickListener(new View.OnClickListener()
            {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view)
                {
                    ingredientsText.setTextSize(14.3f);
                    ingredientsText.setText("Prepare the Veggies: Start by preparing your veggies. You can slice the bell peppers and red onions into thin strips and sauté them in a little olive oil until they are tender. Season with a pinch of salt and pepper. You can also add some of your favorite veggies to the mix.\n" +
                            "\n" +
                            "Warm the Tortillas: Heat the tortillas in a dry skillet or microwave them for about 20 seconds until they are warm and pliable.\n" +
                            "\n" +
                            "Prepare the Beans: In a small saucepan, heat the beans over low heat until they are warmed through. You can add a pinch of cumin and chili powder for extra flavor if you like.\n" +
                            "\n" +
                            "Assemble the Tacos: Lay out each tortilla, and assemble your tacos by adding the following ingredients, adjusting to your preference:\n" +
                            "\n" +
                            "Spread a layer of beans in the center of each tortilla.\n" +
                            "Add a generous handful of shredded lettuce.\n" +
                            "Top with sliced avocados, diced tomatoes, and the sautéed veggies.\n" +
                            "Sprinkle shredded cheese over the top.\n" +
                            "Add Toppings: If you like, you can add a dollop of sour cream or Greek yogurt, some salsa or hot sauce for a kick, and a few fresh cilantro leaves.\n" +
                            "\n" +
                            "Serve: Fold the tortillas in half and serve your delicious vegetarian tacos with lime wedges on the side.");
                }
            });


//            Thread thread = new Thread(new Runnable() {
//
//                @Override
//                public void run() {
//                    try {
//                        String token = "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";
//                        OpenAiService service = new OpenAiService(token, Duration.ofSeconds(30));
//                        String ingredients = "chicken, rice, beans, tortillas";
//                        System.out.println("\nCreating completion...");
//                        CompletionRequest completionRequest = CompletionRequest.builder()
//                                .model("ada")
//                                .prompt("Give me a food recipe based on the following ingredients I have:" + ingredients)
//                                .echo(true)
//                                .user("testing")
//                                .n(3)
//                                .build();
//                        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
//                        System.out.println("something");
//
//
//                        service.shutdownExecutor();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//            thread.start();
            String ingredients = "tortilla, beans, lettuce, cheese, avocado, tomatoes, veggies";
            String recipe = "Prepare the Veggies: Start by preparing your veggies. You can slice the bell peppers and red onions into thin strips and sauté them in a little olive oil until they are tender. Season with a pinch of salt and pepper. You can also add some of your favorite veggies to the mix.\n" +
                    "\n" +
                    "Warm the Tortillas: Heat the tortillas in a dry skillet or microwave them for about 20 seconds until they are warm and pliable.\n" +
                    "\n" +
                    "Prepare the Beans: In a small saucepan, heat the beans over low heat until they are warmed through. You can add a pinch of cumin and chili powder for extra flavor if you like.\n" +
                    "\n" +
                    "Assemble the Tacos: Lay out each tortilla, and assemble your tacos by adding the following ingredients, adjusting to your preference:\n" +
                    "\n" +
                    "Spread a layer of beans in the center of each tortilla.\n" +
                    "Add a generous handful of shredded lettuce.\n" +
                    "Top with sliced avocados, diced tomatoes, and the sautéed veggies.\n" +
                    "Sprinkle shredded cheese over the top.\n" +
                    "Add Toppings: If you like, you can add a dollop of sour cream or Greek yogurt, some salsa or hot sauce for a kick, and a few fresh cilantro leaves.\n" +
                    "\n" +
                    "Serve: Fold the tortillas in half and serve your delicious vegetarian tacos with lime wedges on the side.";
    }

}
