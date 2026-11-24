package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class orm0 {
    public ncs0 b;
    public huo c;
    public ff60 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df60 f25740a = new df60();
    public fck0 j = new fck0((byte) 3, false);

    public void a(long j) {
        this.g = j;
    }

    public long b(fq80 fq80Var) {
        byte[] bArr = fq80Var.f9961a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            fq80Var.N(4);
            fq80Var.H();
        }
        int iV = ieb.V(i, fq80Var);
        fq80Var.M(0);
        return iV;
    }

    public abstract boolean c(fq80 fq80Var, long j, fck0 fck0Var);

    public void d(boolean z) {
        if (z) {
            this.j = new fck0((byte) 3, false);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
