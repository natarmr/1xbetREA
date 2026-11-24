package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rnd implements mnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30784a;
    public final boolean b;
    public final rpp0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public rnd(boolean z, boolean z2, rpp0 rpp0Var, String str, String str2, String str3, String str4, String str5) {
        str4.getClass();
        str5.getClass();
        this.f30784a = z;
        this.b = z2;
        this.c = rpp0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnd)) {
            return false;
        }
        rnd rndVar = (rnd) obj;
        return this.f30784a == rndVar.f30784a && this.b == rndVar.b && this.c.equals(rndVar.c) && this.d.equals(rndVar.d) && this.e.equals(rndVar.e) && this.f.equals(rndVar.f) && Intrinsics.d(this.g, rndVar.g) && Intrinsics.d(this.h, rndVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f30784a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CompressedCardCricketLiveModel(finished=", ", live=", ", teamsInfoModel=", this.f30784a, this.b);
        sbQ.append(this.c);
        sbQ.append(", teamOneLogoUrl=");
        sbQ.append(this.d);
        sbQ.append(", teamTwoLogoUrl=");
        f140.v(sbQ, this.e, ", matchFormat=", this.f, ", vid=");
        return ua80.m(sbQ, this.g, ", dopInfo=", this.h, Separators.RPAREN);
    }
}
