package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v2k0 implements x2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36688a;
    public final long b;
    public final long c;
    public final y9q0 d;
    public final int e;

    public v2k0() {
        pz40 pz40Var = s6t0.f31722a;
        long commerce = s6t0.b().f33626a.getCommerce();
        long commerceTint = s6t0.b().f33626a.getCommerceTint();
        y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), s6t0.b().f33626a.getCommerce(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
        this.f36688a = R.drawable.ic_glyph_replenish;
        this.b = commerce;
        this.c = commerceTint;
        this.d = y9q0VarA;
        this.e = R.string.top_up;
    }

    @Override // a.x2k0
    public final int a() {
        return this.f36688a;
    }

    @Override // a.x2k0
    public final y9q0 b() {
        return this.d;
    }

    @Override // a.x2k0
    public final long c() {
        return this.c;
    }

    @Override // a.x2k0
    public final long d() {
        return this.b;
    }

    @Override // a.x2k0
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2k0)) {
            return false;
        }
        v2k0 v2k0Var = (v2k0) obj;
        if (this.f36688a != v2k0Var.f36688a) {
            return false;
        }
        long j = v2k0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, v2k0Var.c) && Intrinsics.d(this.d, v2k0Var.d) && this.e == v2k0Var.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36688a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Integer.hashCode(this.e) + brm0.g(this.d, rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        StringBuilder sbR = vqd.r(this.f36688a, "TopUpTransactionButtonType(iconRes=", ", iconBackgroundColor=", strI, ", backgroundColor=");
        sbR.append(strI2);
        sbR.append(", textStyle=");
        sbR.append(this.d);
        sbR.append(", transactionButtonTextRes=");
        return rz4.j(this.e, Separators.RPAREN, sbR);
    }
}
