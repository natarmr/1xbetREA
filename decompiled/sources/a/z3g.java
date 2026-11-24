package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class z3g {
    public static final y3g Companion = new y3g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43715a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Float e;
    public final Float f;
    public final Float g;

    public /* synthetic */ z3g(int i, String str, Integer num, Integer num2, Integer num3, Float f, Float f2, Float f3) {
        if ((i & 1) == 0) {
            this.f43715a = null;
        } else {
            this.f43715a = str;
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
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return Intrinsics.d(this.f43715a, z3gVar.f43715a) && Intrinsics.d(this.b, z3gVar.b) && Intrinsics.d(this.c, z3gVar.c) && Intrinsics.d(this.d, z3gVar.d) && Intrinsics.d(this.e, z3gVar.e) && Intrinsics.d(this.f, z3gVar.f) && Intrinsics.d(this.g, z3gVar.g);
    }

    public final int hashCode() {
        String str = this.f43715a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.e;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.g;
        return iHashCode6 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "CyberCSMatchesStatisticMatchTeamPlayerResponse(name=", this.f43715a, ", kills=", ", deaths=");
        rz4.y(sbP, this.c, ", assists=", this.d, ", kast=");
        vqd.x(sbP, this.e, ", adr=", this.f, ", rating=");
        sbP.append(this.g);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
