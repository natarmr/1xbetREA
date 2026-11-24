package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n680 f6542a;

    public dr4(n680 n680Var) {
        this.f6542a = n680Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr4) && this.f6542a == ((dr4) obj).f6542a;
    }

    public final int hashCode() {
        return this.f6542a.hashCode();
    }

    public final String toString() {
        return "DismissWithResult(optionModel=" + this.f6542a + Separators.RPAREN;
    }
}
