package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23949a;

    public nqa(boolean z) {
        this.f23949a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqa) && this.f23949a == ((nqa) obj).f23949a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23949a);
    }

    public final String toString() {
        return defpackage.c.d("PressureVisibilityChanged(visibility=", Separators.RPAREN, this.f23949a);
    }
}
