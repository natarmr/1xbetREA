package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e13 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7018a;
    public final /* synthetic */ rmb0 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ e13(rmb0 rmb0Var, pz40 pz40Var, byte b) {
        this.f7018a = b;
        this.b = rmb0Var;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7018a;
        pz40 pz40Var = this.c;
        rmb0 rmb0Var = this.b;
        byte b2 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(k13.b.a(Boolean.TRUE), u1c.M(1022273628, new e13(rmb0Var, pz40Var, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new sy2((byte) 3);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(jm40.b, false, (Function1) objP);
                    boolean zI = fetVar.i(rmb0Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new f13(rmb0Var, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarN = epv0.N(fre0.Y(mm40VarA, (Function1) objP2), rmb0Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    Function2 function2 = (Function2) pz40Var.getValue();
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = r71.d;
                        fetVar.o0(objP3);
                    }
                    tj30 tj30Var = (tj30) objP3;
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    h97.q(0, fetVar, function2, true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
