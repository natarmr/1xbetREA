package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kdg {
    public static final jdg Companion = new jdg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18106a;
    public final Integer b;
    public final odg c;

    public /* synthetic */ kdg(int i, String str, Integer num, odg odgVar) {
        if ((i & 1) == 0) {
            this.f18106a = null;
        } else {
            this.f18106a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = odgVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdg)) {
            return false;
        }
        kdg kdgVar = (kdg) obj;
        return Intrinsics.d(this.f18106a, kdgVar.f18106a) && Intrinsics.d(this.b, kdgVar.b) && Intrinsics.d(this.c, kdgVar.c);
    }

    public final int hashCode() {
        String str = this.f18106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        odg odgVar = this.c;
        return iHashCode2 + (odgVar != null ? odgVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "CyberChampPrizeDistributionResponse(place=", this.f18106a, ", prize=", ", team=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
