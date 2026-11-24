package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class unj0 implements vnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmj0 f35965a;

    public unj0(pmj0 pmj0Var) {
        this.f35965a = pmj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unj0) && this.f35965a.equals(((unj0) obj).f35965a);
    }

    public final int hashCode() {
        return this.f35965a.hashCode();
    }

    public final String toString() {
        return "Loading(buttonsUiModel=" + this.f35965a + Separators.RPAREN;
    }
}
