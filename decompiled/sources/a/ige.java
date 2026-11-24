package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ige implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f14731a;

    public ige(ha8 ha8Var) {
        this.f14731a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f14731a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ige) && this.f14731a.equals(((ige) obj).f14731a);
    }

    public final int hashCode() {
        return this.f14731a.hashCode();
    }

    public final String toString() {
        return "VirtualCarousels(blockState=" + this.f14731a + Separators.RPAREN;
    }
}
