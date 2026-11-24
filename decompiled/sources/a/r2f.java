package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29730a;
    public final boolean b;
    public final boolean c;

    public r2f(boolean z, boolean z2, boolean z3) {
        this.f29730a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2f)) {
            return false;
        }
        r2f r2fVar = (r2f) obj;
        return this.f29730a == r2fVar.f29730a && this.b == r2fVar.b && this.c == r2fVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f29730a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("BottomBarState(isScanButtonVisible=", ", isKeyboardVisible=", ", isActionEnabled=", this.f29730a, this.b), this.c, Separators.RPAREN);
    }
}
