package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ry4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ry4 f31294a = new ry4();
    public static final sqp b = sqp.a("identifier");
    public static final sqp c = sqp.a("version");
    public static final sqp d = sqp.a("displayVersion");
    public static final sqp e = sqp.a("organization");
    public static final sqp f = sqp.a("installationUuid");
    public static final sqp g = sqp.a("developmentPlatform");
    public static final sqp h = sqp.a("developmentPlatformVersion");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        y8f y8fVar = (y8f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((i25) y8fVar).f14032a);
        i25 i25Var = (i25) y8fVar;
        t960Var.a(c, i25Var.b);
        t960Var.a(d, i25Var.c);
        t960Var.a(e, null);
        t960Var.a(f, i25Var.d);
        t960Var.a(g, i25Var.e);
        t960Var.a(h, i25Var.f);
    }
}
