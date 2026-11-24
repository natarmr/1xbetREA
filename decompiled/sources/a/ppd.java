package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ppd extends rpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f27370a;

    public ppd(zmk0 zmk0Var) {
        this.f27370a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppd) && this.f27370a.equals(((ppd) obj).f27370a);
    }

    public final int hashCode() {
        return this.f27370a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamOneValueChanged(value=", this.f27370a, Separators.RPAREN);
    }
}
