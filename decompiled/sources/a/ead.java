package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ead implements fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg30 f7459a;

    public ead(jg30 jg30Var) {
        this.f7459a = jg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ead) && this.f7459a.equals(((ead) obj).f7459a);
    }

    public final int hashCode() {
        return this.f7459a.hashCode();
    }

    public final String toString() {
        return "Timer(value=" + this.f7459a + Separators.RPAREN;
    }
}
