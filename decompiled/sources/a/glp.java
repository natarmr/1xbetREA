package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class glp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11504a;

    public final boolean equals(Object obj) {
        if (obj instanceof glp) {
            return this.f11504a == ((glp) obj).f11504a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11504a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f11504a);
    }
}
