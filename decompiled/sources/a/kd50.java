package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kd50 implements nd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18090a;

    public final boolean equals(Object obj) {
        if (obj instanceof kd50) {
            return this.f18090a == ((kd50) obj).f18090a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18090a);
    }

    public final String toString() {
        return defpackage.c.d("SearchExpand(value=", Separators.RPAREN, this.f18090a);
    }
}
