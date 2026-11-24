package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18351a;
    public final ch00 b;

    public kis(boolean z, ch00 ch00Var) {
        this.f18351a = z;
        this.b = ch00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kis)) {
            return false;
        }
        kis kisVar = (kis) obj;
        return this.f18351a == kisVar.f18351a && this.b == kisVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f18351a) * 31);
    }

    public final String toString() {
        return "ExpandClick(isExpanded=" + this.f18351a + ", type=" + this.b + Separators.RPAREN;
    }
}
