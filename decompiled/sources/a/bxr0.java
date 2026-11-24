package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bxr0 implements cxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dxr0 f3388a;

    public bxr0(dxr0 dxr0Var) {
        this.f3388a = dxr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxr0) && this.f3388a.equals(((bxr0) obj).f3388a);
    }

    public final int hashCode() {
        return this.f3388a.hashCode();
    }

    public final String toString() {
        return "Team(team=" + this.f3388a + Separators.RPAREN;
    }
}
