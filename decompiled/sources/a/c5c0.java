package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3765a;

    public final boolean equals(Object obj) {
        if (obj instanceof c5c0) {
            return this.f3765a == ((c5c0) obj).f3765a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3765a);
    }

    public final String toString() {
        return defpackage.c.d("PromoButtonVisible(value=", Separators.RPAREN, this.f3765a);
    }
}
