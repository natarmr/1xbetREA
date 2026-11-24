package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class vgv implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f37400a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;

    public vgv(a4x a4xVar, pz40 pz40Var, float f, Function1 function1) {
        this.f37400a = a4xVar;
        this.b = pz40Var;
        this.c = f;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        mm40 mm40VarU;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        int i = (iIntValue2 & 6) == 0 ? (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            ecv0 ecv0Var = (ecv0) this.f37400a.get(iIntValue);
            fetVar.e0(2010006271);
            int size = ((kcv0) this.b.getValue()).f18080a.size();
            jm40 jm40Var = jm40.b;
            if (size == 1) {
                mm40VarU = g9zVar.d(1.0f);
            } else {
                mm40 mm40VarS = o7k0.s(jm40Var, this.c * 0.9f);
                zcl zclVar = qmk.f28987a;
                mm40VarU = o7k0.u(mm40VarS, 0.0f, 400.0f, 1);
            }
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarU, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (ecv0Var.b == null) {
                fetVar.e0(-230672439);
                fetVar.r(false);
            } else {
                fetVar.e0(-230672438);
                nkb.h(s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 8.0f, 12.0f, 0.0f, 8), ecv0Var.b, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fetVar.r(false);
            }
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 60.0f);
            fetVar.e0(-1669991504);
            for (wbv0 wbv0Var : ecv0Var.c) {
                fetVar.b0(746046055, wbv0Var.f38899a);
                pz40 pz40VarF = androidx.compose.runtime.e.f(wbv0Var, fetVar);
                boolean zG = fetVar.g(wbv0Var);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new w0(wbv0Var, (byte) 22);
                    fetVar.o0(objP);
                }
                jtm0.i(mm40VarE.e(rq8.K(jm40Var, (Function1) objP)), pz40VarF, this.d, fetVar, 0);
                fetVar.r(false);
            }
            ohs0.x(fetVar, false, true, false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
