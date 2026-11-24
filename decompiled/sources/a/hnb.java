package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hnb {
    public static final fnb Companion = new fnb();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new e0b(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13343a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public /* synthetic */ hnb(int i, Integer num, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f13343a = null;
        } else {
            this.f13343a = l;
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
        if (!(obj instanceof hnb)) {
            return false;
        }
        hnb hnbVar = (hnb) obj;
        return Intrinsics.d(this.f13343a, hnbVar.f13343a) && Intrinsics.d(this.b, hnbVar.b) && Intrinsics.d(this.c, hnbVar.c) && Intrinsics.d(this.d, hnbVar.d) && Intrinsics.d(this.e, hnbVar.e) && Intrinsics.d(this.f, hnbVar.f);
    }

    public final int hashCode() {
        Long l = this.f13343a;
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
        StringBuilder sbS = cs0.s(this.f13343a, "ChampsWithGameResponse(champID=", ", champName=", this.b, ", champImage=");
        f140.v(sbS, this.c, ", champCountryImage=", this.d, ", champCountryId=");
        sbS.append(this.e);
        sbS.append(", gameList=");
        sbS.append(this.f);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
