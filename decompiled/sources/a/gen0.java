package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gen0 implements ien0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11165a;

    public gen0(boolean z) {
        this.f11165a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gen0) && this.f11165a == ((gen0) obj).f11165a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11165a);
    }

    public final String toString() {
        return defpackage.c.d("SetBasketButtonEnabled(enabled=", Separators.RPAREN, this.f11165a);
    }
}
