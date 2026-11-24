package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wfc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39064a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ i3t0 c;

    public /* synthetic */ wfc(l7m0 l7m0Var, i3t0 i3t0Var, byte b) {
        this.f39064a = b;
        this.b = l7m0Var;
        this.c = i3t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f39064a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((qwv0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
                    String str = ((bp8) l7m0Var.getValue()).b;
                    String str2 = ((bp8) l7m0Var.getValue()).c;
                    String str3 = ((bp8) l7m0Var.getValue()).d;
                    i3t0 i3t0Var = this.c;
                    boolean zI = fetVar.i(i3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        zhb zhbVar = new zhb(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar.o0(zhbVar);
                        objP = zhbVar;
                    }
                    ahy.m(str, str2, str3, (Function1) ((jhy) objP), fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                qwv0 qwv0Var = (qwv0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                qwv0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(qwv0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    i3t0 i3t0Var2 = this.c;
                    boolean zI2 = fetVar2.i(i3t0Var2);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        zhb zhbVar2 = new zhb(1, i3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar2.o0(zhbVar2);
                        objP2 = zhbVar2;
                    }
                    ahy.l(qwv0Var, l7m0Var, (Function1) ((jhy) objP2), fetVar2, iIntValue2 & 14);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                qwv0 qwv0Var2 = (qwv0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                qwv0Var2.getClass();
                ywv0 ywv0Var = qwv0Var2.f29454a;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(qwv0Var2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                    xczVarA.getClass();
                    ywv0Var.getClass();
                    btv0 btv0Var = new btv0(xczVarA, xczVarA, ywv0Var, true);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, ((zvv0) ((hgk0) ((l7m0) ywv0Var.g.b)).getValue()).g + 24.0f, 5);
                    boolean zG = fetVar3.g(l7m0Var);
                    i3t0 i3t0Var3 = this.c;
                    boolean zI3 = zG | fetVar3.i(i3t0Var3);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new u5l0((Object) l7m0Var, (Object) i3t0Var3, (byte) 13);
                        fetVar3.o0(objP3);
                    }
                    b8k0.e(btv0Var, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP3, fetVar3, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                y5d y5dVar = (y5d) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                j6m0 j6m0Var = v9r0.O1;
                y5dVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(y5dVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    cdr0 cdr0Var = (cdr0) l7m0Var.getValue();
                    if (cdr0Var == null) {
                        fetVar4.e0(655064784);
                        fetVar4.r(false);
                    } else {
                        boolean z = cdr0Var instanceof bdr0;
                        i3t0 i3t0Var4 = this.c;
                        if (z) {
                            fetVar4.e0(21109725);
                            mm40 mm40VarB = y5dVar.b(jm40Var, true);
                            Object objP4 = fetVar4.P();
                            if (objP4 == cl5Var) {
                                objP4 = new t6q0((byte) 29);
                                fetVar4.o0(objP4);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarB, (Function1) objP4);
                            bdr0 bdr0Var = (bdr0) cdr0Var;
                            boolean zI4 = fetVar4.i(i3t0Var4);
                            Object objP5 = fetVar4.P();
                            if (zI4 || objP5 == cl5Var) {
                                w6q0 w6q0Var = new w6q0(1, i3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                                fetVar4.o0(w6q0Var);
                                objP5 = w6q0Var;
                            }
                            xnm0.e(mm40VarK, bdr0Var, (Function1) ((jhy) objP5), fetVar4, 0);
                            fetVar4.r(false);
                        } else if (cdr0Var instanceof adr0) {
                            fetVar4.e0(21124001);
                            mm40 mm40VarB2 = y5dVar.b(jm40Var, true);
                            adr0 adr0Var = (adr0) cdr0Var;
                            boolean zI5 = fetVar4.i(i3t0Var4);
                            Object objP6 = fetVar4.P();
                            if (zI5 || objP6 == cl5Var) {
                                w6q0 w6q0Var2 = new w6q0(1, i3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                                fetVar4.o0(w6q0Var2);
                                objP6 = w6q0Var2;
                            }
                            knm0.d(mm40VarB2, adr0Var, (Function1) ((jhy) objP6), fetVar4, 0);
                            fetVar4.r(false);
                        } else {
                            fetVar4.e0(655064784);
                            fetVar4.r(false);
                        }
                    }
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
