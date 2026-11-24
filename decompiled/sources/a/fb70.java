package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fb70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9243a;

    public fb70(boolean z) {
        this.f9243a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb70) && this.f9243a == ((fb70) obj).f9243a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9243a);
    }

    public final String toString() {
        return defpackage.c.d("ShowDemoUnavailableDialog(userAuthorized=", Separators.RPAREN, this.f9243a);
    }
}
