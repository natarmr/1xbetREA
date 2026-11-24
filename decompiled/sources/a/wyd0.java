package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wyd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39970a;
    public final int b;

    public wyd0(String str, int i) {
        this.f39970a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyd0)) {
            return false;
        }
        wyd0 wyd0Var = (wyd0) obj;
        return this.f39970a.equals(wyd0Var.f39970a) && this.b == wyd0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39970a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "RainbowStatisticMatchesComparisonTeamBannedMapsModel(name=", this.f39970a, ", count=", Separators.RPAREN);
    }
}
