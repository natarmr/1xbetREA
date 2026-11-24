package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22982a;

    public final boolean equals(Object obj) {
        if (obj instanceof n67) {
            return this.f22982a == ((n67) obj).f22982a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22982a);
    }

    public final String toString() {
        return defpackage.c.d("ShowChangeBalance(showBonusAccounts=", Separators.RPAREN, this.f22982a);
    }
}
