package com.hotelbookingpro.controller;

import com.hotelbookingpro.model.Hotel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HotelController {

    private List<Hotel> hotels = new ArrayList<>();

    public HotelController() {
        // Initialize mock data
        hotels.add(new Hotel(1L, "Palais Marrakech", "Marrakech · Médina", "1 800 MAD",
                "Découvrez le luxe absolu au cœur de la ville ocre. Le Palais Marrakech allie architecture traditionnelle marocaine et confort moderne exceptionnel. Nos suites spacieuses offrent une vue imprenable sur les jardins luxuriants ou les montagnes de l'Atlas.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1542314831-068cd1dbfeeb?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1590073242678-cfea53382e52?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1582719508461-905c673771fd?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1560185007-cde436f6a4d0?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1560448204-e02f11c3d0e2?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1539020140153-e479b8c22e70?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1613977257363-707ba9348227?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1571896349842-6e53ce41be03?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Spa & Bien-être", "Piscine chauffée", "Restaurant gastronomique", "Wifi haut débit", "Climatisation"),
                "4.9★", "Spa & piscine"));

        hotels.add(new Hotel(2L, "Atlantic Bay", "Agadir · Front de mer", "950 MAD",
                "Un séjour inoubliable les pieds dans l'eau. Profitez de notre plage privée et de nos activités nautiques pour toute la famille. Le soleil d'Agadir vous attend.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1566073771259-6a8506099945?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1571896349842-6e53ce41be03?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1437719417032-8595fd9e9dc6?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1498503403619-e39e4ff39465?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1502680390469-be75c86b636f?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1533105079780-92b9be482077?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1572331165267-854da2b00ca1?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Plage privée", "Surf school", "Vue océan", "Kids club", "Demi-pension"),
                "4.7★", "Pieds dans l’eau"));

        hotels.add(new Hotel(3L, "Skyline Casablanca", "Casablanca · Centre-ville", "1 200 MAD",
                "L'élégance urbaine au cœur de la métropole. Idéal pour vos voyages d'affaires ou pour découvrir l'architecture Art Déco de Casablanca. Rooftop avec vue panoramique.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1584132967334-10e028bd69f7?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1565031491318-a7172ddc872d?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1551882547-ff40c63fe5fa?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1486406140926-c627a92ad1ab?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1533052449557-0131499f57d3?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1518684079-3c830dcef090?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1577147443647-81856d5151af?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Business Center", "Rooftop Bar", "Salle de fitness", "Conciergerie", "Parking sécurisé"),
                "4.6★", "Business & events"));

        hotels.add(new Hotel(4L, "Riad des Lumières", "Fès · Médina", "850 MAD",
                "Une immersion authentique dans l'histoire du Maroc. Ce Riad traditionnel restauré avec passion vous offre calme et sérénité au cœur de la médina millénaire de Fès.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1539020140153-e479b8c22e70?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1560448204-e02f11c3d0e2?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1590059390492-d5495eb83dbd?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1535025639604-9a804c092faa?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1582719508461-905c673771fd?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1548268770-663685052994?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1558685160-149669d57185?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1599597753177-3e1986429d2f?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Patio andalou", "Cuisine traditionnelle", "Terrasse panoramique", "Hammam beldi", "Excursions guidées"),
                "4.8★", "Charme authentique"));

        hotels.add(new Hotel(5L, "Tanger Marina Hotel", "Tanger · Marina", "1 100 MAD",
                "Entre Méditerranée et Atlantique, vivez au rythme de Tanger. Notre hôtel moderne surplombe la marina et offre un accès direct aux meilleurs spots de la ville.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1582719478250-c89cae4dc85b?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1578683010236-d716f9a3f461?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1537996194471-e657df975ab4?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1528127269322-539801943592?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1580227974556-34a5d4829678?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1566665797739-1674de7a421a?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1571896349842-6e53ce41be03?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Vue mer", "Piscine à débordement", "Restaurant fruits de mer", "Proche port", "Spa"),
                "4.5★", "Vue mer"));

        hotels.add(new Hotel(6L, "Sahara Luxury Camp", "Merzouga · Désert", "2 500 MAD",
                "Une nuit magique sous les étoiles. Nos tentes de luxe vous offrent tout le confort d'un grand hôtel au milieu des dunes dorées de Merzouga. Dîner spectacle et balade en dromadaire inclus.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1542401886-65d6c61db217?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1489749798305-4fea3ae63d43?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1516214104703-d870798883c5?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1478131143081-80f7f84ca84d?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1545153496-01588667b243?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1502134249126-9f3755a50d78?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1539020140153-e479b8c22e70?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1509316975850-ff9c5deb0cd9?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Bivouac de luxe", "Dîner sous les étoiles", "Balade dromadaire", "Feu de camp", "Musique Gnawa"),
                "4.9★", "Bivouac de luxe"));

        hotels.add(new Hotel(7L, "Atlas Mountain Resort", "Imlil · Atlas", "600 MAD",
                "Respirez l'air pur des montagnes. Point de départ idéal pour l'ascension du Toubkal ou pour des randonnées douces en famille. Authenticité et nature préservée.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1445019980597-93fa8acb246c?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1469854523086-cc02fe5d8800?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1476514525535-07fb3b4ae5f1?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1518182170546-0766ce6fec56?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1551632811-561732d1e306?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1519681393784-d120267933ba?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Randonnée", "Vue montagne", "Cheminée", "Cuisine bio", "Guide local"),
                "4.7★", "Nature & Rando"));

        hotels.add(new Hotel(8L, "Sofitel Rabat Jardin", "Rabat · Souissi", "2 200 MAD",
                "L'art de vivre à la française au cœur de la capitale. Jardins andalous, gastronomie raffinée et service d'exception pour ce palace emblématique de Rabat.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1596436889106-be35e843f974?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1566665797739-1674de7a421a?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1582719478250-c89cae4dc85b?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1571003123894-1f0594d2b5d9?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1584132967334-10e028bd69f7?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1560448204-e02f11c3d0e2?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1605128368366-22a30d52f6ee?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1572297676693-018288544d6b?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Golf à proximité", "Piscine olympique", "Spa So", "Gastronomie", "Bar Lounge"),
                "4.8★", "Luxe & Calme"));

        hotels.add(new Hotel(9L, "Blue Pearl Chefchaouen", "Chefchaouen · Montagne", "550 MAD",
                "Perdez-vous dans les ruelles bleues. Notre maison d'hôtes offre une vue imprenable sur la ville et les montagnes environnantes. Un havre de paix coloré.",
                Arrays.asList(
                        "https://images.unsplash.com/photo-1523906834658-6e24ef2386f9?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1534008897995-27a23e859048?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1597212618440-806262de4f6b?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1468530986413-2c93495ed15e?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1580227974556-34a5d4829678?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1550586678-f7b2e3a68188?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1564507592333-c60657eea523?auto=format&fit=crop&w=1200&q=80",
                        "https://images.unsplash.com/photo-1573215668469-8d3c5d6e2b89?auto=format&fit=crop&w=1200&q=80"
                ),
                Arrays.asList("Terrasse vue ville", "Petit-déjeuner traditionnel", "Au cœur de la médina", "Ambiance familiale", "Thé à la menthe"),
                "4.6★", "Vue panoramique"));
    }

    @GetMapping("/hotels")
    public String listHotels(Model model) {
        model.addAttribute("hotels", hotels);
        return "hotels";
    }

    @GetMapping("/hotels/details")
    public String hotelDetailsRedirect() {
        return "redirect:/hotels";
    }

    @GetMapping("/hotels/details/{id}")
    public String hotelDetails(@PathVariable Long id, Model model) {
        Hotel hotel = hotels.stream()
                .filter(h -> h.getId().equals(id))
                .findFirst()
                .orElse(hotels.get(0)); // Fallback to first hotel if not found
        
        model.addAttribute("hotel", hotel);
        return "hotel_details";
    }
}
