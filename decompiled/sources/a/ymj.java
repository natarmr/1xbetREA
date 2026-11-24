package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ymj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42891a;

    public ymj(boolean z) {
        this.f42891a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymj) && this.f42891a == ((ymj) obj).f42891a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42891a);
    }

    public final String toString() {
        return defpackage.c.d("Express(hasBackStack=", Separators.RPAREN, this.f42891a);
    }
}
