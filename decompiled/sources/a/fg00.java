package a;

import android.content.res.Configuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fg00 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9468a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ k3t0 c;

    public /* synthetic */ fg00(pz40 pz40Var, k3t0 k3t0Var, byte b) {
        this.f9468a = b;
        this.b = pz40Var;
        this.c = k3t0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f9468a;
        k3t0 k3t0Var = this.c;
        cl5 cl5Var = ukd.f35823a;
        pz40 pz40Var = this.b;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                ir8 ir8Var = (ir8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zx7 zx7Var = gqw0.e;
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
                }
                if (fetVar.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                    drd0 drd0Var = (drd0) pz40Var.getValue();
                    if (drd0Var != null) {
                        if (drd0Var instanceof zqd0) {
                            fetVar.e0(982855768);
                            a4x a4xVar = ((zqd0) drd0Var).d;
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            boolean zI = fetVar.i(k3t0Var);
                            Object objP = fetVar.P();
                            if (zI || objP == cl5Var) {
                                objP = new ebh(k3t0Var, (byte) 2);
                                fetVar.o0(objP);
                            }
                            gkb.c(a4xVar, mm40VarD, (Function1) objP, 0, fetVar, 48, 8);
                            fetVar.r(false);
                        } else if (drd0Var instanceof ard0) {
                            fetVar.e0(1417192185);
                            jcb.l(ir8Var.b(jm40Var, zx7Var), ((ard0) drd0Var).d, false, null, fetVar, 0, 12);
                            fetVar.r(false);
                        } else if (drd0Var instanceof brd0) {
                            fetVar.e0(1417196241);
                            mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                            mdm mdmVar = ((brd0) drd0Var).d;
                            boolean zI2 = fetVar.i(k3t0Var);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new dbh(k3t0Var, (byte) 10);
                                fetVar.o0(objP2);
                            }
                            jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar, 0, 4);
                            fetVar.r(false);
                        } else if (drd0Var instanceof crd0) {
                            fetVar.e0(983656095);
                            float f = ((Configuration) fetVar.k(dy2.f6873a)).screenHeightDp;
                            zcl zclVar = qmk.f28987a;
                            s0x.t(iym0.r(f - 134.0f), 48, fetVar, o7k0.d(jm40Var, 1.0f));
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(1417175715, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            case 1:
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zx7 zx7Var2 = gqw0.e;
                ir8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    drd0 drd0Var2 = (drd0) pz40Var.getValue();
                    if (drd0Var2 != null) {
                        boolean z = drd0Var2 instanceof brd0;
                        k3t0 k3t0Var2 = this.c;
                        if (z) {
                            fetVar2.e0(851976819);
                            mm40 mm40VarB2 = ir8Var2.b(jm40Var, zx7Var2);
                            mdm mdmVar2 = ((brd0) drd0Var2).d;
                            boolean zI3 = fetVar2.i(k3t0Var2);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new dbh(k3t0Var2, (byte) 15);
                                fetVar2.o0(objP3);
                            }
                            vdx.b(mm40VarB2, mdmVar2, (Function0) objP3, fetVar2, 0);
                            fetVar2.r(false);
                        } else if (drd0Var2 instanceof ard0) {
                            fetVar2.e0(851985057);
                            mm40 mm40VarB3 = ir8Var2.b(jm40Var, zx7Var2);
                            mdm mdmVar3 = ((ard0) drd0Var2).d;
                            Object objP4 = fetVar2.P();
                            if (objP4 == cl5Var) {
                                objP4 = new wm90((byte) 4);
                                fetVar2.o0(objP4);
                            }
                            vdx.b(mm40VarB3, mdmVar3, (Function0) objP4, fetVar2, 384);
                            fetVar2.r(false);
                        } else if (drd0Var2 instanceof zqd0) {
                            fetVar2.e0(851991769);
                            a4x a4xVar2 = ((zqd0) drd0Var2).d;
                            boolean zI4 = fetVar2.i(k3t0Var2);
                            Object objP5 = fetVar2.P();
                            if (zI4 || objP5 == cl5Var) {
                                yi90 yi90Var = new yi90(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                                fetVar2.o0(yi90Var);
                                objP5 = yi90Var;
                            }
                            vdx.k(a4xVar2, (Function1) ((jhy) objP5), fetVar2, 0);
                            fetVar2.r(false);
                        } else if (drd0Var2 instanceof crd0) {
                            fetVar2.e0(851997123);
                            vdx.z(0, fetVar2);
                            fetVar2.r(false);
                        }
                    }
                    throw b1j.f(851974937, fetVar2, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            default:
                ir8 ir8Var3 = (ir8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                zx7 zx7Var3 = gqw0.e;
                ir8Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(ir8Var3) ? 4 : 2;
                }
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    drd0 drd0Var3 = (drd0) pz40Var.getValue();
                    if (drd0Var3 != null) {
                        if (drd0Var3 instanceof zqd0) {
                            fetVar3.e0(1002437084);
                            a4x a4xVar3 = ((zqd0) drd0Var3).d;
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            boolean zI5 = fetVar3.i(k3t0Var);
                            Object objP6 = fetVar3.P();
                            if (zI5 || objP6 == cl5Var) {
                                objP6 = new ebh(k3t0Var, (byte) 7);
                                fetVar3.o0(objP6);
                            }
                            gkb.c(a4xVar3, mm40VarD2, (Function1) objP6, R.string.match_reviewe, fetVar3, 48, 0);
                            fetVar3.r(false);
                        } else if (drd0Var3 instanceof ard0) {
                            fetVar3.e0(2110562361);
                            jcb.l(ir8Var3.b(jm40Var, zx7Var3), ((ard0) drd0Var3).d, false, null, fetVar3, 0, 12);
                            fetVar3.r(false);
                        } else if (drd0Var3 instanceof brd0) {
                            fetVar3.e0(2110566417);
                            mm40 mm40VarB4 = ir8Var3.b(jm40Var, zx7Var3);
                            mdm mdmVar4 = ((brd0) drd0Var3).d;
                            boolean zI6 = fetVar3.i(k3t0Var);
                            Object objP7 = fetVar3.P();
                            if (zI6 || objP7 == cl5Var) {
                                objP7 = new dbh(k3t0Var, (byte) 28);
                                fetVar3.o0(objP7);
                            }
                            jcb.l(mm40VarB4, mdmVar4, false, (Function0) objP7, fetVar3, 0, 4);
                            fetVar3.r(false);
                        } else if (drd0Var3 instanceof crd0) {
                            fetVar3.e0(1003313237);
                            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            s0x.t(iym0.r(((Configuration) fetVar3.k(dy2.f6873a)).screenHeightDp - 134.0f), 0, fetVar3, s5x0.N(mm40VarD3, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                            fetVar3.r(false);
                        }
                    }
                    throw b1j.f(2110544073, fetVar3, false);
                }
                fetVar3.X();
                return Unit.f46060a;
        }
    }
}
