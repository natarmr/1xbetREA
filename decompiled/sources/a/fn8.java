package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9821a;
    public final boolean b;

    public fn8(boolean z, boolean z2) {
        this.f9821a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn8)) {
            return false;
        }
        fn8 fn8Var = (fn8) obj;
        return this.f9821a == fn8Var.f9821a && this.b == fn8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f9821a) * 31);
    }

    public final String toString() {
        return hne.n("BottomBarKeyModel(isAuthorized=", ", isMakeBetButtonEnabled=", Separators.RPAREN, this.f9821a, this.b);
    }
}
