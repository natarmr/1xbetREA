package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s40 implements ep80 {
    public final String b;

    public s40(String str) {
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
        return (obj instanceof s40) && this.b.equals(((s40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("AdvancedScreenLayoutIdParentData(id=", this.b, Separators.RPAREN);
    }
}
