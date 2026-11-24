package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ia0 implements qa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final st0 f14413a;

    public ia0(st0 st0Var) {
        this.f14413a = st0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia0) && this.f14413a.equals(((ia0) obj).f14413a);
    }

    public final int hashCode() {
        return this.f14413a.hashCode();
    }

    public final String toString() {
        return "OnAggregatorGameClick(game=" + this.f14413a + Separators.RPAREN;
    }
}
