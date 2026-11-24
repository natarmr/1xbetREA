package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class in8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15060a;
    public final boolean b;
    public final boolean c;

    public in8(String str, boolean z, boolean z2) {
        this.f15060a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in8)) {
            return false;
        }
        in8 in8Var = (in8) obj;
        return this.f15060a.equals(in8Var.f15060a) && this.b == in8Var.b && this.c == in8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f15060a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("BottomBarUiModel(counter=", this.f15060a, ", isMakeBetEnabled=", this.b, ", isClearEnabled="), this.c, Separators.RPAREN);
    }
}
