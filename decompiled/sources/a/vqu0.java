package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vqu0 implements xqu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37870a;

    public final boolean equals(Object obj) {
        if (obj instanceof vqu0) {
            return this.f37870a == ((vqu0) obj).f37870a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37870a);
    }

    public final String toString() {
        return defpackage.c.d("SearchExpand(expand=", Separators.RPAREN, this.f37870a);
    }
}
