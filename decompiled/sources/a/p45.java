package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26334a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final q45 a() {
        if (this.h == 3 && this.b != 0) {
            String str = this.f26334a;
            return new q45(this.b, this.e, this.f, str, this.c, this.d, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
