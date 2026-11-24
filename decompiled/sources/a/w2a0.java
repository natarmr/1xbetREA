package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w2a0 implements x2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f38438a;
    public final mdm b;

    public w2a0(mdm mdmVar, imm immVar) {
        mdmVar.getClass();
        this.f38438a = immVar;
        this.b = mdmVar;
    }

    @Override // a.x2a0
    public final imm a() {
        return this.f38438a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2a0)) {
            return false;
        }
        w2a0 w2a0Var = (w2a0) obj;
        return this.f38438a.equals(w2a0Var.f38438a) && Intrinsics.d(this.b, w2a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38438a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(toolBar=" + this.f38438a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
