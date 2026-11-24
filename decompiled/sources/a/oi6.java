package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class oi6 implements qi6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c130 f25297a;

    public oi6(c130 c130Var) {
        this.f25297a = c130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi6) && this.f25297a.equals(((oi6) obj).f25297a);
    }

    public final int hashCode() {
        return this.f25297a.hashCode();
    }

    public final String toString() {
        return "InfoClick(delegateAction=" + this.f25297a + Separators.RPAREN;
    }
}
