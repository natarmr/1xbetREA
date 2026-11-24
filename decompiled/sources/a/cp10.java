package a;

/* JADX INFO: loaded from: classes.dex */
public final class cp10 extends y960 {
    public static final z960 d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        z960 z960VarA = z960.a(32, new cp10());
        d = z960VarA;
        z960VarA.f = 0.5f;
    }

    public static cp10 b(float f, float f2) {
        cp10 cp10Var = (cp10) d.b();
        cp10Var.b = f;
        cp10Var.c = f2;
        return cp10Var;
    }

    @Override // a.y960
    public final y960 a() {
        return new cp10();
    }
}
