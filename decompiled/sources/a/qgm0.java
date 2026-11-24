package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qgm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pgm0 f28693a;
    public final a4x b;

    public qgm0(pgm0 pgm0Var, i4 i4Var) {
        i4Var.getClass();
        this.f28693a = pgm0Var;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgm0)) {
            return false;
        }
        qgm0 qgm0Var = (qgm0) obj;
        return this.f28693a.equals(qgm0Var.f28693a) && Intrinsics.d(this.b, qgm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28693a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticTableUiModel(tableInfo=" + this.f28693a + ", tableItems=" + this.b + Separators.RPAREN;
    }
}
