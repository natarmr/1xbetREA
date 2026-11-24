package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hlp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13275a;

    public final boolean equals(Object obj) {
        if (obj instanceof hlp) {
            return this.f13275a == ((hlp) obj).f13275a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13275a);
    }

    public final String toString() {
        return defpackage.c.d("SelectionEnabled(value=", Separators.RPAREN, this.f13275a);
    }
}
