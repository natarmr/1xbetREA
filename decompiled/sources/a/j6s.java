package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16003a;

    public final boolean equals(Object obj) {
        if (obj instanceof j6s) {
            return this.f16003a == ((j6s) obj).f16003a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16003a);
    }

    public final String toString() {
        return defpackage.c.d("BackClick(isSystemBack=", Separators.RPAREN, this.f16003a);
    }
}
