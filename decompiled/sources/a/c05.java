package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c05 f3506a = new c05();
    public static final sqp b = sqp.a("rolloutId");
    public static final sqp c = sqp.a("variantId");
    public static final sqp d = sqp.a("parameterKey");
    public static final sqp e = sqp.a("parameterValue");
    public static final sqp f = sqp.a("templateVersion");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        hdg0 hdg0Var = (hdg0) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((v45) hdg0Var).b);
        v45 v45Var = (v45) hdg0Var;
        t960Var.a(c, v45Var.c);
        t960Var.a(d, v45Var.d);
        t960Var.a(e, v45Var.e);
        t960Var.c(f, v45Var.f);
    }
}
