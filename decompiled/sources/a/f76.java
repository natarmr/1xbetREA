package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f76 implements m76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qws0 f9044a;
    public final qws0 b;
    public final p0n c;
    public final String d;
    public final pem e;

    public f76(qws0 qws0Var, qws0 qws0Var2, p0n p0nVar, String str, pem pemVar) {
        str.getClass();
        this.f9044a = qws0Var;
        this.b = qws0Var2;
        this.c = p0nVar;
        this.d = str;
        this.e = pemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f76)) {
            return false;
        }
        f76 f76Var = (f76) obj;
        return this.f9044a.equals(f76Var.f9044a) && this.b.equals(f76Var.b) && Intrinsics.d(this.c, f76Var.c) && Intrinsics.d(this.d, f76Var.d) && Intrinsics.d(this.e, f76Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f9044a.f29450a.hashCode() * 31, 31, this.b.f29450a);
        p0n p0nVar = this.c;
        return ua80.b((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d) + (this.e != null ? -924445215 : 0);
    }

    public final String toString() {
        return "Cricket(firstOpponentModel=" + this.f9044a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
