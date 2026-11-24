package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3605a;
    public final boolean b;

    public c230(boolean z, long j) {
        this.f3605a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c230)) {
            return false;
        }
        c230 c230Var = (c230) obj;
        return this.f3605a == c230Var.f3605a && this.b == c230Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f3605a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f3605a, "OnCategorySubGameExpandClick(subGameId=", ", isExpanded=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
