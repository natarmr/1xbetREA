package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k05 f17447a = new k05();
    public static final sqp b = sqp.a("processName");
    public static final sqp c = sqp.a("pid");
    public static final sqp d = sqp.a("importance");
    public static final sqp e = sqp.a("defaultProcess");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        ryb0 ryb0Var = (ryb0) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ryb0Var.f31306a);
        t960Var.d(c, ryb0Var.b);
        t960Var.d(d, ryb0Var.c);
        t960Var.f(e, ryb0Var.d);
    }
}
