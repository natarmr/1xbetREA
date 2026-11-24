package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fjh {
    public static final ejh Companion = new ejh();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9640a;
    public final List b;

    public /* synthetic */ fjh(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f9640a = null;
        } else {
            this.f9640a = str;
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
        if (!(obj instanceof fjh)) {
            return false;
        }
        fjh fjhVar = (fjh) obj;
        return Intrinsics.d(this.f9640a, fjhVar.f9640a) && Intrinsics.d(this.b, fjhVar.b);
    }

    public final int hashCode() {
        String str = this.f9640a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategorySwissResponse(name=", this.f9640a, ", rounds=", this.b, Separators.RPAREN);
    }
}
