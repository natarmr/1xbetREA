package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfe f18187a;
    public final boolean b;

    public kfb0(hfe hfeVar, boolean z) {
        this.f18187a = hfeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfb0)) {
            return false;
        }
        kfb0 kfb0Var = (kfb0) obj;
        return this.f18187a.equals(kfb0Var.f18187a) && this.b == kfb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18187a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularOneXGamesMapperJackpotState(jackpot=" + this.f18187a + ", forceShowLoading=" + this.b + Separators.RPAREN;
    }
}
