package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yx50 implements by50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra0 f43404a;

    public yx50(ra0 ra0Var) {
        this.f43404a = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx50) && this.f43404a.equals(((yx50) obj).f43404a);
    }

    public final int hashCode() {
        return this.f43404a.hashCode();
    }

    public final String toString() {
        return "OnAggregatorActionCardClicked(item=" + this.f43404a + Separators.RPAREN;
    }
}
