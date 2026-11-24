package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f40320a;
    public final g4j b;

    public x5j(imm immVar, g4j g4jVar) {
        immVar.getClass();
        g4jVar.getClass();
        this.f40320a = immVar;
        this.b = g4jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5j)) {
            return false;
        }
        x5j x5jVar = (x5j) obj;
        return Intrinsics.d(this.f40320a, x5jVar.f40320a) && Intrinsics.d(this.b, x5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40320a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTasksUiState(dailyTasksNavigationBarUiModel=" + this.f40320a + ", dailyTasksCollectionsUiModel=" + this.b + Separators.RPAREN;
    }
}
