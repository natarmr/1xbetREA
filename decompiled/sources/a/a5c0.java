package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265a;

    public final boolean equals(Object obj) {
        if (obj instanceof a5c0) {
            return this.f265a == ((a5c0) obj).f265a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265a);
    }

    public final String toString() {
        return defpackage.c.d("PromoBalanceVisible(value=", Separators.RPAREN, this.f265a);
    }
}
