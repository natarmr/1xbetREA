package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dz7 {
    public static final cz7 Companion = new cz7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6928a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final c08 f;
    public final c08 g;
    public final Integer h;
    public final Integer i;
    public final Boolean j;

    public /* synthetic */ dz7(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, c08 c08Var, c08 c08Var2, Integer num6, Integer num7, Boolean bool) {
        if ((i & 1) == 0) {
            this.f6928a = null;
        } else {
            this.f6928a = num;
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = c08Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = c08Var2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz7)) {
            return false;
        }
        dz7 dz7Var = (dz7) obj;
        return Intrinsics.d(this.f6928a, dz7Var.f6928a) && Intrinsics.d(this.b, dz7Var.b) && Intrinsics.d(this.c, dz7Var.c) && Intrinsics.d(this.d, dz7Var.d) && Intrinsics.d(this.e, dz7Var.e) && Intrinsics.d(this.f, dz7Var.f) && Intrinsics.d(this.g, dz7Var.g) && Intrinsics.d(this.h, dz7Var.h) && Intrinsics.d(this.i, dz7Var.i) && Intrinsics.d(this.j, dz7Var.j);
    }

    public final int hashCode() {
        Integer num = this.f6928a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        c08 c08Var = this.f;
        int iHashCode6 = (iHashCode5 + (c08Var == null ? 0 : c08Var.hashCode())) * 31;
        c08 c08Var2 = this.g;
        int iHashCode7 = (iHashCode6 + (c08Var2 == null ? 0 : c08Var2.hashCode())) * 31;
        Integer num6 = this.h;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.i;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.j;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("BigPigCurrentThrowExtendedResponse(pointsBeforeThrow=", this.f6928a, ", pointsAfterThrow=", this.b, ", currentPlayer=");
        rz4.y(sbQ, this.c, ", numberOfThrow=", this.d, ", numberOfSeriesThrow=");
        sbQ.append(this.e);
        sbQ.append(", pointsGame=");
        sbQ.append(this.f);
        sbQ.append(", pointsSeries=");
        sbQ.append(this.g);
        sbQ.append(", firstDice=");
        sbQ.append(this.h);
        sbQ.append(", secondDice=");
        sbQ.append(this.i);
        sbQ.append(", finishedSeries=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
