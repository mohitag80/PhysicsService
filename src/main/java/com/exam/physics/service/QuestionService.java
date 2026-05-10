package com.exam.physics.service;

import com.exam.physics.model.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private static final Logger logger = LogManager.getLogger(QuestionService.class);

    private final List<Question> questionBank = new ArrayList<>();

    public QuestionService() {
        initializeQuestions();
        logger.info("QuestionService initialized with {} questions", questionBank.size());
    }

    private void initializeQuestions() {
        // Grade 9 - Mechanics
        questionBank.add(new Question(1L, "What is Newton's First Law of Motion?",
            new String[]{"An object remains at rest or in uniform motion unless acted upon by a net external force",
                         "Force equals mass times acceleration",
                         "Every action has an equal and opposite reaction",
                         "Energy cannot be created or destroyed"},
            "A", "Mechanics", 9, "easy", "Laws of Motion", 1));

        questionBank.add(new Question(2L, "A car accelerates from 0 to 60 km/h in 10 seconds. What is the acceleration?",
            new String[]{"6 km/h/s", "600 m/s²", "1.67 m/s²", "6 m/s²"},
            "C", "Mechanics", 9, "medium", "Laws of Motion", 2));

        questionBank.add(new Question(3L, "What is the SI unit of force?",
            new String[]{"Joule", "Watt", "Newton", "Pascal"},
            "C", "Mechanics", 9, "easy", "Laws of Motion", 1));

        questionBank.add(new Question(4L, "A body of mass 5 kg moves with velocity 4 m/s. What is its momentum?",
            new String[]{"1.25 kg·m/s", "9 kg·m/s", "20 kg·m/s", "0.8 kg·m/s"},
            "C", "Mechanics", 9, "easy", "Momentum", 2));

        questionBank.add(new Question(5L, "Which of the following is a vector quantity?",
            new String[]{"Speed", "Mass", "Temperature", "Velocity"},
            "D", "Mechanics", 9, "easy", "Kinematics", 1));

        // Grade 9 - Thermodynamics
        questionBank.add(new Question(6L, "What is the freezing point of water in Kelvin?",
            new String[]{"273 K", "0 K", "373 K", "100 K"},
            "A", "Thermodynamics", 9, "easy", "Temperature", 1));

        questionBank.add(new Question(7L, "Heat transfer through electromagnetic waves is called?",
            new String[]{"Conduction", "Convection", "Radiation", "Advection"},
            "C", "Thermodynamics", 9, "easy", "Heat Transfer", 1));

        // Grade 10 - Electricity
        questionBank.add(new Question(8L, "What is Ohm's Law?",
            new String[]{"V = I/R", "V = IR", "V = I + R", "V = I²R"},
            "B", "Electricity", 10, "easy", "Current Electricity", 1));

        questionBank.add(new Question(9L, "Three resistors of 2Ω, 3Ω, and 6Ω are connected in parallel. What is the equivalent resistance?",
            new String[]{"11 Ω", "1 Ω", "0.91 Ω", "6 Ω"},
            "B", "Electricity", 10, "hard", "Circuits", 3));

        questionBank.add(new Question(10L, "Power dissipated in a resistor is given by:",
            new String[]{"P = V/I", "P = I²R", "P = V²/I", "P = IR²"},
            "B", "Electricity", 10, "medium", "Current Electricity", 2));

        questionBank.add(new Question(11L, "What is the unit of electric charge?",
            new String[]{"Ampere", "Volt", "Coulomb", "Ohm"},
            "C", "Electricity", 10, "easy", "Electrostatics", 1));

        // Grade 10 - Optics
        questionBank.add(new Question(12L, "Which mirror is used in vehicle rear-view mirrors?",
            new String[]{"Concave mirror", "Plane mirror", "Convex mirror", "Parabolic mirror"},
            "C", "Optics", 10, "easy", "Reflection", 1));

        questionBank.add(new Question(13L, "The refractive index of glass is 1.5. What is the speed of light in glass?",
            new String[]{"2 × 10⁸ m/s", "3 × 10⁸ m/s", "1.5 × 10⁸ m/s", "4.5 × 10⁸ m/s"},
            "A", "Optics", 10, "medium", "Refraction", 2));

        // Grade 11 - Mechanics Advanced
        questionBank.add(new Question(14L, "A projectile is launched at 45° to the horizontal. What is its range if initial velocity is 20 m/s? (g = 10 m/s²)",
            new String[]{"20 m", "40 m", "80 m", "10 m"},
            "B", "Mechanics", 11, "hard", "Projectile Motion", 3));

        questionBank.add(new Question(15L, "What is the escape velocity from Earth's surface? (g = 9.8 m/s², R = 6400 km)",
            new String[]{"7.9 km/s", "11.2 km/s", "8.5 km/s", "15 km/s"},
            "B", "Gravitation", 11, "medium", "Gravitation", 2));

        questionBank.add(new Question(16L, "Kepler's Second Law states that:",
            new String[]{"Planets orbit in ellipses", "A planet sweeps equal areas in equal times",
                         "T² ∝ R³", "Gravitational force varies as 1/r²"},
            "B", "Gravitation", 11, "medium", "Gravitation", 2));

        // Grade 11 - Waves
        questionBank.add(new Question(17L, "The speed of sound in air at 0°C is approximately:",
            new String[]{"340 m/s", "331 m/s", "300 m/s", "360 m/s"},
            "B", "Waves", 11, "easy", "Sound", 1));

        questionBank.add(new Question(18L, "Which phenomenon explains the formation of rainbow?",
            new String[]{"Reflection", "Refraction and Dispersion", "Diffraction", "Interference"},
            "B", "Optics", 11, "medium", "Dispersion", 2));

        // Grade 12 - Electromagnetism
        questionBank.add(new Question(19L, "The work done in moving a charge in an electric field between two equipotential surfaces is:",
            new String[]{"Maximum", "Minimum", "Zero", "Depends on path"},
            "C", "Electromagnetism", 12, "medium", "Electrostatics", 2));

        questionBank.add(new Question(20L, "Faraday's Law of electromagnetic induction states that the induced EMF is proportional to:",
            new String[]{"The magnetic field strength", "The rate of change of magnetic flux",
                         "The charge in the conductor", "The resistance of the circuit"},
            "B", "Electromagnetism", 12, "medium", "Electromagnetic Induction", 2));

        questionBank.add(new Question(21L, "The de Broglie wavelength of a particle is given by:",
            new String[]{"λ = h/mv", "λ = mv/h", "λ = hv/m", "λ = m/hv"},
            "A", "Modern Physics", 12, "hard", "Quantum Mechanics", 3));

        questionBank.add(new Question(22L, "In a photoelectric effect, if the frequency of incident light is doubled, the maximum kinetic energy of emitted electrons:",
            new String[]{"Doubles", "More than doubles", "Less than doubles", "Remains same"},
            "B", "Modern Physics", 12, "hard", "Photoelectric Effect", 3));

        questionBank.add(new Question(23L, "The half-life of a radioactive element is 10 years. After 30 years, what fraction remains?",
            new String[]{"1/4", "1/6", "1/8", "1/16"},
            "C", "Nuclear Physics", 12, "hard", "Radioactivity", 3));

        questionBank.add(new Question(24L, "Which gate is the universal gate?",
            new String[]{"AND", "OR", "NAND", "XOR"},
            "C", "Electronics", 12, "medium", "Logic Gates", 2));

        questionBank.add(new Question(25L, "In a p-n junction diode, the depletion region is formed due to:",
            new String[]{"Drift of majority carriers", "Diffusion of majority carriers",
                         "External voltage", "Temperature effect"},
            "B", "Electronics", 12, "hard", "Semiconductor Physics", 3));
    }

    public List<Question> getTopNQuestionsByGrade(int grade, int n) {
        logger.info("Fetching top {} questions for grade {}", n, grade);
        return questionBank.stream()
                .filter(q -> q.getGrade() == grade)
                .limit(Math.min(n, questionBank.size()))
                .collect(Collectors.toList());
    }

    public List<Question> getQuestionsByTopic(String topic, int n) {
        logger.info("Fetching {} questions for topic: {}", n, topic);
        return questionBank.stream()
                .filter(q -> q.getTopic().equalsIgnoreCase(topic))
                .limit(Math.min(n, questionBank.size()))
                .collect(Collectors.toList());
    }

    public List<Question> getQuestionsByComplexity(String complexity, int n) {
        logger.info("Fetching {} questions with complexity: {}", n, complexity);
        return questionBank.stream()
                .filter(q -> q.getComplexity().equalsIgnoreCase(complexity))
                .limit(Math.min(n, questionBank.size()))
                .collect(Collectors.toList());
    }

    public List<Question> getQuestionsByGradeAndTopic(int grade, String topic, int n) {
        return questionBank.stream()
                .filter(q -> q.getGrade() == grade && q.getTopic().equalsIgnoreCase(topic))
                .limit(Math.min(n, questionBank.size()))
                .collect(Collectors.toList());
    }

    public List<String> getAvailableTopics() {
        return questionBank.stream()
                .map(Question::getTopic)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
