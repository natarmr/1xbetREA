package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l5c0 implements m5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19447a;

    public final boolean equals(Object obj) {
        if (obj instanceof l5c0) {
            return this.f19447a == ((l5c0) obj).f19447a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19447a);
    }

    public final String toString() {
        return defpackage.c.d("PromoItemsVisible(value=", Separators.RPAREN, this.f19447a);
    }
}
