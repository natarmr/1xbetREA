package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zct0 implements bdt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy30 f44181a;

    public zct0(gy30 gy30Var) {
        this.f44181a = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zct0) && this.f44181a.equals(((zct0) obj).f44181a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STAGE_NET";
    }

    public final int hashCode() {
        return this.f44181a.hashCode() + 1634241252;
    }

    public final String toString() {
        return "Content(key=STAGE_NET, model=" + this.f44181a + Separators.RPAREN;
    }
}
