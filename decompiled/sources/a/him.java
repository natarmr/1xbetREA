package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class him implements kim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13119a;

    public him(boolean z) {
        this.f13119a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof him) && this.f13119a == ((him) obj).f13119a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13119a);
    }

    public final String toString() {
        return defpackage.c.d("OnSearchFocusChanged(isFocused=", Separators.RPAREN, this.f13119a);
    }
}
