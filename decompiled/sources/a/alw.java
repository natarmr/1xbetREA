package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class alw extends rkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1085a;
    public final boolean b;
    public final int c;
    public final a4x d;

    public alw(int i, a4x a4xVar, String str, boolean z) {
        this.f1085a = str;
        this.b = z;
        this.c = i;
        this.d = a4xVar;
    }

    @Override // a.rkb0
    public final String c() {
        return this.f1085a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alw)) {
            return false;
        }
        alw alwVar = (alw) obj;
        return this.f1085a.equals(alwVar.f1085a) && this.b == alwVar.b && this.c == alwVar.c && this.d.equals(alwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(this.f1085a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("HorizontalChampPopularUiItem(id=", this.f1085a, ", live=", this.b, ", rowCount=");
        sbU.append(this.c);
        sbU.append(", champs=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
