package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class buf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3228a;
    public final String b;
    public final auf c;
    public final ztf d;

    public buf(String str, String str2, auf aufVar, ztf ztfVar) {
        str.getClass();
        str2.getClass();
        this.f3228a = str;
        this.b = str2;
        this.c = aufVar;
        this.d = ztfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buf)) {
            return false;
        }
        buf bufVar = (buf) obj;
        return Intrinsics.d(this.f3228a, bufVar.f3228a) && Intrinsics.d(this.b, bufVar.b) && this.c.equals(bufVar.c) && this.d.equals(bufVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f3228a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CupheadRoundInformationUiModel(winnerTitle=", this.f3228a, ", winner=", this.b, ", stage=");
        sbN.append(this.c);
        sbN.append(", hp=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
