package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jhm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16535a;
    public final a4x b;

    public jhm0(int i, a4x a4xVar) {
        a4xVar.getClass();
        this.f16535a = i;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhm0)) {
            return false;
        }
        jhm0 jhm0Var = (jhm0) obj;
        return this.f16535a == jhm0Var.f16535a && Intrinsics.d(this.b, jhm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16535a) * 31);
    }

    public final String toString() {
        return "StatisticsColumnsUiModel(id=" + this.f16535a + ", cells=" + this.b + Separators.RPAREN;
    }
}
