package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jav implements iqg {
    public static final iav Companion = new iav();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16209a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final List g;
    public final List h;
    public final Integer i;
    public final Integer j;
    public final Integer k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{maz.a(wezVar, new tet((byte) 24)), maz.a(wezVar, new tet((byte) 25)), null, null, null, null, maz.a(wezVar, new tet((byte) 26)), maz.a(wezVar, new tet((byte) 27)), null, null, null};
    }

    public /* synthetic */ jav(int i, List list, List list2, Integer num, Integer num2, Integer num3, Integer num4, List list3, List list4, Integer num5, Integer num6, Integer num7) {
        if ((i & 1) == 0) {
            this.f16209a = null;
        } else {
            this.f16209a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jav)) {
            return false;
        }
        jav javVar = (jav) obj;
        return Intrinsics.d(this.f16209a, javVar.f16209a) && Intrinsics.d(this.b, javVar.b) && Intrinsics.d(this.c, javVar.c) && Intrinsics.d(this.d, javVar.d) && Intrinsics.d(this.e, javVar.e) && Intrinsics.d(this.f, javVar.f) && Intrinsics.d(this.g, javVar.g) && Intrinsics.d(this.h, javVar.h) && Intrinsics.d(this.i, javVar.i) && Intrinsics.d(this.j, javVar.j) && Intrinsics.d(this.k, javVar.k);
    }

    public final int hashCode() {
        List list = this.f16209a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.h;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.k;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GoldRushResponse(firstPlayersFields=", ", secondPlayersFields=", this.f16209a, ", previousRoundCount=", this.b);
        rz4.y(sbT, this.c, ", playerMoves=", this.d, ", cubeCount=");
        rz4.y(sbT, this.e, ", fastMoves=", this.f, ", secondPlayerActivatedField=");
        b1j.y(", firstPlayerActivatedField=", ", gameState=", sbT, this.g, this.h);
        rz4.y(sbT, this.i, ", firstPlayerPosition=", this.j, ", secondPlayerPosition=");
        return dw9.q(sbT, this.k, Separators.RPAREN);
    }

    public jav() {
        this.f16209a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
