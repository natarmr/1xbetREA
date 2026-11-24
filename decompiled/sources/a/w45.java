package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w45 extends idg0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public w45(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            hny.u("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            hny.u("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            hny.u("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof idg0)) {
            return false;
        }
        w45 w45Var = (w45) ((idg0) obj);
        return this.b.equals(w45Var.b) && this.c.equals(w45Var.c) && this.d.equals(w45Var.d) && this.e.equals(w45Var.e) && this.f == w45Var.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return brm0.k(this.f, "}", sb);
    }
}
