package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ky4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ky4 f19089a = new ky4();
    public static final sqp b = sqp.a("pid");
    public static final sqp c = sqp.a("processName");
    public static final sqp d = sqp.a("reasonCode");
    public static final sqp e = sqp.a("importance");
    public static final sqp f = sqp.a("pss");
    public static final sqp g = sqp.a("rss");
    public static final sqp h = sqp.a("timestamp");
    public static final sqp i = sqp.a("traceFile");
    public static final sqp j = sqp.a("buildIdMappingForArch");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        r8f r8fVar = (r8f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.d(b, ((z15) r8fVar).f43601a);
        z15 z15Var = (z15) r8fVar;
        t960Var.a(c, z15Var.b);
        t960Var.d(d, z15Var.c);
        t960Var.d(e, z15Var.d);
        t960Var.c(f, z15Var.e);
        t960Var.c(g, z15Var.f);
        t960Var.c(h, z15Var.g);
        t960Var.a(i, z15Var.h);
        t960Var.a(j, z15Var.i);
    }
}
