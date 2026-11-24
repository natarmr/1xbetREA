package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vi4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37458a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ cj4 c;

    public /* synthetic */ vi4(cj4 cj4Var, l7m0 l7m0Var) {
        this.f37458a = (byte) 0;
        this.c = cj4Var;
        this.b = l7m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f37458a;
        cl5 cl5Var = ukd.f35823a;
        cj4 cj4Var = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gfk0 gfk0Var = cj4.U1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zI = fetVar.i(cj4Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new ui4(cj4Var, (byte) 5);
                        fetVar.o0(objP2);
                    }
                    o050.c(y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28), l7m0Var, false, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gfk0 gfk0Var2 = cj4.U1;
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarB = yhg0Var.b(gqw0.j, o7k0.n(s5x0.N(jm40.b, 10.0f, 18.0f, 0.0f, 0.0f, 12), 44.0f));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarB);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    wul wulVar = (wul) l7m0Var.getValue();
                    if (wulVar == null) {
                        fetVar2.e0(708470683);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(708470684);
                        boolean zI2 = fetVar2.i(cj4Var);
                        Object objP3 = fetVar2.P();
                        if (zI2 || objP3 == cl5Var) {
                            objP3 = new ui4(cj4Var, (byte) 6);
                            fetVar2.o0(objP3);
                        }
                        qzb.n(null, wulVar, (Function0) objP3, fetVar2, 0, 1);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gfk0 gfk0Var3 = cj4.U1;
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    s6q0 s6q0Var = (s6q0) l7m0Var.getValue();
                    boolean zI3 = fetVar3.i(cj4Var);
                    Object objP4 = fetVar3.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new aj4(cj4Var, (byte) 2);
                        fetVar3.o0(objP4);
                    }
                    jwb.o(null, s6q0Var, 6, null, (Function1) objP4, fetVar3, 384, 9);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                gfk0 gfk0Var4 = cj4.U1;
                ((yhg0) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    jnm jnmVar = (jnm) l7m0Var.getValue();
                    boolean zI4 = fetVar4.i(cj4Var);
                    Object objP5 = fetVar4.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new ui4(cj4Var, (byte) 7);
                        fetVar4.o0(objP5);
                    }
                    Function0 function0 = (Function0) objP5;
                    boolean zI5 = fetVar4.i(cj4Var);
                    Object objP6 = fetVar4.P();
                    if (zI5 || objP6 == cl5Var) {
                        objP6 = new aj4(cj4Var, (byte) 3);
                        fetVar4.o0(objP6);
                    }
                    wwb.k(null, jnmVar, 6, null, function0, (Function1) objP6, fetVar4, 384, 73);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                gfk0 gfk0Var5 = cj4.U1;
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 12.0f, 1);
                    s6q0 s6q0Var2 = (s6q0) l7m0Var.getValue();
                    boolean zI6 = fetVar5.i(cj4Var);
                    Object objP7 = fetVar5.P();
                    if (zI6 || objP7 == cl5Var) {
                        objP7 = new aj4(cj4Var, (byte) 1);
                        fetVar5.o0(objP7);
                    }
                    jwb.o(mm40VarL, s6q0Var2, 7, null, (Function1) objP7, fetVar5, 384, 8);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vi4(l7m0 l7m0Var, cj4 cj4Var, byte b) {
        this.f37458a = b;
        this.b = l7m0Var;
        this.c = cj4Var;
    }
}
