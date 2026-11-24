package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ta9 implements va9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f33603a;
    public final mdm b;

    public ta9(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f33603a = immVar;
        this.b = mdmVar;
    }

    @Override // a.va9
    public final imm a() {
        return this.f33603a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta9)) {
            return false;
        }
        ta9 ta9Var = (ta9) obj;
        return Intrinsics.d(this.f33603a, ta9Var.f33603a) && Intrinsics.d(this.b, ta9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33603a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(toolBarUiModel=" + this.f33603a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
