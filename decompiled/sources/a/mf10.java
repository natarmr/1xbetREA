package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mf10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f21676a;
    public final se10 b;
    public final boolean c;

    public mf10(imm immVar, se10 se10Var, boolean z) {
        immVar.getClass();
        se10Var.getClass();
        this.f21676a = immVar;
        this.b = se10Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf10)) {
            return false;
        }
        mf10 mf10Var = (mf10) obj;
        return Intrinsics.d(this.f21676a, mf10Var.f21676a) && Intrinsics.d(this.b, mf10Var.b) && this.c == mf10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f21676a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyProgramAlternativeUiState(navBarModel=");
        sb.append(this.f21676a);
        sb.append(", contentModel=");
        sb.append(this.b);
        sb.append(", operationProgress=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
