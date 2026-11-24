package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vzl0 implements wzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38305a;

    public vzl0(boolean z) {
        this.f38305a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzl0) && this.f38305a == ((vzl0) obj).f38305a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38305a);
    }

    public final String toString() {
        return defpackage.c.d("ToggleVisibleKeyboard(isVisible=", Separators.RPAREN, this.f38305a);
    }
}
