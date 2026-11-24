package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qqf f25307a;
    public final qqf b;

    public oif(qqf qqfVar, qqf qqfVar2) {
        this.f25307a = qqfVar;
        this.b = qqfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oif)) {
            return false;
        }
        oif oifVar = (oif) obj;
        return this.f25307a.equals(oifVar.f25307a) && this.b.equals(oifVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25307a.hashCode() * 31);
    }

    public final String toString() {
        return "Cs2BombSiteModel(siteA=" + this.f25307a + ", siteB=" + this.b + Separators.RPAREN;
    }
}
