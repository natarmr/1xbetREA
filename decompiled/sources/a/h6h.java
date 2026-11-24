package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12528a;
    public final boolean b;

    public h6h(boolean z, long j) {
        this.f12528a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6h)) {
            return false;
        }
        h6h h6hVar = (h6h) obj;
        return this.f12528a == h6hVar.f12528a && this.b == h6hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f12528a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f12528a, "OnCategorySubGameExpandClick(subGameId=", ", isExpanded=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
