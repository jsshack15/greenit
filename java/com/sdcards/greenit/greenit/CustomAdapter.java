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
                bobsImage.setImageResource(R.drawable.ventilation);
                break;
            case "Emission":
                content = "Diffusion of air impurities such as microbial contaminants and volatile organic compounds should be minimized through wise choice of construction and interior-finishing material.\nHumidity Control:\nPrevent airborne bacteria, mold, and other fungi, as well as radon, through envelope design, and heating, ventilating, air-conditioning (HVAC) system designs, that manage moisture sources from outside and inside the building.";
                bobsImage.setImageResource(R.drawable.humidity);
                break;
            case "Individual":
                content = "As an individual, you can make a great difference in your workplace by following principles of sustainable development.\n\nCartons:\nMost cartons manufactured around the world are used only once. Save used cartons and reuse them when needed later.\nStaple-pins:\n120 tons of steel can be saved in UK if every worker uses one less staple-pin per day.\nRecycled Paper:\nGallons of water can be saved merely by using recycled paper in offices instead of virgin paper.";
                bobsImage.setImageResource(R.drawable.files);
                break;
            case "Company":
                content = "As a group, office-workers can help in the sustainable trasformation of organizations.\nCar-Pooling:\nBy the addition of commuters in vehicles, a substantial amount of liquid and gaseous fossil fuels can be conserved.\nNo-Paper Policy: The greenest paper is no paper at all, so keep things digital and dematerialized whenever possible. The more you do online, the less you need paper. Keep files on computers instead of in file cabinets.";
                bobsImage.setImageResource(R.drawable.carpool);
                break;
            case "Geo":
                content = "Geothermal heating/cooling systems:\nOperated via sub-surface conductive heat transfer, these advanced systems use the naturally renewable temperature of the earth's crust as a heat source in the winter, and as a heat sink in the summer.\nA geothermal heat pump is vastly more efficient than conventional heating systems because it doesn’t burn fuel to create warmth; it simply moves existing heat from one place to another. Geothermal Temperature Regulation has the following advanages:\n- Much lower operating costs than other systems.\n- Can be installed in both new construction and retrofit situations.\n- Much quieter than other cooling systems.";
                bobsImage.setImageResource(R.drawable.geo);
                break;
            case "Patient":
                content = "Patient Care:\nMaximized patient care is essential for sustenability in hospital premises. Thermal insulation of exterior walls, roof, floors for comfort and hygiene, advanced and more convenient imaging procedures and recovery, etc. are indispensable.\nFavourable Ambience:\nAmple greenery outside the hospital buildiing brings positive aura. Non-toxic cleaning products with relieving fragrance are also advisable.";
                bobsImage.setImageResource(R.drawable.hosinfra);
                break;
            case "LowEnergy":
                content = "Integrated Low-energy Imaging Systems:\nThe energy cost can be controlled during installations by taking into consideration factors such as life cycle cost analysis, energy consumption, energy efficiency etc.\nTechnical Efficiency:\nMeasures can be taken for improving power factor through the use of capacitors for the reduction of power loss due to harmonic currents.";
                bobsImage.setImageResource(R.drawable.medequip);
                break;
            case "Onsite":
                content = "On-site treatment:\nOn-site treatment of biomedical waste is generally cost effective for large hospitals and major universities who have the space, labor and budget to operate the relevant equipment.\nAn autoclave uses steam and pressure to sterilize the waste or reduce its microbiological load to a level at which it may be safely disposed of.";
                bobsImage.setImageResource(R.drawable.onsite);
                break;
            case "Offsite":
                content = "Off-site treatment:\nOff-site treatment and disposal involves hiring of a biomedical waste disposal service to collect and haul away biomedical waste in special containers (usually cardboard boxes, or reusable plastic bins) for treatment at a facility designed to handle biomedical waste.\nBiomedical waste should be collected in containers that are leak-proof and sufficiently strong to prevent breakage during handling.";
                bobsImage.setImageResource(R.drawable.offsite);
                break;
            case "Device":
                content = "Reprocessed Medical Devices:\nProper reprocessing and sterilization of medical devices allows hospitals to reduce the amount of waste entering landfills.\nAccording to The Journal of Bone and Joint Surgery, reprocessed devices can cost half as much as new devices";
                bobsImage.setImageResource(R.drawable.device);
                break;
            case "Material":
                content = "Use Sustainable Building Materials:\nEach and every part of your house such as roofing material, building material, cabinets, counters and insulation to your flooring can be environment-friendly.\nUse products such as reclaimed lumber, recycled plastic, recycled glass or natural products such as bamboo, cork and linoleum which are made of natural, renewable materials.";
                bobsImage.setImageResource(R.drawable.material);
                break;
            case "Insulation":
                content = "Proper Insulation: Don’t let heating and cooling of your interior spaces air go waste through improper insulation.\nProper insulation will not only reduce your energy consumption but will bring down your electricity bills substantially.";
                bobsImage.setImageResource(R.drawable.insulation);
                break;
            case "Appliances":
                content = "Energy Star Label:\nEnergy Star is becoming a well known label and consumers today choose energy star appliances for their homes.\nThese appliances offer significant cost and energy savings without compromising performance.\nEco-Friendly Lighting:\nBoth LED and CFL cost a bit more upfront but use less energy and last longer than traditional incandescent bulbs.";
                bobsImage.setImageResource(R.drawable.star);
                break;
            case "Water":
                content = "Water Conserving Fixtures:\nLow-flow faucets, toilets and shower-heads are a few of the ways that you can use while building a green home to conserve water.\nThey can cut down on your water bills cost and make your home much more environment friendly";
                bobsImage.setImageResource(R.drawable.water);
                break;
            case "Landscape":
                content = "Smart Trees:\nPlanting trees on southern and western side of your home can keep your home cooler as they will block sunlight from falling directly on your home and during the winter, when trees lose their leaves, they will allow more sunlight to reach your home.\nWaste Decomposition:\nUse kitchen waste as compost in gardens and pots.\nToilet waste to be treated efficiently by water treatment plants.";
                bobsImage.setImageResource(R.drawable.landscape);
                break;
            case "Household":
                content = "Your Own Bit:\n- Turning off any lights or appliances when you don’t use them.\n- Remembering that even when you’re not using something and it’s plugged in, it’s still eating away at potentially saved energy.\n- Buying only recyclable containers and reusing plastics for food storage.";
                bobsImage.setImageResource(R.drawable.bit);
                break;

        }

        bobsText.setText(content);

        return customView;
    }

}
