package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ojw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25380a;
    public final pjw b;

    public ojw(String str, pjw pjwVar) {
        this.f25380a = str;
        this.b = pjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojw)) {
            return false;
        }
        ojw ojwVar = (ojw) obj;
        return this.f25380a.equals(ojwVar.f25380a) && this.b == ojwVar.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f25380a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25380a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeShimmerModel(key=" + this.f25380a + ", shimmerRowType=" + this.b + Separators.RPAREN;
    }
}
