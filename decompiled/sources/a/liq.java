package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class liq implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20117a;
    public final a4x b;
    public final kiq c;
    public final kiq d;
    public final wev e;

    public liq(String str, i4 i4Var, kiq kiqVar, kiq kiqVar2, wev wevVar) {
        i4Var.getClass();
        this.f20117a = str;
        this.b = i4Var;
        this.c = kiqVar;
        this.d = kiqVar2;
        this.e = wevVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liq)) {
            return false;
        }
        liq liqVar = (liq) obj;
        return this.f20117a.equals(liqVar.f20117a) && Intrinsics.d(this.b, liqVar.b) && this.c.equals(liqVar.c) && this.d.equals(liqVar.d) && this.e == liqVar.e;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f20117a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cs0.b(this.b, this.f20117a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("FixedGraphUiModel(key=", this.f20117a, ", values=", this.b, ", topTeam=");
        sbU.append(this.c);
        sbU.append(", bottomTeam=");
        sbU.append(this.d);
        sbU.append(", graphType=");
        sbU.append(this.e);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
