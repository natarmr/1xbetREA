package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd50 f29623a;

    public r0c0(nd50 nd50Var) {
        this.f29623a = nd50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0c0) && this.f29623a.equals(((r0c0) obj).f29623a);
    }

    public final int hashCode() {
        return this.f29623a.hashCode();
    }

    public final String toString() {
        return "OnNavBarBackPressed(navBarAction=" + this.f29623a + Separators.RPAREN;
    }
}
