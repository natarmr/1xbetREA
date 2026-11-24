package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vqs {
    public static final uqs Companion = new uqs();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37868a;
    public final Integer b;
    public final String c;
    public final List d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final nts h;
    public final String i;
    public final Long j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final List n;
    public final List o;
    public final Integer p;
    public final Integer q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, maz.a(wezVar, new o9s((byte) 28)), null, null, null, null, null, null, null, null, null, maz.a(wezVar, new o9s((byte) 29)), maz.a(wezVar, new sqs((byte) 0)), null, null};
    }

    public /* synthetic */ vqs(int i, String str, Integer num, String str2, List list, Integer num2, Integer num3, Integer num4, nts ntsVar, String str3, Long l, Integer num5, Integer num6, String str4, List list2, List list3, Integer num7, Integer num8) {
        if ((i & 1) == 0) {
            this.f37868a = null;
        } else {
            this.f37868a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = ntsVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num7;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = num8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqs)) {
            return false;
        }
        vqs vqsVar = (vqs) obj;
        return Intrinsics.d(this.f37868a, vqsVar.f37868a) && Intrinsics.d(this.b, vqsVar.b) && Intrinsics.d(this.c, vqsVar.c) && Intrinsics.d(this.d, vqsVar.d) && Intrinsics.d(this.e, vqsVar.e) && Intrinsics.d(this.f, vqsVar.f) && Intrinsics.d(this.g, vqsVar.g) && Intrinsics.d(this.h, vqsVar.h) && Intrinsics.d(this.i, vqsVar.i) && Intrinsics.d(this.j, vqsVar.j) && Intrinsics.d(this.k, vqsVar.k) && Intrinsics.d(this.l, vqsVar.l) && Intrinsics.d(this.m, vqsVar.m) && Intrinsics.d(this.n, vqsVar.n) && Intrinsics.d(this.o, vqsVar.o) && Intrinsics.d(this.p, vqsVar.p) && Intrinsics.d(this.q, vqsVar.q);
    }

    public final int hashCode() {
        String str = this.f37868a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        nts ntsVar = this.h;
        int iHashCode8 = (iHashCode7 + (ntsVar == null ? 0 : ntsVar.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.j;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num5 = this.k;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.l;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.n;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.o;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num7 = this.p;
        int iHashCode16 = (iHashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.q;
        return iHashCode16 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "GameScoreZipResponse(periodStr=", this.f37868a, ", period=", ", fullScoreStr=");
        cs0.y(this.c, ", periodScoreList=", ", scoreFirst=", sbP, this.d);
        rz4.y(sbP, this.e, ", scoreSecond=", this.f, ", serve=");
        sbP.append(this.g);
        sbP.append(", subScore=");
        sbP.append(this.h);
        sbP.append(", periodFullScore=");
        h97.w(this.j, this.i, ", timeSec=", ", timeDirection=", sbP);
        rz4.y(sbP, this.k, ", timeRun=", this.l, ", folls=");
        cs0.y(this.m, ", dopInfo=", ", tabloStats=", sbP, this.n);
        sbP.append(this.o);
        sbP.append(", isBreak=");
        sbP.append(this.p);
        sbP.append(", bestOfMaps=");
        return dw9.q(sbP, this.q, Separators.RPAREN);
    }
}
