package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wjg0 {
    public static final vjg0 Companion = new vjg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ikg0 f39262a;
    public final ikg0 b;
    public final ikg0 c;
    public final Integer d;

    public /* synthetic */ wjg0(int i, ikg0 ikg0Var, ikg0 ikg0Var2, ikg0 ikg0Var3, Integer num) {
        if ((i & 1) == 0) {
            this.f39262a = null;
        } else {
            this.f39262a = ikg0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ikg0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ikg0Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjg0)) {
            return false;
        }
        wjg0 wjg0Var = (wjg0) obj;
        return Intrinsics.d(this.f39262a, wjg0Var.f39262a) && Intrinsics.d(this.b, wjg0Var.b) && Intrinsics.d(this.c, wjg0Var.c) && Intrinsics.d(this.d, wjg0Var.d);
    }

    public final int hashCode() {
        ikg0 ikg0Var = this.f39262a;
        int iHashCode = (ikg0Var == null ? 0 : ikg0Var.hashCode()) * 31;
        ikg0 ikg0Var2 = this.b;
        int iHashCode2 = (iHashCode + (ikg0Var2 == null ? 0 : ikg0Var2.hashCode())) * 31;
        ikg0 ikg0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (ikg0Var3 == null ? 0 : ikg0Var3.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RpsPlayersRoundResultResponse(firstPlayer=" + this.f39262a + ", secondPlayer=" + this.b + ", thirdPlayer=" + this.c + ", result=" + this.d + Separators.RPAREN;
    }
}
