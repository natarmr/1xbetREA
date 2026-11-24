package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rk5 implements sk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30631a;

    public rk5(boolean z) {
        this.f30631a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk5) && this.f30631a == ((rk5) obj).f30631a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30631a);
    }

    public final String toString() {
        return defpackage.c.d("StopShimmers(hasTransactionHistoryTitle=", Separators.RPAREN, this.f30631a);
    }
}
