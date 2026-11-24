package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ykp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42802a;

    public final boolean equals(Object obj) {
        if (obj instanceof ykp) {
            return this.f42802a == ((ykp) obj).f42802a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42802a);
    }

    public final String toString() {
        return defpackage.c.d("Expanded(value=", Separators.RPAREN, this.f42802a);
    }
}
