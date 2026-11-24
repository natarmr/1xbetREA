package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k5c0 implements m5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17713a;

    public final boolean equals(Object obj) {
        if (obj instanceof k5c0) {
            return this.f17713a == ((k5c0) obj).f17713a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17713a);
    }

    public final String toString() {
        return defpackage.c.d("BalanceVisible(value=", Separators.RPAREN, this.f17713a);
    }
}
