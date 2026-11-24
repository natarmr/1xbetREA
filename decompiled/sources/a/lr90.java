package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lr90 implements tr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir90 f20519a;

    public lr90(ir90 ir90Var) {
        this.f20519a = ir90Var;
    }

    @Override // a.tr90
    public final ir90 a() {
        return this.f20519a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr90) && this.f20519a.equals(((lr90) obj).f20519a);
    }

    public final int hashCode() {
        return this.f20519a.hashCode();
    }

    public final String toString() {
        return "Empty(uiModel=" + this.f20519a + Separators.RPAREN;
    }
}
