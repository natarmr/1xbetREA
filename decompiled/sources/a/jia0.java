package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sha0 f16565a;

    public jia0(sha0 sha0Var) {
        this.f16565a = sha0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jia0) && this.f16565a.equals(((jia0) obj).f16565a);
    }

    public final int hashCode() {
        return this.f16565a.hashCode();
    }

    public final String toString() {
        return "OnFilterChosen(filterItem=" + this.f16565a + Separators.RPAREN;
    }
}
