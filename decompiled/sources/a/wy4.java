package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wy4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wy4 f39959a = new wy4();
    public static final sqp b = sqp.a("baseAddress");
    public static final sqp c = sqp.a("size");
    public static final sqp d = sqp.a("name");
    public static final sqp e = sqp.a("uuid");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        a9f a9fVar = (a9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, ((r25) a9fVar).f29713a);
        r25 r25Var = (r25) a9fVar;
        t960Var.c(c, r25Var.b);
        t960Var.a(d, r25Var.c);
        String str = r25Var.d;
        t960Var.a(e, str != null ? str.getBytes(r9f.f30077a) : null);
    }
}
