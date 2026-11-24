package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p6l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26460a;

    public final boolean equals(Object obj) {
        if (obj instanceof p6l) {
            return this.f26460a == ((p6l) obj).f26460a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26460a);
    }

    public final String toString() {
        return defpackage.c.d("Aegis(value=", Separators.RPAREN, this.f26460a);
    }
}
