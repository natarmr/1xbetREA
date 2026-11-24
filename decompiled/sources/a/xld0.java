package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xld0 implements amd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dao f41067a;
    public final m9s b;
    public final ms2 c;
    public final boolean d;

    static {
        int i = dao.t;
    }

    public xld0(dao daoVar, m9s m9sVar, ms2 ms2Var, boolean z) {
        daoVar.getClass();
        m9sVar.getClass();
        ms2Var.getClass();
        this.f41067a = daoVar;
        this.b = m9sVar;
        this.c = ms2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xld0)) {
            return false;
        }
        xld0 xld0Var = (xld0) obj;
        return Intrinsics.d(this.f41067a, xld0Var.f41067a) && Intrinsics.d(this.b, xld0Var.b) && Intrinsics.d(this.c, xld0Var.c) && this.d == xld0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f41067a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnMakeQuickBet(eventBet=" + this.f41067a + ", gameDetails=" + this.b + ", entryPoint=" + this.c + ", betExists=" + this.d + Separators.RPAREN;
    }
}
