package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rjh {
    public static final qjh Companion = new qjh();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30593a;
    public final String b;
    public final Integer c;
    public final List d;
    public final List e;
    public final List f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{null, null, null, maz.a(wezVar, new gch((byte) 14)), maz.a(wezVar, new gch((byte) 15)), maz.a(wezVar, new gch((byte) 16))};
    }

    public /* synthetic */ rjh(int i, String str, String str2, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f30593a = null;
        } else {
            this.f30593a = str;
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
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjh)) {
            return false;
        }
        rjh rjhVar = (rjh) obj;
        return Intrinsics.d(this.f30593a, rjhVar.f30593a) && Intrinsics.d(this.b, rjhVar.b) && Intrinsics.d(this.c, rjhVar.c) && Intrinsics.d(this.d, rjhVar.d) && Intrinsics.d(this.e, rjhVar.e) && Intrinsics.d(this.f, rjhVar.f);
    }

    public final int hashCode() {
        String str = this.f30593a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberTournamentBracketGroupSwissResponse(id=", this.f30593a, ", record=", this.b, ", index=");
        cs0.z(sbN, this.c, ", fromGroupWinners=", this.d, ", fromGroupLosers=");
        return kng0.n(", matches=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
