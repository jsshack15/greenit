package com.sdcards.greenit.greenit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String[] options) {
        super(context, R.layout.custom_row, options);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater bobsInflater = LayoutInflater.from(getContext());
        View customView = bobsInflater.inflate(R.layout.custom_row, parent, false);

        String singleItem = getItem(position);
        TextView bobsText = (TextView) customView.findViewById(R.id.bobsText);
        ImageView bobsImage = (ImageView) customView.findViewById(R.id.bobsImage);

        String content = "";

        switch (singleItem){
            case "Syllabus":
                content = "Design of Curriculum:\nEnvironmental Education as a compulsory part of the academic curriculum, at all levels of education.\nProject-based Education:\nTheoretical and practical projects based on sustainable development.";
                bobsImage.setImageResource(R.drawable.evs);
                break;
            case "Activities":
                content = "Create “Green Teams”:\nPut students in charge to power down computers, close the blinds, check faucets, and sort recycling.\nEco-friendly Activities:\nInvolve both, students and staff, in activities such as planting trees and waste management.";
                bobsImage.setImageResource(R.drawable.activity);
                break;
            case "Indoor":
                content = "Plants for Better Air:\nBamboo palms, English Ivy, and rubber plants can purify air and help reduce stress.\nTemperature Regulation:\nSmart ventilation and natural lighting techniques can save substantial electricity.";
                bobsImage.setImageResource(R.drawable.plant);
                break;
            case "IndoorSign":
                content = "Electricity Conservation:\nSet up signs indoors asking occupants to switch off electrical appliances when not in use.\nMotivational Signs:\nBulletins and charts with eco-friendly messages.";
                bobsImage.setImageResource(R.drawable.light);
                break;
            case "Outdoor":
                content = "Waste Disposal Signs:\nSigns can direct people towards location of dustbins.\nWater Conservation:\nSigns to ensure that drinking-water taps are turned off after use.";
                bobsImage.setImageResource(R.drawable.dustbin);
                break;
            case "Elearning":
                content = "Presentation-based Classes:\nLessons through interactive computer-presentations, reducing the use of paper and chalk-boards.\nOnline Assessments:\nOnline submission of projects, and computer-based tests.";
                bobsImage.setImageResource(R.drawable.elearning);
                break;
            case "HotelWaste":
                content = "Waste Segregation:\nUse four separate colour-coded bins for storing the separated waste.\nWaste Decomposition:\nA Vermiculture area can be set up for converting food waste and wet waste into organic manure.";
                bobsImage.setImageResource(R.drawable.hotel_waste);
                break;
            case "Lighting":
                content = "Daylighting:\nA skylight permitting sunlight into the atrium providing natural light and reducing power consumption.\nEfficient Electronic Lighting:\nEnergy efficient lighting such as CFL and LED, replacing neon signage and heavy lamps.";
                bobsImage.setImageResource(R.drawable.skylight);
                break;
            case "Integration":
                content = "Integrated Energy Control:\nThe Master Control Panel in guest rooms can be incorporated with an Ecobutton, which slightly raises the AC temperature, thus conserving energy.";
                bobsImage.setImageResource(R.drawable.master);
                break;
            case "Bathroom":
                content = "Aerated Taps:\nAerated water through taps can reduce water consumption by upto 50%.\nSpecial Flushes:\nSpecialized toilets such as Dual-Flush and Composting varieties.";
                bobsImage.setImageResource(R.drawable.bathroom);
                break;
            case "Sewage":
                content = "Sewage Treatment:\nA Sewage Treatment Plant should run so that waste water is treated and reused for gardening, hence, reducing fresh water exhaustion.";
                bobsImage.setImageResource(R.drawable.sewage);
                break;
            case "Awareness":
                content = "Awareness Programmes:\nEnvironmental awareness among guests and employees through theme-based activities.\nEmployee Training:\nRegularly conducted training programmes to ensure eco-vigilance in all professional activities.";
                bobsImage.setImageResource(R.drawable.employee);
                break;
            case "Exterior":
                content = "Green Rooftops:\nRooftop Gardens can contribute in the sustenance of cleaner air and improved thermal insulation.\nWall Garden:\nLush green walls, besides aesthetic beauty provide insulation from urban heat and smog.";
                bobsImage.setImageResource(R.drawable.wall);
                break;
            case "Ventilation":
                content = "Ample Ventilation:\nA properly designed ventilation system for cleaner outdoor or recirculated air.\nClean Air:\nFiltration and treatment of indoor air, and also of degraded air before its emission.";
                break;

        }

        bobsText.setText(content);

        return customView;
    }

}
