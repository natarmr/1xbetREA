package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v25 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36667a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final w25 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new w25(this.e, this.f36667a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
