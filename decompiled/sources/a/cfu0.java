package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4281a;
    public final boolean b;

    public cfu0(String str, boolean z) {
        this.f4281a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfu0)) {
            return false;
        }
        cfu0 cfu0Var = (cfu0) obj;
        return this.f4281a.equals(cfu0Var.f4281a) && this.b == cfu0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f4281a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("VideoPausePlaceholder(path=", this.f4281a, ", withDefaultImage=", this.b, Separators.RPAREN);
    }
}
