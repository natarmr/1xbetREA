package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ffm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz10 f9453a;

    public ffm0(fz10 fz10Var) {
        this.f9453a = fz10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffm0) && this.f9453a.equals(((ffm0) obj).f9453a);
    }

    public final int hashCode() {
        return this.f9453a.f10387a.hashCode();
    }

    public final String toString() {
        return "StatisticModel(mainModel=" + this.f9453a + Separators.RPAREN;
    }
}
