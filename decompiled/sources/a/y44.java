package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y44 implements a54 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41984a;

    public y44(boolean z) {
        this.f41984a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y44) && this.f41984a == ((y44) obj).f41984a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41984a);
    }

    public final String toString() {
        return defpackage.c.d("OnChildLoadingChanged(isLoading=", Separators.RPAREN, this.f41984a);
    }
}
