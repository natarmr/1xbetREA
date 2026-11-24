package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y2p implements b3p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f41916a;
    public final imm b;

    public y2p(mdm mdmVar, imm immVar) {
        this.f41916a = mdmVar;
        this.b = immVar;
    }

    @Override // a.b3p
    public final imm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2p)) {
            return false;
        }
        y2p y2pVar = (y2p) obj;
        return this.f41916a.equals(y2pVar.f41916a) && this.b.equals(y2pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41916a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(config=" + this.f41916a + ", dsNavigationBarUiModel=" + this.b + Separators.RPAREN;
    }
}
