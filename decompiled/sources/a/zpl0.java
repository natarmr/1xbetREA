package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zpl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44765a;
    public final long b;
    public final boolean c;

    public zpl0(int i, long j, boolean z) {
        this.f44765a = i;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpl0)) {
            return false;
        }
        zpl0 zpl0Var = (zpl0) obj;
        return this.f44765a == zpl0Var.f44765a && this.b == zpl0Var.b && this.c == zpl0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Integer.hashCode(this.f44765a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(vqd.q(this.f44765a, this.b, "SportState(index=", ", id="), ", checked=", this.c, Separators.RPAREN);
    }
}
