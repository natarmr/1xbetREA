package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7214a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;
    public final fhj f;

    /* JADX WARN: Multi-variable type inference failed */
    public e55(String str, String str2, String str3, String str4, int i, fhj fhjVar) {
        if (str == null) {
            hny.u("Null appIdentifier");
            throw null;
        }
        this.f7214a = str;
        if (str2 == null) {
            hny.u("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            hny.u("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            hny.u("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = fhjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e55) {
            e55 e55Var = (e55) obj;
            return this.f7214a.equals(e55Var.f7214a) && this.b.equals(e55Var.b) && this.c.equals(e55Var.c) && this.d.equals(e55Var.d) && this.e == e55Var.e && this.f == e55Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.f7214a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f7214a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + ((int) this.e) + ", developmentPlatformProvider=" + this.f + "}";
    }
}
