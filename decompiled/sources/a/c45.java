package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class c45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3708a;
    public final String b;
    public final String c;
    public final p55 d;
    public final int e;

    public c45(String str, String str2, String str3, p55 p55Var, int i) {
        this.f3708a = str;
        this.b = str2;
        this.c = str3;
        this.d = p55Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c45)) {
            return false;
        }
        c45 c45Var = (c45) obj;
        String str = c45Var.f3708a;
        String str2 = this.f3708a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c45Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c45Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        p55 p55Var = c45Var.d;
        p55 p55Var2 = this.d;
        if (p55Var2 == null) {
            if (p55Var != null) {
                return false;
            }
        } else if (!p55Var2.equals(p55Var)) {
            return false;
        }
        int i = c45Var.e;
        int i2 = this.e;
        if (i2 == 0) {
            return i == 0;
        }
        return hne.b(i2, i);
    }

    public final int hashCode() {
        String str = this.f3708a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        p55 p55Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (p55Var == null ? 0 : p55Var.hashCode())) * 1000003;
        int i = this.e;
        return iHashCode4 ^ (i != 0 ? hne.E(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f3708a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = Payload.RESPONSE_OK;
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
