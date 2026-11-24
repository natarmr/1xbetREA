package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mc70 implements pc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21537a;

    public mc70(boolean z) {
        this.f21537a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc70) && this.f21537a == ((mc70) obj).f21537a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21537a);
    }

    public final String toString() {
        return defpackage.c.d("Exit(demoAvailable=", Separators.RPAREN, this.f21537a);
    }
}
