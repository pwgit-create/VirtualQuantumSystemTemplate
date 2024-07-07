class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public ComplexNumber normalize() {
        double magnitude = this.magnitude();
        return new ComplexNumber(real / magnitude, imaginary / magnitude);
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return real + "";
        } else if (real == 0) {
            return imaginary + "i";
        } else if (imaginary < 0) {
            return real + " - " + (-1 * imaginary) + "i";
        } else {
            return real + " + " + imaginary + "i";
        }
    }
} 