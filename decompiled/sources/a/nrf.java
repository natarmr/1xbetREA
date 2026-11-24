package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23999a;
    public final String b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final Float g;
    public final Float h;

    public nrf(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        this.f23999a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrf)) {
            return false;
        }
        nrf nrfVar = (nrf) obj;
        return this.f23999a.equals(nrfVar.f23999a) && this.b.equals(nrfVar.b) && Intrinsics.d(this.c, nrfVar.c) && Intrinsics.d(this.d, nrfVar.d) && Intrinsics.d(this.e, nrfVar.e) && Intrinsics.d(this.f, nrfVar.f) && Intrinsics.d(this.g, nrfVar.g) && Intrinsics.d(this.h, nrfVar.h);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f23999a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.e;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.f;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.g;
        int iHashCode5 = (iHashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.h;
        return iHashCode5 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2StatisticPlayerModel(playerId=", this.f23999a, ", playerImage=", this.b, ", rating=");
        vqd.x(sbN, this.c, ", kills=", this.d, ", dead=");
        vqd.x(sbN, this.e, ", kast=", this.f, ", roundSwing=");
        sbN.append(this.g);
        sbN.append(", adr=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
