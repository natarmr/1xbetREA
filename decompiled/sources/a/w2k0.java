package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w2k0 implements x2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38453a;
    public final long b;
    public final long c;
    public final y9q0 d;
    public final int e;

    public w2k0() {
        pz40 pz40Var = s6t0.f31722a;
        long primary = s6t0.b().f33626a.getPrimary();
        long secondaryButtonBackground = s6t0.b().f33626a.getSecondaryButtonBackground();
        y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), s6t0.b().f33626a.getPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
        this.f38453a = R.drawable.ic_glyph_minus_small;
        this.b = primary;
        this.c = secondaryButtonBackground;
        this.d = y9q0VarA;
        this.e = R.string.pay_out_title;
    }

    @Override // a.x2k0
    public final int a() {
        return this.f38453a;
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
        if (!(obj instanceof w2k0)) {
            return false;
        }
        w2k0 w2k0Var = (w2k0) obj;
        if (this.f38453a != w2k0Var.f38453a) {
            return false;
        }
        long j = w2k0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, w2k0Var.c) && Intrinsics.d(this.d, w2k0Var.d) && this.e == w2k0Var.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f38453a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Integer.hashCode(this.e) + brm0.g(this.d, rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        StringBuilder sbR = vqd.r(this.f38453a, "WithdrawalTransactionButtonType(iconRes=", ", iconBackgroundColor=", strI, ", backgroundColor=");
        sbR.append(strI2);
        sbR.append(", textStyle=");
        sbR.append(this.d);
        sbR.append(", transactionButtonTextRes=");
        return rz4.j(this.e, Separators.RPAREN, sbR);
    }
}
