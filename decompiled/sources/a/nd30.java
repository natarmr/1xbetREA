package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nd30 {
    public static final md30 Companion = new md30();
    public static final a8z[] e = {maz.a(wez.f39042a, new n230(14)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23322a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ nd30(int i, Integer num, Integer num2, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f23322a = null;
        } else {
            this.f23322a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd30)) {
            return false;
        }
        nd30 nd30Var = (nd30) obj;
        return Intrinsics.d(this.f23322a, nd30Var.f23322a) && Intrinsics.d(this.b, nd30Var.b) && Intrinsics.d(this.c, nd30Var.c) && Intrinsics.d(this.d, nd30Var.d);
    }

    public final int hashCode() {
        List list = this.f23322a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(cs0.r(this.b, "MatchProgressStatisticResponse(response=", ", sportId=", ", subScoreOne=", this.f23322a), this.c, ", subScoreTwo=", this.d, Separators.RPAREN);
    }
}
