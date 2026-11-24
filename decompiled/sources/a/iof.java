package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class iof {
    public static final hof Companion = new hof();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15114a;
    public final gsf b;
    public final String c;
    public final gsf d;
    public final String e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final gsf m;
    public final gsf n;
    public final Integer o;
    public final Integer p;

    public iof(edy edyVar) {
        edyVar.getClass();
        String strL = piz.L(edyVar, "killer");
        fsf fsfVar = gsf.Companion;
        Integer numValueOf = Integer.valueOf(piz.K(edyVar, "killerSide"));
        fsfVar.getClass();
        gsf gsfVarA = fsf.a(numValueOf);
        String strL2 = piz.L(edyVar, "victim");
        gsf gsfVarA2 = fsf.a(Integer.valueOf(piz.K(edyVar, "victimSide")));
        String strL3 = piz.L(edyVar, "weapon");
        boolean zJ = piz.J(edyVar, "headShot");
        boolean zJ2 = piz.J(edyVar, "penetrated");
        boolean zJ3 = piz.J(edyVar, "throughSmoke");
        boolean zJ4 = piz.J(edyVar, "noScope");
        boolean zJ5 = piz.J(edyVar, "killerBlind");
        String strL4 = piz.L(edyVar, "assister");
        gsf gsfVarA3 = fsf.a(Integer.valueOf(piz.K(edyVar, "assisterSide")));
        String strL5 = piz.L(edyVar, "flasher");
        gsf gsfVarA4 = fsf.a(Integer.valueOf(piz.K(edyVar, "flasherSide")));
        int iK = piz.K(edyVar, "vX");
        int iK2 = piz.K(edyVar, "vY");
        Boolean boolValueOf = Boolean.valueOf(zJ);
        Boolean boolValueOf2 = Boolean.valueOf(zJ2);
        Boolean boolValueOf3 = Boolean.valueOf(zJ3);
        Boolean boolValueOf4 = Boolean.valueOf(zJ4);
        Boolean boolValueOf5 = Boolean.valueOf(zJ5);
        Integer numValueOf2 = Integer.valueOf(iK);
        Integer numValueOf3 = Integer.valueOf(iK2);
        this.f15114a = strL;
        this.b = gsfVarA;
        this.c = strL2;
        this.d = gsfVarA2;
        this.e = strL3;
        this.f = boolValueOf;
        this.g = boolValueOf2;
        this.h = boolValueOf3;
        this.i = boolValueOf4;
        this.j = boolValueOf5;
        this.k = strL4;
        this.l = strL5;
        this.m = gsfVarA4;
        this.n = gsfVarA3;
        this.o = numValueOf2;
        this.p = numValueOf3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iof)) {
            return false;
        }
        iof iofVar = (iof) obj;
        return Intrinsics.d(this.f15114a, iofVar.f15114a) && this.b == iofVar.b && Intrinsics.d(this.c, iofVar.c) && this.d == iofVar.d && Intrinsics.d(this.e, iofVar.e) && Intrinsics.d(this.f, iofVar.f) && Intrinsics.d(this.g, iofVar.g) && Intrinsics.d(this.h, iofVar.h) && Intrinsics.d(this.i, iofVar.i) && Intrinsics.d(this.j, iofVar.j) && Intrinsics.d(this.k, iofVar.k) && Intrinsics.d(this.l, iofVar.l) && this.m == iofVar.m && this.n == iofVar.n && Intrinsics.d(this.o, iofVar.o) && Intrinsics.d(this.p, iofVar.p);
    }

    public final int hashCode() {
        String str = this.f15114a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        gsf gsfVar = this.b;
        int iHashCode2 = (iHashCode + (gsfVar == null ? 0 : gsfVar.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gsf gsfVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (gsfVar2 == null ? 0 : gsfVar2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.i;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.j;
        int iHashCode10 = (iHashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        gsf gsfVar3 = this.m;
        int iHashCode13 = (iHashCode12 + (gsfVar3 == null ? 0 : gsfVar3.hashCode())) * 31;
        gsf gsfVar4 = this.n;
        int iHashCode14 = (iHashCode13 + (gsfVar4 == null ? 0 : gsfVar4.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.p;
        return iHashCode15 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2KillGameLogResponse(killer=");
        sb.append(this.f15114a);
        sb.append(", killerSide=");
        sb.append(this.b);
        sb.append(", victim=");
        sb.append(this.c);
        sb.append(", victimSide=");
        sb.append(this.d);
        sb.append(", weapon=");
        h97.v(this.f, this.e, ", headShot=", ", penetrated=", sb);
        defpackage.c.j(sb, this.g, ", throughSmoke=", this.h, ", noScope=");
        defpackage.c.j(sb, this.i, ", killerBlind=", this.j, ", assister=");
        f140.v(sb, this.k, ", flasher=", this.l, ", flasherSide=");
        sb.append(this.m);
        sb.append(", assisterSide=");
        sb.append(this.n);
        sb.append(", killXPosition=");
        return ua80.l(sb, this.o, ", killYPosition=", this.p, Separators.RPAREN);
    }

    public /* synthetic */ iof(int i, String str, gsf gsfVar, String str2, gsf gsfVar2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, gsf gsfVar3, gsf gsfVar4, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f15114a = null;
        } else {
            this.f15114a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gsfVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = gsfVar2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = gsfVar3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = gsfVar4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = num2;
        }
    }
}
