package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qwe0 implements twe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f29432a;
    public final u0f0 b;
    public final a4x c;

    public qwe0(q7f0 q7f0Var, u0f0 u0f0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f29432a = q7f0Var;
        this.b = u0f0Var;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwe0)) {
            return false;
        }
        qwe0 qwe0Var = (qwe0) obj;
        return this.f29432a == qwe0Var.f29432a && this.b == qwe0Var.b && Intrinsics.d(this.c, qwe0Var.c);
    }

    public final int hashCode() {
        q7f0 q7f0Var = this.f29432a;
        int iHashCode = (q7f0Var == null ? 0 : q7f0Var.hashCode()) * 31;
        u0f0 u0f0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (u0f0Var != null ? u0f0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(registrationType=");
        sb.append(this.f29432a);
        sb.append(", scrollToField=");
        sb.append(this.b);
        sb.append(", fieldsList=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
