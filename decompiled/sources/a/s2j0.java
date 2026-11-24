package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31503a;

    public final boolean equals(Object obj) {
        if (obj instanceof s2j0) {
            return this.f31503a == ((s2j0) obj).f31503a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31503a);
    }

    public final String toString() {
        return defpackage.c.d("ClearCoupon(hasEnable=", Separators.RPAREN, this.f31503a);
    }
}
