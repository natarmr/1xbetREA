package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pjs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27106a;
    public final String b;

    public pjs0(String str, String str2) {
        this.f27106a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjs0)) {
            return false;
        }
        pjs0 pjs0Var = (pjs0) obj;
        return this.f27106a.equals(pjs0Var.f27106a) && this.b.equals(pjs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27106a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TransfersPlayerModel(nickname=", this.f27106a, ", image=", this.b, Separators.RPAREN);
    }
}
