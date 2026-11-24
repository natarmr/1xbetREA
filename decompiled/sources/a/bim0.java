package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bim0 implements eim0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2666a;
    public final m3i b;
    public final vkm0 c;
    public final pim0 d;

    public bim0(long j, m3i m3iVar, vkm0 vkm0Var, pim0 pim0Var) {
        pim0Var.getClass();
        this.f2666a = j;
        this.b = m3iVar;
        this.c = vkm0Var;
        this.d = pim0Var;
    }

    @Override // a.eim0
    public final long a() {
        return this.f2666a;
    }

    @Override // a.eim0
    public final klm0 b() {
        return this.c;
    }

    @Override // a.eim0
    public final cnm0 d() {
        return new zmm0(this.b);
    }

    @Override // a.eim0
    public final pim0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bim0)) {
            return false;
        }
        bim0 bim0Var = (bim0) obj;
        return this.f2666a == bim0Var.f2666a && this.b.equals(bim0Var.b) && this.c.equals(bim0Var.c) && Intrinsics.d(this.d, bim0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f2666a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f2666a, "LargeCardWatermark(gameId=", ", topBlock=", "LargeCardWatermark(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", background=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
