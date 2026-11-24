package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eqe implements gqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qkt f8234a;

    public eqe(qkt qktVar) {
        this.f8234a = qktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqe) && this.f8234a.equals(((eqe) obj).f8234a);
    }

    public final int hashCode() {
        return this.f8234a.hashCode();
    }

    public final String toString() {
        return "ExitWithResult(item=" + this.f8234a + Separators.RPAREN;
    }
}
