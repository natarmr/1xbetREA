package a;

/* JADX INFO: loaded from: classes4.dex */
public final class o6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24754a;
    public final ngk0 b;
    public final int c;
    public final int d;
    public final jxr0 e;
    public final jxr0 f;

    public o6s0(long j, ngk0 ngk0Var, int i, int i2, jxr0 jxr0Var, jxr0 jxr0Var2) {
        ngk0Var.getClass();
        this.f24754a = j;
        this.b = ngk0Var;
        this.c = i;
        this.d = i2;
        this.e = jxr0Var;
        this.f = jxr0Var2;
    }

    public final long a() {
        ne60 ne60Var = (ne60) this.b.get(Long.valueOf(this.f24754a));
        if (ne60Var != null) {
            return ne60Var.f23370a;
        }
        return 0L;
    }

    public final void b(long j) {
        int i;
        int i2;
        int i3;
        long j2 = ((qkx) this.e.invoke()).f28908a;
        long j3 = ((qkx) this.f.invoke()).f28908a;
        int i4 = ((int) (j2 >> 32)) - (this.c * 2);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) (j2 & 4294967295L);
        if (i5 < 0) {
            i5 = 0;
        }
        long j4 = (((long) i5) & 4294967295L) | (((long) i4) << 32);
        int i6 = (int) (j4 >> 32);
        if (i6 > 0 && (i = (int) (j4 & 4294967295L)) > 0 && (i2 = (int) (j3 >> 32)) > 0 && (i3 = (int) (j3 & 4294967295L)) > 0) {
            int i7 = i2 - i6;
            if (i7 < 0) {
                i7 = 0;
            }
            float f = i7;
            int i8 = (i3 - i) + this.d;
            j = (((long) Float.floatToRawIntBits(l1e0.c(Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, i8 >= 0 ? i8 : 0))) & 4294967295L) | (((long) Float.floatToRawIntBits(l1e0.c(Float.intBitsToFloat((int) (j >> 32)), 0.0f, f))) << 32);
        }
        if (ne60.c(j, a())) {
            return;
        }
        this.b.put(Long.valueOf(this.f24754a), new ne60(j));
    }
}
