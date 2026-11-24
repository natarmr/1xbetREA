package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class edl0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7624a;

    public final boolean equals(Object obj) {
        if (obj instanceof edl0) {
            return this.f7624a == ((edl0) obj).f7624a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7624a);
    }

    public final String toString() {
        return defpackage.c.d("SelectedState(value=", Separators.RPAREN, this.f7624a);
    }
}
