package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29479a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Float e;

    public qxd0(Integer num, Integer num2, Integer num3, Integer num4, Float f) {
        this.f29479a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxd0)) {
            return false;
        }
        qxd0 qxd0Var = (qxd0) obj;
        return Intrinsics.d(this.f29479a, qxd0Var.f29479a) && Intrinsics.d(this.b, qxd0Var.b) && Intrinsics.d(this.c, qxd0Var.c) && Intrinsics.d(this.d, qxd0Var.d) && Intrinsics.d(this.e, qxd0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f29479a;
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
        StringBuilder sbQ = hne.q("RainbowSixPlayerStatsModel(kills=", this.f29479a, ", deaths=", this.b, ", maps=");
        rz4.y(sbQ, this.c, ", eps=", this.d, ", kost=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
