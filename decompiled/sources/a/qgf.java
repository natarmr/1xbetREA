package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qgf {
    public static final pgf Companion = new pgf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f28681a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ qgf(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f28681a = null;
        } else {
            this.f28681a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgf)) {
            return false;
        }
        qgf qgfVar = (qgf) obj;
        return Intrinsics.d(this.f28681a, qgfVar.f28681a) && Intrinsics.d(this.b, qgfVar.b) && Intrinsics.d(this.c, qgfVar.c) && Intrinsics.d(this.d, qgfVar.d) && Intrinsics.d(this.e, qgfVar.e);
    }

    public final int hashCode() {
        Integer num = this.f28681a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CrystalPlayerInfoResponse(round=", this.f28681a, ", step=", this.b, ", color=");
        rz4.y(sbQ, this.c, ", count=", this.d, ", summ=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
