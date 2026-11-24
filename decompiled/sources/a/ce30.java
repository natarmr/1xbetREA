package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ce30 {
    public static final be30 Companion = new be30();
    public static final a8z[] d = {maz.a(wez.f39042a, new n230(15)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4193a;
    public final String b;
    public final String c;

    public /* synthetic */ ce30(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f4193a = null;
        } else {
            this.f4193a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce30)) {
            return false;
        }
        ce30 ce30Var = (ce30) obj;
        return Intrinsics.d(this.f4193a, ce30Var.f4193a) && Intrinsics.d(this.b, ce30Var.b) && Intrinsics.d(this.c, ce30Var.c);
    }

    public final int hashCode() {
        List list = this.f4193a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(ua80.o("MatchResponse(gameStatisticResponse=", ", image=", this.b, this.f4193a, ", title="), this.c, Separators.RPAREN);
    }
}
