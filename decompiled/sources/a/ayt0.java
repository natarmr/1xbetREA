package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ayt0 {
    public static final zxt0 Companion = new zxt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1686a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ ayt0(int i, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        if ((i & 1) == 0) {
            this.f1686a = null;
        } else {
            this.f1686a = str;
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayt0)) {
            return false;
        }
        ayt0 ayt0Var = (ayt0) obj;
        return Intrinsics.d(this.f1686a, ayt0Var.f1686a) && Intrinsics.d(this.b, ayt0Var.b) && Intrinsics.d(this.c, ayt0Var.c) && Intrinsics.d(this.d, ayt0Var.d) && Intrinsics.d(this.e, ayt0Var.e);
    }

    public final int hashCode() {
        String str = this.f1686a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "ValorantMatchInfoResponse(mapName=", this.f1686a, ", mapNumber=", ", firstTeamScore=");
        rz4.y(sbP, this.c, ", secondTeamScore=", this.d, ", mapWinner=");
        return dw9.q(sbP, this.e, Separators.RPAREN);
    }
}
