package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class x1s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40135a;
    public final long b;
    public final long c;
    public final String d;

    public x1s0(long j, long j2, String str, String str2) {
        this.f40135a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1s0)) {
            return false;
        }
        x1s0 x1s0Var = (x1s0) obj;
        return this.f40135a.equals(x1s0Var.f40135a) && this.b == x1s0Var.b && this.c == x1s0Var.c && this.d.equals(x1s0Var.d);
    }

    public final int hashCode() {
        return ua80.b(rw2.b(rw2.b(this.f40135a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "TournamentItemModel(userName=", this.f40135a, ", points=");
        kng0.A(sbO, ", place=", this.c, ", prize=");
        return axq.n(sbO, this.d, ", imageUrl=)");
    }
}
