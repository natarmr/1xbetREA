package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l76 implements m76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qws0 f19541a;
    public final qws0 b;
    public final p0n c;
    public final String d;
    public final pem e;

    public l76(qws0 qws0Var, qws0 qws0Var2, p0n p0nVar, String str, pem pemVar) {
        str.getClass();
        this.f19541a = qws0Var;
        this.b = qws0Var2;
        this.c = p0nVar;
        this.d = str;
        this.e = pemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l76)) {
            return false;
        }
        l76 l76Var = (l76) obj;
        return this.f19541a.equals(l76Var.f19541a) && this.b.equals(l76Var.b) && Intrinsics.d(this.c, l76Var.c) && Intrinsics.d(this.d, l76Var.d) && Intrinsics.d(this.e, l76Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f19541a.f29450a.hashCode() * 31, 31, this.b.f29450a);
        p0n p0nVar = this.c;
        return ua80.b((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31, 31, this.d) + (this.e != null ? -924445215 : 0);
    }

    public final String toString() {
        return "TwoPairs(firstOpponentModel=" + this.f19541a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + this.e + Separators.RPAREN;
    }
}
