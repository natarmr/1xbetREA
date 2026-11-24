package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f6k0 implements g6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9016a;

    public f6k0(boolean z) {
        this.f9016a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6k0) && this.f9016a == ((f6k0) obj).f9016a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9016a);
    }

    public final String toString() {
        return defpackage.c.d("RegistrationFailed(isTimeout=", Separators.RPAREN, this.f9016a);
    }
}
