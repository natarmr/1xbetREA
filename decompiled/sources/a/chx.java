package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class chx implements ehx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv20 f4383a;

    public chx(iv20 iv20Var) {
        this.f4383a = iv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chx) && this.f4383a.equals(((chx) obj).f4383a);
    }

    public final int hashCode() {
        return this.f4383a.hashCode();
    }

    public final String toString() {
        return "MarketGroup(delegateAction=" + this.f4383a + Separators.RPAREN;
    }
}
