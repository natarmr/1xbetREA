package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final class m15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20988a;
    public final long b;

    public m15(int i, long j) {
        if (i == 0) {
            hny.u("Null status");
            throw null;
        }
        this.f20988a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m15)) {
            return false;
        }
        m15 m15Var = (m15) obj;
        return hne.b(this.f20988a, m15Var.f20988a) && this.b == m15Var.b;
    }

    public final int hashCode() {
        int iE = (hne.E(this.f20988a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iE;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f20988a;
        if (i == 1) {
            str = Payload.RESPONSE_OK;
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return brm0.k(this.b, "}", sb);
    }
}
