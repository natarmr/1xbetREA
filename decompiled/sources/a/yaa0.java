package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class yaa0 {
    public static final vaa0 Companion = new vaa0();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new raa0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42285a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ yaa0(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if ((i & 1) == 0) {
            this.f42285a = null;
        } else {
            this.f42285a = str;
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
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaa0)) {
            return false;
        }
        yaa0 yaa0Var = (yaa0) obj;
        return Intrinsics.d(this.f42285a, yaa0Var.f42285a) && Intrinsics.d(this.b, yaa0Var.b) && Intrinsics.d(this.c, yaa0Var.c) && Intrinsics.d(this.d, yaa0Var.d) && Intrinsics.d(this.e, yaa0Var.e) && Intrinsics.d(this.f, yaa0Var.f);
    }

    public final int hashCode() {
        String str = this.f42285a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerStatisticResponse(time=", this.f42285a, ", timeDiff=", this.b, ", place=");
        f140.v(sbN, this.c, ", playerId=", this.d, ", teamTitle=");
        return rw2.m(this.e, ", veloJerseys=", Separators.RPAREN, sbN, this.f);
    }
}
