package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y25 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f41889a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final z25 a() {
        if (this.g == 31) {
            return new z25(this.f41889a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb.append(" diskUsed");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
