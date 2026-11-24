package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g76 implements m76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qws0 f10800a;
    public final qws0 b;
    public final p0n c;
    public final String d;
    public final pem e;

    public g76(qws0 qws0Var, qws0 qws0Var2, p0n p0nVar, String str, pem pemVar) {
        str.getClass();
        this.f10800a = qws0Var;
        this.b = qws0Var2;
        this.c = p0nVar;
        this.d = str;
        this.e = pemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g76)) {
            return false;
        }
        g76 g76Var = (g76) obj;
        return this.f10800a.equals(g76Var.f10800a) && this.b.equals(g76Var.b) && Intrinsics.d(this.c, g76Var.c) && Intrinsics.d(this.d, g76Var.d) && Intrinsics.d(this.e, g76Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f10800a.f29450a.hashCode() * 31, 31, this.b.f29450a);
        p0n p0nVar = this.c;
        return ua80.b((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d) + (this.e != null ? -924445215 : 0);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f10800a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
