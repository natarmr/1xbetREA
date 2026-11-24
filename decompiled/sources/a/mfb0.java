package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfe f21687a;
    public final boolean b;

    public mfb0(hfe hfeVar, boolean z) {
        this.f21687a = hfeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfb0)) {
            return false;
        }
        mfb0 mfb0Var = (mfb0) obj;
        return this.f21687a.equals(mfb0Var.f21687a) && this.b == mfb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21687a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularOneXGamesMapperLuckyWheelState(luckyWheel=" + this.f21687a + ", forceShowLoading=" + this.b + Separators.RPAREN;
    }
}
