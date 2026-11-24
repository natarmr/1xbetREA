package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6234a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public dkk(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6234a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkk)) {
            return false;
        }
        dkk dkkVar = (dkk) obj;
        return Intrinsics.d(this.f6234a, dkkVar.f6234a) && Intrinsics.d(this.b, dkkVar.b) && Intrinsics.d(this.c, dkkVar.c) && Intrinsics.d(this.d, dkkVar.d) && Intrinsics.d(this.e, dkkVar.e) && Intrinsics.d(this.f, dkkVar.f);
    }

    public final int hashCode() {
        String str = this.f6234a;
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
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DicePlayerScoreUiModel(firstRoundScoreOne=", this.f6234a, ", firstRoundScoreTwo=", this.b, ", firstRoundScoreResult=");
        f140.v(sbN, this.c, ", secondRoundScoreOne=", this.d, ", secondRoundScoreTwo=");
        return ua80.m(sbN, this.e, ", secondRoundScoreResult=", this.f, Separators.RPAREN);
    }
}
