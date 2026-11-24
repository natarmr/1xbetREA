package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gz7 {
    public static final fz7 Companion = new fz7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12167a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ gz7(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.f12167a = null;
        } else {
            this.f12167a = num;
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
        if (!(obj instanceof gz7)) {
            return false;
        }
        gz7 gz7Var = (gz7) obj;
        return Intrinsics.d(this.f12167a, gz7Var.f12167a) && Intrinsics.d(this.b, gz7Var.b) && Intrinsics.d(this.c, gz7Var.c) && Intrinsics.d(this.d, gz7Var.d) && Intrinsics.d(this.e, gz7Var.e);
    }

    public final int hashCode() {
        Integer num = this.f12167a;
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
        StringBuilder sbQ = hne.q("BigPigCurrentThrowResponse(currentPlayer=", this.f12167a, ", numberOfNextThrow=", this.b, ", numberOfSeriesThrow=");
        rz4.y(sbQ, this.c, ", pointsOfGame=", this.d, ", pointsOfSeries=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
