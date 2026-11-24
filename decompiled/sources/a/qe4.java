package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qe4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28564a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ qe4(o2s o2sVar, l7m0 l7m0Var, l7m0 l7m0Var2, j2s j2sVar, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7) {
        this.h = o2sVar;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.i = j2sVar;
        this.d = l7m0Var3;
        this.e = l7m0Var4;
        this.f = l7m0Var5;
        this.g = l7m0Var6;
        this.j = l7m0Var7;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ugd ugdVar;
        ugd ugdVar2;
        byte b = this.f28564a;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.b;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.j;
        Object obj7 = this.g;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        switch (b) {
            case 0:
                wpq wpqVar = (wpq) obj5;
                pkk0 pkk0Var = (pkk0) obj4;
                ze4 ze4Var = (ze4) obj6;
                l7m0 l7m0Var2 = (l7m0) obj7;
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qek0 qek0Var = ze4.g2;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    wul wulVar = ((ng4) l7m0Var.getValue()).j;
                    l7m0 l7m0Var3 = this.d;
                    if (((wul) l7m0Var3.getValue()) != null) {
                        fetVar.e0(-1304419243);
                        ugd ugdVarM = u1c.M(366791070, new ve4(l7m0Var3, ze4Var, b4), fetVar);
                        fetVar.r(false);
                        ugdVar = ugdVarM;
                    } else {
                        fetVar.e0(-1303437753);
                        fetVar.r(false);
                        ugdVar = null;
                    }
                    boolean zI = fetVar.i(wpqVar) | fetVar.g(pkk0Var) | fetVar.i(ze4Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new on(wpqVar, pkk0Var, ze4Var, (byte) 18);
                        fetVar.o0(objP);
                    }
                    i120.f(mm40Var, this.c, wulVar, (Function1) objP, ugdVar, u1c.M(1537096665, new ve4(this.e, ze4Var, b3), fetVar), u1c.M(-668545702, new ve4(this.f, ze4Var, b2), fetVar), u1c.M(-249831741, new ve4(l7m0Var2, ze4Var, (byte) 3), fetVar), fetVar, (iIntValue & 14) | 14352384);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                o2s o2sVar = (o2s) obj5;
                final j2s j2sVar = (j2s) obj4;
                l7m0 l7m0Var4 = (l7m0) obj7;
                l7m0 l7m0Var5 = (l7m0) obj6;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xak xakVar = j2s.b2;
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40Var2, qmk.a(fetVar2).c, 0.0f, 2);
                    final l7m0 l7m0Var6 = this.c;
                    ugd ugdVarM2 = u1c.M(310694835, new a2s(l7m0Var6, j2sVar, (byte) 1), fetVar2);
                    final l7m0 l7m0Var7 = this.d;
                    final l7m0 l7m0Var8 = this.e;
                    final l7m0 l7m0Var9 = this.f;
                    ntb.v(mm40VarL, o2sVar, this.b, ugdVarM2, u1c.M(-1585723243, new ber() { // from class: a.b2s
                        @Override // a.ber
                        public final Object q(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, fet fetVar3, Integer num) {
                            int i;
                            mm40 mm40Var3 = (mm40) obj8;
                            xcz xczVar = (xcz) obj9;
                            xcz xczVar2 = (xcz) obj10;
                            Function0 function0 = (Function0) obj11;
                            Function1 function1 = (Function1) obj12;
                            int iIntValue3 = num.intValue();
                            xak xakVar2 = j2s.b2;
                            mm40Var3.getClass();
                            xczVar.getClass();
                            xczVar2.getClass();
                            function0.getClass();
                            function1.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                i = (fetVar3.g(mm40Var3) ? 4 : 2) | iIntValue3;
                            } else {
                                i = iIntValue3;
                            }
                            if ((iIntValue3 & 48) == 0) {
                                i |= fetVar3.g(xczVar) ? 32 : 16;
                            }
                            if ((iIntValue3 & 384) == 0) {
                                i |= fetVar3.g(xczVar2) ? 256 : 128;
                            }
                            if ((iIntValue3 & 3072) == 0) {
                                i |= fetVar3.i(function0) ? 2048 : 1024;
                            }
                            if ((iIntValue3 & 24576) == 0) {
                                i |= fetVar3.i(function1) ? 16384 : 8192;
                            }
                            if (fetVar3.U(i & 1, (74899 & i) != 74898)) {
                                obc.e(new l5d0[]{fka.f9681a.a(l7m0Var7), kr00.f18743a.a(l7m0Var8.getValue())}, u1c.M(503930197, new fw6(mm40Var3, l7m0Var6, l7m0Var9, xczVar, xczVar2, j2sVar, function1, function0, (byte) 4), fetVar3), fetVar3, 48);
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), u1c.M(-718477003, new c2s(l7m0Var8, l7m0Var4, b4), fetVar2), u1c.M(-114751112, new a2s(l7m0Var5, j2sVar, (byte) 2), fetVar2), fetVar2, 115043328);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                z3f0 z3f0Var = (z3f0) obj7;
                xcz xczVar = (xcz) obj6;
                wpq wpqVar2 = (wpq) obj5;
                pkk0 pkk0Var2 = (pkk0) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                zie0 zie0Var = z3f0.Y1;
                mm40Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    List list = (List) l7m0Var.getValue();
                    boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
                    l7m0 l7m0Var10 = this.d;
                    if (((a4x) l7m0Var10.getValue()).isEmpty() || ((a4x) l7m0Var10.getValue()).size() <= 1) {
                        fetVar3.e0(-1626151460);
                        fetVar3.r(false);
                        ugdVar2 = null;
                    } else {
                        fetVar3.e0(-1626855221);
                        ugd ugdVarM3 = u1c.M(-1927230916, new acb0(this.e, z3f0Var, wpqVar2, pkk0Var2, this.f, l7m0Var10), fetVar3);
                        fetVar3.r(false);
                        ugdVar2 = ugdVarM3;
                    }
                    k3t0 k3t0VarH0 = z3f0Var.H0();
                    boolean zI2 = fetVar3.i(k3t0VarH0);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new qye0(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar3.o0(objP2);
                    }
                    g7x.k(mm40Var3, list, zBooleanValue, xczVar, (Function1) ((jhy) objP2), ugdVar2, fetVar3, iIntValue3 & 14);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qe4(pz40 pz40Var, l7m0 l7m0Var, wpq wpqVar, pkk0 pkk0Var, ze4 ze4Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5) {
        this.b = pz40Var;
        this.c = l7m0Var;
        this.h = wpqVar;
        this.i = pkk0Var;
        this.j = ze4Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
        this.f = l7m0Var4;
        this.g = l7m0Var5;
    }

    public /* synthetic */ qe4(z3f0 z3f0Var, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, pz40 pz40Var, wpq wpqVar, pkk0 pkk0Var, l7m0 l7m0Var4) {
        this.g = z3f0Var;
        this.j = xczVar;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
        this.e = pz40Var;
        this.h = wpqVar;
        this.i = pkk0Var;
        this.f = l7m0Var4;
    }
}
