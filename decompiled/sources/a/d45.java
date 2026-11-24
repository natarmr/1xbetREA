package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5438a;
    public final long b;
    public final long c;

    public d45(long j, long j2, String str) {
        this.f5438a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d45) {
            d45 d45Var = (d45) obj;
            if (this.f5438a.equals(d45Var.f5438a) && this.b == d45Var.b && this.c == d45Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5438a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f5438a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return brm0.k(this.c, "}", sb);
    }
}
