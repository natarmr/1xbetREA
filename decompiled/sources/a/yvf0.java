package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yvf0 implements awf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43317a;
    public final String b;

    public yvf0(String str, String str2) {
        this.f43317a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvf0)) {
            return false;
        }
        yvf0 yvf0Var = (yvf0) obj;
        return this.f43317a.equals(yvf0Var.f43317a) && this.b.equals(yvf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43317a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ResponsibleTitleUiModel(title=", this.f43317a, ", description=", this.b, Separators.RPAREN);
    }
}
