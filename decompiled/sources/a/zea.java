package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zea implements iqg {
    public static final yea Companion = new yea();
    public static final a8z[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f44241a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final List i;

    static {
        wez wezVar = wez.f39042a;
        j = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new mn9((byte) 18)), maz.a(wezVar, new mn9((byte) 19))};
    }

    public /* synthetic */ zea(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List list, List list2) {
        if ((i & 1) == 0) {
            this.f44241a = null;
        } else {
            this.f44241a = num;
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
            this.f = num6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zea)) {
            return false;
        }
        zea zeaVar = (zea) obj;
        return Intrinsics.d(this.f44241a, zeaVar.f44241a) && Intrinsics.d(this.b, zeaVar.b) && Intrinsics.d(this.c, zeaVar.c) && Intrinsics.d(this.d, zeaVar.d) && Intrinsics.d(this.e, zeaVar.e) && Intrinsics.d(this.f, zeaVar.f) && Intrinsics.d(this.g, zeaVar.g) && Intrinsics.d(this.h, zeaVar.h) && Intrinsics.d(this.i, zeaVar.i);
    }

    public final int hashCode() {
        Integer num = this.f44241a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CardCricketResponse(gameState=", this.f44241a, ", firstScore=", this.b, ", secondScore=");
        rz4.y(sbQ, this.c, ", firstWickets=", this.d, ", secondWickets=");
        rz4.y(sbQ, this.e, ", firstCardsCount=", this.f, ", secondCardsCount=");
        cs0.z(sbQ, this.g, ", firstInning=", this.h, ", secondInning=");
        return dw9.r(sbQ, this.i, Separators.RPAREN);
    }

    public zea() {
        this.f44241a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
