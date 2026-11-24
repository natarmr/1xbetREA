package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ua9 implements va9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f35317a;
    public final mdm b;

    public ua9(mdm mdmVar, imm immVar) {
        immVar.getClass();
        mdmVar.getClass();
        this.f35317a = immVar;
        this.b = mdmVar;
    }

    @Override // a.va9
    public final imm a() {
        return this.f35317a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua9)) {
            return false;
        }
        ua9 ua9Var = (ua9) obj;
        return Intrinsics.d(this.f35317a, ua9Var.f35317a) && Intrinsics.d(this.b, ua9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35317a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(toolBarUiModel=" + this.f35317a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
