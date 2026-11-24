package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cve implements ive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dao f5026a;
    public final m9s b;
    public final ms2 c;
    public final ctc d;

    static {
        int i = dao.t;
    }

    public cve(dao daoVar, m9s m9sVar, ms2 ms2Var, ctc ctcVar) {
        m9sVar.getClass();
        ms2Var.getClass();
        this.f5026a = daoVar;
        this.b = m9sVar;
        this.c = ms2Var;
        this.d = ctcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cve)) {
            return false;
        }
        cve cveVar = (cve) obj;
        return this.f5026a.equals(cveVar.f5026a) && Intrinsics.d(this.b, cveVar.b) && Intrinsics.d(this.c, cveVar.c) && this.d == cveVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5026a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnAddToCoupon(eventBet=" + this.f5026a + ", gameDetails=" + this.b + ", entryPoint=" + this.c + ", clickType=" + this.d + Separators.RPAREN;
    }
}
