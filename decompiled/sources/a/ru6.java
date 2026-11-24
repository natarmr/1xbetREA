package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ru6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31110a;
    public final String b;
    public final double c;
    public final long d;
    public final uoy e;
    public final double f;
    public final long g;
    public final long h;
    public final zfa0 i;
    public final int j;
    public final Double k;
    public final String l;

    public /* synthetic */ ru6(long j, String str, double d, long j2, uoy uoyVar, double d2, long j3, long j4, int i, Double d3, String str2, int i2) {
        this(j, str, d, j2, uoyVar, d2, j3, j4, yfa0.INSTANCE, i, (i2 & 1024) != 0 ? null : d3, (i2 & 2048) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru6)) {
            return false;
        }
        ru6 ru6Var = (ru6) obj;
        return this.f31110a == ru6Var.f31110a && Intrinsics.d(this.b, ru6Var.b) && Double.compare(this.c, ru6Var.c) == 0 && this.d == ru6Var.d && this.e == ru6Var.e && Double.compare(this.f, ru6Var.f) == 0 && this.g == ru6Var.g && this.h == ru6Var.h && Intrinsics.d(this.i, ru6Var.i) && this.j == ru6Var.j && Intrinsics.d(this.k, ru6Var.k) && Intrinsics.d(this.l, ru6Var.l);
    }

    public final int hashCode() {
        int iA = twn.a(this.j, (this.i.hashCode() + rw2.b(rw2.b(brm0.d(this.f, twn.d(this.e, rw2.b(brm0.d(this.c, ua80.b(Long.hashCode(this.f31110a) * 31, 31, this.b), 31), 31, this.d), 31), 31), 31, this.g), 31, this.h)) * 31, 31);
        Double d = this.k;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.l;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31110a, "BetEventModel(eventEntityId=", ", coefficient=", this.b);
        ohs0.A(sbO, this.c, ", coef=", ", gameId=");
        sbO.append(this.d);
        sbO.append(", kind=");
        sbO.append(this.e);
        ohs0.A(sbO, this.f, ", param=", ", playerId=");
        sbO.append(this.g);
        kng0.A(sbO, ", type=", this.h, ", playersDuel=");
        sbO.append(this.i);
        sbO.append(", uiFeatureId=");
        sbO.append(this.j);
        sbO.append(", optionLowerCf=");
        sbO.append(this.k);
        sbO.append(", optionLowerCfView=");
        sbO.append(this.l);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public ru6(long j, String str, double d, long j2, uoy uoyVar, double d2, long j3, long j4, zfa0 zfa0Var, int i, Double d3, String str2) {
        str.getClass();
        uoyVar.getClass();
        zfa0Var.getClass();
        this.f31110a = j;
        this.b = str;
        this.c = d;
        this.d = j2;
        this.e = uoyVar;
        this.f = d2;
        this.g = j3;
        this.h = j4;
        this.i = zfa0Var;
        this.j = i;
        this.k = d3;
        this.l = str2;
    }
}
