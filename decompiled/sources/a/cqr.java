package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4810a;
    public final int b;
    public final boolean c;

    public cqr(String str, int i, boolean z) {
        this.f4810a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqr)) {
            return false;
        }
        cqr cqrVar = (cqr) obj;
        return this.f4810a.equals(cqrVar.f4810a) && this.b == cqrVar.b && this.c == cqrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f4810a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "GameBackgroundUiModel(imageUrl=", this.f4810a, ", color=", ", rtlReflect="), this.c, Separators.RPAREN);
    }
}
