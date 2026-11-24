package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e0s0 {
    public static final d0s0 Companion = new d0s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7004a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ e0s0(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f7004a = null;
        } else {
            this.f7004a = str;
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
        if (!(obj instanceof e0s0)) {
            return false;
        }
        e0s0 e0s0Var = (e0s0) obj;
        return Intrinsics.d(this.f7004a, e0s0Var.f7004a) && Intrinsics.d(this.b, e0s0Var.b) && Intrinsics.d(this.c, e0s0Var.c) && Intrinsics.d(this.d, e0s0Var.d);
    }

    public final int hashCode() {
        String str = this.f7004a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(axq.p(this.b, "TournamentCsFeedStatisticMapResponse(name=", this.f7004a, ", ctWinrate=", ", tWinrate="), this.c, ", count=", this.d, Separators.RPAREN);
    }
}
