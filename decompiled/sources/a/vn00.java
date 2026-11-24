package a;

/* JADX INFO: loaded from: classes.dex */
public final class vn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f37693a;
    public long b;
    public long c;
    public long d;
    public final Object e;
    public Object f;
    public Object g;

    public vn00() {
        ey40 ey40Var = hkx.f13229a;
        this.e = new ey40();
        this.f37693a = -1L;
        this.b = 0L;
        this.c = 0L;
    }

    public void a(scq0 scq0Var, long j, long j2, float[] fArr, long j3) {
        long j4 = scq0Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            scq0Var.g = j3;
            scq0Var.a(scq0Var.e, scq0Var.f, j, j2, fArr);
        }
    }

    public boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (ikx.b(j2, this.b)) {
            z = false;
        } else {
            this.b = j2;
            z = true;
        }
        if (!ikx.b(j, this.c)) {
            this.c = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.d) {
            return z;
        }
        this.d = j3;
        return true;
    }

    public vn00(long j, mbj mbjVar, long j2) {
        this.f37693a = j;
        this.e = mbjVar;
        this.f = mbjVar.f21512a;
        this.b = j2;
        this.g = wcf0.g;
    }
}
