package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21392a;
    public final boolean b;

    public m90(boolean z, boolean z2) {
        this.f21392a = z;
        this.b = z2;
    }

    public static m90 a(m90 m90Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = m90Var.f21392a;
        }
        if ((i & 2) != 0) {
            z2 = m90Var.b;
        }
        m90Var.getClass();
        return new m90(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        return this.f21392a == m90Var.f21392a && this.b == m90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f21392a) * 31);
    }

    public final String toString() {
        return hne.n("ViewState(showPlayButton=", ", instantBetAllowed=", Separators.RPAREN, this.f21392a, this.b);
    }
}
