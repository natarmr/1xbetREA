package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dz4 f6923a = new dz4();
    public static final sqp b = sqp.a("batteryLevel");
    public static final sqp c = sqp.a("batteryVelocity");
    public static final sqp d = sqp.a("proximityOn");
    public static final sqp e = sqp.a("orientation");
    public static final sqp f = sqp.a("ramUsed");
    public static final sqp g = sqp.a("diskUsed");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        i9f i9fVar = (i9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((z25) i9fVar).f43654a);
        z25 z25Var = (z25) i9fVar;
        t960Var.d(c, z25Var.b);
        t960Var.f(d, z25Var.c);
        t960Var.d(e, z25Var.d);
        t960Var.c(f, z25Var.e);
        t960Var.c(g, z25Var.f);
    }
}
