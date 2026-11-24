package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zpa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final npn f44751a;
    public final boolean b;

    public zpa0(npn npnVar, boolean z) {
        this.f44751a = npnVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zpa0) {
            zpa0 zpa0Var = (zpa0) obj;
            if (this.f44751a == zpa0Var.f44751a && this.b == zpa0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44751a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteStateChanged(editFavoriteChampModel=" + this.f44751a + ", addToFavorites=" + this.b + Separators.RPAREN;
    }
}
