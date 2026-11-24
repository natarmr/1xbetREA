package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ots0 implements pts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25845a;
    public final mdm b;

    public ots0(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f25845a = immVar;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ots0)) {
            return false;
        }
        ots0 ots0Var = (ots0) obj;
        return Intrinsics.d(this.f25845a, ots0Var.f25845a) && Intrinsics.d(this.b, ots0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25845a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBar=" + this.f25845a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
