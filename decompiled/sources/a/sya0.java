package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33017a;
    public final fza0 b;

    public sya0(long j, fza0 fza0Var) {
        this.f33017a = j;
        this.b = fza0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sya0)) {
            return false;
        }
        sya0 sya0Var = (sya0) obj;
        return this.f33017a == sya0Var.f33017a && this.b == sya0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f33017a) * 31);
    }

    public final String toString() {
        return "OnGameCategoryAllClick(partitionId=" + this.f33017a + ", popularCategory=" + this.b + Separators.RPAREN;
    }
}
