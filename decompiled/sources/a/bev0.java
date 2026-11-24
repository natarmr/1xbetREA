package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bev0 implements cev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdv0 f2470a;

    public bev0(zdv0 zdv0Var) {
        this.f2470a = zdv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bev0) && this.f2470a == ((bev0) obj).f2470a;
    }

    public final int hashCode() {
        return this.f2470a.hashCode();
    }

    public final String toString() {
        return "Shimmer(style=" + this.f2470a + Separators.RPAREN;
    }
}
