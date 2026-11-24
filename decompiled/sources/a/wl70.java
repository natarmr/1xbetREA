package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wl70 implements xl70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39339a;

    public wl70(boolean z) {
        this.f39339a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl70) && this.f39339a == ((wl70) obj).f39339a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39339a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return defpackage.c.d("ShowLoader(show=false, showOptions=", Separators.RPAREN, this.f39339a);
    }
}
