package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class flh {
    public static final elh Companion = new elh();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9737a;
    public final List b;

    public /* synthetic */ flh(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f9737a = null;
        } else {
            this.f9737a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flh)) {
            return false;
        }
        flh flhVar = (flh) obj;
        return Intrinsics.d(this.f9737a, flhVar.f9737a) && Intrinsics.d(this.b, flhVar.b);
    }

    public final int hashCode() {
        String str = this.f9737a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketRoundGroupResponse(name=", this.f9737a, ", matches=", this.b, Separators.RPAREN);
    }
}
