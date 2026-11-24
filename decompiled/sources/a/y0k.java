package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y0k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41809a;

    public final boolean equals(Object obj) {
        if (obj instanceof y0k) {
            return this.f41809a == ((y0k) obj).f41809a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41809a);
    }

    public final String toString() {
        return defpackage.c.d("OnCompactClicked(isExpandable=", Separators.RPAREN, this.f41809a);
    }
}
