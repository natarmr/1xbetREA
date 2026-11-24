package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zmg {
    public static final ymg Companion = new ymg();
    public static final a8z[] s = {null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new jcg(28)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f44625a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Float h;
    public final Integer i;
    public final Integer j;
    public final Float k;
    public final Boolean l;
    public final Integer m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final Integer r;

    public /* synthetic */ zmg(int i, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Float f, Integer num3, Integer num4, Float f2, Boolean bool, Integer num5, List list, String str6, String str7, String str8, Integer num6) {
        if ((i & 1) == 0) {
            this.f44625a = null;
        } else {
            this.f44625a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str7;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str8;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmg)) {
            return false;
        }
        zmg zmgVar = (zmg) obj;
        return Intrinsics.d(this.f44625a, zmgVar.f44625a) && Intrinsics.d(this.b, zmgVar.b) && Intrinsics.d(this.c, zmgVar.c) && Intrinsics.d(this.d, zmgVar.d) && Intrinsics.d(this.e, zmgVar.e) && Intrinsics.d(this.f, zmgVar.f) && Intrinsics.d(this.g, zmgVar.g) && Intrinsics.d(this.h, zmgVar.h) && Intrinsics.d(this.i, zmgVar.i) && Intrinsics.d(this.j, zmgVar.j) && Intrinsics.d(this.k, zmgVar.k) && Intrinsics.d(this.l, zmgVar.l) && Intrinsics.d(this.m, zmgVar.m) && Intrinsics.d(this.n, zmgVar.n) && Intrinsics.d(this.o, zmgVar.o) && Intrinsics.d(this.p, zmgVar.p) && Intrinsics.d(this.q, zmgVar.q) && Intrinsics.d(this.r, zmgVar.r);
    }

    public final int hashCode() {
        Integer num = this.f44625a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f2 = this.k;
        int iHashCode11 = (iHashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool = this.l;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.m;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list = this.n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.q;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num6 = this.r;
        return iHashCode17 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f44625a, "CyberDotaPlayersResponse(id=", ", nickName=", this.b, ", realName=");
        f140.v(sbN, this.c, ", country=", this.d, ", playerImage=");
        f140.v(sbN, this.e, ", playerImageS3=", this.f, ", countMaps=");
        sbN.append(this.g);
        sbN.append(", winRate=");
        sbN.append(this.h);
        sbN.append(", goldInMinute=");
        rz4.y(sbN, this.i, ", experienceInMinute=", this.j, ", kda=");
        sbN.append(this.k);
        sbN.append(", captain=");
        sbN.append(this.l);
        sbN.append(", position=");
        cs0.z(sbN, this.m, ", heroes=", this.n, ", playerFlag=");
        f140.v(sbN, this.o, ", playerFlagS3=", this.p, ", rankImageS3=");
        return vqd.l(this.r, this.q, ", rank=", Separators.RPAREN, sbN);
    }
}
