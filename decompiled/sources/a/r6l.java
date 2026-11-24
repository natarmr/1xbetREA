package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r6l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29938a;

    public final boolean equals(Object obj) {
        if (obj instanceof r6l) {
            return this.f29938a == ((r6l) obj).f29938a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29938a);
    }

    public final String toString() {
        return defpackage.c.d("Alive(value=", Separators.RPAREN, this.f29938a);
    }
}
