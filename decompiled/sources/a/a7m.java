package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a7m implements b7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an90 f378a;

    public a7m(an90 an90Var) {
        this.f378a = an90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7m) && this.f378a.equals(((a7m) obj).f378a);
    }

    public final int hashCode() {
        return this.f378a.hashCode();
    }

    public final String toString() {
        return "Undefined(state=" + this.f378a + Separators.RPAREN;
    }
}
