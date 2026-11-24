package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bqf {
    public static final aqf Companion = new aqf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3026a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final jqf g;
    public final gqf h;

    public /* synthetic */ bqf(int i, Long l, String str, String str2, Integer num, String str3, String str4, jqf jqfVar, gqf gqfVar) {
        if ((i & 1) == 0) {
            this.f3026a = null;
        } else {
            this.f3026a = l;
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
            this.d = num;
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
            this.g = jqfVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = gqfVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar = (bqf) obj;
        return Intrinsics.d(this.f3026a, bqfVar.f3026a) && Intrinsics.d(this.b, bqfVar.b) && Intrinsics.d(this.c, bqfVar.c) && Intrinsics.d(this.d, bqfVar.d) && Intrinsics.d(this.e, bqfVar.e) && Intrinsics.d(this.f, bqfVar.f) && Intrinsics.d(this.g, bqfVar.g) && Intrinsics.d(this.h, bqfVar.h);
    }

    public final int hashCode() {
        Long l = this.f3026a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        jqf jqfVar = this.g;
        int iHashCode7 = (iHashCode6 + (jqfVar == null ? 0 : jqfVar.hashCode())) * 31;
        gqf gqfVar = this.h;
        return iHashCode7 + (gqfVar != null ? gqfVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f3026a, "Cs2PlayerDuelResponse(id=", ", nick=", this.b, ", name=");
        axq.x(this.d, this.c, ", age=", ", country=", sbS);
        f140.v(sbS, this.e, ", imageS3=", this.f, ", team=");
        sbS.append(this.g);
        sbS.append(", stats=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
