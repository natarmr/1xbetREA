package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h000 implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrz f12209a;
    public final String b;
    public final d4d c;
    public final String d;
    public final wui0 e;
    public final sy f;

    public h000(wrz wrzVar, String str, d4d d4dVar, String str2, wui0 wui0Var, sy syVar) {
        str.getClass();
        str2.getClass();
        this.f12209a = wrzVar;
        this.b = str;
        this.c = d4dVar;
        this.d = str2;
        this.e = wui0Var;
        this.f = syVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h000)) {
            return false;
        }
        h000 h000Var = (h000) obj;
        return this.f12209a.equals(h000Var.f12209a) && Intrinsics.d(this.b, h000Var.b) && this.c == h000Var.c && Intrinsics.d(this.d, h000Var.d) && this.e == h000Var.e && Intrinsics.d(this.f, h000Var.f);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f12209a.hashCode() * 31, 31, this.b);
        d4d d4dVar = this.c;
        int iC = rw2.c(this.e, ua80.b((iB + (d4dVar == null ? 0 : d4dVar.hashCode())) * 31, 31, this.d), 31);
        sy syVar = this.f;
        return iC + (syVar != null ? syVar.hashCode() : 0);
    }

    public final String toString() {
        return "LimitsNeFullLimitUiModel(limitType=" + this.f12209a + ", title=" + this.b + ", titleColor=" + this.c + ", limit=" + this.d + ", position=" + this.e + ", additionalInfoUiModel=" + this.f + Separators.RPAREN;
    }
}
