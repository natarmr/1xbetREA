package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yta implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f43208a;
    public final /* synthetic */ omv b;
    public final /* synthetic */ float c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ pz40 g;

    public yta(a4x a4xVar, omv omvVar, float f, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4) {
        this.f43208a = a4xVar;
        this.b = omvVar;
        this.c = f;
        this.d = pz40Var;
        this.e = pz40Var2;
        this.f = pz40Var3;
        this.g = pz40Var4;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40VarB;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            eja ejaVar = (eja) this.f43208a.get(iIntValue);
            fetVar.e0(980513819);
            dja djaVar = ejaVar.f7899a;
            dja djaVar2 = (dja) this.e.getValue();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (djaVar == djaVar2) {
                fetVar.e0(980561961);
                mm40 mm40VarH = k7n0.H(jm40Var, 1.0f);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new wta(this.f, (byte) 0);
                    fetVar.o0(objP);
                }
                mm40VarB = ffb0.P(mm40VarH, (Function1) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(980798088);
                fetVar.r(false);
                mm40VarB = g9z.b(g9zVar, jm40Var, null, 7);
            }
            rqm rqmVar = ejaVar.b;
            wui0 wui0Var = wui0.c;
            vui0 vui0Var = rqmVar.f30938a;
            pui0 pui0Var = rqmVar.b;
            pvi0 pvi0Var = rqmVar.c;
            float f = rqmVar.d;
            d4d d4dVar = rqmVar.e;
            tvi0 tvi0Var = rqmVar.f;
            boolean z = rqmVar.h;
            t89 t89Var = rqmVar.i;
            vui0Var.getClass();
            d4dVar.getClass();
            tvi0Var.getClass();
            rqm rqmVar2 = new rqm(vui0Var, pui0Var, pvi0Var, f, d4dVar, tvi0Var, wui0Var, z, t89Var);
            boolean z2 = iIntValue != q3d.i((a4x) this.g.getValue());
            boolean zG = fetVar.g(ejaVar) | fetVar.i(this.b) | fetVar.d(this.c);
            pz40 pz40Var = this.d;
            boolean zG2 = zG | fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                xta xtaVar = new xta(ejaVar, this.b, this.c, this.e, this.f, this.g, pz40Var);
                fetVar.o0(xtaVar);
                objP2 = xtaVar;
            }
            obc.q(mm40VarB, rqmVar2, z2, null, null, null, null, (Function1) objP2, fetVar, 0, 120);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
