package a;

/* JADX INFO: loaded from: classes.dex */
public final class vz4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vz4 f38282a = new vz4();
    public static final sqp b = new sqp("logSource", rz4.q(rw2.r(a5d0.class, new v04(1))));
    public static final sqp c = new sqp("logEventDropped", rz4.q(rw2.r(a5d0.class, new v04(2))));

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        ov00 ov00Var = (ov00) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ov00Var.f25902a);
        t960Var.a(c, ov00Var.b);
    }
}
