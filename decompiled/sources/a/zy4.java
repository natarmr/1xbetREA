package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zy4 f45187a = new zy4();
    public static final sqp b = sqp.a("name");
    public static final sqp c = sqp.a("code");
    public static final sqp d = sqp.a("address");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        c9f c9fVar = (c9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((t25) c9fVar).f33199a);
        t25 t25Var = (t25) c9fVar;
        t960Var.a(c, t25Var.b);
        t960Var.c(d, t25Var.c);
    }
}
