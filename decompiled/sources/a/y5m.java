package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5m implements a6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42055a;
    public final String b;
    public final e6m c;
    public final l6m d;

    public y5m(String str, String str2, e6m e6mVar, l6m l6mVar) {
        str.getClass();
        str2.getClass();
        this.f42055a = str;
        this.b = str2;
        this.c = e6mVar;
        this.d = l6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5m)) {
            return false;
        }
        y5m y5mVar = (y5m) obj;
        return Intrinsics.d(this.f42055a, y5mVar.f42055a) && Intrinsics.d(this.b, y5mVar.b) && Intrinsics.d(this.c, y5mVar.c) && Intrinsics.d(this.d, y5mVar.d);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ua80.b(this.f42055a.hashCode() * 31, 31, this.b), 31, false), 31, false);
        e6m e6mVar = this.c;
        int iHashCode = (iE + (e6mVar == null ? 0 : e6mVar.hashCode())) * 31;
        l6m l6mVar = this.d;
        return iHashCode + (l6mVar != null ? l6mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Score(firstScore=", this.f42055a, ", secondScore=", this.b, ", firstScoreChanged=false, secondScoreChanged=false, timer=");
        sbN.append(this.c);
        sbN.append(", victoryIndicator=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
