package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qpd extends rpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f29111a;

    public qpd(zmk0 zmk0Var) {
        this.f29111a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpd) && this.f29111a.equals(((qpd) obj).f29111a);
    }

    public final int hashCode() {
        return this.f29111a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoValueChanged(value=", this.f29111a, Separators.RPAREN);
    }
}
