public class OutfitRecommendation {
    public static String[] getRecommendation(String gender, String event) {
        String color = "";
        String material = "";
        String typeOfClothes = "";
        String accessories = "";
        String shoes = "";
        String stylingTips = "";
        String picturePath = "";

        if (gender.equals("Male")) {
            switch (event) {
                case "Wedding":
                    color = "Navy Blue or Black";
                    material = "Silk or Wool";
                    typeOfClothes = "Tailored Suit with Tie";
                    accessories = "Pocket Square, Tie Clip, and Watch";
                    shoes = "Polished Oxford Shoes";
                    stylingTips = "Ensure your suit is well-tailored. Use minimal accessories for a clean, elegant look.";
                    picturePath = "images/male_wedding.jpg";
                    break;
                case "Party":
                    color = "Bright Colors or Patterns";
                    material = "Cotton or Linen";
                    typeOfClothes = "Casual Shirt with Trousers";
                    accessories = "Leather Bracelet or Watch";
                    shoes = "Loafers or Casual Sneakers";
                    stylingTips = "Experiment with bold patterns or rolled-up sleeves for a stylish, relaxed vibe.";
                    picturePath = "images/male_party_outfit.jpg";
                    break;
                case "Conference":
                    color = "Gray or Blue";
                    material = "Polyester or Wool";
                    typeOfClothes = "Formal Business Suit";
                    accessories = "Minimalist Watch and Tie";
                    shoes = "Black or Brown Derby Shoes";
                    stylingTips = "Keep the tie professional and avoid overly bright colors. Ensure your shoes are well-polished.";
                    picturePath = "images/male_conference_suit.jpeg";
                    break;
                case "Sports":
                    color = "Neutral or Team Colors";
                    material = "Breathable Polyester";
                    typeOfClothes = "T-shirt with Shorts";
                    accessories = "Sweatband or Cap";
                    shoes = "Running Shoes";
                    stylingTips = "Choose moisture-wicking fabrics and avoid overly loose clothing for optimal performance.";
                    picturePath = "images/male_sports_outfit.jpg";
                    break;
                case "Casual Outing":
                    color = "Earthy Tones or Pastels";
                    material = "Cotton";
                    typeOfClothes = "Jeans with Polo Shirt";
                    accessories = "Sunglasses or Casual Watch";
                    shoes = "Casual Sneakers or Moccasins";
                    stylingTips = "Opt for a well-fitted polo shirt and slim-fit jeans for a smart casual look.";
                    picturePath = "images/male_casual_outfit.jpg";
                    break;
            }
        } else if (gender.equals("Female")) {
            switch (event) {
                case "Wedding":
                    color = "Soft Pink, Gold, or Cream";
                    material = "Silk or Satin";
                    typeOfClothes = "Elegant Evening Gown";
                    accessories = "Statement Necklace and Clutch Bag";
                    shoes = "Heels or Embellished Sandals";
                    stylingTips = "Choose a gown that complements your body shape. Pair it with subtle makeup and elegant jewelry.";
                    picturePath = "images/female_wedding_dress.jpg";
                    break;
                case "Party":
                    color = "Bright or Metallic Shades";
                    material = "Chiffon or Velvet";
                    typeOfClothes = "Party Dress or Skirt with Blouse";
                    accessories = "Clutch Bag and Earrings";
                    shoes = "Strappy Heels or Pumps";
                    stylingTips = "Add a touch of glamour with bold lipstick and sparkling accessories.";
                    picturePath = "images/female_party_outfit.jpg";
                    break;
                case "Conference":
                    color = "Neutral Tones";
                    material = "Polyester or Wool";
                    typeOfClothes = "Formal Blazer with Trousers or Skirt";
                    accessories = "Minimal Jewelry and Structured Bag";
                    shoes = "Low Heels or Flats";
                    stylingTips = "Keep the look professional by avoiding overly bold patterns. Opt for neutral makeup tones.";
                    picturePath = "images/female_conference_outfit.jpg";
                    break;
                case "Sports":
                    color = "Neutral or Team Colors";
                    material = "Breathable Polyester";
                    typeOfClothes = "T-shirt with Leggings or Shorts";
                    accessories = "Headband or Sports Watch";
                    shoes = "Running Shoes";
                    stylingTips = "Choose flexible, breathable fabrics. Make sure your footwear provides proper support.";
                    picturePath = "images/female_sports_outfit.jpg";
                    break;
                case "Casual Outing":
                    color = "Soft Colors or Patterns";
                    material = "Cotton or Denim";
                    typeOfClothes = "Jeans with Casual Top";
                    accessories = "Crossbody Bag and Sunglasses";
                    shoes = "Flat Sandals or Sneakers";
                    stylingTips = "Layer with a denim jacket or cardigan for a laid-back yet stylish look.";
                    picturePath = "images/female_casual_outfit.jpg";
                    break;
            }
        }

        return new String[]{color, material, typeOfClothes, accessories, shoes, stylingTips, picturePath};
    }
}
