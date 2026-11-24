package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f23184a;
    public final fdc0 b;
    public final boolean c;

    public nac0(imm immVar, fdc0 fdc0Var, boolean z) {
        fdc0Var.getClass();
        this.f23184a = immVar;
        this.b = fdc0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nac0)) {
            return false;
        }
        nac0 nac0Var = (nac0) obj;
        return this.f23184a.equals(nac0Var.f23184a) && Intrinsics.d(this.b, nac0Var.b) && this.c == nac0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f23184a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCheckUiState(navigationBarUiModel=");
        sb.append(this.f23184a);
        sb.append(", contentState=");
        sb.append(this.b);
        sb.append(", wasKeyboardOpen=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
