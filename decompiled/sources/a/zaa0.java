package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zaa0 {
    public static final waa0 Companion = new waa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44058a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public /* synthetic */ zaa0(int i, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        if ((i & 1) == 0) {
            this.f44058a = null;
        } else {
            this.f44058a = str;
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa0)) {
            return false;
        }
        zaa0 zaa0Var = (zaa0) obj;
        return Intrinsics.d(this.f44058a, zaa0Var.f44058a) && Intrinsics.d(this.b, zaa0Var.b) && Intrinsics.d(this.c, zaa0Var.c) && Intrinsics.d(this.d, zaa0Var.d) && Intrinsics.d(this.e, zaa0Var.e) && Intrinsics.d(this.f, zaa0Var.f) && Intrinsics.d(this.g, zaa0Var.g);
    }

    public final int hashCode() {
        String str = this.f44058a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        return iHashCode6 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "PlayerStatisticResponse(id=", this.f44058a, ", number=", ", age=");
        rz4.y(sbP, this.c, ", gamesCount=", this.d, ", goalsCount=");
        rz4.y(sbP, this.e, ", yellowCardsCount=", this.f, ", redCardsCount=");
        return dw9.q(sbP, this.g, Separators.RPAREN);
    }
}
