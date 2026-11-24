package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f9487a;

    public fge(ha8 ha8Var) {
        this.f9487a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f9487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fge) && this.f9487a.equals(((fge) obj).f9487a);
    }

    public final int hashCode() {
        return this.f9487a.hashCode();
    }

    public final String toString() {
        return "SlotMachine(blockState=" + this.f9487a + Separators.RPAREN;
    }
}
