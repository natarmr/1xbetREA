package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c35 extends l9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9f f3656a;
    public final String b;
    public final String c;
    public final long d;

    public c35(d35 d35Var, String str, String str2, long j) {
        this.f3656a = d35Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l9f) {
            c35 c35Var = (c35) ((l9f) obj);
            if (this.f3656a.equals(c35Var.f3656a) && this.b.equals(c35Var.b) && this.c.equals(c35Var.c) && this.d == c35Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3656a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f3656a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return brm0.k(this.d, "}", sb);
    }
}
