package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut00 f12277a;

    public h1c0(ut00 ut00Var) {
        this.f12277a = ut00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1c0) && this.f12277a.equals(((h1c0) obj).f12277a);
    }

    public final int hashCode() {
        return this.f12277a.hashCode();
    }

    public final String toString() {
        return "LocationDialog(type=" + this.f12277a + Separators.RPAREN;
    }
}
