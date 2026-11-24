package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class lcg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f19798a = new zfn(new j6g0((byte) 13), (byte) 0);
    public static final ncg0 b;
    public static final ncg0 c;

    static {
        long j = y3d.g;
        b = new ncg0(true, Float.NaN, j);
        c = new ncg0(false, Float.NaN, j);
    }

    public static ncg0 a(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = y3d.g;
        if (ycl.b(f, Float.NaN) && h2t0.a(j, j)) {
            return z ? b : c;
        }
        return new ncg0(z, f, j);
    }
}
