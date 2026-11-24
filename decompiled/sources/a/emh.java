package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class emh {
    public static final dmh Companion = new dmh();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new bmh(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8046a;
    public final String b;
    public final List c;

    public /* synthetic */ emh(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f8046a = null;
        } else {
            this.f8046a = str;
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
        if (!(obj instanceof emh)) {
            return false;
        }
        emh emhVar = (emh) obj;
        return Intrinsics.d(this.f8046a, emhVar.f8046a) && Intrinsics.d(this.b, emhVar.b) && Intrinsics.d(this.c, emhVar.c);
    }

    public final int hashCode() {
        String str = this.f8046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CyberTournamentBracketStageSwissResponse(type=", this.f8046a, ", name=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
