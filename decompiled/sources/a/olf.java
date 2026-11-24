package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class olf extends slf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25451a;
    public final int b;
    public final wpf c;
    public final isf d;

    public olf(int i, int i2, wpf wpfVar, isf isfVar) {
        this.f25451a = i;
        this.b = i2;
        this.c = wpfVar;
        this.d = isfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olf)) {
            return false;
        }
        olf olfVar = (olf) obj;
        return this.f25451a == olfVar.f25451a && this.b == olfVar.b && this.c == olfVar.c && this.d == olfVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f25451a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("Cs2RoundEndGameLogModel(ctScore=", this.f25451a, ", tScore=", ", winner=", this.b);
        sbT.append(this.c);
        sbT.append(", winType=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
