package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wdn0 implements den0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38982a;

    public wdn0(boolean z) {
        this.f38982a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdn0) && this.f38982a == ((wdn0) obj).f38982a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38982a);
    }

    public final String toString() {
        return defpackage.c.d("SetBasketButtonEnabled(enabled=", Separators.RPAREN, this.f38982a);
    }
}
