package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m400 implements q400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f21143a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;
    public final oy f;

    public m400(xrz xrzVar, String str, String str2, wui0 wui0Var, boolean z, oy oyVar) {
        str.getClass();
        str2.getClass();
        this.f21143a = xrzVar;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
        this.f = oyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m400)) {
            return false;
        }
        m400 m400Var = (m400) obj;
        return this.f21143a.equals(m400Var.f21143a) && Intrinsics.d(this.b, m400Var.b) && Intrinsics.d(this.c, m400Var.c) && this.d == m400Var.d && this.e == m400Var.e && Intrinsics.d(this.f, m400Var.f);
    }

    public final int hashCode() {
        int iE = brm0.e(rw2.c(this.d, ua80.b(ua80.b(this.f21143a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        oy oyVar = this.f;
        return iE + (oyVar == null ? 0 : oyVar.hashCode());
    }

    public final String toString() {
        return "FinancialLimit(limitType=" + this.f21143a + ", title=" + this.b + ", limit=" + this.c + ", position=" + this.d + ", enabled=" + this.e + ", additionalInfoUiModel=" + this.f + Separators.RPAREN;
    }
}
