package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cw0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5055a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ cw0(l7m0 l7m0Var, byte b) {
        this.f5055a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5055a;
        byte b2 = 6;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l7m0Var.getClass();
                    v8q0.a(((nw0) l7m0Var.getValue()).f24212a, o2e.e0(jm40Var, "ToolbarTitleTestTag"), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, j1t0.b, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240504);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                j47.N(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                jiq0.f(x8x.L(1), (fet) obj, jm40Var, l7m0Var);
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(o7k0.p(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 40.0f, 6.0f), vgg0.f37379a);
                    boolean zG = fetVar2.g(l7m0Var);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new eka(l7m0Var, (byte) 12);
                        fetVar2.o0(objP);
                    }
                    hkb.u(mm40VarJ, 0L, 0L, (Function0) objP, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 4:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
                    boolean zG2 = fetVar3.g(l7m0Var);
                    Object objP2 = fetVar3.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new x1d(l7m0Var, (byte) 8);
                        fetVar3.o0(objP2);
                    }
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar3), null, i4w0.T(mm40VarN, (Function1) objP2), ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), fetVar3, 56, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                y860.z(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                y860.y(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 7:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    n6m.b(o7k0.d(jm40Var, 1.0f), ((o3l) l7m0Var.getValue()).f24590a, fetVar4, 6, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 8:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 230.0f);
                    long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    zcl zclVar4 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 0.0f, 8.0f, 1);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarL);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(e7z.u1);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    plc.p((uls) l7m0Var.getValue(), fetVar5, 0);
                    obb.B("00:00", fetVar5, 6);
                    mm40 mm40VarE2 = o7k0.e(jm40Var, 160.0f);
                    boolean zG3 = fetVar5.g(l7m0Var);
                    Object objP3 = fetVar5.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new ufp(l7m0Var, b2);
                        fetVar5.o0(objP3);
                    }
                    b8k0.e(mm40VarE2, null, null, null, null, null, false, null, (Function1) objP3, fetVar5, 0, 510);
                    obb.B(((uls) l7m0Var.getValue()).c, fetVar5, 0);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                lmc.v(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 10:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lmc.v(l7m0Var, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                jar0.l(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 12:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zjb.c(o7k0.d(jm40Var, 1.0f), ((iu70) l7m0Var.getValue()).r, 0L, null, 0L, 0, fetVar7, 6);
                } else {
                    fetVar7.X();
                }
                break;
            case 13:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    d7x.e(0, fetVar8, null, ((iu70) l7m0Var.getValue()).j);
                } else {
                    fetVar8.X();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                g8x.m(l7m0Var, (fet) obj, x8x.L(1));
                break;
            case 15:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    q1m0 q1m0Var = (q1m0) l7m0Var.getValue();
                    if (q1m0Var instanceof p1m0) {
                        fetVar9.e0(-1772604233);
                        List list = ((p1m0) q1m0Var).b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof i1m0) {
                                arrayList.add(obj3);
                            }
                        }
                        xcz xczVarA = ddz.a(0, 0, fetVar9, 0, 3);
                        mm40 mm40VarC = o7k0.c(o7k0.d(jm40Var, 1.0f), 1.0f);
                        boolean zI = fetVar9.i(arrayList) | fetVar9.g(xczVarA);
                        Object objP4 = fetVar9.P();
                        if (zI || objP4 == cl5Var) {
                            objP4 = new u5l0((Object) arrayList, (Object) xczVarA, (byte) 14);
                            fetVar9.o0(objP4);
                        }
                        b8k0.e(mm40VarC, xczVarA, null, null, null, null, false, null, (Function1) objP4, fetVar9, 6, 508);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(-1771205978);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                knx.z(l7m0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cw0(l7m0 l7m0Var, int i, byte b) {
        this.f5055a = b;
        this.b = l7m0Var;
    }
}
