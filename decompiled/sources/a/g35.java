package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g35 extends o9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10595a;
    public final String b;
    public final String c;
    public final boolean d;

    public g35(int i, String str, String str2, boolean z) {
        this.f10595a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o9f) {
            g35 g35Var = (g35) ((o9f) obj);
            if (this.f10595a == g35Var.f10595a && this.b.equals(g35Var.b) && this.c.equals(g35Var.c) && this.d == g35Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.f10595a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f10595a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return rw2.p(sb, this.d, "}");
    }
}
