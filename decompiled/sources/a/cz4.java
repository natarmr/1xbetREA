package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cz4 f5208a = new cz4();
    public static final sqp b = sqp.a("processName");
    public static final sqp c = sqp.a("pid");
    public static final sqp d = sqp.a("importance");
    public static final sqp e = sqp.a("defaultProcess");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        g9f g9fVar = (g9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((x25) g9fVar).f40150a);
        x25 x25Var = (x25) g9fVar;
        t960Var.d(c, x25Var.b);
        t960Var.d(d, x25Var.c);
        t960Var.f(e, x25Var.d);
    }
}
