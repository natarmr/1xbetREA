package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tlh {
    public static final slh Companion = new slh();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new gch(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34144a;
    public final String b;
    public final List c;

    public /* synthetic */ tlh(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f34144a = null;
        } else {
            this.f34144a = str;
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
        if (!(obj instanceof tlh)) {
            return false;
        }
        tlh tlhVar = (tlh) obj;
        return Intrinsics.d(this.f34144a, tlhVar.f34144a) && Intrinsics.d(this.b, tlhVar.b) && Intrinsics.d(this.c, tlhVar.c);
    }

    public final int hashCode() {
        String str = this.f34144a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("CyberTournamentBracketStageGroupResponse(name=", this.f34144a, ", type=", this.b, ", brackets="), this.c, Separators.RPAREN);
    }
}
