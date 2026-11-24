package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zxd0 {
    public static final yxd0 Companion = new yxd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f45152a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Float e;

    public /* synthetic */ zxd0(int i, Float f, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f45152a = null;
        } else {
            this.f45152a = num;
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
            this.e = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxd0)) {
            return false;
        }
        zxd0 zxd0Var = (zxd0) obj;
        return Intrinsics.d(this.f45152a, zxd0Var.f45152a) && Intrinsics.d(this.b, zxd0Var.b) && Intrinsics.d(this.c, zxd0Var.c) && Intrinsics.d(this.d, zxd0Var.d) && Intrinsics.d(this.e, zxd0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f45152a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.e;
        return iHashCode4 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("RainbowSixPlayersStatsResponse(kills=", this.f45152a, ", deaths=", this.b, ", maps=");
        rz4.y(sbQ, this.c, ", eps=", this.d, ", kost=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
