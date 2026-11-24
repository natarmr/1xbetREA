package a;

/* JADX INFO: loaded from: classes.dex */
public final class l7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19553a;
    public final coq0 b;
    public final fq80 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public l7d0(byte b) {
        this.f19553a = b;
        switch (b) {
            case 1:
                this.b = new coq0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new fq80();
                break;
            default:
                this.b = new coq0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new fq80();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(fq80 fq80Var) {
        int i = fq80Var.b;
        if (fq80Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        fq80Var.k(bArr, 0, 9);
        fq80Var.M(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return ((j2 & 3) << 13) | ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public final void a(guo guoVar) {
        byte b = this.f19553a;
        fq80 fq80Var = this.c;
        switch (b) {
            case 0:
                byte[] bArr = vtt0.b;
                fq80Var.K(bArr, bArr.length);
                this.d = true;
                guoVar.g();
                break;
            default:
                byte[] bArr2 = vtt0.b;
                fq80Var.K(bArr2, bArr2.length);
                this.d = true;
                guoVar.g();
                break;
        }
    }
}
