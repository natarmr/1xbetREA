package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qcn0 implements ycn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f28492a;

    public qcn0(bem bemVar) {
        this.f28492a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcn0) && this.f28492a.equals(((qcn0) obj).f28492a);
    }

    public final int hashCode() {
        return this.f28492a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f28492a, Separators.RPAREN);
    }
}
