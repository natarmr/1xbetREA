package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wg60 implements xg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut00 f39099a;

    public wg60(ut00 ut00Var) {
        this.f39099a = ut00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg60) && this.f39099a.equals(((wg60) obj).f39099a);
    }

    public final int hashCode() {
        return this.f39099a.hashCode();
    }

    public final String toString() {
        return "LocationDialog(type=" + this.f39099a + Separators.RPAREN;
    }
}
