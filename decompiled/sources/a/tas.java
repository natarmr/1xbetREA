package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33629a;
    public final Integer b;
    public final String c;
    public final List d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final vas h;
    public final String i;
    public final Long j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final List n;
    public final List o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final ubr s;

    public tas(String str, Integer num, String str2, ArrayList arrayList, Integer num2, Integer num3, Integer num4, vas vasVar, String str3, Long l, Integer num5, Integer num6, String str4, List list, ArrayList arrayList2, Integer num7, Integer num8, Integer num9, ubr ubrVar) {
        this.f33629a = str;
        this.b = num;
        this.c = str2;
        this.d = arrayList;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = vasVar;
        this.i = str3;
        this.j = l;
        this.k = num5;
        this.l = num6;
        this.m = str4;
        this.n = list;
        this.o = arrayList2;
        this.p = num7;
        this.q = num8;
        this.r = num9;
        this.s = ubrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tas)) {
            return false;
        }
        tas tasVar = (tas) obj;
        return Intrinsics.d(this.f33629a, tasVar.f33629a) && Intrinsics.d(this.b, tasVar.b) && Intrinsics.d(this.c, tasVar.c) && Intrinsics.d(this.d, tasVar.d) && Intrinsics.d(this.e, tasVar.e) && Intrinsics.d(this.f, tasVar.f) && Intrinsics.d(this.g, tasVar.g) && Intrinsics.d(this.h, tasVar.h) && Intrinsics.d(this.i, tasVar.i) && Intrinsics.d(this.j, tasVar.j) && Intrinsics.d(this.k, tasVar.k) && Intrinsics.d(this.l, tasVar.l) && Intrinsics.d(this.m, tasVar.m) && Intrinsics.d(this.n, tasVar.n) && Intrinsics.d(this.o, tasVar.o) && Intrinsics.d(this.p, tasVar.p) && Intrinsics.d(this.q, tasVar.q) && Intrinsics.d(this.r, tasVar.r) && this.s.equals(tasVar.s);
    }

    public final int hashCode() {
        String str = this.f33629a;
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
        vas vasVar = this.h;
        int iHashCode8 = (iHashCode7 + (vasVar == null ? 0 : vasVar.hashCode())) * 31;
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
        int iHashCode17 = (iHashCode16 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.r;
        return this.s.hashCode() + ((iHashCode17 + (num9 != null ? num9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "GameEventScoreModel(periodStr=", this.f33629a, ", period=", ", fullScoreStr=");
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
        rz4.y(sbP, this.q, ", gameStatus=", this.r, ", fullScoreDetailsModel=");
        sbP.append(this.s);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
