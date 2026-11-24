package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v45 extends hdg0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public v45(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdg0) {
            v45 v45Var = (v45) ((hdg0) obj);
            if (this.b.equals(v45Var.b) && this.c.equals(v45Var.c) && this.d.equals(v45Var.d) && this.e.equals(v45Var.e) && this.f == v45Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return brm0.k(this.f, "}", sb);
    }
}
