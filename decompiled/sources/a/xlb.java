package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xlb {
    public static final wlb Companion = new wlb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f41063a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final String g;
    public final String h;

    public /* synthetic */ xlb(int i, Long l, Long l2, String str, String str2, Integer num, Boolean bool, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f41063a = null;
        } else {
            this.f41063a = l;
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
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlb)) {
            return false;
        }
        xlb xlbVar = (xlb) obj;
        return Intrinsics.d(this.f41063a, xlbVar.f41063a) && Intrinsics.d(this.b, xlbVar.b) && Intrinsics.d(this.c, xlbVar.c) && Intrinsics.d(this.d, xlbVar.d) && Intrinsics.d(this.e, xlbVar.e) && Intrinsics.d(this.f, xlbVar.f) && Intrinsics.d(this.g, xlbVar.g) && Intrinsics.d(this.h, xlbVar.h);
    }

    public final int hashCode() {
        Long l = this.f41063a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f41063a, this.b, "ChampsBarResponse(id=", ", sportId=", ", name=");
        f140.v(sbO, this.c, ", image=", this.d, ", cyberType=");
        brm0.z(this.f, this.e, ", isDuelChamp=", ", nameEng=", sbO);
        return ua80.m(sbO, this.g, ", countryImage=", this.h, Separators.RPAREN);
    }
}
