package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l05 f19181a = new l05();
    public static final sqp b = sqp.a("eventType");
    public static final sqp c = sqp.a("sessionData");
    public static final sqp d = sqp.a("applicationInfo");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        qji0 qji0Var = (qji0) obj;
        t960 t960Var = (t960) obj2;
        qji0Var.getClass();
        t960Var.a(b, uho.SESSION_START);
        t960Var.a(c, qji0Var.f28841a);
        t960Var.a(d, qji0Var.b);
    }
}
