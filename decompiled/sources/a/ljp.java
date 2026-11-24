package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ljp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20163a;

    public ljp(boolean z) {
        this.f20163a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljp) && this.f20163a == ((ljp) obj).f20163a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20163a);
    }

    public final String toString() {
        return defpackage.c.d("OnSearchFocusChanged(isFocused=", Separators.RPAREN, this.f20163a);
    }
}
