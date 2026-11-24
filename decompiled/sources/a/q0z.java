package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q0z;", "La/iw5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q0z extends iw5 {
    public final phf0 k2 = new phf0("EXTRA_REQUEST_KEY");
    public final yzn0 l2 = new yzn0("SELECTED_FILTER_KEY");
    public final es m2 = new es("FILTER_LIST_KEY");
    public static final /* synthetic */ iiy[] o2 = {new ez40(q0z.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(q0z.class, "selectedFilter", "getSelectedFilter()Lorg/xplatform/statistic/lastgames/domain/model/FilterModel;", 0), new ez40(q0z.class, "filterModelList", "getFilterModelList()Ljava/util/List;", 0)};
    public static final art n2 = new art();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1679770571);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), f1t0.c, (ugd) null, u1c.M(694678820, new p0z((Object) this, (byte) 0), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(String str, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        int i2;
        y9q0 y9q0VarT;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1656085827);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.d(jm40Var, 1.0f), null, null, false, null, function0, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
                fetVar2.e0(726261608);
                y9q0VarT = ibm0.l(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
            } else {
                fetVar2.e0(726262892);
                y9q0VarT = ibm0.t(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2);
            }
            fetVar2.r(false);
            v8q0.a(str, mm40VarB, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarT, fetVar, i2 & 14, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(2001221853);
                mbc.o(agi0.f827a, null, false, fetVar2, 6, 6);
            } else {
                fetVar2.e0(1908387195);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(this, str, z, z2, function0, i);
        }
    }
}
