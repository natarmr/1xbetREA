package a;

/* JADX INFO: loaded from: classes2.dex */
public final class m05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m05 f20937a = new m05();
    public static final sqp b = sqp.a("sessionId");
    public static final sqp c = sqp.a("firstSessionId");
    public static final sqp d = sqp.a("sessionIndex");
    public static final sqp e = sqp.a("eventTimestampUs");
    public static final sqp f = sqp.a("dataCollectionStatus");
    public static final sqp g = sqp.a("firebaseInstallationId");
    public static final sqp h = sqp.a("firebaseAuthenticationToken");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        xji0 xji0Var = (xji0) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, xji0Var.f40987a);
        t960Var.a(c, xji0Var.b);
        t960Var.d(d, xji0Var.c);
        t960Var.c(e, xji0Var.d);
        t960Var.a(f, xji0Var.e);
        t960Var.a(g, xji0Var.f);
        t960Var.a(h, xji0Var.g);
    }
}
