package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class edh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7618a;
    public final int b;

    public edh0(int i, int i2) {
        this.f7618a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edh0)) {
            return false;
        }
        edh0 edh0Var = (edh0) obj;
        return this.f7618a == edh0Var.f7618a && this.b == edh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7618a) * 31);
    }

    public final String toString() {
        return ohs0.m("SeaBattleGameCoordinate(horizontal=", this.f7618a, ", vertical=", Separators.RPAREN, this.b);
    }
}
