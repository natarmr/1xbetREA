package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n26 implements p26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22784a;

    public n26(boolean z) {
        this.f22784a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n26) && this.f22784a == ((n26) obj).f22784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22784a);
    }

    public final String toString() {
        return defpackage.c.d("ShowDefaultSearch(showKeyboardOnStart=", Separators.RPAREN, this.f22784a);
    }
}
