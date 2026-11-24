package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17167a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;

    public jup(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
        this.f17167a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
        this.h = num8;
        this.i = num9;
        this.j = num10;
        this.k = num11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jup)) {
            return false;
        }
        jup jupVar = (jup) obj;
        return Intrinsics.d(this.f17167a, jupVar.f17167a) && Intrinsics.d(this.b, jupVar.b) && Intrinsics.d(this.c, jupVar.c) && Intrinsics.d(this.d, jupVar.d) && Intrinsics.d(this.e, jupVar.e) && Intrinsics.d(this.f, jupVar.f) && Intrinsics.d(this.g, jupVar.g) && Intrinsics.d(this.h, jupVar.h) && Intrinsics.d(this.i, jupVar.i) && Intrinsics.d(this.j, jupVar.j) && Intrinsics.d(this.k, jupVar.k);
    }

    public final int hashCode() {
        Integer num = this.f17167a;
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
        Integer num8 = this.h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.i;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.k;
        return iHashCode10 + (num11 != null ? num11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("FightStatisticValuesModel(totalStrikes=", this.f17167a, ", significantStrikes=", this.b, ", knockdowns=");
        rz4.y(sbQ, this.c, ", takedowns=", this.d, ", submissionAttempts=");
        rz4.y(sbQ, this.e, ", headStrikes=", this.f, ", bodyStrikes=");
        rz4.y(sbQ, this.g, ", legStrikes=", this.h, ", distanceStrikes=");
        rz4.y(sbQ, this.i, ", clinchStrikes=", this.j, ", groundStrikes=");
        return dw9.q(sbQ, this.k, Separators.RPAREN);
    }
}
