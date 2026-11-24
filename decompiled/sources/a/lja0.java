package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lja0;", "La/iw5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lja0 extends iw5 {
    public fiu0 k2;
    public final kiu0 l2;
    public final phf0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(lja0.class, "teamId", "getTeamId()Ljava/lang/String;", 0)};
    public static final jh70 n2 = new jh70();

    public lja0() {
        l3a0 l3a0Var = new l3a0(this, (byte) 22);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 21), (byte) 22));
        this.l2 = agc.G(this, sre0.f32672a.b(qja0.class), new a190(a8zVarA, (byte) 20), new a190(a8zVarA, (byte) 21), l3a0Var);
        this.m2 = new phf0("TEAM_ID_KEY");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(159913411);
        qja0 qja0Var = (qja0) this.l2.getValue();
        int i = qja0.r;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), x4d0.d, (ugd) null, u1c.M(369350386, new in80(qja0Var.y(fetVar), this, (byte) 3), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(String str, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        y9q0 y9q0VarT;
        boolean z3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1657387595);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.h(z2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.d(jm40Var, 1.0f), null, null, false, null, function0, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            if (z2) {
                fetVar2.e0(-323734335);
                y9q0VarT = ibm0.l(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
                z3 = false;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-323646915);
                y9q0VarT = ibm0.t(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
                z3 = false;
                fetVar2.r(false);
            }
            y9q0 y9q0Var = y9q0VarT;
            boolean z5 = z3;
            v8q0.a(str, mm40VarB, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i2 & 14, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(376190571);
                mbc.o(agi0.f827a, null, false, fetVar2, 6, 6);
            } else {
                fetVar2.e0(-1222942291);
            }
            fetVar2.r(z5);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5((Object) this, (Object) str, z, z2, (wdr) function0, i, (byte) 5);
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fma0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fma0 fma0Var = (fma0) (ze3Var instanceof fma0 ? ze3Var : null);
            if (fma0Var != null) {
                this.k2 = fma0Var.a(0L, a4n0.f(this), "", this.m2.n(this, o2[0])).i();
                return;
            }
        }
        jf4.n(b1j.i(fma0.class, "Cannot create dependency "));
    }
}
