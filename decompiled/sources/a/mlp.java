package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mlp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22003a;

    public final boolean equals(Object obj) {
        if (obj instanceof mlp) {
            return this.f22003a == ((mlp) obj).f22003a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22003a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f22003a);
    }
}
