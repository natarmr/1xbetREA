package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pxe f5168a;
    public final String b;
    public final boolean c;
    public final String d;
    public final i680 e;

    public cye(pxe pxeVar, String str, boolean z, String str2, i680 i680Var) {
        this.f5168a = pxeVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = i680Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof cye) {
                cye cyeVar = (cye) obj;
                if (this.f5168a.equals(cyeVar.f5168a) && this.b.equals(cyeVar.b) && this.c == cyeVar.c) {
                    String str = cyeVar.d;
                    String str2 = this.d;
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
                    if (zEquals && Intrinsics.d(this.e, cyeVar.e)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f5168a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        i680 i680Var = this.e;
        return iHashCode + (i680Var != null ? i680Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.d;
        String strA = str == null ? "null" : c15.a(str);
        StringBuilder sb = new StringBuilder("CouponInfoUiModel(coefficientContainerState=");
        sb.append(this.f5168a);
        sb.append(", coefChangeDesc=");
        sb.append(this.b);
        sb.append(", isAuthorized=");
        f140.s(", autoSubUiModel=", strA, ", optionBetUiState=", sb, this.c);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
