package a;

/* JADX INFO: loaded from: classes.dex */
public final class w04 implements qgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38331a = 1;
    public int b;
    public long c;
    public int d;

    public w04(int i, int i2, long j) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public String toString() {
        switch (this.f38331a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(vtt0.X(this.b));
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", minHeaderSize=");
                return rz4.j(this.d, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w04() {
    }
}
