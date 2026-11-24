package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w25 extends d9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38433a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public w25(int i, long j, long j2, String str, String str2) {
        this.f38433a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d9f) {
            w25 w25Var = (w25) ((d9f) obj);
            if (this.f38433a == w25Var.f38433a && this.b.equals(w25Var.b)) {
                String str = w25Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == w25Var.d && this.e == w25Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f38433a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f38433a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return rz4.j(this.e, "}", sb);
    }
}
