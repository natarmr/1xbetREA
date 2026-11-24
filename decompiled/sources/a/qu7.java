package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qu7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29334a;
    public final int b;
    public final qwh0 c;
    public final le40 d;
    public final tn8 e;

    public qu7(imm immVar, int i, qwh0 qwh0Var, le40 le40Var, tn8 tn8Var) {
        immVar.getClass();
        qwh0Var.getClass();
        le40Var.getClass();
        this.f29334a = immVar;
        this.b = i;
        this.c = qwh0Var;
        this.d = le40Var;
        this.e = tn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu7)) {
            return false;
        }
        qu7 qu7Var = (qu7) obj;
        return Intrinsics.d(this.f29334a, qu7Var.f29334a) && this.b == qu7Var.b && Intrinsics.d(this.c, qu7Var.c) && Intrinsics.d(this.d, qu7Var.d) && Intrinsics.d(this.e, qu7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, this.f29334a.hashCode() * 31, 31)) * 31)) * 31;
        tn8 tn8Var = this.e;
        return iHashCode + (tn8Var == null ? 0 : tn8Var.hashCode());
    }

    public final String toString() {
        return "BetsOnPlayersUiState(navigationBarUiModel=" + this.f29334a + ", backgroundResId=" + this.b + ", segmentSectionUiState=" + this.c + ", middleContentUiState=" + this.d + ", bottomContentUiState=" + this.e + Separators.RPAREN;
    }
}
