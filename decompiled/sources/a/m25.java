package a;

/* JADX INFO: loaded from: classes2.dex */
public final class m25 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21039a;
    public String b;
    public h9f c;
    public i9f d;
    public j9f e;
    public m9f f;
    public byte g;

    public final n25 a() {
        String str;
        h9f h9fVar;
        i9f i9fVar;
        if (this.g == 1 && (str = this.b) != null && (h9fVar = this.c) != null && (i9fVar = this.d) != null) {
            return new n25(this.f21039a, str, h9fVar, i9fVar, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
