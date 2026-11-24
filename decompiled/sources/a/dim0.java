package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dim0 implements eim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6148a;
    public final k3i b;
    public final jlm0 c;
    public final pim0 d;

    public dim0(long j, k3i k3iVar, jlm0 jlm0Var, pim0 pim0Var) {
        pim0Var.getClass();
        this.f6148a = j;
        this.b = k3iVar;
        this.c = jlm0Var;
        this.d = pim0Var;
    }

    @Override // a.eim0
    public final long a() {
        return this.f6148a;
    }

    @Override // a.eim0
    public final klm0 b() {
        return this.c;
    }

    @Override // a.eim0
    public final cnm0 d() {
        return new bnm0(this.b);
    }

    @Override // a.eim0
    public final pim0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dim0)) {
            return false;
        }
        dim0 dim0Var = (dim0) obj;
        return this.f6148a == dim0Var.f6148a && this.b.equals(dim0Var.b) && this.c.equals(dim0Var.c) && Intrinsics.d(this.d, dim0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f6148a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6148a, "SmallCardNoTeamLogo(gameId=", ", topBlock=", "SmallCardNoTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", background=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
