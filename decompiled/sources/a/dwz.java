package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dwz implements wwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f6822a;
    public final String b;
    public final String c;
    public final String d;
    public final wui0 e;
    public final boolean f;
    public final ny g;

    public dwz(xrz xrzVar, String str, String str2, String str3, wui0 wui0Var, boolean z, ny nyVar) {
        brm0.B(str, str2, str3);
        this.f6822a = xrzVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = wui0Var;
        this.f = z;
        this.g = nyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwz)) {
            return false;
        }
        dwz dwzVar = (dwz) obj;
        return this.f6822a.equals(dwzVar.f6822a) && Intrinsics.d(this.b, dwzVar.b) && Intrinsics.d(this.c, dwzVar.c) && Intrinsics.d(this.d, dwzVar.d) && this.e == dwzVar.e && this.f == dwzVar.f && Intrinsics.d(this.g, dwzVar.g);
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.c(this.e, ua80.b(ua80.b(ua80.b(this.f6822a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        ny nyVar = this.g;
        return iE + (nyVar == null ? 0 : nyVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsIeFinancialLimitUiModel(limitType=");
        sb.append(this.f6822a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", limit=");
        f140.v(sb, this.c, ", expiresAt=", this.d, ", position=");
        sb.append(this.e);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", additionalInfoUiModel=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
