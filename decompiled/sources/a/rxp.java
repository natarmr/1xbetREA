package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byp f31275a;
    public final byp b;
    public final byp c;

    public rxp(byp bypVar, byp bypVar2, byp bypVar3) {
        this.f31275a = bypVar;
        this.b = bypVar2;
        this.c = bypVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxp)) {
            return false;
        }
        rxp rxpVar = (rxp) obj;
        return this.f31275a.equals(rxpVar.f31275a) && this.b.equals(rxpVar.b) && this.c.equals(rxpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31275a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FighterStatisticStrikePositionModel(distance=" + this.f31275a + ", clinch=" + this.b + ", ground=" + this.c + Separators.RPAREN;
    }
}
