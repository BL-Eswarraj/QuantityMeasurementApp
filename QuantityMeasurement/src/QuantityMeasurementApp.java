public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;
            return Double.compare(this.value, feet.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " ft";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC1: Feet Measurement Equality ===\n");

        // TEST 1: Two Feet objects with SAME value
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        System.out.println("TEST 1 - Same values (1.0 ft = 1.0 ft): " + feet1.equals(feet2));

        // TEST 2: Two Feet objects with DIFFERENT values
        Feet feet3 = new Feet(2.0);
        System.out.println("TEST 2 - Different values (1.0 ft ≠ 2.0 ft): " + feet1.equals(feet3));

        // TEST 3: Compare Feet object with NULL
        System.out.println("TEST 3 - Compare with null: " + feet1.equals(null));

        // TEST 4: Compare Feet object with ITSELF (Reflexive property)
        System.out.println("TEST 4 - Same reference (reflexive): " + feet1.equals(feet1));

        // TEST 5: Symmetric property (a.equals(b) == b.equals(a))
        Feet feet4 = new Feet(3.5);
        Feet feet5 = new Feet(3.5);
        System.out.println("TEST 5a - Symmetric (feet4 = feet5): " + feet4.equals(feet5));
        System.out.println("TEST 5b - Symmetric (feet5 = feet4): " + feet5.equals(feet4));
    }
}