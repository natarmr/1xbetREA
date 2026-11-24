package a;

/* JADX INFO: loaded from: classes.dex */
public final class fv4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fv4 f10197a = new fv4();
    public static final sqp b = sqp.a("requestTimeMs");
    public static final sqp c = sqp.a("requestUptimeMs");
    public static final sqp d = sqp.a("clientInfo");
    public static final sqp e = sqp.a("logSource");
    public static final sqp f = sqp.a("logSourceName");
    public static final sqp g = sqp.a("logEvent");
    public static final sqp h = sqp.a("qosTier");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        nv00 nv00Var = (nv00) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, ((i45) nv00Var).f14129a);
        i45 i45Var = (i45) nv00Var;
        t960Var.c(c, i45Var.b);
        t960Var.a(d, i45Var.c);
        t960Var.a(e, i45Var.d);
        t960Var.a(f, i45Var.e);
        t960Var.a(g, i45Var.f);
        t960Var.a(h, xed0.f40741a);
    }
}
