package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jy4 f17341a = new jy4();
    public static final sqp b = sqp.a("arch");
    public static final sqp c = sqp.a("libraryName");
    public static final sqp d = sqp.a("buildId");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        q8f q8fVar = (q8f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((a25) q8fVar).f107a);
        a25 a25Var = (a25) q8fVar;
        t960Var.a(c, a25Var.b);
        t960Var.a(d, a25Var.c);
    }
}
