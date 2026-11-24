package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zrd0 implements csd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44848a;
    public final a4x b;
    public final qrd0 c;

    public zrd0(mdm mdmVar, a4x a4xVar, qrd0 qrd0Var) {
        a4xVar.getClass();
        this.f44848a = mdmVar;
        this.b = a4xVar;
        this.c = qrd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrd0)) {
            return false;
        }
        zrd0 zrd0Var = (zrd0) obj;
        return this.f44848a.equals(zrd0Var.f44848a) && Intrinsics.d(this.b, zrd0Var.b) && Intrinsics.d(this.c, zrd0Var.c);
    }

    public final int hashCode() {
        int iB = cs0.b(this.b, this.f44848a.hashCode() * 31, 31);
        qrd0 qrd0Var = this.c;
        return iB + (qrd0Var == null ? 0 : qrd0Var.hashCode());
    }

    public final String toString() {
        return "Content(dsEmptyPeriodConfig=" + this.f44848a + ", chipsList=" + this.b + ", raceResult=" + this.c + Separators.RPAREN;
    }
}
