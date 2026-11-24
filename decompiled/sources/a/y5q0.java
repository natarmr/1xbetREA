package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5q0 implements b6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42061a;
    public final vuu0 b;
    public final oie c;

    public y5q0(int i, vuu0 vuu0Var, oie oieVar, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        vuu0Var = (i2 & 2) != 0 ? gfk0.f : vuu0Var;
        oieVar = (i2 & 4) != 0 ? null : oieVar;
        this.f42061a = i;
        this.b = vuu0Var;
        this.c = oieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5q0)) {
            return false;
        }
        y5q0 y5q0Var = (y5q0) obj;
        return this.f42061a == y5q0Var.f42061a && this.b.equals(y5q0Var.b) && Intrinsics.d(this.c, y5q0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f42061a) * 31)) * 31;
        oie oieVar = this.c;
        return iHashCode + (oieVar == null ? 0 : oieVar.hashCode());
    }

    public final String toString() {
        return "Custom(keyboardType=" + bmy.a(this.f42061a) + ", visualTransformation=" + this.b + ", contentType=" + this.c + Separators.RPAREN;
    }
}
