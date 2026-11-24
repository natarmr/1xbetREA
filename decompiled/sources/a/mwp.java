package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mwp {
    public static final lwp Companion = new lwp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22516a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final jwp i;
    public final Integer j;

    public /* synthetic */ mwp(int i, Integer num, Long l, String str, String str2, String str3, String str4, String str5, Integer num2, jwp jwpVar, Integer num3) {
        if ((i & 1) == 0) {
            this.f22516a = null;
        } else {
            this.f22516a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = jwpVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwp)) {
            return false;
        }
        mwp mwpVar = (mwp) obj;
        return Intrinsics.d(this.f22516a, mwpVar.f22516a) && Intrinsics.d(this.b, mwpVar.b) && Intrinsics.d(this.c, mwpVar.c) && Intrinsics.d(this.d, mwpVar.d) && Intrinsics.d(this.e, mwpVar.e) && Intrinsics.d(this.f, mwpVar.f) && Intrinsics.d(this.g, mwpVar.g) && Intrinsics.d(this.h, mwpVar.h) && Intrinsics.d(this.i, mwpVar.i) && Intrinsics.d(this.j, mwpVar.j);
    }

    public final int hashCode() {
        Integer num = this.f22516a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        jwp jwpVar = this.i;
        int iHashCode9 = (iHashCode8 + (jwpVar == null ? 0 : jwpVar.hashCode())) * 31;
        Integer num3 = this.j;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f22516a, this.b, "FighterResponse(fighterID=", ", feedId=", ", feedName=");
        f140.v(sbM, this.c, ", firstName=", this.d, ", lastName=");
        f140.v(sbM, this.e, ", nickname=", this.f, ", imageS3=");
        axq.x(this.h, this.g, ", position=", ", record=", sbM);
        sbM.append(this.i);
        sbM.append(", rankChange=");
        sbM.append(this.j);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
