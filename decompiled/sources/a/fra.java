package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fra implements qra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dta f10009a;

    public fra(dta dtaVar) {
        this.f10009a = dtaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fra) && this.f10009a.equals(((fra) obj).f10009a);
    }

    public final int hashCode() {
        return this.f10009a.hashCode();
    }

    public final String toString() {
        return "OnChangeOpenTab(tabState=" + this.f10009a + Separators.RPAREN;
    }
}
