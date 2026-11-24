package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ria0 f18378a;

    public kja0(ria0 ria0Var) {
        this.f18378a = ria0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kja0) && this.f18378a.equals(((kja0) obj).f18378a);
    }

    public final int hashCode() {
        return this.f18378a.hashCode();
    }

    public final String toString() {
        return "OnFilterChosen(filterItem=" + this.f18378a + Separators.RPAREN;
    }
}
