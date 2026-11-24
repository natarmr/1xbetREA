package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ot20 extends qt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25811a;

    public ot20(boolean z) {
        this.f25811a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot20) && this.f25811a == ((ot20) obj).f25811a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25811a);
    }

    public final String toString() {
        return defpackage.c.d("Available(betMarketExpanded=", Separators.RPAREN, this.f25811a);
    }
}
