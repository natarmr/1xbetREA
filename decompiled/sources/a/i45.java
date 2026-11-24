package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i45 extends nv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14129a;
    public final long b;
    public final s15 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public i45(long j, long j2, s15 s15Var, Integer num, String str, ArrayList arrayList) {
        xed0 xed0Var = xed0.f40741a;
        this.f14129a = j;
        this.b = j2;
        this.c = s15Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv00)) {
            return false;
        }
        i45 i45Var = (i45) ((nv00) obj);
        if (this.f14129a != i45Var.f14129a || this.b != i45Var.b || !this.c.equals(i45Var.c)) {
            return false;
        }
        Integer num = i45Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = i45Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(i45Var.f)) {
            return false;
        }
        Object obj2 = xed0.f40741a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f14129a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ xed0.f40741a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14129a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + xed0.f40741a + "}";
    }
}
