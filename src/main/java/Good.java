public class Good {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public Good(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
    }

    //Реализация Builder через статический внутренний класс
    public static class Builder {
        //Обязательные параметры
        public int a;
        public int b;
        //Необязательные параметры со значениями по умолчанию
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;

        //Конструктор с обязательными параметрами
        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }

        //Методы с возвращающим типом Builder для необязательного параметра с, d, e, f,
        public Builder c(int val) {
            c = val;
            return this;
        }

        public Builder d(int val) {
            d = val;
            return this;
        }

        public Builder e(int val) {
            e = val;
            return this;
        }

        public Builder f(int val) {
            f = val;
            return this;
        }

        //Метод с возвращающим типом Good для генерации объекта
        public Good buidl() {
            return new Good(this);
        }
    }


    public static void main(String[] args) {
        Good good = new Good.Builder(40, 20).c(11).d(111).e(11111).buidl();
        System.out.println(good.a);
    }

}