package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class f3q {
    public static final e3q Companion = new e3q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8876a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public /* synthetic */ f3q(int i, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f8876a = null;
        } else {
            this.f8876a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3q)) {
            return false;
        }
        f3q f3qVar = (f3q) obj;
        return Intrinsics.d(this.f8876a, f3qVar.f8876a) && Intrinsics.d(this.b, f3qVar.b) && Intrinsics.d(this.c, f3qVar.c) && Intrinsics.d(this.d, f3qVar.d) && Intrinsics.d(this.e, f3qVar.e) && Intrinsics.d(this.f, f3qVar.f) && Intrinsics.d(this.g, f3qVar.g);
    }

    public final int hashCode() {
        String str = this.f8876a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FilterDataResponse(id=", this.f8876a, ", name=", this.b, ", type=");
        b1j.u(this.c, ", providerName=", this.d, ", imgMobLight=", sbN);
        f140.v(sbN, this.e, ", imageMobDark=", this.f, ", gamesCount=");
        return dw9.q(sbN, this.g, Separators.RPAREN);
    }
}
