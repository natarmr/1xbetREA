package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class p55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26388a;
    public final long b;
    public final int c;

    public p55(String str, long j, int i) {
        this.f26388a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p55)) {
            return false;
        }
        p55 p55Var = (p55) obj;
        String str = p55Var.f26388a;
        String str2 = this.f26388a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != p55Var.b) {
            return false;
        }
        int i = p55Var.c;
        int i2 = this.c;
        if (i2 == 0) {
            return i == 0;
        }
        return hne.b(i2, i);
    }

    public final int hashCode() {
        String str = this.f26388a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? hne.E(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f26388a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i == 1) {
            str = Payload.RESPONSE_OK;
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
