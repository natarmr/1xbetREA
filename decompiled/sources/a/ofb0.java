package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ofb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfe f25158a;
    public final boolean b;

    public ofb0(hfe hfeVar, boolean z) {
        this.f25158a = hfeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb0)) {
            return false;
        }
        ofb0 ofb0Var = (ofb0) obj;
        return this.f25158a.equals(ofb0Var.f25158a) && this.b == ofb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f25158a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularOneXGamesMapperSpotlightState(spotlight=" + this.f25158a + ", showLoading=" + this.b + Separators.RPAREN;
    }
}
