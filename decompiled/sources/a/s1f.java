package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s1f implements y1f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31453a;

    public s1f(boolean z) {
        this.f31453a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1f) && this.f31453a == ((s1f) obj).f31453a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31453a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateKeyboardVisibility(isVisible=", Separators.RPAREN, this.f31453a);
    }
}
