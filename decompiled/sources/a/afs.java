package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class afs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f793a;

    public afs(ank0 ank0Var) {
        this.f793a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afs) && this.f793a.equals(((afs) obj).f793a);
    }

    public final int hashCode() {
        return this.f793a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("LeftZoneChanged(leftZoneActions=", this.f793a, Separators.RPAREN);
    }
}
