package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byp f10370a;
    public final byp b;
    public final byp c;

    public fyp(byp bypVar, byp bypVar2, byp bypVar3) {
        this.f10370a = bypVar;
        this.b = bypVar2;
        this.c = bypVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyp)) {
            return false;
        }
        fyp fypVar = (fyp) obj;
        return this.f10370a.equals(fypVar.f10370a) && this.b.equals(fypVar.b) && this.c.equals(fypVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f10370a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FighterStatisticWinMethodsModel(koTko=" + this.f10370a + ", decision=" + this.b + ", sub=" + this.c + Separators.RPAREN;
    }
}
