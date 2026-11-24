package a;

/* JADX INFO: loaded from: classes.dex */
public final class fa5 implements ba5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9190a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fa5(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f9190a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        int i = this.f9190a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        f1t0.g0("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // a.ba5
    public final int getType() {
        return 1752331379;
    }
}
