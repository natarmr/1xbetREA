package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ie40 implements le40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he40 f14615a;

    public ie40(he40 he40Var) {
        this.f14615a = he40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie40) && this.f14615a.equals(((ie40) obj).f14615a);
    }

    public final int hashCode() {
        return this.f14615a.hashCode();
    }

    public final String toString() {
        return "Data(sectionUiModel=" + this.f14615a + Separators.RPAREN;
    }
}
