package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cfs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f4278a;

    public cfs(ank0 ank0Var) {
        this.f4278a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfs) && this.f4278a.equals(((cfs) obj).f4278a);
    }

    public final int hashCode() {
        return this.f4278a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("RightZoneChanged(rightZoneActions=", this.f4278a, Separators.RPAREN);
    }
}
