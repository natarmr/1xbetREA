package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class b2h {
    public static final a2h Companion = new a2h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1852a;
    public final String b;
    public final y0h c;
    public final y1h d;

    static {
        x1h x1hVar = y1h.Companion;
        x0h x0hVar = y0h.Companion;
    }

    public /* synthetic */ b2h(int i, String str, String str2, y0h y0hVar, y1h y1hVar) {
        if ((i & 1) == 0) {
            this.f1852a = null;
        } else {
            this.f1852a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = y0hVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = y1hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2h)) {
            return false;
        }
        b2h b2hVar = (b2h) obj;
        return Intrinsics.d(this.f1852a, b2hVar.f1852a) && Intrinsics.d(this.b, b2hVar.b) && Intrinsics.d(this.c, b2hVar.c) && Intrinsics.d(this.d, b2hVar.d);
    }

    public final int hashCode() {
        String str = this.f1852a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        y0h y0hVar = this.c;
        int iHashCode3 = (iHashCode2 + (y0hVar == null ? 0 : y0hVar.hashCode())) * 31;
        y1h y1hVar = this.d;
        return iHashCode3 + (y1hVar != null ? y1hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberLastMatchesResponse(firstTeamId=", this.f1852a, ", secondTeamId=", this.b, ", headToHeadResponse=");
        sbN.append(this.c);
        sbN.append(", lastMatchesInfoResponse=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
