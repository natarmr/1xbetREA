package a;

/* JADX INFO: loaded from: classes.dex */
public final class kv40 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18938a;
    public final long b;
    public final long c;

    public kv40(long j, long j2, long j3) {
        this.f18938a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv40)) {
            return false;
        }
        kv40 kv40Var = (kv40) obj;
        return this.f18938a == kv40Var.f18938a && this.b == kv40Var.b && this.c == kv40Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(rw2.b(527, 31, this.f18938a), 31, this.b);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f18938a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
