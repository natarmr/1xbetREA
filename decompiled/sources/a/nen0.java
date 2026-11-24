package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nen0 implements pen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23394a;

    public nen0(boolean z) {
        this.f23394a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nen0) && this.f23394a == ((nen0) obj).f23394a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23394a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return defpackage.c.d("Loading(isRefreshing=false, isTablet=", Separators.RPAREN, this.f23394a);
    }
}
