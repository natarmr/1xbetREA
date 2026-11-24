package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iu80 implements ku80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f15385a;

    public iu80(lq5 lq5Var) {
        this.f15385a = lq5Var;
    }

    @Override // a.ku80
    public final lq5 a() {
        return this.f15385a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu80) && this.f15385a.equals(((iu80) obj).f15385a);
    }

    public final int hashCode() {
        return this.f15385a.hashCode();
    }

    public final String toString() {
        return "Error(style=" + this.f15385a + Separators.RPAREN;
    }
}
