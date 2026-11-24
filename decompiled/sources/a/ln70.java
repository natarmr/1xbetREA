package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ln70 extends qn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20331a;
    public final boolean b;

    public ln70(boolean z, boolean z2) {
        this.f20331a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln70)) {
            return false;
        }
        ln70 ln70Var = (ln70) obj;
        return this.f20331a == ln70Var.f20331a && this.b == ln70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f20331a) * 31);
    }

    public final String toString() {
        return hne.n("OnBonusChanged(showMenu=", ", showFreePlayButton=", Separators.RPAREN, this.f20331a, this.b);
    }
}
