package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16779a;

    public final boolean equals(Object obj) {
        if (obj instanceof jmr) {
            return this.f16779a == ((jmr) obj).f16779a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16779a);
    }

    public final String toString() {
        return defpackage.c.d("BackClick(isSystemBack=", Separators.RPAREN, this.f16779a);
    }
}
