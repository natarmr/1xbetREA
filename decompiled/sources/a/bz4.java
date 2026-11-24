package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bz4 f3447a = new bz4();
    public static final sqp b = sqp.a("pc");
    public static final sqp c = sqp.a("symbol");
    public static final sqp d = sqp.a("file");
    public static final sqp e = sqp.a("offset");
    public static final sqp f = sqp.a("importance");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        d9f d9fVar = (d9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, ((w25) d9fVar).f38433a);
        w25 w25Var = (w25) d9fVar;
        t960Var.a(c, w25Var.b);
        t960Var.a(d, w25Var.c);
        t960Var.c(e, w25Var.d);
        t960Var.d(f, w25Var.e);
    }
}
