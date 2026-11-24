package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nrn0 implements qrn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24011a;

    public nrn0(boolean z) {
        this.f24011a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrn0) && this.f24011a == ((nrn0) obj).f24011a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24011a);
    }

    public final String toString() {
        return defpackage.c.d("ChangeStateWaitDialog(isClosed=", Separators.RPAREN, this.f24011a);
    }
}
