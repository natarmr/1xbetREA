package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gtr implements htr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11894a;

    public gtr(boolean z) {
        this.f11894a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtr) && this.f11894a == ((gtr) obj).f11894a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11894a);
    }

    public final String toString() {
        return defpackage.c.d("Shimmers(isScrollable=", Separators.RPAREN, this.f11894a);
    }
}
