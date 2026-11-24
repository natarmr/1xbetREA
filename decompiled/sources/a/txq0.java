package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class txq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv60 f34714a;

    public txq0(zv60 zv60Var) {
        this.f34714a = zv60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txq0) && this.f34714a.equals(((txq0) obj).f34714a);
    }

    public final int hashCode() {
        return this.f34714a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f34714a + Separators.RPAREN;
    }
}
