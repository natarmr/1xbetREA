package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21011a;

    public m1j0(boolean z) {
        this.f21011a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1j0) && this.f21011a == ((m1j0) obj).f21011a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21011a);
    }

    public final String toString() {
        return defpackage.c.d("ShowWarningOpenSiteDialog(officialSite=", Separators.RPAREN, this.f21011a);
    }
}
