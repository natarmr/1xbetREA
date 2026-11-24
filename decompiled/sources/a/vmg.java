package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vmg {
    public static final umg Companion = new umg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37673a;
    public final String b;
    public final String c;
    public final Double d;
    public final Integer e;

    public /* synthetic */ vmg(int i, String str, String str2, String str3, Double d, Integer num) {
        if ((i & 1) == 0) {
            this.f37673a = null;
        } else {
            this.f37673a = str;
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
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmg)) {
            return false;
        }
        vmg vmgVar = (vmg) obj;
        return Intrinsics.d(this.f37673a, vmgVar.f37673a) && Intrinsics.d(this.b, vmgVar.b) && Intrinsics.d(this.c, vmgVar.c) && Intrinsics.d(this.d, vmgVar.d) && Intrinsics.d(this.e, vmgVar.e);
    }

    public final int hashCode() {
        String str = this.f37673a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberDotaPlayerHeroesResponse(heroName=", this.f37673a, ", image=", this.b, ", imageS3=");
        sbN.append(this.c);
        sbN.append(", winRate=");
        sbN.append(this.d);
        sbN.append(", matchesCount=");
        return dw9.q(sbN, this.e, Separators.RPAREN);
    }
}
