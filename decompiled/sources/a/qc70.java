package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28472a;

    public qc70(boolean z) {
        this.f28472a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc70) && this.f28472a == ((qc70) obj).f28472a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28472a);
    }

    public final String toString() {
        return defpackage.c.d("OneXGamesWebGameUnauthorizedDemoState(demoAvailable=", Separators.RPAREN, this.f28472a);
    }
}
