package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class flp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9750a;

    public final boolean equals(Object obj) {
        if (obj instanceof flp) {
            return this.f9750a == ((flp) obj).f9750a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9750a);
    }

    public final String toString() {
        return defpackage.c.d("MultiSelectEnabled(value=", Separators.RPAREN, this.f9750a);
    }
}
