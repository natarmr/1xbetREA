package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40301a;

    public x58(boolean z) {
        this.f40301a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x58) && this.f40301a == ((x58) obj).f40301a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40301a);
    }

    public final String toString() {
        return defpackage.c.d("BiometryAvailabilityUiState(isBiometryAvailable=", Separators.RPAREN, this.f40301a);
    }
}
