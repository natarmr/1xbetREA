package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8844a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final g35 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new g35(this.f8844a, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
