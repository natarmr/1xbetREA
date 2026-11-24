package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class g8r {
    public static final f8r Companion = new f8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oxb0 f10880a;
    public final szb0 b;
    public final Integer c;

    public /* synthetic */ g8r(int i, oxb0 oxb0Var, szb0 szb0Var, Integer num) {
        if ((i & 1) == 0) {
            this.f10880a = null;
        } else {
            this.f10880a = oxb0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = szb0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8r)) {
            return false;
        }
        g8r g8rVar = (g8r) obj;
        return Intrinsics.d(this.f10880a, g8rVar.f10880a) && Intrinsics.d(this.b, g8rVar.b) && Intrinsics.d(this.c, g8rVar.c);
    }

    public final int hashCode() {
        oxb0 oxb0Var = this.f10880a;
        int iHashCode = (oxb0Var == null ? 0 : oxb0Var.hashCode()) * 31;
        szb0 szb0Var = this.b;
        int iHashCode2 = (iHashCode + (szb0Var == null ? 0 : szb0Var.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeSpinsPrizeResponse(game=");
        sb.append(this.f10880a);
        sb.append(", product=");
        sb.append(this.b);
        sb.append(", count=");
        return dw9.q(sb, this.c, Separators.RPAREN);
    }
}
