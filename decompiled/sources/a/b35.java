package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d35 f1885a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final c35 a() {
        d35 d35Var;
        String str;
        String str2;
        if (this.e == 1 && (d35Var = this.f1885a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new c35(d35Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1885a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
