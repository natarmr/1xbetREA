package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jlo0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16727a;
    public final a4x b;
    public final ulo0 c;
    public final boolean d;

    public jlo0(String str, a4x a4xVar, ulo0 ulo0Var, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f16727a = str;
        this.b = a4xVar;
        this.c = ulo0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlo0)) {
            return false;
        }
        jlo0 jlo0Var = (jlo0) obj;
        return Intrinsics.d(this.f16727a, jlo0Var.f16727a) && Intrinsics.d(this.b, jlo0Var.b) && this.c == jlo0Var.c && this.d == jlo0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16727a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cs0.b(this.b, this.f16727a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("TableStatisticInfoItemUiModel(key=", this.f16727a, ", stats=", this.b, ", tableType=");
        sbU.append(this.c);
        sbU.append(", extraMarginTop=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
