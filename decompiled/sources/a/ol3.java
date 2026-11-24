package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ol3 implements ql3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml3 f25434a;

    public ol3(ml3 ml3Var) {
        this.f25434a = ml3Var;
    }

    @Override // a.ql3
    public final ml3 a() {
        return this.f25434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol3) && this.f25434a.equals(((ol3) obj).f25434a);
    }

    public final int hashCode() {
        return this.f25434a.hashCode();
    }

    public final String toString() {
        return "FloatingButtonsAndTitleStyle(barStyle=" + this.f25434a + Separators.RPAREN;
    }
}
