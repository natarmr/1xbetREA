package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class llp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20259a;

    public final boolean equals(Object obj) {
        if (obj instanceof llp) {
            return this.f20259a == ((llp) obj).f20259a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20259a);
    }

    public final String toString() {
        return defpackage.c.d("MultiSelectEnabled(value=", Separators.RPAREN, this.f20259a);
    }
}
