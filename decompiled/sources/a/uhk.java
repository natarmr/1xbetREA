package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uhk extends bik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35683a;

    public uhk(boolean z) {
        this.f35683a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhk) && this.f35683a == ((uhk) obj).f35683a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35683a);
    }

    public final String toString() {
        return defpackage.c.d("Foldable(isFullClosed=", Separators.RPAREN, this.f35683a);
    }
}
