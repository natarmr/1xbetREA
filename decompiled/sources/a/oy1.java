package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26039a;
    public final cy1 b;

    public oy1(String str, cy1 cy1Var) {
        str.getClass();
        this.f26039a = str;
        this.b = cy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy1)) {
            return false;
        }
        oy1 oy1Var = (oy1) obj;
        return Intrinsics.d(this.f26039a, oy1Var.f26039a) && this.b == oy1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26039a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournamentsCardsNativeTopButtonUiModel(label=" + this.f26039a + ", state=" + this.b + Separators.RPAREN;
    }
}
