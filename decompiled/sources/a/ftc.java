package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ftc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10104a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ftc(Function0 function0, byte b) {
        this.f10104a = b;
        this.b = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        gy40 gy40Var;
        byte b = this.f10104a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar.e0(-756081143);
                d6x d6xVar = (d6x) fetVar.k(a6x.f338a);
                if (d6xVar != null) {
                    fetVar.e0(-1604682242);
                    fetVar.r(false);
                    gy40Var = null;
                } else {
                    fetVar.e0(-1604549624);
                    Object objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = dw9.j(fetVar);
                    }
                    gy40Var = (gy40) objP;
                    fetVar.r(false);
                }
                mm40 mm40VarV = y860.V(jm40.b, gy40Var, d6xVar, true, null, this.b);
                fetVar.r(false);
                return mm40VarV;
            case 1:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                int iB = si30.b(((Number) function0.invoke()).floatValue() * pu90VarS.b);
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b - iB, new n7(pu90VarS, iB, (byte) 9));
            case 2:
                mz3 mz3Var = (mz3) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mz3Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(mz3Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40.b, 114.0f);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    j0x.b(mz3Var, "", y860.W(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), null, null, false, null, this.b, 28), null, null, 0.0f, null, fetVar2, (iIntValue & 14) | 48, 120);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var2.getClass();
                pj30Var2.getClass();
                int iMax = Math.max(p4e.h(p4eVar.f26347a), ((Number) function0.invoke()).intValue());
                pu90 pu90VarS2 = pj30Var2.S(p4e.b(p4eVar.f26347a, 0, 0, iMax, iMax, 3));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, p4e.h(p4eVar.f26347a), new cam(pu90VarS2, (byte) 6));
        }
    }
}
