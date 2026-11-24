package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xvs0 implements aws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvs0 f41577a;

    public xvs0(rvs0 rvs0Var) {
        this.f41577a = rvs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvs0) && this.f41577a.equals(((xvs0) obj).f41577a);
    }

    public final int hashCode() {
        return this.f41577a.hashCode();
    }

    public final String toString() {
        return "SetResultAndExit(result=" + this.f41577a + Separators.RPAREN;
    }
}
