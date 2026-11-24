package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kxz implements mxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19083a;

    public /* synthetic */ kxz(String str) {
        this.f19083a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxz) {
            return this.f19083a.equals(((kxz) obj).f19083a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19083a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSetMoneyLimitClick(newLimit=", this.f19083a, Separators.RPAREN);
    }
}
