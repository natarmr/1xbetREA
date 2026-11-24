package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mw1 implements nw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1 f22481a;

    public mw1(vw1 vw1Var) {
        this.f22481a = vw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw1) && this.f22481a.equals(((mw1) obj).f22481a);
    }

    public final int hashCode() {
        return this.f22481a.hashCode();
    }

    public final String toString() {
        return "Tournament(uiModel=" + this.f22481a + Separators.RPAREN;
    }
}
