package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ve4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37264a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ ze4 c;

    public /* synthetic */ ve4(l7m0 l7m0Var, ze4 ze4Var, byte b) {
        this.f37264a = b;
        this.b = l7m0Var;
        this.c = ze4Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f37264a;
        byte b2 = 4;
        cl5 cl5Var = ukd.f35823a;
        ze4 ze4Var = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qek0 qek0Var = ze4.g2;
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarB = yhg0Var.b(gqw0.j, o7k0.n(s5x0.N(jm40.b, 10.0f, 18.0f, 0.0f, 0.0f, 12), 44.0f));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    wul wulVar = (wul) l7m0Var.getValue();
                    if (wulVar == null) {
                        fetVar.e0(1194918315);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1194918316);
                        boolean zI = fetVar.i(ze4Var);
                        Object objP = fetVar.P();
                        if (zI || objP == cl5Var) {
                            objP = new pe4(ze4Var, (byte) 8);
                            fetVar.o0(objP);
                        }
                        qzb.n(null, wulVar, (Function0) objP, fetVar, 0, 1);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                qek0 qek0Var2 = ze4.g2;
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    s6q0 s6q0Var = (s6q0) l7m0Var.getValue();
                    boolean zI2 = fetVar2.i(ze4Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new re4(ze4Var, b2);
                        fetVar2.o0(objP2);
                    }
                    jwb.o(null, s6q0Var, 6, null, (Function1) objP2, fetVar2, 384, 9);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                qek0 qek0Var3 = ze4.g2;
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    jnm jnmVar = (jnm) l7m0Var.getValue();
                    boolean zI3 = fetVar3.i(ze4Var);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new pe4(ze4Var, (byte) 9);
                        fetVar3.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zI4 = fetVar3.i(ze4Var);
                    Object objP4 = fetVar3.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new re4(ze4Var, (byte) 5);
                        fetVar3.o0(objP4);
                    }
                    wwb.k(null, jnmVar, 6, null, function0, (Function1) objP4, fetVar3, 384, 73);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                qek0 qek0Var4 = ze4.g2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 12.0f, 1);
                    s6q0 s6q0Var2 = (s6q0) l7m0Var.getValue();
                    boolean zI5 = fetVar4.i(ze4Var);
                    Object objP5 = fetVar4.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new re4(ze4Var, (byte) 3);
                        fetVar4.o0(objP5);
                    }
                    jwb.o(mm40VarL, s6q0Var2, 7, null, (Function1) objP5, fetVar4, 384, 8);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                mm40 mm40Var = (mm40) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                qek0 qek0Var5 = ze4.g2;
                mm40Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(mm40Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    zcl zclVar3 = qmk.f28987a;
                    qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
                    lh80 lh80VarT = s5x0.t(16.0f, 0.0f, 2);
                    boolean zG = fetVar5.g(l7m0Var) | fetVar5.i(ze4Var);
                    Object objP6 = fetVar5.P();
                    if (zG || objP6 == cl5Var) {
                        objP6 = new ys3(l7m0Var, ze4Var, (byte) 7);
                        fetVar5.o0(objP6);
                    }
                    b8k0.f(mm40Var, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP6, fetVar5, iIntValue5 & 14, 490);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
