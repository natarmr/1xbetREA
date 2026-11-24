package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1997a;

    public final boolean equals(Object obj) {
        if (obj instanceof b5c0) {
            return this.f1997a == ((b5c0) obj).f1997a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1997a);
    }

    public final String toString() {
        return defpackage.c.d("PromoButtonLoading(value=", Separators.RPAREN, this.f1997a);
    }
}
