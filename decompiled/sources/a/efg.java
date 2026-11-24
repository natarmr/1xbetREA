package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class efg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xeg f7719a;
    public final a4x b;
    public final boolean c;

    public efg(xeg xegVar, a4x a4xVar, boolean z) {
        this.f7719a = xegVar;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efg)) {
            return false;
        }
        efg efgVar = (efg) obj;
        return this.f7719a.equals(efgVar.f7719a) && this.b.equals(efgVar.b) && this.c == efgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f7719a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampionshipEventsUiState(contentState=");
        sb.append(this.f7719a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
