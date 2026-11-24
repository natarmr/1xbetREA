package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qrl0 implements rrl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29217a;
    public final int b;

    public qrl0(int i, int i2) {
        this.f29217a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrl0)) {
            return false;
        }
        qrl0 qrl0Var = (qrl0) obj;
        return this.f29217a == qrl0Var.f29217a && this.b == qrl0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f29217a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnSportsMoved(fromPosition=", this.f29217a, ", toPosition=", Separators.RPAREN, this.b);
    }
}
