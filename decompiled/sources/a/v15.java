package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36612a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public q9f j;
    public u8f k;
    public r8f l;
    public byte m;

    public final w15 a() {
        if (this.m == 1 && this.f36612a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
            return new w15(this.f36612a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36612a == null) {
            sb.append(" sdkVersion");
        }
        if (this.b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb.append(" platform");
        }
        if (this.d == null) {
            sb.append(" installationUuid");
        }
        if (this.h == null) {
            sb.append(" buildVersion");
        }
        if (this.i == null) {
            sb.append(" displayVersion");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
