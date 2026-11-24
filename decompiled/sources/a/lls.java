package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lls {
    public static final kls Companion = new kls();
    public static final a8z[] j = {maz.a(wez.f39042a, new o9s(14)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ols f20264a;
    public final Long b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;

    public /* synthetic */ lls(int i, ols olsVar, Long l, Boolean bool, Integer num, String str, String str2, Integer num2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f20264a = null;
        } else {
            this.f20264a = olsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lls)) {
            return false;
        }
        lls llsVar = (lls) obj;
        return this.f20264a == llsVar.f20264a && Intrinsics.d(this.b, llsVar.b) && Intrinsics.d(this.c, llsVar.c) && Intrinsics.d(this.d, llsVar.d) && Intrinsics.d(this.e, llsVar.e) && Intrinsics.d(this.f, llsVar.f) && Intrinsics.d(this.g, llsVar.g) && Intrinsics.d(this.h, llsVar.h) && Intrinsics.d(this.i, llsVar.i);
    }

    public final int hashCode() {
        ols olsVar = this.f20264a;
        int iHashCode = (olsVar == null ? 0 : olsVar.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameLogResponse(type=");
        sb.append(this.f20264a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", radiant=");
        h97.u(this.c, this.d, ", heroId=", ", heroName=", sb);
        f140.v(sb, this.e, ", heroImage=", this.f, ", targetId=");
        b1j.u(this.g, ", targetName=", this.h, ", targetImage=", sb);
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
