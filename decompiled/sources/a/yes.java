package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yes extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f42504a;

    public yes(ank0 ank0Var) {
        this.f42504a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yes) && this.f42504a.equals(((yes) obj).f42504a);
    }

    public final int hashCode() {
        return this.f42504a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("CentralZoneChanged(centralZoneActions=", this.f42504a, Separators.RPAREN);
    }
}
