package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class upw {
    public static final tpw Companion = new tpw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36088a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ upw(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f36088a = null;
        } else {
            this.f36088a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upw)) {
            return false;
        }
        upw upwVar = (upw) obj;
        return Intrinsics.d(this.f36088a, upwVar.f36088a) && Intrinsics.d(this.b, upwVar.b) && Intrinsics.d(this.c, upwVar.c) && Intrinsics.d(this.d, upwVar.d) && Intrinsics.d(this.e, upwVar.e) && Intrinsics.d(this.f, upwVar.f) && Intrinsics.d(this.g, upwVar.g) && Intrinsics.d(this.h, upwVar.h);
    }

    public final int hashCode() {
        String str = this.f36088a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HorsesParamsResponse(damAndSire=", this.f36088a, ", distance=", this.b, ", horseId=");
        f140.v(sbN, this.c, ", jockeyAndTrainer=", this.d, ", place=");
        f140.v(sbN, this.e, ", position=", this.f, ", weight=");
        return ua80.m(sbN, this.g, ", yearAndAge=", this.h, Separators.RPAREN);
    }
}
