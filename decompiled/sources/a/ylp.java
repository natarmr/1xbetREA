package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ylp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final npn f42855a;
    public final boolean b;

    public ylp(npn npnVar, boolean z) {
        this.f42855a = npnVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ylp) {
            ylp ylpVar = (ylp) obj;
            if (this.f42855a == ylpVar.f42855a && this.b == ylpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f42855a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteStateChanged(editFavoriteChampModel=" + this.f42855a + ", checked=" + this.b + Separators.RPAREN;
    }
}
