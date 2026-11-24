package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y410 {
    public static final x410 Companion = new x410();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41979a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ y410(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f41979a = null;
        } else {
            this.f41979a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y410)) {
            return false;
        }
        y410 y410Var = (y410) obj;
        return Intrinsics.d(this.f41979a, y410Var.f41979a) && Intrinsics.d(this.b, y410Var.b) && Intrinsics.d(this.c, y410Var.c);
    }

    public final int hashCode() {
        String str = this.f41979a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(b1j.n("LolStatisticMatchesMatchTeamPlayerRuneItemsResponse(name=", this.f41979a, ", imageS3=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
