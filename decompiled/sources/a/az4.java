package a;

/* JADX INFO: loaded from: classes2.dex */
public final class az4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final az4 f1699a = new az4();
    public static final sqp b = sqp.a("name");
    public static final sqp c = sqp.a("importance");
    public static final sqp d = sqp.a("frames");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        e9f e9fVar = (e9f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((u25) e9fVar).f34930a);
        u25 u25Var = (u25) e9fVar;
        t960Var.d(c, u25Var.b);
        t960Var.a(d, u25Var.c);
    }
}
