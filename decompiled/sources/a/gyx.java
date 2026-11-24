package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gyx implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boo0 f12153a;
    public final a4x b;

    public gyx(boo0 boo0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f12153a = boo0Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyx)) {
            return false;
        }
        gyx gyxVar = (gyx) obj;
        return this.f12153a.equals(gyxVar.f12153a) && Intrinsics.d(this.b, gyxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12153a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemStatisticsUiModel(tabs=" + this.f12153a + ", heroItemStatistics=" + this.b + Separators.RPAREN;
    }
}
