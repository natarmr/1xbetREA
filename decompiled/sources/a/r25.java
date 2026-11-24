package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r25 extends a9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29713a;
    public final long b;
    public final String c;
    public final String d;

    public r25(long j, long j2, String str, String str2) {
        this.f29713a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a9f) {
            r25 r25Var = (r25) ((a9f) obj);
            if (this.f29713a == r25Var.f29713a && this.b == r25Var.b && this.c.equals(r25Var.c)) {
                String str = r25Var.d;
                String str2 = this.d;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29713a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f29713a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return axq.n(sb, this.d, "}");
    }
}
