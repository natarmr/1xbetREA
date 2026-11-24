package a;

/* JADX INFO: loaded from: classes.dex */
public final class a05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a05 f9a = new a05();
    public static final sqp b = new sqp("currentCacheSizeBytes", rz4.q(rw2.r(a5d0.class, new v04(1))));
    public static final sqp c = new sqp("maxCacheSizeBytes", rz4.q(rw2.r(a5d0.class, new v04(2))));

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        zqm0 zqm0Var = (zqm0) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, zqm0Var.f44813a);
        t960Var.c(c, zqm0Var.b);
    }
}
