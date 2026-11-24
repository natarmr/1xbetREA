package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sfn {
    public static final rfn Companion = new rfn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f32125a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ sfn(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f32125a = null;
        } else {
            this.f32125a = num;
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
            this.g = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfn)) {
            return false;
        }
        sfn sfnVar = (sfn) obj;
        return Intrinsics.d(this.f32125a, sfnVar.f32125a) && Intrinsics.d(this.b, sfnVar.b) && Intrinsics.d(this.c, sfnVar.c) && Intrinsics.d(this.d, sfnVar.d) && Intrinsics.d(this.e, sfnVar.e) && Intrinsics.d(this.f, sfnVar.f) && Intrinsics.d(this.g, sfnVar.g);
    }

    public final int hashCode() {
        Integer num = this.f32125a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f32125a, "DynamicBannerResponse(gameType=", ", gameName=", this.b, ", description=");
        f140.v(sbN, this.c, ", headerDescription=", this.d, ", route=");
        f140.v(sbN, this.e, ", oldRoute=", this.f, ", clientData=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
