package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15596a;
    public final boolean b;

    public iyn(boolean z, boolean z2) {
        this.f15596a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyn)) {
            return false;
        }
        iyn iynVar = (iyn) obj;
        return this.f15596a == iynVar.f15596a && this.b == iynVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f15596a) * 31);
    }

    public final String toString() {
        return hne.n("EndSessionStateModel(isLoginLaterVisible=", ", isButtonsEnable=", Separators.RPAREN, this.f15596a, this.b);
    }
}
