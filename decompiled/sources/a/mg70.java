package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mg70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21728a;

    public mg70(boolean z) {
        this.f21728a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mg70) && this.f21728a == ((mg70) obj).f21728a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21728a);
    }

    public final String toString() {
        return defpackage.c.d("ShowBetMenu(show=", Separators.RPAREN, this.f21728a);
    }
}
