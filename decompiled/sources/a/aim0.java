package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aim0 implements eim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f930a;
    public final m3i b;
    public final okm0 c;
    public final pim0 d;

    public aim0(long j, m3i m3iVar, okm0 okm0Var, pim0 pim0Var) {
        pim0Var.getClass();
        this.f930a = j;
        this.b = m3iVar;
        this.c = okm0Var;
        this.d = pim0Var;
    }

    @Override // a.eim0
    public final long a() {
        return this.f930a;
    }

    @Override // a.eim0
    public final klm0 b() {
        return this.c;
    }

    @Override // a.eim0
    public final cnm0 d() {
        return new ymm0(this.b);
    }

    @Override // a.eim0
    public final pim0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aim0)) {
            return false;
        }
        aim0 aim0Var = (aim0) obj;
        return this.f930a == aim0Var.f930a && this.b.equals(aim0Var.b) && this.c.equals(aim0Var.c) && Intrinsics.d(this.d, aim0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f930a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f930a, "LargeCardLargeTeamLogo(gameId=", ", topBlock=", "LargeCardLargeTeamLogo(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", background=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
