package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uce implements ode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hds0 f35425a;

    public uce(hds0 hds0Var) {
        this.f35425a = hds0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uce) && this.f35425a.equals(((uce) obj).f35425a);
    }

    public final int hashCode() {
        return this.f35425a.hashCode();
    }

    public final String toString() {
        return "Empty(item=" + this.f35425a + Separators.RPAREN;
    }
}
