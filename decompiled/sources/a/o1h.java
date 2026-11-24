package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o1h {
    public static final n1h Companion = new n1h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24480a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    public /* synthetic */ o1h(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        if ((i & 1) == 0) {
            this.f24480a = null;
        } else {
            this.f24480a = num;
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
            this.h = num8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1h)) {
            return false;
        }
        o1h o1hVar = (o1h) obj;
        return Intrinsics.d(this.f24480a, o1hVar.f24480a) && Intrinsics.d(this.b, o1hVar.b) && Intrinsics.d(this.c, o1hVar.c) && Intrinsics.d(this.d, o1hVar.d) && Intrinsics.d(this.e, o1hVar.e) && Intrinsics.d(this.f, o1hVar.f) && Intrinsics.d(this.g, o1hVar.g) && Intrinsics.d(this.h, o1hVar.h) && Intrinsics.d(this.i, o1hVar.i);
    }

    public final int hashCode() {
        Integer num = this.f24480a;
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
        return iHashCode8 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CyberIndividualHeroStatisticResponse(killsCount=", this.f24480a, ", deadCount=", this.b, ", assistsCount=");
        rz4.y(sbQ, this.c, ", lastHitsCount=", this.d, ", deniesCount=");
        rz4.y(sbQ, this.e, ", overallValueOfHero=", this.f, ", goldInMinute=");
        rz4.y(sbQ, this.g, ", experienceInMinute=", this.h, ", goldCount=");
        return dw9.q(sbQ, this.i, Separators.RPAREN);
    }
}
