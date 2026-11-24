package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jz4 f17392a = new jz4();
    public static final sqp b = sqp.a("platform");
    public static final sqp c = sqp.a("version");
    public static final sqp d = sqp.a("buildVersion");
    public static final sqp e = sqp.a("jailbroken");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        o9f o9fVar = (o9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.d(b, ((g35) o9fVar).f10595a);
        g35 g35Var = (g35) o9fVar;
        t960Var.a(c, g35Var.b);
        t960Var.a(d, g35Var.c);
        t960Var.f(e, g35Var.d);
    }
}
