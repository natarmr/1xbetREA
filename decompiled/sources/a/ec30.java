package a;

import android.os.Message;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ec30 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7548a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec30(vl8 vl8Var, Function1 function1) {
        this.f7548a = (byte) 7;
        this.b = vl8Var;
        this.c = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xra xraVar = (xra) this.b;
        bzl bzlVar = (bzl) this.c;
        y5d y5dVar = (y5d) obj;
        ih2 ih2Var = (ih2) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        cl5 cl5Var = xra.X1;
        y5dVar.getClass();
        ih2Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(y5dVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.e(ih2Var.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            xraVar.getClass();
            int iOrdinal = ih2Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1702590856);
                xraVar.H0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1702592711);
                xraVar.I0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1702594733);
                xraVar.J0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(1702596809);
                xraVar.K0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(1702589405, fetVar, false);
                }
                fetVar.e0(1702598726);
                xraVar.L0(bzlVar, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g5b g5bVar = (g5b) this.b;
        bzl bzlVar = (bzl) this.c;
        y5d y5dVar = (y5d) obj;
        ih2 ih2Var = (ih2) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        gl5 gl5Var = g5b.c2;
        y5dVar.getClass();
        ih2Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(y5dVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.e(ih2Var.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            int iOrdinal = ih2Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1416133179);
                g5bVar.H0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1416131324);
                g5bVar.I0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-1416129302);
                g5bVar.J0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(-1416127226);
                g5bVar.K0(bzlVar, fetVar, 0);
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-1416134650, fetVar, false);
                }
                fetVar.e0(-950212237);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ndf0 ndf0Var = (ndf0) this.b;
        Fragment fragment = (Fragment) this.c;
        udl0 udl0Var = (udl0) obj;
        RelatedParams relatedParams = (RelatedParams) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        udl0Var.getClass();
        relatedParams.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.e(udl0Var.ordinal()) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.g(relatedParams) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            int i2 = ((i << 3) & 112) | 6;
            ndf0Var.a(tke.Y(udl0Var, fetVar, i2), tke.Z(udl0Var, fetVar, i2), fragment, relatedParams, fetVar);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        w6n w6nVar = (w6n) this.b;
        god godVar = (god) this.c;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            obc.d(afp0.f790a.a(w6nVar), u1c.M(2007752630, new kea((Object) mm40Var, (Object) godVar, (byte) 29), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        w6n w6nVar = (w6n) this.b;
        qod qodVar = (qod) this.c;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            obc.d(afp0.f790a.a(w6nVar), u1c.M(1137613286, new eod(mm40Var, qodVar, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        h7h h7hVar = (h7h) this.b;
        Function1 function1 = (Function1) this.c;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            uzb.a(null, h7hVar.f12573a, (b7h) h7hVar.g.get(iIntValue), false, null, function1, fetVar, 0, 25);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        y3d y3dVar = (y3d) this.b;
        qge qgeVar = (qge) this.c;
        pbe0 pbe0Var = (pbe0) obj;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        pbe0Var.getClass();
        ((kz3) obj2).getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(pbe0Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 131) != 130)) {
            u4n0.e(pbe0Var, null, null, null, qgeVar, 0.0f, y3dVar != null ? new m78(y3dVar.f41946a, 5) : null, false, fetVar, iIntValue & 14, 175);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        vne vneVar = (vne) this.b;
        xk80 xk80Var = (xk80) this.c;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            boolean zI = fetVar.i(vneVar) | fetVar.g(xk80Var) | ((iIntValue2 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new ell(vneVar, xk80Var, iIntValue, b);
                fetVar.o0(objP);
            }
            saj.r(y860.W(jm40.b, null, null, false, null, (Function0) objP, 28), ill.f14985a, null, null, fetVar, 48, 12);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        j8n j8nVar = (j8n) this.b;
        Function0 function0 = (Function0) this.c;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((b53) obj).getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.h(zBooleanValue) ? 32 : 16;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            fetVar.X();
        } else if (zBooleanValue) {
            fetVar.e0(498276272);
            xkb.B(0, 1, fetVar, null, j8nVar.b);
            fetVar.r(false);
        } else {
            fetVar.e0(498364374);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            acb.n(new ac(new y3d(StaticColors.INSTANCE.m125getWhite100d7_KjU()), new y3d(y3d.c), 4), false, function0, o7k0.e(mm40VarD, 20.0f), fetVar, 48, 0);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        q7m q7mVar = (q7m) this.b;
        vpm0 vpm0Var = (vpm0) this.c;
        ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
            dub.Y(q7mVar, vpm0Var.f37812a, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        zbr zbrVar = (zbr) this.b;
        Function1 function1 = (Function1) this.c;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            wwh0 wwh0Var = zbrVar.c;
            gf6 gf6Var = zbrVar.d;
            lj80 lj80Var = ((oj80) wwh0Var.f39885a.get(iIntValue)).f25348a;
            if (lj80Var instanceof ij80) {
                fetVar.e0(2005442890);
                rcb.R(gf6Var, zbrVar.e, function1, fetVar, 0);
                fetVar.r(false);
            } else if (lj80Var instanceof fj80) {
                fetVar.e0(2005776047);
                b7c0 b7c0Var = zbrVar.f;
                if (b7c0Var == null) {
                    fetVar.e0(2005776046);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2005776047);
                    rcb.P(b7c0Var, gf6Var, function1, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!(lj80Var instanceof cj80)) {
                    throw b1j.f(2142899542, fetVar, false);
                }
                fetVar.e0(2006150899);
                rx4 rx4Var = zbrVar.g;
                if (rx4Var == null) {
                    fetVar.e0(2006150898);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2006150899);
                    rcb.b(gf6Var, rx4Var, function1, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        nrr nrrVar = (nrr) this.b;
        Function2 function2 = (Function2) this.c;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 100.0f), 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            hdp0 hdp0Var = nrrVar.b;
            dex dexVar = nrrVar.e;
            f7k.b(hdp0Var, dexVar == dex.f5973a, nrrVar.f, nrrVar.g, function2, fetVar);
            f7k.b(nrrVar.c, dexVar == dex.b, nrrVar.h, nrrVar.i, function2, fetVar);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        mrr mrrVar = (mrr) this.b;
        Function2 function2 = (Function2) this.c;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            jdp0 jdp0Var = mrrVar.b;
            eex eexVar = mrrVar.e;
            kpb.c(null, jdp0Var, eexVar == eex.f7695a, mrrVar.f, mrrVar.g, function2, fetVar, 1);
            kpb.c(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), mrrVar.c, eexVar == eex.b, mrrVar.h, mrrVar.i, function2, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        trr trrVar = (trr) this.b;
        Function2 function2 = (Function2) this.c;
        y5d y5dVar = (y5d) obj;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, y5dVar, mm40Var);
        if ((iD & 6) == 0) {
            i = (fetVar.g(y5dVar) ? 4 : 2) | iD;
        } else {
            i = iD;
        }
        if ((iD & 48) == 0) {
            i |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            kr00.a(u1c.M(560839792, new cbr((Object) mm40Var, (Object) trrVar, (Object) function2, (Object) y5dVar, (byte) 1), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        zfn zfnVar;
        l5d0 l5d0VarA;
        l5d0 l5d0VarA2;
        int i4;
        int i5;
        byte b = this.f7548a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 3;
        byte b3 = 2;
        Object obj5 = this.c;
        Object obj6 = this.b;
        final byte b4 = 1;
        switch (b) {
            case 0:
                Map map = (Map) obj6;
                nc30 nc30Var = (nc30) obj5;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    fetVar.e0(327673214);
                    Object obj7 = map.get(num);
                    Object obj8 = obj7;
                    if (obj7 == null) {
                        Object[] objArr = new Object[0];
                        v0h0 v0h0Var = xcz.y;
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new n230((byte) 9);
                            fetVar.o0(objP);
                        }
                        xcz xczVar = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 384);
                        map.put(num, xczVar);
                        obj8 = xczVar;
                    }
                    xcz xczVar2 = (xcz) obj8;
                    fetVar.r(false);
                    if (((a4x) nc30Var.d.get(iIntValue)).isEmpty()) {
                        fetVar.e0(1568108365);
                        aad.l(nc30Var.f, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1568205116);
                        n0q n0qVar = o7k0.c;
                        int i6 = (fetVar.g(nc30Var) ? 1 : 0) | ((iIntValue2 & 112) != 32 ? (byte) 0 : (byte) 1);
                        Object objP2 = fetVar.P();
                        if (i6 != 0 || objP2 == cl5Var) {
                            objP2 = new z08((Object) nc30Var, iIntValue, (byte) 10);
                            fetVar.o0(objP2);
                        }
                        b8k0.e(n0qVar, xczVar2, null, null, null, null, false, null, (Function1) objP2, fetVar, 6, 508);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ArrayList arrayList = (ArrayList) obj6;
                xdr xdrVar = (xdr) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    wo5 wo5Var = (wo5) CollectionsKt.W(iIntValue3, arrayList);
                    if (wo5Var == null) {
                        fetVar2.e0(633856055);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(633856056);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                        n0q n0qVar2 = o7k0.c;
                        ArrayList arrayList2 = wo5Var.c;
                        boolean zG = fetVar2.g(xdrVar) | fetVar2.i(wo5Var);
                        Object objP3 = fetVar2.P();
                        Object obj9 = objP3;
                        if (zG || objP3 == cl5Var) {
                            ba30 ba30Var = new ba30(xdrVar, wo5Var, (byte) 25);
                            fetVar2.o0(ba30Var);
                            obj9 = ba30Var;
                        }
                        u7x.j(n0qVar2, arrayList2, (Function2) obj9, fetVar2, 6);
                        zcl zclVar = qmk.f28987a;
                        qxw.o(fetVar2, o7k0.e(jm40Var, 32.0f));
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                aw50 aw50Var = (aw50) obj6;
                Fragment fragment = (Fragment) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    ((vrq0) aw50Var.e.get(iIntValue5)).b.j(fragment, o7k0.c, fetVar3, 48);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                bb00 bb00Var = (bb00) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n);
                    xcz xczVarA = ddz.a(0, 0, fetVar4, 0, 3);
                    zcl zclVar2 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7);
                    boolean zG2 = fetVar4.g(bb00Var) | ((iIntValue8 & 112) == 32) | fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new g18((Object) bb00Var, iIntValue7, (Object) function1, (byte) 8);
                        fetVar4.o0(objP4);
                    }
                    b8k0.e(mm40VarQ, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP4, fetVar4, 100663296, 248);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ir8 ir8Var = (ir8) obj6;
                Function1 function2 = (Function1) obj5;
                f1l0 f1l0Var = (f1l0) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                f1l0Var.getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= fetVar5.g(f1l0Var) ? 32 : 16;
                }
                if (!fetVar5.U(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    fetVar5.X();
                } else if (f1l0Var instanceof d1l0) {
                    fetVar5.e0(-1900061228);
                    mm40 mm40VarB = ir8Var.b(o7k0.y(jm40Var, null, 3), gqw0.e);
                    mdm mdmVar = ((d1l0) f1l0Var).g;
                    boolean zG3 = fetVar5.g(function2);
                    Object objP5 = fetVar5.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new uck0(function2, (byte) 2);
                        fetVar5.o0(objP5);
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP5, fetVar5, 0, 4);
                    fetVar5.r(false);
                } else {
                    if (!(f1l0Var instanceof e1l0)) {
                        throw b1j.f(-338389141, fetVar5, false);
                    }
                    fetVar5.e0(-338371795);
                    qxw.o(fetVar5, o7k0.c);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case 5:
                zw0 zw0Var = (zw0) obj6;
                ((Boolean) obj2).getClass();
                ((Boolean) obj3).getClass();
                Message message = (Message) obj4;
                WebView webViewC = zw0Var.c(false, new vw0((String) obj5, new yw0(zw0Var, (byte) 3), new yw0(zw0Var, (byte) 4)), new uw0(new t90(1, zw0Var, zw0.class, "updateCurrentFullScreenView", "updateCurrentFullScreenView(Landroid/view/View;)V", 0, (byte) 21), new wgd(b2), new yw0(zw0Var, (byte) 5)));
                if (webViewC != null) {
                    Object obj10 = message != null ? message.obj : null;
                    WebView.WebViewTransport webViewTransport = obj10 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj10 : null;
                    if (webViewTransport != null) {
                        webViewTransport.setWebView(webViewC);
                    }
                    if (message != null) {
                        message.sendToTarget();
                    }
                    ax0 ax0Var = new ax0(webViewC, null);
                    zw0Var.d.add(ax0Var);
                    Function1 function3 = zw0Var.k;
                    if (function3 != null) {
                        function3.invoke(ax0Var);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                wpq wpqVar = (wpq) obj6;
                pkk0 pkk0Var = (pkk0) obj5;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar6 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                gfk0 gfk0Var = cj4.U1;
                ((ir8) obj).getClass();
                mm40Var.getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar6.g(mm40Var) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    ((ypq) wpqVar).b(false);
                    if (pkk0Var != null) {
                        ((r3k) pkk0Var).a();
                    }
                    gq80.g((iIntValue10 >> 3) & 14, fetVar6, mm40Var);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 7:
                vl8 vl8Var = (vl8) obj6;
                Function1 function4 = (Function1) obj5;
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar7.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    jh8 jh8Var = (jh8) ((tl8) vl8Var).n.get(iIntValue11);
                    if (jh8Var == null) {
                        z2 = false;
                    } else if (jh8Var instanceof gh8) {
                        fetVar7.e0(1790465531);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        ian ianVar = ((gh8) jh8Var).f11284a;
                        boolean zG4 = fetVar7.g(function4) | fetVar7.g(jh8Var);
                        Object objP6 = fetVar7.P();
                        if (zG4 || objP6 == cl5Var) {
                            objP6 = new t87(function4, jh8Var, (byte) 17);
                            fetVar7.o0(objP6);
                        }
                        pzb.q(mm40VarD, ianVar, (Function2) objP6, fetVar7, 6);
                        fetVar7.r(false);
                    } else if (jh8Var instanceof fh8) {
                        fetVar7.e0(1790500926);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        lan lanVar = ((fh8) jh8Var).f9528a;
                        boolean zG5 = fetVar7.g(function4) | fetVar7.g(jh8Var);
                        Object objP7 = fetVar7.P();
                        if (zG5 || objP7 == cl5Var) {
                            objP7 = new op7(function4, jh8Var, (byte) 8);
                            fetVar7.o0(objP7);
                        }
                        qzb.s(mm40VarD2, lanVar, (Function1) objP7, fetVar7, 6);
                        fetVar7.r(false);
                    } else if (jh8Var instanceof ch8) {
                        fetVar7.e0(1790532790);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        jan janVar = ((ch8) jh8Var).f4347a;
                        boolean zG6 = fetVar7.g(function4);
                        Object objP8 = fetVar7.P();
                        if (zG6 || objP8 == cl5Var) {
                            objP8 = new uo6(function4, (byte) 18);
                            fetVar7.o0(objP8);
                        }
                        qzb.s(mm40VarD3, janVar, (Function1) objP8, fetVar7, 6);
                        fetVar7.r(false);
                    } else {
                        z2 = false;
                        if (jh8Var instanceof dh8) {
                            fetVar7.e0(1790554128);
                            mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar3 = qmk.f28987a;
                            mm40 mm40VarE = o7k0.e(mm40VarD4, 278.0f);
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode2 = Long.hashCode(fetVar7.T);
                            bh90 bh90VarM2 = fetVar7.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar7, mm40VarE);
                            mkd.c0.getClass();
                            fetVar7.i0();
                            if (fetVar7.S) {
                                fetVar7.l(pcyVar);
                            } else {
                                fetVar7.r0();
                            }
                            jpm0.o(fetVar7, tj30VarC, gqw0.x);
                            jpm0.o(fetVar7, bh90VarM2, gqw0.w);
                            jpm0.o(fetVar7, Integer.valueOf(iHashCode2), gqw0.y);
                            jpm0.n(fetVar7);
                            jpm0.o(fetVar7, mm40VarC1, gqw0.v);
                            jcb.l(o7k0.d(jm40Var, 1.0f), ((dh8) jh8Var).f6080a, false, null, fetVar7, 6, 12);
                            fetVar7.r(true);
                            fetVar7.r(false);
                        }
                    }
                    throw b1j.f(1790463731, fetVar7, z2);
                }
                fetVar7.X();
                return Unit.f46060a;
            case 8:
                final vaa vaaVar = (vaa) obj6;
                final Function2 function5 = (Function2) obj5;
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar8 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, y5dVar, mm40Var2);
                if ((iD & 6) == 0) {
                    i = (fetVar8.g(y5dVar) ? 4 : 2) | iD;
                } else {
                    i = iD;
                }
                if ((iD & 48) == 0) {
                    i |= fetVar8.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar8.U(i & 1, (i & 147) != 146)) {
                    final byte b5 = 0;
                    final byte b6 = 1;
                    ay3.m(y5dVar.b(mm40Var2, true), q3d.j(u1c.M(284203886, new xdr() { // from class: a.paa
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b7 = b5;
                            Function2 function6 = function5;
                            vaa vaaVar2 = vaaVar;
                            switch (b7) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj11;
                                    fet fetVar9 = (fet) obj12;
                                    int iIntValue13 = ((Integer) obj13).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue13 & 6) == 0) {
                                        iIntValue13 |= fetVar9.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                        l5d0 l5d0VarA3 = cn80.b.a(w6n.f);
                                        l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.f);
                                        zfn zfnVar2 = egp0.c;
                                        ((g1t0) fetVar9.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA3, l5d0VarA4, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar9.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(5)}, u1c.M(1633959982, new oaa(mm40Var3, vaaVar2, function6, (byte) 1), fetVar9), fetVar9, 48);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj11;
                                    fet fetVar10 = (fet) obj12;
                                    int iIntValue14 = ((Integer) obj13).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar10.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar10.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        l5d0 l5d0VarA5 = cn80.b.a(w6n.f);
                                        l5d0 l5d0VarA6 = egp0.f7775a.a(gqw0.d);
                                        zfn zfnVar3 = egp0.c;
                                        ((g1t0) fetVar10.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA5, l5d0VarA6, zfnVar3.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar10.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(5)}, u1c.M(-1797237200, new oaa(mm40Var4, vaaVar2, function6, (byte) 2), fetVar10), fetVar10, 48);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar8), u1c.M(-1431394705, new sd8(vaaVar, (byte) 4), fetVar8), u1c.M(1147974000, new xdr() { // from class: a.paa
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b7 = b6;
                            Function2 function6 = function5;
                            vaa vaaVar2 = vaaVar;
                            switch (b7) {
                                case 0:
                                    mm40 mm40Var3 = (mm40) obj11;
                                    fet fetVar9 = (fet) obj12;
                                    int iIntValue13 = ((Integer) obj13).intValue();
                                    mm40Var3.getClass();
                                    if ((iIntValue13 & 6) == 0) {
                                        iIntValue13 |= fetVar9.g(mm40Var3) ? 4 : 2;
                                    }
                                    if (fetVar9.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                        l5d0 l5d0VarA3 = cn80.b.a(w6n.f);
                                        l5d0 l5d0VarA4 = egp0.f7775a.a(gqw0.f);
                                        zfn zfnVar2 = egp0.c;
                                        ((g1t0) fetVar9.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA3, l5d0VarA4, zfnVar2.a(g1t0.n()), dw9.k(6, egp0.b), cn80.f4642a.a(fetVar9.k(bmd.n)), kcp0.c.a(Boolean.TRUE), kcp0.f18071a.a(null), egp0.d.a(5)}, u1c.M(1633959982, new oaa(mm40Var3, vaaVar2, function6, (byte) 1), fetVar9), fetVar9, 48);
                                    } else {
                                        fetVar9.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var4 = (mm40) obj11;
                                    fet fetVar10 = (fet) obj12;
                                    int iIntValue14 = ((Integer) obj13).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar10.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar10.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        l5d0 l5d0VarA5 = cn80.b.a(w6n.f);
                                        l5d0 l5d0VarA6 = egp0.f7775a.a(gqw0.d);
                                        zfn zfnVar3 = egp0.c;
                                        ((g1t0) fetVar10.k(j1t0.e)).getClass();
                                        obc.e(new l5d0[]{l5d0VarA5, l5d0VarA6, zfnVar3.a(g1t0.n()), dw9.k(5, egp0.b), cn80.f4642a.a(fetVar10.k(bmd.n)), kcp0.c.a(Boolean.FALSE), kcp0.f18071a.a(null), egp0.d.a(5)}, u1c.M(-1797237200, new oaa(mm40Var4, vaaVar2, function6, (byte) 2), fetVar10), fetVar10, 48);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar8)), fetVar8);
                    x8f.a(o7k0.d(jm40Var, 1.0f), vaaVar.d, vaaVar.e, vaaVar.f, vaaVar.g, fetVar8, 6);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 9:
                final waa waaVar = (waa) obj6;
                final Function2 function6 = (Function2) obj5;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar9 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar9.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar9.U(iD2 & 1, (iD2 & 145) != 144)) {
                    final byte b7 = 0;
                    final byte b8 = 1;
                    b34.k(q8a.k0(mm40Var3, enx.b), q3d.j(u1c.M(-984816688, new xdr() { // from class: a.qaa
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b9 = b7;
                            Function2 function7 = function6;
                            waa waaVar2 = waaVar;
                            switch (b9) {
                                case 0:
                                    mm40 mm40Var4 = (mm40) obj11;
                                    fet fetVar10 = (fet) obj12;
                                    int iIntValue13 = ((Integer) obj13).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue13 & 6) == 0) {
                                        iIntValue13 |= fetVar10.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar10.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                        xf0.h(mm40Var4, waaVar2.c, null, u1c.M(-1207027736, new naa(function7, (byte) 1), fetVar10), fetVar10, (iIntValue13 & 14) | 24576, 12);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var5 = (mm40) obj11;
                                    fet fetVar11 = (fet) obj12;
                                    int iIntValue14 = ((Integer) obj13).intValue();
                                    mm40Var5.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar11.g(mm40Var5) ? 4 : 2;
                                    }
                                    if (fetVar11.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        xf0.h(mm40Var5, waaVar2.d, null, u1c.M(-199957978, new naa(function7, (byte) 0), fetVar11), fetVar11, (iIntValue14 & 14) | 24576, 12);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar9), u1c.M(1666201839, new sd8(waaVar, (byte) 5), fetVar9), u1c.M(22253070, new xdr() { // from class: a.qaa
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b9 = b8;
                            Function2 function7 = function6;
                            waa waaVar2 = waaVar;
                            switch (b9) {
                                case 0:
                                    mm40 mm40Var4 = (mm40) obj11;
                                    fet fetVar10 = (fet) obj12;
                                    int iIntValue13 = ((Integer) obj13).intValue();
                                    mm40Var4.getClass();
                                    if ((iIntValue13 & 6) == 0) {
                                        iIntValue13 |= fetVar10.g(mm40Var4) ? 4 : 2;
                                    }
                                    if (fetVar10.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                                        xf0.h(mm40Var4, waaVar2.c, null, u1c.M(-1207027736, new naa(function7, (byte) 1), fetVar10), fetVar10, (iIntValue13 & 14) | 24576, 12);
                                    } else {
                                        fetVar10.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var5 = (mm40) obj11;
                                    fet fetVar11 = (fet) obj12;
                                    int iIntValue14 = ((Integer) obj13).intValue();
                                    mm40Var5.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar11.g(mm40Var5) ? 4 : 2;
                                    }
                                    if (fetVar11.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        xf0.h(mm40Var5, waaVar2.d, null, u1c.M(-199957978, new naa(function7, (byte) 0), fetVar11), fetVar11, (iIntValue14 & 14) | 24576, 12);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar9)), null, fetVar9, 4);
                    kc5.G(o7k0.d(jm40Var, 1.0f), waaVar.f, waaVar.g, waaVar.h, waaVar.i, fetVar9, 6);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 10:
                final nda ndaVar = (nda) obj6;
                final Function2 function7 = (Function2) obj5;
                y5d y5dVar2 = (y5d) obj;
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar10 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                y5dVar2.getClass();
                mm40Var4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i2 = iIntValue13 | (fetVar10.g(y5dVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i2 |= fetVar10.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar10.U(i2 & 1, (i2 & 147) != 146)) {
                    mm40 mm40VarB2 = y5dVar2.b(o7k0.d(mm40Var4, 1.0f), true);
                    zcl zclVar4 = qmk.f28987a;
                    x5d x5dVarA2 = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar10, 0);
                    int iHashCode3 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM3 = fetVar10.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar10, mm40VarB2);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC2, gqw0.v);
                    zfn zfnVar2 = cn80.b;
                    w6n w6nVar = w6n.h;
                    l5d0 l5d0VarA3 = zfnVar2.a(w6nVar);
                    zfn zfnVar3 = egp0.f7775a;
                    zx7 zx7Var = gqw0.d;
                    l5d0 l5d0VarA4 = zfnVar3.a(zx7Var);
                    zfn zfnVar4 = egp0.c;
                    zfn zfnVar5 = j1t0.e;
                    ((g1t0) fetVar10.k(zfnVar5)).getClass();
                    l5d0 l5d0VarA5 = zfnVar4.a(g1t0.g());
                    zfn zfnVar6 = egp0.b;
                    l5d0 l5d0VarK = dw9.k(5, zfnVar6);
                    zfn zfnVar7 = cn80.f4642a;
                    zfn zfnVar8 = bmd.n;
                    l5d0 l5d0VarA6 = zfnVar7.a(fetVar10.k(zfnVar8));
                    zfn zfnVar9 = kcp0.f18071a;
                    l5d0 l5d0VarA7 = zfnVar9.a(null);
                    zfn zfnVar10 = egp0.d;
                    l5d0 l5d0VarA8 = zfnVar10.a(2);
                    zfn zfnVar11 = kcp0.c;
                    Boolean bool = Boolean.FALSE;
                    final byte b9 = 0;
                    obc.e(new l5d0[]{l5d0VarA3, l5d0VarA4, l5d0VarA5, l5d0VarK, l5d0VarA6, l5d0VarA7, l5d0VarA8, zfnVar11.a(bool)}, u1c.M(1480659321, new Function2() { // from class: a.oca
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            byte b10 = b9;
                            jm40 jm40Var2 = jm40.b;
                            nda ndaVar2 = ndaVar;
                            switch (b10) {
                                case 0:
                                    fet fetVar11 = (fet) obj11;
                                    int iIntValue14 = ((Integer) obj12).intValue();
                                    if (fetVar11.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                                        mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar5 = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(mm40VarD5, 0.0f, 8.0f, 1);
                                        boolean z3 = false;
                                        kdp0 kdp0Var = ndaVar2.d;
                                        if (ndaVar2.c == cex.f4233a) {
                                            z3 = true;
                                        }
                                        dtb.c(mm40VarL, kdp0Var, z3, ndaVar2.f, ndaVar2.g, function7, fetVar11, 0);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                                default:
                                    fet fetVar12 = (fet) obj11;
                                    int iIntValue15 = ((Integer) obj12).intValue();
                                    if (fetVar12.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                                        mm40 mm40VarD6 = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar6 = qmk.f28987a;
                                        dtb.c(s5x0.L(mm40VarD6, 0.0f, 8.0f, 1), ndaVar2.e, ndaVar2.c == cex.b, ndaVar2.h, ndaVar2.i, function7, fetVar12, 0);
                                    } else {
                                        fetVar12.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar10), fetVar10, 48);
                    mbc.o(xfi0.f40792a, o7k0.d(jm40Var, 1.0f), true, fetVar10, 438, 0);
                    l5d0 l5d0VarA9 = zfnVar2.a(w6nVar);
                    l5d0 l5d0VarA10 = zfnVar3.a(zx7Var);
                    ((g1t0) fetVar10.k(zfnVar5)).getClass();
                    final byte b10 = 1;
                    obc.e(new l5d0[]{l5d0VarA9, l5d0VarA10, zfnVar4.a(g1t0.g()), dw9.k(5, zfnVar6), zfnVar7.a(fetVar10.k(zfnVar8)), zfnVar9.a(null), zfnVar10.a(2), zfnVar11.a(bool)}, u1c.M(-1775470480, new Function2() { // from class: a.oca
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj11, Object obj12) {
                            byte b11 = b10;
                            jm40 jm40Var2 = jm40.b;
                            nda ndaVar2 = ndaVar;
                            switch (b11) {
                                case 0:
                                    fet fetVar11 = (fet) obj11;
                                    int iIntValue14 = ((Integer) obj12).intValue();
                                    if (fetVar11.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                                        mm40 mm40VarD5 = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar5 = qmk.f28987a;
                                        mm40 mm40VarL = s5x0.L(mm40VarD5, 0.0f, 8.0f, 1);
                                        boolean z3 = false;
                                        kdp0 kdp0Var = ndaVar2.d;
                                        if (ndaVar2.c == cex.f4233a) {
                                            z3 = true;
                                        }
                                        dtb.c(mm40VarL, kdp0Var, z3, ndaVar2.f, ndaVar2.g, function7, fetVar11, 0);
                                    } else {
                                        fetVar11.X();
                                    }
                                    break;
                                default:
                                    fet fetVar12 = (fet) obj11;
                                    int iIntValue15 = ((Integer) obj12).intValue();
                                    if (fetVar12.U(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                                        mm40 mm40VarD6 = o7k0.d(jm40Var2, 1.0f);
                                        zcl zclVar6 = qmk.f28987a;
                                        dtb.c(s5x0.L(mm40VarD6, 0.0f, 8.0f, 1), ndaVar2.e, ndaVar2.c == cex.b, ndaVar2.h, ndaVar2.i, function7, fetVar12, 0);
                                    } else {
                                        fetVar12.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar10), fetVar10, 48);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 11:
                pda pdaVar = (pda) obj6;
                Function2 function8 = (Function2) obj5;
                y5d y5dVar3 = (y5d) obj;
                mm40 mm40Var5 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                y5dVar3.getClass();
                mm40Var5.getClass();
                if ((iIntValue14 & 6) == 0) {
                    i3 = iIntValue14 | (fetVar11.g(y5dVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i3 |= fetVar11.g(mm40Var5) ? 32 : 16;
                }
                if (fetVar11.U(i3 & 1, (i3 & 147) != 146)) {
                    mm40 mm40VarB3 = y5dVar3.b(mm40Var5, true);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarB3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar11, 48);
                    int iHashCode4 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM4 = fetVar11.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar11, mm40VarN);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar11, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar11, bh90VarM4, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar11, numValueOf, shdVar3);
                    jpm0.n(fetVar11);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar11, mm40VarC3, shdVar4);
                    mm40 mm40VarE2 = o7k0.e(new x7z(1.0f, true), 72.0f);
                    udp0 udp0Var = pdaVar.b;
                    if (!(udp0Var instanceof ycp0)) {
                        if (udp0Var instanceof sdp0) {
                            zfnVar = cn80.b;
                            l5d0VarA = zfnVar.a(w6n.f);
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    zfnVar = cn80.b;
                    l5d0VarA = zfnVar.a(w6n.h);
                    l5d0 l5d0Var = l5d0VarA;
                    zfn zfnVar12 = egp0.f7775a;
                    l5d0 l5d0VarA11 = zfnVar12.a(gqw0.f);
                    zfn zfnVar13 = egp0.c;
                    zfn zfnVar14 = j1t0.e;
                    ((g1t0) fetVar11.k(zfnVar14)).getClass();
                    l5d0 l5d0VarA12 = zfnVar13.a(g1t0.n());
                    zfn zfnVar15 = egp0.b;
                    l5d0 l5d0VarK2 = dw9.k(6, zfnVar15);
                    zfn zfnVar16 = cn80.f4642a;
                    zfn zfnVar17 = bmd.n;
                    l5d0 l5d0VarA13 = zfnVar16.a(fetVar11.k(zfnVar17));
                    zfn zfnVar18 = kcp0.c;
                    l5d0 l5d0VarA14 = zfnVar18.a(Boolean.TRUE);
                    zfn zfnVar19 = kcp0.f18071a;
                    l5d0 l5d0VarA15 = zfnVar19.a(null);
                    zfn zfnVar20 = egp0.d;
                    obc.e(new l5d0[]{l5d0Var, l5d0VarA11, l5d0VarA12, l5d0VarK2, l5d0VarA13, l5d0VarA14, l5d0VarA15, zfnVar20.a(5)}, u1c.M(42459208, new sca(mm40VarE2, pdaVar, function8, (byte) 1), fetVar11), fetVar11, 48);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var2, 80.0f), 1.0f);
                    x5d x5dVarA3 = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar11, 48);
                    int iHashCode5 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM5 = fetVar11.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar11, mm40VarC);
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, x5dVarA3, shdVar);
                    jpm0.o(fetVar11, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar11, shdVar3, fetVar11);
                    jpm0.o(fetVar11, mm40VarC4, shdVar4);
                    n4c.l(s5x0.N(jm40Var2, 0.0f, 24.0f, 0.0f, 0.0f, 13), pdaVar.d, ((Boolean) fetVar11.k(kr00.f18743a)).booleanValue(), fetVar11, 0);
                    fka.a(6, fetVar11, o7k0.d(jm40Var2, 1.0f));
                    fetVar11.r(true);
                    udp0 udp0Var2 = pdaVar.c;
                    if (udp0Var2 instanceof ycp0) {
                        l5d0VarA2 = zfnVar.a(w6n.h);
                    } else {
                        if (!(udp0Var2 instanceof sdp0)) {
                            t9f.b();
                            return null;
                        }
                        l5d0VarA2 = zfnVar.a(w6n.f);
                    }
                    l5d0 l5d0Var2 = l5d0VarA2;
                    l5d0 l5d0VarA16 = zfnVar12.a(gqw0.d);
                    ((g1t0) fetVar11.k(zfnVar14)).getClass();
                    obc.e(new l5d0[]{l5d0Var2, l5d0VarA16, zfnVar13.a(g1t0.n()), dw9.k(5, zfnVar15), zfnVar16.a(fetVar11.k(zfnVar17)), zfnVar18.a(Boolean.FALSE), zfnVar19.a(null), zfnVar20.a(5)}, u1c.M(-1824614145, new sca(mm40VarE2, pdaVar, function8, (byte) 2), fetVar11), fetVar11, 48);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 12:
                oda odaVar = (oda) obj6;
                Function2 function9 = (Function2) obj5;
                y5d y5dVar4 = (y5d) obj;
                boolean z3 = false;
                mm40 mm40Var6 = (mm40) obj2;
                fet fetVar12 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, y5dVar4, mm40Var6);
                if ((iD3 & 6) == 0) {
                    i4 = iD3 | (fetVar12.g(y5dVar4) ? 4 : 2);
                } else {
                    i4 = iD3;
                }
                if ((iD3 & 48) == 0) {
                    i4 |= fetVar12.g(mm40Var6) ? 32 : 16;
                }
                if ((i4 & 147) != 146) {
                    z3 = true;
                }
                if (fetVar12.U(i4 & 1, z3)) {
                    kr00.a(u1c.M(-52595037, new bda(y5dVar4, mm40Var6, odaVar, function9, (byte) 0), fetVar12), fetVar12, 6);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 13:
                vka vkaVar = (vka) obj6;
                Function2 function10 = (Function2) obj5;
                mm40 mm40Var7 = (mm40) obj2;
                fet fetVar13 = (fet) obj3;
                int iD4 = dw9.d((Integer) obj4, (y5d) obj, mm40Var7);
                if ((iD4 & 48) == 0) {
                    iD4 |= fetVar13.g(mm40Var7) ? 32 : 16;
                }
                if (fetVar13.U(iD4 & 1, (iD4 & 145) != 144)) {
                    wpm0.a(mm40Var7, u1c.M(1819573167, new z1s(vkaVar, function10, b3), fetVar13), fetVar13, ((iD4 >> 3) & 14) | 48);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 14:
                wka wkaVar = (wka) obj6;
                Function2 function11 = (Function2) obj5;
                mm40 mm40Var8 = (mm40) obj2;
                fet fetVar14 = (fet) obj3;
                int iD5 = dw9.d((Integer) obj4, (y5d) obj, mm40Var8);
                if ((iD5 & 48) == 0) {
                    iD5 |= fetVar14.g(mm40Var8) ? 32 : 16;
                }
                if (fetVar14.U(iD5 & 1, (iD5 & 145) != 144)) {
                    dqm0.c(mm40Var8, u1c.M(2019354609, new z1s(wkaVar, function11, b2), fetVar14), fetVar14, ((iD5 >> 3) & 14) | 48);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 15:
                return a(obj, obj2, obj3, obj4);
            case 16:
                return b(obj, obj2, obj3, obj4);
            case 17:
                return c(obj, obj2, obj3, obj4);
            case 18:
                return g(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h(obj, obj2, obj3, obj4);
            case 20:
                return i(obj, obj2, obj3, obj4);
            case 21:
                return l(obj, obj2, obj3, obj4);
            case 22:
                return m(obj, obj2, obj3, obj4);
            case 23:
                return o(obj, obj2, obj3, obj4);
            case 24:
                return p(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return r(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return s(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return u(obj, obj2, obj3, obj4);
            default:
                final urr urrVar = (urr) obj6;
                final Function2 function12 = (Function2) obj5;
                y5d y5dVar5 = (y5d) obj;
                mm40 mm40Var9 = (mm40) obj2;
                fet fetVar15 = (fet) obj3;
                int iD6 = dw9.d((Integer) obj4, y5dVar5, mm40Var9);
                if ((iD6 & 6) == 0) {
                    i5 = iD6 | (fetVar15.g(y5dVar5) ? 4 : 2);
                } else {
                    i5 = iD6;
                }
                if ((iD6 & 48) == 0) {
                    i5 |= fetVar15.g(mm40Var9) ? 32 : 16;
                }
                if (fetVar15.U(i5 & 1, (i5 & 147) != 146)) {
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarE3 = o7k0.e(s5x0.L(mm40Var9, 8.0f, 0.0f, 2), 100.0f);
                    final byte b11 = false ? (byte) 1 : (byte) 0;
                    wzb.y(mm40VarE3, q3d.j(u1c.M(-314746968, new xdr() { // from class: a.err
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b12 = b11;
                            final Function2 function13 = function12;
                            final urr urrVar2 = urrVar;
                            Object[] objArr2 = 0;
                            final byte b13 = 1;
                            final mm40 mm40Var10 = (mm40) obj11;
                            fet fetVar16 = (fet) obj12;
                            int iIntValue15 = ((Integer) obj13).intValue();
                            switch (b12) {
                                case 0:
                                    mm40Var10.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar16.g(mm40Var10) ? 4 : 2;
                                    }
                                    if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        obc.d(eap.f7478a.a(fetVar16.k(bmd.n)), u1c.M(-1366332312, new Function2() { // from class: a.frr
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj14, Object obj15) {
                                                byte b14 = b13;
                                                urr urrVar3 = urrVar2;
                                                switch (b14) {
                                                    case 0:
                                                        fet fetVar17 = (fet) obj14;
                                                        int iIntValue16 = ((Integer) obj15).intValue();
                                                        if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.c, function13, fetVar17, 0, 0);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar18 = (fet) obj14;
                                                        int iIntValue17 = ((Integer) obj15).intValue();
                                                        if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.b, function13, fetVar18, 0, 0);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, 56);
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                                default:
                                    mm40Var10.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar16.g(mm40Var10) ? 4 : 2;
                                    }
                                    if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        l5d0 l5d0VarA17 = eap.f7478a.a(fetVar16.k(bmd.n));
                                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                        obc.d(l5d0VarA17, u1c.M(206369002, new Function2() { // from class: a.frr
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj14, Object obj15) {
                                                byte b14 = objArr3;
                                                urr urrVar3 = urrVar2;
                                                switch (b14) {
                                                    case 0:
                                                        fet fetVar17 = (fet) obj14;
                                                        int iIntValue16 = ((Integer) obj15).intValue();
                                                        if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.c, function13, fetVar17, 0, 0);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar18 = (fet) obj14;
                                                        int iIntValue17 = ((Integer) obj15).intValue();
                                                        if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.b, function13, fetVar18, 0, 0);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, 56);
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar15), u1c.M(471603689, new rgh(y5dVar5, urrVar, (byte) 19), fetVar15), u1c.M(1257954346, new xdr() { // from class: a.err
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // a.xdr
                        public final Object F(Object obj11, Object obj12, Object obj13) {
                            byte b12 = b4;
                            final Function2 function13 = function12;
                            final urr urrVar2 = urrVar;
                            Object[] objArr2 = 0;
                            final byte b13 = 1;
                            final mm40 mm40Var10 = (mm40) obj11;
                            fet fetVar16 = (fet) obj12;
                            int iIntValue15 = ((Integer) obj13).intValue();
                            switch (b12) {
                                case 0:
                                    mm40Var10.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar16.g(mm40Var10) ? 4 : 2;
                                    }
                                    if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        obc.d(eap.f7478a.a(fetVar16.k(bmd.n)), u1c.M(-1366332312, new Function2() { // from class: a.frr
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj14, Object obj15) {
                                                byte b14 = b13;
                                                urr urrVar3 = urrVar2;
                                                switch (b14) {
                                                    case 0:
                                                        fet fetVar17 = (fet) obj14;
                                                        int iIntValue16 = ((Integer) obj15).intValue();
                                                        if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.c, function13, fetVar17, 0, 0);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar18 = (fet) obj14;
                                                        int iIntValue17 = ((Integer) obj15).intValue();
                                                        if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.b, function13, fetVar18, 0, 0);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, 56);
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                                default:
                                    mm40Var10.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar16.g(mm40Var10) ? 4 : 2;
                                    }
                                    if (fetVar16.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        l5d0 l5d0VarA17 = eap.f7478a.a(fetVar16.k(bmd.n));
                                        final byte objArr3 = objArr2 == true ? 1 : 0;
                                        obc.d(l5d0VarA17, u1c.M(206369002, new Function2() { // from class: a.frr
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj14, Object obj15) {
                                                byte b14 = objArr3;
                                                urr urrVar3 = urrVar2;
                                                switch (b14) {
                                                    case 0:
                                                        fet fetVar17 = (fet) obj14;
                                                        int iIntValue16 = ((Integer) obj15).intValue();
                                                        if (fetVar17.U(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.c, function13, fetVar17, 0, 0);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        fet fetVar18 = (fet) obj14;
                                                        int iIntValue17 = ((Integer) obj15).intValue();
                                                        if (fetVar18.U(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                                                            icp0.a(mm40Var10, urrVar3.b, function13, fetVar18, 0, 0);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, 56);
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar15)), fetVar15);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ec30(Object obj, Object obj2, byte b) {
        this.f7548a = b;
        this.b = obj;
        this.c = obj2;
    }
}
