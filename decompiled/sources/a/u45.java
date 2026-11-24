package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35028a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final v45 a() {
        if (this.f == 1 && this.f35028a != null && this.b != null && this.c != null && this.d != null) {
            return new v45(this.f35028a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f35028a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        if (this.c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((this.f & 1) == 0) {
            sb.append(" templateVersion");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
