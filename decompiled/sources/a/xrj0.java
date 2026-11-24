package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xrj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41374a;
    public final udp0 b;
    public final udp0 c;

    public xrj0(a4x a4xVar, udp0 udp0Var, udp0 udp0Var2) {
        a4xVar.getClass();
        this.f41374a = a4xVar;
        this.b = udp0Var;
        this.c = udp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrj0)) {
            return false;
        }
        xrj0 xrj0Var = (xrj0) obj;
        return Intrinsics.d(this.f41374a, xrj0Var.f41374a) && Intrinsics.d(this.b, xrj0Var.b) && Intrinsics.d(this.c, xrj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f41374a.hashCode() * 31;
        udp0 udp0Var = this.b;
        int iHashCode2 = (iHashCode + (udp0Var == null ? 0 : udp0Var.hashCode())) * 31;
        udp0 udp0Var2 = this.c;
        return iHashCode2 + (udp0Var2 != null ? udp0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ShortStatisticUiModel(infoList=" + this.f41374a + ", teamOne=" + this.b + ", teamTwo=" + this.c + Separators.RPAREN;
    }
}
