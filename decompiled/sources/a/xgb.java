package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xgb implements ygb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40829a;

    public final boolean equals(Object obj) {
        if (obj instanceof xgb) {
            return this.f40829a == ((xgb) obj).f40829a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40829a);
    }

    public final String toString() {
        return defpackage.c.d("Favorite(value=", Separators.RPAREN, this.f40829a);
    }
}
