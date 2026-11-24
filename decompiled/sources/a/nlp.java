package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nlp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23739a;

    public final boolean equals(Object obj) {
        if (obj instanceof nlp) {
            return this.f23739a == ((nlp) obj).f23739a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23739a);
    }

    public final String toString() {
        return defpackage.c.d("SelectionEnabled(value=", Separators.RPAREN, this.f23739a);
    }
}
