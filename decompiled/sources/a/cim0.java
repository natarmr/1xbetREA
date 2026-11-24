package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cim0 implements eim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4424a;
    public final l3i b;
    public final clm0 c;
    public final pim0 d;

    public cim0(long j, l3i l3iVar, clm0 clm0Var, pim0 pim0Var) {
        pim0Var.getClass();
        this.f4424a = j;
        this.b = l3iVar;
        this.c = clm0Var;
        this.d = pim0Var;
    }

    @Override // a.eim0
    public final long a() {
        return this.f4424a;
    }

    @Override // a.eim0
    public final klm0 b() {
        return this.c;
    }

    @Override // a.eim0
    public final cnm0 d() {
        return new anm0(this.b);
    }

    @Override // a.eim0
    public final pim0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cim0)) {
            return false;
        }
        cim0 cim0Var = (cim0) obj;
        return this.f4424a == cim0Var.f4424a && this.b.equals(cim0Var.b) && this.c.equals(cim0Var.c) && Intrinsics.d(this.d, cim0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f4424a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4424a, "MediumCardSmallTeamLogo(gameId=", ", topBlock=", "MediumCardSmallTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", background=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
