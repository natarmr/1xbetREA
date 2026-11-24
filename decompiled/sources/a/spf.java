package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class spf {
    public static final rpf Companion = new rpf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32590a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final gsf j;
    public final gsf k;
    public final gsf l;
    public final gsf m;

    public /* synthetic */ spf(int i, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, gsf gsfVar, gsf gsfVar2, gsf gsfVar3, gsf gsfVar4) {
        if ((i & 1) == 0) {
            this.f32590a = null;
        } else {
            this.f32590a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = gsfVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = gsfVar2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = gsfVar3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = gsfVar4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spf)) {
            return false;
        }
        spf spfVar = (spf) obj;
        return Intrinsics.d(this.f32590a, spfVar.f32590a) && Intrinsics.d(this.b, spfVar.b) && Intrinsics.d(this.c, spfVar.c) && Intrinsics.d(this.d, spfVar.d) && Intrinsics.d(this.e, spfVar.e) && Intrinsics.d(this.f, spfVar.f) && Intrinsics.d(this.g, spfVar.g) && Intrinsics.d(this.h, spfVar.h) && Intrinsics.d(this.i, spfVar.i) && this.j == spfVar.j && this.k == spfVar.k && this.l == spfVar.l && this.m == spfVar.m;
    }

    public final int hashCode() {
        String str = this.f32590a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.h;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.i;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        gsf gsfVar = this.j;
        int iHashCode10 = (iHashCode9 + (gsfVar == null ? 0 : gsfVar.hashCode())) * 31;
        gsf gsfVar2 = this.k;
        int iHashCode11 = (iHashCode10 + (gsfVar2 == null ? 0 : gsfVar2.hashCode())) * 31;
        gsf gsfVar3 = this.l;
        int iHashCode12 = (iHashCode11 + (gsfVar3 == null ? 0 : gsfVar3.hashCode())) * 31;
        gsf gsfVar4 = this.m;
        return iHashCode12 + (gsfVar4 != null ? gsfVar4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "Cs2MatchInfoResponse(mapName=", this.f32590a, ", mapNumber=", ", firstTeamScore=");
        rz4.y(sbP, this.c, ", secondTeamScore=", this.d, ", mapWinner=");
        rz4.y(sbP, this.e, ", firstTeamCountRoundTerrorist=", this.f, ", firstTeamCountRoundCt=");
        rz4.y(sbP, this.g, ", secondTeamCountRoundTerrorist=", this.h, ", secondTeamCountRoundCt=");
        sbP.append(this.i);
        sbP.append(", firstTeamFirstTimeRole=");
        sbP.append(this.j);
        sbP.append(", firstTeamSecondTimeRole=");
        sbP.append(this.k);
        sbP.append(", secondTeamFirstTimeRole=");
        sbP.append(this.l);
        sbP.append(", secondTeamSecondTimeRole=");
        sbP.append(this.m);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
