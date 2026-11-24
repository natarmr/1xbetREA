package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class er70 implements fr70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8267a;

    public er70(boolean z) {
        this.f8267a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er70) && this.f8267a == ((er70) obj).f8267a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8267a);
    }

    public final String toString() {
        return defpackage.c.d("RegistrationFailed(isTimeout=", Separators.RPAREN, this.f8267a);
    }
}
