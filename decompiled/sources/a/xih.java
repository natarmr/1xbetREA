package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xih {
    public static final wih Companion = new wih();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gch(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40945a;
    public final List b;

    public /* synthetic */ xih(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f40945a = null;
        } else {
            this.f40945a = str;
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
        if (!(obj instanceof xih)) {
            return false;
        }
        xih xihVar = (xih) obj;
        return Intrinsics.d(this.f40945a, xihVar.f40945a) && Intrinsics.d(this.b, xihVar.b);
    }

    public final int hashCode() {
        String str = this.f40945a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategoryGroupResponse(name=", this.f40945a, ", rounds=", this.b, Separators.RPAREN);
    }
}
