package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iaj implements ep80 {
    public final String b;

    public iaj(String str) {
        this.b = str;
    }

    @Override // a.ep80
    public final Object d(w6k w6kVar) {
        w6kVar.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iaj) && this.b.equals(((iaj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("DashboardScreenLayoutIdParentData(id=", this.b, Separators.RPAREN);
    }
}
