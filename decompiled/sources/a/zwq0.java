package a;

/* JADX INFO: loaded from: classes.dex */
public final class zwq0 implements vmb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45120a;

    public zwq0(int i) {
        this.f45120a = i;
    }

    @Override // a.vmb0
    public final long a(mkx mkxVar, long j, k6z k6zVar, long j2) {
        int i = mkxVar.f21964a;
        int i2 = mkxVar.c;
        int i3 = (int) (j2 >> 32);
        int iD = hne.d(i2 - i, i3, 2, i);
        if (iD >= 0) {
            i = iD + i3 > ((int) (j >> 32)) ? i2 - i3 : iD;
        }
        int i4 = mkxVar.b - ((int) (j2 & 4294967295L));
        int i5 = this.f45120a;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = mkxVar.d + i5;
        }
        return (((long) i) << 32) | (((long) i6) & 4294967295L);
    }
}
