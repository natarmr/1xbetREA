package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29737a;

    public final boolean equals(Object obj) {
        if (obj instanceof r2j0) {
            return this.f29737a == ((r2j0) obj).f29737a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29737a);
    }

    public final String toString() {
        return defpackage.c.d("AutoMax(hasEnable=", Separators.RPAREN, this.f29737a);
    }
}
