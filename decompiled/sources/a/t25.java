package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t25 extends c9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33199a;
    public final String b;
    public final long c;

    public t25(String str, String str2, long j) {
        this.f33199a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c9f) {
            t25 t25Var = (t25) ((c9f) obj);
            if (this.f33199a.equals(t25Var.f33199a) && this.b.equals(t25Var.b) && this.c == t25Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f33199a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f33199a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return brm0.k(this.c, "}", sb);
    }
}
