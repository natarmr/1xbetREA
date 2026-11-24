package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tb40 {
    public static final sb40 Companion = new sb40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33645a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Float g;
    public final tc40 h;

    static {
        sc40 sc40Var = tc40.Companion;
    }

    public /* synthetic */ tb40(int i, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, Float f, tc40 tc40Var) {
        if ((i & 1) == 0) {
            this.f33645a = null;
        } else {
            this.f33645a = num;
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
            this.g = f;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = tc40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb40)) {
            return false;
        }
        tb40 tb40Var = (tb40) obj;
        return Intrinsics.d(this.f33645a, tb40Var.f33645a) && Intrinsics.d(this.b, tb40Var.b) && Intrinsics.d(this.c, tb40Var.c) && Intrinsics.d(this.d, tb40Var.d) && Intrinsics.d(this.e, tb40Var.e) && Intrinsics.d(this.f, tb40Var.f) && Intrinsics.d(this.g, tb40Var.g) && Intrinsics.d(this.h, tb40Var.h);
    }

    public final int hashCode() {
        Integer num = this.f33645a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.g;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        tc40 tc40Var = this.h;
        return iHashCode7 + (tc40Var != null ? tc40Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f33645a, "MetaHeroesHeroResponse(id=", ", name=", this.b, ", image=");
        axq.x(this.d, this.c, ", rating=", ", numberOfMatches=", sbN);
        rz4.y(sbN, this.e, ", numberOfWins=", this.f, ", contestRate=");
        sbN.append(this.g);
        sbN.append(", skillBuild=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
