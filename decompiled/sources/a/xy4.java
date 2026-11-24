package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xy4 f41689a = new xy4();
    public static final sqp b = sqp.a("threads");
    public static final sqp c = sqp.a("exception");
    public static final sqp d = sqp.a("appExitInfo");
    public static final sqp e = sqp.a("profilingManagerInfo");
    public static final sqp f = sqp.a("signal");
    public static final sqp g = sqp.a("binaries");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        f9f f9fVar = (f9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((q25) f9fVar).f27984a);
        q25 q25Var = (q25) f9fVar;
        t960Var.a(c, q25Var.b);
        t960Var.a(d, q25Var.c);
        t960Var.a(e, q25Var.d);
        t960Var.a(f, q25Var.e);
        t960Var.a(g, q25Var.f);
    }
}
