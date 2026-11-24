package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ee9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh80 f7659a;
    public static final float b;
    public static final float c;

    static {
        float f = h56.f12464a;
        float f2 = h56.b;
        kkj0 kkj0Var = pe9.f26841a;
        f7659a = new lh80(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            vcx.a("Padding must be non-negative");
        }
        new lh80(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            vcx.a("Padding must be non-negative");
        }
        b = 58.0f;
        c = 40.0f;
    }

    public static be9 a(long j, long j2, long j3, long j4, fet fetVar, int i) {
        long j5 = (i & 2) != 0 ? y3d.g : j2;
        long j6 = (i & 4) != 0 ? y3d.g : j3;
        long j7 = (i & 8) != 0 ? y3d.g : j4;
        t4d t4dVar = (t4d) fetVar.k(v4d.f36771a);
        be9 be9Var = t4dVar.W;
        if (be9Var == null) {
            be9 be9Var2 = new be9(v4d.c(t4dVar, p0q.f26165a), v4d.c(t4dVar, p0q.g), y3d.c(p0q.c, v4d.c(t4dVar, p0q.b)), y3d.c(p0q.e, v4d.c(t4dVar, p0q.d)));
            t4dVar.W = be9Var2;
            be9Var = be9Var2;
        }
        long j8 = j != 16 ? j : be9Var.f2438a;
        long j9 = j5 != 16 ? j5 : be9Var.b;
        if (j6 == 16) {
            j6 = be9Var.c;
        }
        long j10 = j6;
        if (j7 == 16) {
            j7 = be9Var.d;
        }
        return new be9(j8, j9, j10, j7);
    }
}
