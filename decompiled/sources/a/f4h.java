package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f4h {
    public static final e4h Companion = new e4h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8913a;
    public final Integer b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Integer f;
    public final Float g;
    public final Float h;
    public final Float i;

    public /* synthetic */ f4h(int i, Integer num, Integer num2, Float f, Float f2, Float f3, Integer num3, Float f4, Float f5, Float f6) {
        if ((i & 1) == 0) {
            this.f8913a = null;
        } else {
            this.f8913a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4h)) {
            return false;
        }
        f4h f4hVar = (f4h) obj;
        return Intrinsics.d(this.f8913a, f4hVar.f8913a) && Intrinsics.d(this.b, f4hVar.b) && Intrinsics.d(this.c, f4hVar.c) && Intrinsics.d(this.d, f4hVar.d) && Intrinsics.d(this.e, f4hVar.e) && Intrinsics.d(this.f, f4hVar.f) && Intrinsics.d(this.g, f4hVar.g) && Intrinsics.d(this.h, f4hVar.h) && Intrinsics.d(this.i, f4hVar.i);
    }

    public final int hashCode() {
        Integer num = this.f8913a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.e;
        int iHashCode5 = (iHashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f4 = this.g;
        int iHashCode7 = (iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.h;
        int iHashCode8 = (iHashCode7 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.i;
        return iHashCode8 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberLolPlayerStatisticResponse(wins=", this.f8913a, ", losses=", this.b, ", kills=");
        vqd.x(sbQ, this.c, ", deaths=", this.d, ", assists=");
        sbQ.append(this.e);
        sbQ.append(", goldEarned=");
        sbQ.append(this.f);
        sbQ.append(", baronKills=");
        vqd.x(sbQ, this.g, ", dragonKills=", this.h, ", towerKills=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
