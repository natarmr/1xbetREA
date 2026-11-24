package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f24689a;
    public final a4x b;

    public o5j(imm immVar, i4 i4Var) {
        immVar.getClass();
        i4Var.getClass();
        this.f24689a = immVar;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5j)) {
            return false;
        }
        o5j o5jVar = (o5j) obj;
        return Intrinsics.d(this.f24689a, o5jVar.f24689a) && Intrinsics.d(this.b, o5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24689a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTasksRulesUiState(navigationBarUiModel=" + this.f24689a + ", rulesParagraphs=" + this.b + Separators.RPAREN;
    }
}
