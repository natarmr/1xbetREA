package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lzu0 implements pzu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20922a;

    public lzu0(boolean z) {
        this.f20922a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzu0) && this.f20922a == ((lzu0) obj).f20922a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20922a);
    }

    public final String toString() {
        return defpackage.c.d("OnChangeBalanceConfirmed(balanceHasChange=", Separators.RPAREN, this.f20922a);
    }
}
