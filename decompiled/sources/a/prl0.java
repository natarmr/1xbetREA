package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class prl0 implements rrl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final msl0 f27472a;

    public prl0(msl0 msl0Var) {
        this.f27472a = msl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prl0) && this.f27472a.equals(((prl0) obj).f27472a);
    }

    public final int hashCode() {
        return this.f27472a.hashCode();
    }

    public final String toString() {
        return "OnSportChecked(item=" + this.f27472a + Separators.RPAREN;
    }
}
