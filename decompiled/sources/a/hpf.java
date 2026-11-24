package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13439a;
    public final int b;

    public hpf(int i, int i2) {
        this.f13439a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpf)) {
            return false;
        }
        hpf hpfVar = (hpf) obj;
        return this.f13439a == hpfVar.f13439a && this.b == hpfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f13439a) * 31);
    }

    public final String toString() {
        return ohs0.m("Cs2MapSplitBounds(top=", this.f13439a, ", bottom=", Separators.RPAREN, this.b);
    }
}
