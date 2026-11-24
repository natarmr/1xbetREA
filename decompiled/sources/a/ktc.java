package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ktc implements ltc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ymx f18857a;
    public final mtc b;

    public ktc(ymx ymxVar, int i) {
        ymxVar = (i & 1) != 0 ? ymx.INTERVAL_200 : ymxVar;
        mtc mtcVar = new mtc();
        this.f18857a = ymxVar;
        this.b = mtcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ktc) {
            ktc ktcVar = (ktc) obj;
            return this.f18857a == ktcVar.f18857a && this.b == ktcVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18857a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalBlock(blockTimeout=" + this.f18857a + ", clickTimeHolder=" + this.b + Separators.RPAREN;
    }
}
