package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ojs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25375a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final hjs e;

    public ojs(boolean z, boolean z2, boolean z3, boolean z4, hjs hjsVar) {
        this.f25375a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = hjsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojs)) {
            return false;
        }
        ojs ojsVar = (ojs) obj;
        return this.f25375a == ojsVar.f25375a && this.b == ojsVar.b && this.c == ojsVar.c && this.d == ojsVar.d && this.e.equals(ojsVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f25375a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameLiteToolbarUiModel(menuEnabled=", ", quickBetVisible=", ", quickBetEnabled=", this.f25375a, this.b);
        ua80.u(", quickBetActive=", ", navigationBar=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
