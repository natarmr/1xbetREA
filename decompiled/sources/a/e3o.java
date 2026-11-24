package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e3o implements g3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hhq0 f7147a;

    public e3o(hhq0 hhq0Var) {
        this.f7147a = hhq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3o) && this.f7147a.equals(((e3o) obj).f7147a);
    }

    public final int hashCode() {
        return this.f7147a.hashCode();
    }

    public final String toString() {
        return "OnTimeFilterSelected(model=" + this.f7147a + Separators.RPAREN;
    }
}
