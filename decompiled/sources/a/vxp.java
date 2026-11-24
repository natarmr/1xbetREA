package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byp f38211a;
    public final byp b;
    public final byp c;

    public vxp(byp bypVar, byp bypVar2, byp bypVar3) {
        this.f38211a = bypVar;
        this.b = bypVar2;
        this.c = bypVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxp)) {
            return false;
        }
        vxp vxpVar = (vxp) obj;
        return this.f38211a.equals(vxpVar.f38211a) && this.b.equals(vxpVar.b) && this.c.equals(vxpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f38211a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FighterStatisticStrikeTargetModel(head=" + this.f38211a + ", body=" + this.b + ", leg=" + this.c + Separators.RPAREN;
    }
}
