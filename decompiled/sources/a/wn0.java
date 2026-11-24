package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wn0 implements xn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f39425a;
    public final imm b;
    public final wdp c;

    public wn0(mdm mdmVar, imm immVar, wdp wdpVar) {
        immVar.getClass();
        this.f39425a = mdmVar;
        this.b = immVar;
        this.c = wdpVar;
    }

    @Override // a.xn0
    public final imm a() {
        return this.b;
    }

    @Override // a.xn0
    public final wdp b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        return this.f39425a.equals(wn0Var.f39425a) && Intrinsics.d(this.b, wn0Var.b) && Intrinsics.d(this.c, wn0Var.c);
    }

    public final int hashCode() {
        int iA = h97.a(this.b, this.f39425a.hashCode() * 31, 31);
        wdp wdpVar = this.c;
        return iA + (wdpVar == null ? 0 : wdpVar.hashCode());
    }

    public final String toString() {
        return "Error(config=" + this.f39425a + ", navigationBarUiModel=" + this.b + ", accountSelectionUiState=" + this.c + Separators.RPAREN;
    }
}
