package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x6e0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40361a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ j2m0 d;

    public /* synthetic */ x6e0(l7m0 l7m0Var, Function1 function1, j2m0 j2m0Var, byte b) {
        this.f40361a = b;
        this.b = l7m0Var;
        this.c = function1;
        this.d = j2m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f40361a;
        j2m0 j2m0Var = this.d;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d3m0 d3m0Var = (d3m0) l7m0Var.getValue();
                    if (d3m0Var != null) {
                        if (d3m0Var instanceof b3m0) {
                            fetVar.e0(1669877901);
                            b34.A(0, fetVar);
                            fetVar.r(false);
                        } else if (d3m0Var instanceof a3m0) {
                            fetVar.e0(1669879969);
                            b34.s(((a3m0) d3m0Var).d, function1, fetVar, 0);
                            fetVar.r(false);
                        } else if (d3m0Var instanceof c3m0) {
                            fetVar.e0(1669885761);
                            b34.G(j2m0Var, (c3m0) d3m0Var, function1, fetVar, 8);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(1669875731, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            default:
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d3m0 d3m0Var2 = (d3m0) l7m0Var.getValue();
                    if (d3m0Var2 != null) {
                        if (d3m0Var2 instanceof b3m0) {
                            fetVar.e0(228192727);
                            wha0.x(0, fetVar);
                            fetVar.r(false);
                        } else if (d3m0Var2 instanceof a3m0) {
                            fetVar.e0(228194860);
                            wha0.q(ir8Var.b(jm40.b, gqw0.e), ((a3m0) d3m0Var2).d, function1, fetVar, 0);
                            fetVar.r(false);
                        } else if (d3m0Var2 instanceof c3m0) {
                            fetVar.e0(228202666);
                            wha0.C(j2m0Var, (c3m0) d3m0Var2, function1, fetVar, 8);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(228190621, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
        }
    }
}
