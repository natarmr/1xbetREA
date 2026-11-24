package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class puy {
    public static final ouy Companion = new ouy();
    public static final a8z[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27638a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;

    static {
        wez wezVar = wez.f39042a;
        j = new a8z[]{maz.a(wezVar, new pcy((byte) 9)), null, null, null, null, maz.a(wezVar, new pcy((byte) 10)), null, null, null};
    }

    public /* synthetic */ puy(int i, List list, String str, String str2, String str3, Integer num, List list2, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f27638a = null;
        } else {
            this.f27638a = list;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
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
            this.i = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puy)) {
            return false;
        }
        puy puyVar = (puy) obj;
        return Intrinsics.d(this.f27638a, puyVar.f27638a) && Intrinsics.d(this.b, puyVar.b) && Intrinsics.d(this.c, puyVar.c) && Intrinsics.d(this.d, puyVar.d) && Intrinsics.d(this.e, puyVar.e) && Intrinsics.d(this.f, puyVar.f) && Intrinsics.d(this.g, puyVar.g) && Intrinsics.d(this.h, puyVar.h) && Intrinsics.d(this.i, puyVar.i);
    }

    public final int hashCode() {
        List list = this.f27638a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("LanguageResponse(androidName=", ", codeIso=", this.b, this.f27638a, ", enumIso=");
        f140.v(sbO, this.c, ", engName=", this.d, ", id=");
        cs0.z(sbO, this.e, ", iosName=", this.f, ", name=");
        f140.v(sbO, this.g, ", translation=", this.h, ", webName=");
        return axq.n(sbO, this.i, Separators.RPAREN);
    }
}
