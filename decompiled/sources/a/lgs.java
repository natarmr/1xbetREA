package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lgs implements pgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20022a;
    public final String b;
    public final String c;

    public lgs(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f20022a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgs)) {
            return false;
        }
        lgs lgsVar = (lgs) obj;
        if (!Intrinsics.d(this.f20022a, lgsVar.f20022a) || !Intrinsics.d(this.b, lgsVar.b)) {
            return false;
        }
        String str = lgsVar.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f20022a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.c;
        return axq.n(b1j.n("MarketUiModel(marketText=", this.f20022a, ", subMarket=", this.b, ", autoSubUiModel="), str == null ? "null" : kng0.l("AutoSubUiModel(autoSubLabel=", str, Separators.RPAREN), Separators.RPAREN);
    }
}
