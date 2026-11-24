package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bur implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3246a;

    public final boolean equals(Object obj) {
        if (obj instanceof bur) {
            return this.f3246a == ((bur) obj).f3246a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3246a);
    }

    public final String toString() {
        return defpackage.c.d("ZoneVisible(value=", Separators.RPAREN, this.f3246a);
    }
}
