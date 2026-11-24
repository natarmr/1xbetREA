package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c1s0 implements d1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t8s0 f3590a;

    public c1s0(t8s0 t8s0Var) {
        this.f3590a = t8s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1s0) && this.f3590a.equals(((c1s0) obj).f3590a);
    }

    public final int hashCode() {
        return this.f3590a.hashCode();
    }

    public final String toString() {
        return "ValorantModel(statistic=" + this.f3590a + Separators.RPAREN;
    }
}
