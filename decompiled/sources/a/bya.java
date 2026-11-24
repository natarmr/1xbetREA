package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f3407a;
    public final imm b;

    public bya(imm immVar, imm immVar2) {
        this.f3407a = immVar;
        this.b = immVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bya)) {
            return false;
        }
        bya byaVar = (bya) obj;
        return this.f3407a.equals(byaVar.f3407a) && this.b.equals(byaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3407a.hashCode() * 31);
    }

    public final String toString() {
        return "CashbackChoosingNavigationBarUiState(model=" + this.f3407a + ", searchModel=" + this.b + Separators.RPAREN;
    }
}
