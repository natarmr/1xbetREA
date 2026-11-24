package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class im1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15003a;
    public final boolean b;

    public im1(boolean z, boolean z2) {
        this.f15003a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im1)) {
            return false;
        }
        im1 im1Var = (im1) obj;
        return this.f15003a == im1Var.f15003a && this.b == im1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f15003a) * 31);
    }

    public final String toString() {
        return hne.n("PartTypeTwoGamesScreen(fromSuccessfulSearch=", ", showNavBar=", Separators.RPAREN, this.f15003a, this.b);
    }
}
