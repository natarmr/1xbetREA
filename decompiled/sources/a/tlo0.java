package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tlo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlo0 f34156a;
    public final a4x b;

    public tlo0(zlo0 zlo0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f34156a = zlo0Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlo0)) {
            return false;
        }
        tlo0 tlo0Var = (tlo0) obj;
        return this.f34156a.equals(tlo0Var.f34156a) && Intrinsics.d(this.b, tlo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34156a.hashCode() * 31);
    }

    public final String toString() {
        return "TableStatisticTableUiModel(tableInfo=" + this.f34156a + ", tableItems=" + this.b + Separators.RPAREN;
    }
}
