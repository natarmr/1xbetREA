package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/kia0;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kia0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final kiu0 l2;

    public kia0() {
        l3a0 l3a0Var = new l3a0(this, (byte) 17);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 17), (byte) 18));
        this.l2 = agc.G(this, sre0.f32672a.b(pia0.class), new a190(a8zVarA, (byte) 16), new a190(a8zVarA, (byte) 17), l3a0Var);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-535570284);
        pia0 pia0Var = (pia0) this.l2.getValue();
        int i = pia0.q;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), ffb0.c, (ugd) null, u1c.M(2030345603, new in80(pia0Var.y(fetVar), this, (byte) 2), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(int i, fet fetVar, String str, Function0 function0, boolean z) {
        y9q0 y9q0VarT;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1264427272);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.d(jm40Var, 1.0f), null, null, false, null, function0, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40Var, 58.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.d);
            if (z) {
                fetVar2.e0(966406132);
                y9q0VarT = ibm0.l(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(966493552);
                y9q0VarT = ibm0.t(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
                fetVar2.r(false);
            }
            v8q0.a(str, mm40VarB, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarT, fetVar2, i2 & 14, 24960, 110588);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 28, i, (Object) this, (Object) str, (Object) function0, z);
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wka0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wka0 wka0Var = (wka0) (ze3Var instanceof wka0 ? ze3Var : null);
            if (wka0Var != null) {
                this.k2 = wka0Var.a(a4n0.f(this), "", 0L).i();
                return;
            }
        }
        jf4.n(b1j.i(wka0.class, "Cannot create dependency "));
    }
}
