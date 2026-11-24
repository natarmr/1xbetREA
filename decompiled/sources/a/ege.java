package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ege implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f7760a;

    public ege(ha8 ha8Var) {
        this.f7760a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f7760a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ege) && this.f7760a.equals(((ege) obj).f7760a);
    }

    public final int hashCode() {
        return this.f7760a.hashCode();
    }

    public final String toString() {
        return "RegistrationBonusBanner(blockState=" + this.f7760a + Separators.RPAREN;
    }
}
