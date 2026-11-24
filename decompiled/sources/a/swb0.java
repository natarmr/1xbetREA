package a;

/* JADX INFO: loaded from: classes.dex */
public final class swb0 extends rzk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32915a;
    public final long b;
    public final long c;

    public swb0(byte b, long j, long j2) {
        this.f32915a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, fq80 fq80Var) {
        long jZ = fq80Var.z();
        if ((128 & jZ) != 0) {
            return 8589934591L & ((((jZ & 1) << 32) | fq80Var.B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // a.rzk0
    public final String toString() {
        switch (this.f32915a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return brm0.k(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return brm0.k(this.c, " }", sb2);
        }
    }
}
