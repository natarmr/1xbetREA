package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e3e0 implements h3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7v0 f7130a;

    public e3e0(f7v0 f7v0Var) {
        this.f7130a = f7v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3e0) && this.f7130a == ((e3e0) obj).f7130a;
    }

    public final int hashCode() {
        return this.f7130a.hashCode();
    }

    public final String toString() {
        return "OnCardClick(weightClass=" + this.f7130a + Separators.RPAREN;
    }
}
