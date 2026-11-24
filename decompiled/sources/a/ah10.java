package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ah10 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f853a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ah10(bwj bwjVar, l7m0 l7m0Var, Function1 function1) {
        this.f853a = (byte) 0;
        this.c = bwjVar;
        this.b = l7m0Var;
        this.d = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        byte b = this.f853a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 16;
        l7m0 l7m0Var = this.b;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                xk80 xk80Var = (xk80) obj7;
                Function1 function1 = (Function1) obj6;
                l7m0 l7m0Var2 = (l7m0) obj2;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                l7m0Var2.getClass();
                ((l7m0) obj3).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar.g(l7m0Var2) ? 32 : 16;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    q5x.e(xk80Var, o7k0.c, null, null, 0, 0.0f, null, null, false, null, null, gfk0.b, null, u1c.M(1189948171, new n82(l7m0Var, l7m0Var2, function1, (byte) 3), fetVar), fetVar, 100663344, 24960, 12028);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                gna0 gna0Var = (gna0) obj7;
                au7 au7Var = (au7) obj6;
                mm40 mm40Var = (mm40) obj;
                mm40 mm40Var2 = (mm40) obj2;
                Function1 function2 = (Function1) obj3;
                int i4 = 4;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                yk5 yk5Var = au7.U1;
                mm40Var.getClass();
                mm40Var2.getClass();
                function2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (!fetVar2.g(mm40Var)) {
                        i4 = 2;
                    }
                    i = i4 | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar2.i(function2) ? 256 : 128;
                }
                if (fetVar2.U(i & 1, (i & 1171) != 1170)) {
                    tn8 tn8Var = ((qu7) l7m0Var.getValue()).e;
                    if (tn8Var == null) {
                        fetVar2.e0(-1702954261);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1702954260);
                        boolean zI = fetVar2.i(au7Var);
                        Object objP = fetVar2.P();
                        if (zI || objP == cl5Var) {
                            objP = new yt7(au7Var, (byte) 2);
                            fetVar2.o0(objP);
                        }
                        phu0.d(mm40Var, tn8Var, gna0Var, (Function1) objP, u1c.M(629276754, new t87(tn8Var, mm40Var2, (byte) 6), fetVar2), u1c.M(940667825, new t87(au7Var, function2, (byte) 7), fetVar2), fetVar2, 221568 | (i & 14));
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                dnr dnrVar = (dnr) obj7;
                l7m0 l7m0Var3 = (l7m0) obj6;
                mm40 mm40Var3 = (mm40) obj;
                xcz xczVar = (xcz) obj2;
                Function0 function0 = (Function0) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ddk ddkVar = dnr.c2;
                mm40Var3.getClass();
                xczVar.getClass();
                function0.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i2 = (fetVar3.g(mm40Var3) ? 4 : 2) | iIntValue3;
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= fetVar3.g(xczVar) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i2 |= fetVar3.i(function0) ? 256 : 128;
                }
                if (fetVar3.U(i2 & 1, (i2 & 1171) != 1170)) {
                    obc.d(kr00.f18743a.a(l7m0Var.getValue()), u1c.M(1108065973, new cqk(dnrVar, mm40Var3, xczVar, l7m0Var3, function0), fetVar3), fetVar3, 56);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                nts0 nts0Var = (nts0) obj7;
                Function1 function3 = (Function1) obj6;
                agk0 agk0Var = (agk0) l7m0Var;
                l7m0 l7m0Var4 = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                l7m0Var4.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (fetVar4.g(l7m0Var4) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i3 |= fetVar4.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar4.U(i3 & 1, (i3 & 1155) != 1154)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, jm40.b);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    imm immVar = nts0Var.f24116a;
                    boolean zG = fetVar4.g(function3);
                    Object objP2 = fetVar4.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new nas0(function3, (byte) 13);
                        fetVar4.o0(objP2);
                    }
                    Function0 function4 = (Function0) objP2;
                    boolean zG2 = fetVar4.g(function3);
                    Object objP3 = fetVar4.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new xar0(function3, b2);
                        fetVar4.o0(objP3);
                    }
                    hlm.c(null, immVar, null, function4, null, (Function1) objP3, null, null, null, null, null, null, fetVar4, 0, 0, 4053);
                    jcb.v(null, 0.0f, ((ThemeColors) fetVar4.k(zaq0.b)).getSeparator60(), fetVar4, 0, 3);
                    lvm0.d(null, nts0Var, l7m0Var4, agk0Var.l(), yclVar.f42389a, fetVar4, ((i3 << 6) & 896) | ((i3 << 9) & 458752));
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ah10(l7m0 l7m0Var, Object obj, Object obj2, byte b) {
        this.f853a = b;
        this.b = l7m0Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ah10(nts0 nts0Var, Function1 function1, agk0 agk0Var) {
        this.f853a = (byte) 3;
        this.c = nts0Var;
        this.d = function1;
        this.b = agk0Var;
    }
}
