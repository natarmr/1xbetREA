package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o0j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24428a;

    public o0j0(boolean z) {
        this.f24428a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0j0) && this.f24428a == ((o0j0) obj).f24428a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24428a);
    }

    public final String toString() {
        return defpackage.c.d("CheckCashSize(canClear=", Separators.RPAREN, this.f24428a);
    }
}
