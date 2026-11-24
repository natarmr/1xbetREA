package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ajp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f988a;

    public ajp(boolean z) {
        this.f988a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajp) && this.f988a == ((ajp) obj).f988a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f988a);
    }

    public final String toString() {
        return defpackage.c.d("OnBackPressed(clearTimeFilters=", Separators.RPAREN, this.f988a);
    }
}
