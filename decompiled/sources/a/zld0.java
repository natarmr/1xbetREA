package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zld0 implements amd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dao f44576a;
    public final m9s b;
    public final ms2 c;

    static {
        int i = dao.t;
    }

    public zld0(dao daoVar, m9s m9sVar, ms2 ms2Var) {
        m9sVar.getClass();
        ms2Var.getClass();
        this.f44576a = daoVar;
        this.b = m9sVar;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zld0)) {
            return false;
        }
        zld0 zld0Var = (zld0) obj;
        return this.f44576a.equals(zld0Var.f44576a) && Intrinsics.d(this.b, zld0Var.b) && Intrinsics.d(this.c, zld0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44576a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnShowMakeBetDialog(eventBet=" + this.f44576a + ", gameDetails=" + this.b + ", entryPoint=" + this.c + Separators.RPAREN;
    }
}
