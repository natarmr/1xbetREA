package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bjh {
    public static final ajh Companion = new ajh();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2707a;
    public final List b;

    public /* synthetic */ bjh(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f2707a = null;
        } else {
            this.f2707a = str;
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
        if (!(obj instanceof bjh)) {
            return false;
        }
        bjh bjhVar = (bjh) obj;
        return Intrinsics.d(this.f2707a, bjhVar.f2707a) && Intrinsics.d(this.b, bjhVar.b);
    }

    public final int hashCode() {
        String str = this.f2707a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategoryPlayoffResponse(name=", this.f2707a, ", rounds=", this.b, Separators.RPAREN);
    }
}
