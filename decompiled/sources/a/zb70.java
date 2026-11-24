package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44101a;

    public zb70(boolean z) {
        this.f44101a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb70) && this.f44101a == ((zb70) obj).f44101a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44101a);
    }

    public final String toString() {
        return defpackage.c.d("OneXGamesWebGameTaxState(visible=", Separators.RPAREN, this.f44101a);
    }
}
