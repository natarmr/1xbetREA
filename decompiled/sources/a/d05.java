package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d05 f5255a = new d05();
    public static final sqp b = sqp.a("rolloutId");
    public static final sqp c = sqp.a("parameterKey");
    public static final sqp d = sqp.a("parameterValue");
    public static final sqp e = sqp.a("variantId");
    public static final sqp f = sqp.a("templateVersion");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        idg0 idg0Var = (idg0) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((w45) idg0Var).b);
        w45 w45Var = (w45) idg0Var;
        t960Var.a(c, w45Var.c);
        t960Var.a(d, w45Var.d);
        t960Var.a(e, w45Var.e);
        t960Var.c(f, w45Var.f);
    }
}
