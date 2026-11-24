package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qk70 extends rk70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28872a;

    public qk70(boolean z) {
        this.f28872a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk70) && this.f28872a == ((qk70) obj).f28872a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28872a);
    }

    public final String toString() {
        return defpackage.c.d("EnableClickableFragment(enable=", Separators.RPAREN, this.f28872a);
    }
}
