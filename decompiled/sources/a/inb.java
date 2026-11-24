package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class inb {
    public static final gnb Companion = new gnb();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new e0b(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f15065a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public /* synthetic */ inb(int i, Integer num, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f15065a = null;
        } else {
            this.f15065a = l;
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
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inb)) {
            return false;
        }
        inb inbVar = (inb) obj;
        return Intrinsics.d(this.f15065a, inbVar.f15065a) && Intrinsics.d(this.b, inbVar.b) && Intrinsics.d(this.c, inbVar.c) && Intrinsics.d(this.d, inbVar.d) && Intrinsics.d(this.e, inbVar.e) && Intrinsics.d(this.f, inbVar.f);
    }

    public final int hashCode() {
        Long l = this.f15065a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f15065a, "ChampsWithGameResponse(champID=", ", champName=", this.b, ", champImage=");
        f140.v(sbS, this.c, ", champCountryImage=", this.d, ", champCountryId=");
        sbS.append(this.e);
        sbS.append(", gameList=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
