package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1941a;
    public final String b;
    public final String c;

    public b45(String str, String str2, String str3) {
        if (str == null) {
            hny.u("Null crashlyticsInstallId");
            throw null;
        }
        this.f1941a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b45) {
            b45 b45Var = (b45) obj;
            if (this.f1941a.equals(b45Var.f1941a)) {
                String str = b45Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b45Var.c;
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1941a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f1941a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return axq.n(sb, this.c, "}");
    }
}
