package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c510 {
    public static final b510 Companion = new b510();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new t010((byte) 15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3749a;
    public final String b;
    public final List c;

    public /* synthetic */ c510(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f3749a = null;
        } else {
            this.f3749a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c510)) {
            return false;
        }
        c510 c510Var = (c510) obj;
        return Intrinsics.d(this.f3749a, c510Var.f3749a) && Intrinsics.d(this.b, c510Var.b) && Intrinsics.d(this.c, c510Var.c);
    }

    public final int hashCode() {
        String str = this.f3749a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("LolStatisticMatchesMatchTeamPlayerRunesResponse(name=", this.f3749a, ", image=", this.b, ", runes="), this.c, Separators.RPAREN);
    }
}
