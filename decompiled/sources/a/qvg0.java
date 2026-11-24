package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qvg0 implements rvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29385a;

    public final boolean equals(Object obj) {
        if (obj instanceof qvg0) {
            return this.f29385a == ((qvg0) obj).f29385a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29385a);
    }

    public final String toString() {
        return defpackage.c.d("SuccessSale(hideCoupon=", Separators.RPAREN, this.f29385a);
    }
}
