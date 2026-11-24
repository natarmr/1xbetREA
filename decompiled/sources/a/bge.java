package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f2550a;

    public bge(ha8 ha8Var) {
        this.f2550a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f2550a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bge) && this.f2550a.equals(((bge) obj).f2550a);
    }

    public final int hashCode() {
        return this.f2550a.hashCode();
    }

    public final String toString() {
        return "JackpotWidget(blockState=" + this.f2550a + Separators.RPAREN;
    }
}
