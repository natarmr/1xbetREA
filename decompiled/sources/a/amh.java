package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class amh {
    public static final zlh Companion = new zlh();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gch(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1108a;
    public final String b;
    public final List c;

    public /* synthetic */ amh(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f1108a = null;
        } else {
            this.f1108a = str;
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
        if (!(obj instanceof amh)) {
            return false;
        }
        amh amhVar = (amh) obj;
        return Intrinsics.d(this.f1108a, amhVar.f1108a) && Intrinsics.d(this.b, amhVar.b) && Intrinsics.d(this.c, amhVar.c);
    }

    public final int hashCode() {
        String str = this.f1108a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CyberTournamentBracketStagePlayoffResponse(type=", this.f1108a, ", name=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
