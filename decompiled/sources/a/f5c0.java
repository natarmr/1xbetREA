package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8956a;

    public final boolean equals(Object obj) {
        if (obj instanceof f5c0) {
            return this.f8956a == ((f5c0) obj).f8956a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8956a);
    }

    public final String toString() {
        return defpackage.c.d("PromotionsVisible(value=", Separators.RPAREN, this.f8956a);
    }
}
