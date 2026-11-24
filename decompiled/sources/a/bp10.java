package a;

/* JADX INFO: loaded from: classes.dex */
public final class bp10 extends y960 {
    public static final z960 d;
    public double b = 0.0d;
    public double c = 0.0d;

    static {
        z960 z960VarA = z960.a(64, new bp10());
        d = z960VarA;
        z960VarA.f = 0.5f;
    }

    @Override // a.y960
    public final y960 a() {
        return new bp10();
    }

    public final String toString() {
        return "MPPointD, x: " + this.b + ", y: " + this.c;
    }
}
