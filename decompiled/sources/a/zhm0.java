package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zhm0 implements eim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44401a;
    public final k3i b;
    public final hkm0 c;
    public final pim0 d;

    public zhm0(long j, k3i k3iVar, hkm0 hkm0Var, pim0 pim0Var) {
        pim0Var.getClass();
        this.f44401a = j;
        this.b = k3iVar;
        this.c = hkm0Var;
        this.d = pim0Var;
    }

    @Override // a.eim0
    public final long a() {
        return this.f44401a;
    }

    @Override // a.eim0
    public final klm0 b() {
        return this.c;
    }

    @Override // a.eim0
    public final cnm0 d() {
        return new xmm0(this.b);
    }

    @Override // a.eim0
    public final pim0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhm0)) {
            return false;
        }
        zhm0 zhm0Var = (zhm0) obj;
        return this.f44401a == zhm0Var.f44401a && this.b.equals(zhm0Var.b) && this.c.equals(zhm0Var.c) && Intrinsics.d(this.d, zhm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f44401a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f44401a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", background=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
