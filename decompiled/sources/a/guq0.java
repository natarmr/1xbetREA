package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class guq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11942a;

    public guq0(boolean z) {
        this.f11942a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guq0) && this.f11942a == ((guq0) obj).f11942a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11942a);
    }

    public final String toString() {
        return defpackage.c.d("LuxuryServerModel(enable=", Separators.RPAREN, this.f11942a);
    }
}
