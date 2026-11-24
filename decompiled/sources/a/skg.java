package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class skg {
    public static final rkg Companion = new rkg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32346a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final vkg j;

    public /* synthetic */ skg(int i, Long l, Long l2, String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, vkg vkgVar) {
        if ((i & 1) == 0) {
            this.f32346a = null;
        } else {
            this.f32346a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = vkgVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skg)) {
            return false;
        }
        skg skgVar = (skg) obj;
        return Intrinsics.d(this.f32346a, skgVar.f32346a) && Intrinsics.d(this.b, skgVar.b) && Intrinsics.d(this.c, skgVar.c) && Intrinsics.d(this.d, skgVar.d) && Intrinsics.d(this.e, skgVar.e) && Intrinsics.d(this.f, skgVar.f) && Intrinsics.d(this.g, skgVar.g) && Intrinsics.d(this.h, skgVar.h) && Intrinsics.d(this.i, skgVar.i) && Intrinsics.d(this.j, skgVar.j);
    }

    public final int hashCode() {
        Long l = this.f32346a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        vkg vkgVar = this.j;
        return iHashCode9 + (vkgVar != null ? vkgVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f32346a, this.b, "CyberCs2CompositionPlayerLineupResponse(id=", ", feedId=", ", name=");
        f140.v(sbO, this.c, ", nick=", this.d, ", age=");
        b1j.u(this.e, ", country=", this.f, ", countryImageS3=", sbO);
        f140.v(sbO, this.g, ", imageS3=", this.h, ", prizeMoney=");
        sbO.append(this.i);
        sbO.append(", stats=");
        sbO.append(this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
