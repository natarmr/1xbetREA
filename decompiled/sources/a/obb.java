package a;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyberPoker;

/* JADX INFO: loaded from: classes6.dex */
public abstract class obb {
    public static final void A(mm40 mm40Var, p3w p3wVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        ugd ugdVarM;
        ugd ugdVarM2;
        function1.getClass();
        fetVar.g0(-537176397);
        int i4 = i2 & 1;
        byte b = 2;
        byte b2 = 4;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            int i5 = i3 & 896;
            int i6 = i3 & 112;
            boolean z = (i5 == 256) | (i6 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new gbd(function1, p3wVar, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var4, null, null, false, null, (Function0) objP, 28);
            Function2 function2 = null;
            if (p3wVar.g.isEmpty()) {
                fetVar.e0(31228403);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(26913420);
                ugdVarM = u1c.M(-1571141225, new c61(p3wVar, b2), fetVar);
                fetVar.r(false);
            }
            if (p3wVar.p) {
                fetVar.e0(31337740);
                ugdVarM2 = u1c.M(-1846923115, new c61(p3wVar, (byte) 5), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(31718761);
                fetVar.r(false);
                ugdVarM2 = mrv.g;
            }
            if (p3wVar.n) {
                fetVar.e0(31911023);
                boolean zG = fetVar.g(p3wVar.b + "FULL_CARD_AGGREGATOR_REMEMBER_Id");
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new ugd(404662050, true, new c61(p3wVar, (byte) 6));
                    fetVar.o0(objP2);
                }
                function2 = (Function2) objP2;
                fetVar.r(false);
            } else {
                fetVar.e0(32409875);
                fetVar.r(false);
            }
            z(mm40VarW, p3wVar, function1, u1c.M(1211561922, new mcd(p3wVar, function1, b), fetVar), ugdVarM2, ugdVarM, function2, fetVar, i5 | i6 | 3072);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) p3wVar, (Object) function1, i, i2, (byte) 27);
        }
    }

    public static final void B(String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-306829850);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 10.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = o7k0.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.b;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar2, i120.Q(mm40VarE, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarL2 = s5x0.L(jm40Var, 14.0f, 0.0f, 2);
            long j = qmk.o;
            v8q0.a(str, mm40VarL2, staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, j, null, j1t0.b, 0L, null, 0, 0, qmk.B, 16646109), fetVar, i2 & 14, 0, 131048);
            fetVar2 = fetVar;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qxw.o(fetVar2, i120.Q(o7k0.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), staticColors.m125getWhite100d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0g((Object) str, i, (byte) 4);
        }
    }

    public static final void C(mm40 mm40Var, String str, xdr xdrVar, fet fetVar, int i) {
        fetVar.g0(211080793);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.5f, jm40Var, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            mm40Var = jm40Var;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            e(0, 1, fetVar, null, ibm0.n(g1t0.g(), fetVar), rsm0.w(R.string.when_coef_changed, 0, fetVar));
            e((i2 << 3) & 896, 1, fetVar, null, ibm0.l(g1t0.a(), fetVar), str);
            fetVar.r(true);
            if (xdrVar == null) {
                fetVar.e0(-2074921704);
            } else {
                fetVar.e0(-898216951);
                xdrVar.F(zhg0Var, fetVar, 54);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, str, xdrVar, i, (byte) 21);
        }
    }

    public static final void D(mm40 mm40Var, h9n h9nVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1147558014);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(h9nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(h9nVar.f12686a, o2e.e0(o7k0.d(s5x0.L(jm40.b, 8.0f, 0.0f, 2), 1.0f), "GAME_LABEL_TEXT"), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, h9nVar, i, (byte) 25);
        }
    }

    public static final void E(mm40 mm40Var, i9n i9nVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-374358338);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(i9nVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f), "MENU_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            v8q0.a(null, o2e.e0(o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, true)), 1.0f), "DS_WEB_GAME_MENU_BOTTOM_TITLE"), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            mm40 mm40VarS = o7k0.s(o7k0.c(jm40Var, 1.0f), 36.0f);
            ymx ymxVar = ymx.INTERVAL_750;
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 6);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE1 = o2e.e0(phu0.F(mm40VarS, ymxVar, null, false, null, (Function0) objP, fetVar2, 25008, 4), "MENU_GAME_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), f1t0.b, fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, i9nVar, function0, i, (byte) 5);
        }
    }

    public static final void F(mm40 mm40Var, y1m y1mVar, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(871526126);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(y1mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(17990261);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(17991185);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1908235346, new cxj(mm40Var, y1mVar, (byte) 27), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 8, i, mm40Var, (Object) y1mVar, z);
        }
    }

    public static final void G(mm40 mm40Var, d2m d2mVar, x1m x1mVar, String str, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        float f;
        fetVar.g0(-241082932);
        int i2 = i | 6 | (fetVar.g(d2mVar) ? 32 : 16) | (fetVar.g(x1mVar) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            long jD = z ? cs0.D(fetVar, 247544145, fetVar, false) : rz4.c(fetVar, 247545079, fetVar, false);
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(8.0f);
            if (d2mVar.equals(c2m.f3631a)) {
                f = 32.0f;
            } else {
                if (!d2mVar.equals(b2m.f1858a)) {
                    t9f.b();
                    return;
                }
                f = 40.0f;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(i120.S(i120.Q(o7k0.n(jm40Var, f), x1mVar.f40128a, ugg0VarA), 1.0f, afn0.m(fetVar).getSeparator(), ugg0VarA), 2.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str, null, jD, new n05(qmk.p, o0(d2mVar).f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, o0(d2mVar), fetVar, (i2 >> 9) & 14, 24576, 113650);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, d2mVar, x1mVar, str, z, i);
        }
    }

    public static final void H(mm40 mm40Var, z1m z1mVar, fet fetVar, int i) {
        int i2;
        float f;
        y9q0 y9q0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1657208586);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(z1mVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            d2m d2mVar = z1mVar.f43628a;
            mm40 mm40VarS = o7k0.s(mm40Var, p0(d2mVar));
            c2m c2mVar = c2m.f3631a;
            boolean zEquals = d2mVar.equals(c2mVar);
            b2m b2mVar = b2m.f1858a;
            if (zEquals) {
                zcl zclVar = qmk.f28987a;
                f = 32.0f;
            } else if (!d2mVar.equals(b2mVar)) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 40.0f;
            }
            mm40 mm40VarE = o7k0.e(mm40VarS, f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            if (d2mVar.equals(c2mVar)) {
                y9q0Var = new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
            } else {
                if (!d2mVar.equals(b2mVar)) {
                    t9f.b();
                    return;
                }
                y9q0Var = new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109);
            }
            v8q0.a("VS", null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) z1mVar, i, (byte) 11);
        }
    }

    public static final Executor I(lne lneVar) {
        Executor executorX;
        bko bkoVar = lneVar instanceof bko ? (bko) lneVar : null;
        return (bkoVar == null || (executorX = bkoVar.x()) == null) ? new rvk(lneVar) : executorX;
    }

    public static final void J(EventCardMiddleCyberPoker eventCardMiddleCyberPoker, fus fusVar) {
        boolean z = fusVar.b;
        boolean z2 = fusVar.f10180a;
        l7n l7nVar = z ? l7n.f19567a : l7n.b;
        eventCardMiddleCyberPoker.setTimerVisibility(z2);
        eventCardMiddleCyberPoker.setHideAfterFinished(true);
        eventCardMiddleCyberPoker.setTimeDirection(l7nVar);
        eventCardMiddleCyberPoker.setTime(TimeUnit.SECONDS.toMillis(dtb.T(fusVar)));
        ebo eboVar = eventCardMiddleCyberPoker.q;
        if (z2) {
            eboVar.u.d();
            return;
        }
        DsTimer dsTimer = eboVar.u;
        dsTimer.l = false;
        dsTimer.g.removeCallbacks(dsTimer.w);
    }

    public static v9d K(v9d v9dVar, int i, char c, int i2) {
        int[] iArr = v9dVar.f37030a;
        int length = iArr.length;
        int i3 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
        char[] cArrCopyOf = Arrays.copyOf(v9dVar.b, i3);
        boolean[] zArrCopyOf = Arrays.copyOf(v9dVar.c, i3);
        iArrCopyOf[length] = v9dVar.e() + i;
        cArrCopyOf[length] = c;
        zArrCopyOf[length] = true;
        return new v9d(iArrCopyOf, cArrCopyOf, zArrCopyOf, i2);
    }

    public static cr30 L(String str, Iterable iterable) {
        br30 br30Var;
        iterable.getClass();
        mbk0 mbk0Var = new mbk0();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            br30Var = br30.b;
            if (!zHasNext) {
                break;
            }
            cr30 cr30Var = (cr30) it.next();
            if (cr30Var != br30Var) {
                if (cr30Var instanceof pbb) {
                    w3d.v(mbk0Var, ((pbb) cr30Var).c);
                } else {
                    mbk0Var.add(cr30Var);
                }
            }
        }
        int i = mbk0Var.f21514a;
        if (i != 0) {
            return i != 1 ? new pbb(str, (cr30[]) mbk0Var.toArray(new cr30[0])) : (cr30) mbk0Var.get(0);
        }
        return br30Var;
    }

    public static c8z M(kp9 kp9Var, wsy wsyVar, g950 g950Var, g93 g93Var, int i) {
        if (kp9Var == null) {
            a(32);
            throw null;
        }
        if (g93Var == null) {
            a(33);
            throw null;
        }
        if (wsyVar == null) {
            return null;
        }
        mje mjeVar = new mje(kp9Var, wsyVar, g950Var);
        Regex regex = j950.f16120a;
        return new c8z(kp9Var, mjeVar, g93Var, g950.e(j950.b + '_' + i));
    }

    public static g0d0 N(d0d0 d0d0Var, g93 g93Var) {
        if (d0d0Var != null) {
            return T(d0d0Var, g93Var, true, d0d0Var.b());
        }
        a(13);
        throw null;
    }

    public static n0d0 O(d0d0 d0d0Var, g93 g93Var) {
        f93 f93Var = ujn.c;
        if (d0d0Var == null) {
            a(0);
            throw null;
        }
        gmk0 gmk0VarB = d0d0Var.b();
        if (gmk0VarB != null) {
            return U(d0d0Var, g93Var, f93Var, true, d0d0Var.getVisibility(), gmk0VarB);
        }
        a(6);
        throw null;
    }

    public static f0d0 P(wm40 wm40Var) {
        if (wm40Var == null) {
            a(26);
            throw null;
        }
        ym40 ym40VarC = oek.c(wm40Var);
        ym40VarC.getClass();
        wm40 wm40VarV = V(ym40VarC, e4m0.B);
        if (wm40VarV == null) {
            return null;
        }
        f93 f93Var = ujn.c;
        gm40 gm40Var = gm40.b;
        tek tekVar = uek.e;
        f0d0 f0d0VarQ1 = f0d0.q1(wm40Var, gm40Var, tekVar, false, j4m0.b, 4, wm40Var.b());
        g0d0 g0d0Var = new g0d0(f0d0VarQ1, f93Var, gm40Var, tekVar, false, false, false, 4, null, wm40Var.b());
        f0d0VarQ1.t1(g0d0Var, null, null, null);
        ays0.b.getClass();
        ays0 ays0Var = ays0.c;
        iys0 iys0VarH = wm40VarV.h();
        List listSingletonList = Collections.singletonList(new q4m0(wm40Var.I()));
        ays0Var.getClass();
        iys0VarH.getClass();
        listSingletonList.getClass();
        kzj0 kzj0VarG0 = ucx.g0(ays0Var, iys0VarH, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        f0d0VarQ1.w1(kzj0VarG0, list, null, null, list);
        g0d0Var.s1(f0d0VarQ1.getReturnType());
        return f0d0VarQ1;
    }

    public static fyj0 Q(wm40 wm40Var) {
        if (wm40Var == null) {
            a(24);
            throw null;
        }
        f93 f93Var = ujn.c;
        fyj0 fyj0VarZ1 = fyj0.z1(wm40Var, j4m0.c, 4, wm40Var.b());
        g950 g950VarE = g950.e("value");
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(wm40Var);
        ym40VarC.getClass();
        k3u0 k3u0Var = new k3u0(fyj0VarZ1, null, 0, f93Var, g950VarE, ym40VarC.c().v(), false, false, false, null, wm40Var.b());
        List list = Collections.EMPTY_LIST;
        return fyj0VarZ1.t1(null, null, list, list, Collections.singletonList(k3u0Var), wm40Var.I(), gm40.b, uek.e);
    }

    public static fyj0 R(wm40 wm40Var) {
        if (wm40Var == null) {
            a(22);
            throw null;
        }
        fyj0 fyj0VarZ1 = fyj0.z1(wm40Var, j4m0.f15892a, 4, wm40Var.b());
        List list = Collections.EMPTY_LIST;
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(wm40Var);
        ym40VarC.getClass();
        ary aryVarC = ym40VarC.c();
        t3u0 t3u0Var = t3u0.c;
        return fyj0VarZ1.t1(null, null, list, list, list, aryVarC.h(wm40Var.I()), gm40.b, uek.e);
    }

    public static c8z S(kp9 kp9Var, wsy wsyVar, g93 g93Var) {
        if (wsyVar == null) {
            return null;
        }
        return new c8z(kp9Var, new lso(kp9Var, wsyVar), g93Var);
    }

    public static g0d0 T(d0d0 d0d0Var, g93 g93Var, boolean z, gmk0 gmk0Var) {
        if (d0d0Var == null) {
            a(17);
            throw null;
        }
        if (g93Var == null) {
            a(18);
            throw null;
        }
        if (gmk0Var != null) {
            return new g0d0(d0d0Var, g93Var, d0d0Var.m(), d0d0Var.getVisibility(), z, false, false, 1, null, gmk0Var);
        }
        a(19);
        throw null;
    }

    public static n0d0 U(d0d0 d0d0Var, g93 g93Var, g93 g93Var2, boolean z, tek tekVar, gmk0 gmk0Var) {
        if (d0d0Var == null) {
            a(7);
            throw null;
        }
        if (g93Var == null) {
            a(8);
            throw null;
        }
        if (g93Var2 == null) {
            a(9);
            throw null;
        }
        if (tekVar == null) {
            a(10);
            throw null;
        }
        if (gmk0Var == null) {
            a(11);
            throw null;
        }
        n0d0 n0d0Var = new n0d0(d0d0Var, g93Var, d0d0Var.m(), tekVar, z, false, false, 1, null, gmk0Var);
        n0d0Var.n = n0d0.r1(n0d0Var, d0d0Var.getType(), g93Var2);
        return n0d0Var;
    }

    public static final wm40 V(ym40 ym40Var, qlc qlcVar) {
        ym40Var.getClass();
        qlcVar.getClass();
        foc focVarW = W(ym40Var, qlcVar);
        if (focVarW instanceof wm40) {
            return (wm40) focVarW;
        }
        return null;
    }

    public static final foc W(ym40 ym40Var, qlc qlcVar) {
        ym40Var.getClass();
        qlcVar.getClass();
        if (ym40Var.h0(hsf0.f13580a) != null) {
            hny.b();
            return null;
        }
        gdz gdzVarC0 = ym40Var.c0(qlcVar.f28927a);
        twq twqVar = qlcVar.b.f32934a;
        twqVar.getClass();
        List listF = twq.f(twqVar);
        foc focVarD = gdzVarC0.h.d((g950) CollectionsKt.U(listF), ux50.g);
        if (focVarD != null) {
            for (g950 g950Var : listF.subList(1, listF.size())) {
                if (focVarD instanceof wm40) {
                    foc focVarD2 = ((wm40) focVarD).j0().d(g950Var, ux50.g);
                    focVarD = focVarD2 instanceof wm40 ? (wm40) focVarD2 : null;
                    if (focVarD != null) {
                    }
                }
            }
            return focVarD;
        }
        return null;
    }

    public static final wm40 X(ym40 ym40Var, qlc qlcVar, n660 n660Var) {
        ym40Var.getClass();
        qlcVar.getClass();
        n660Var.getClass();
        wm40 wm40VarV = V(ym40Var, qlcVar);
        return wm40VarV != null ? wm40VarV : n660Var.m(qlcVar, pgi0.t(pgi0.p(lgi0.e(wcq.b, qlcVar), ske.A)));
    }

    public static final lne Y(Executor executor) {
        lne lneVar;
        rvk rvkVar = executor instanceof rvk ? (rvk) executor : null;
        return (rvkVar == null || (lneVar = rvkVar.f31172a) == null) ? new cko(executor) : lneVar;
    }

    public static DsAccordion Z(Context context, dc dcVar) {
        int i;
        context.getClass();
        dcVar.getClass();
        int iOrdinal = dcVar.ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_DSAccordion_Primary;
        } else if (iOrdinal == 1) {
            i = R.style.Widget_DSAccordion_Secondary;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i = R.style.Widget_DSAccordion_Clear;
        }
        return new DsAccordion(new tje(context, i), null, 6, 0);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 12:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = Payload.SOURCE;
                break;
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "enumClass";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[0] = "descriptor";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void b(mm40 mm40Var, f9n f9nVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        f9n f9nVar2 = f9nVar;
        fetVar.g0(1502979038);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(f9nVar2) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            v8q0.a("Label", o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, true)), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            mm40 mm40VarS = o7k0.s(o7k0.c(jm40Var, 1.0f), 36.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 7);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarS, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            f9nVar2 = f9nVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1793929608, new zuh(f9nVar2), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, f9nVar2, function0, i, (byte) 6);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-438970417);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarQ, 8.0f);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new e6c((byte) 11);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarJ, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 366);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 13);
        }
    }

    public static final float c0(cwk cwkVar) {
        cwkVar.getClass();
        t9o0 t9o0Var = (t9o0) ((hgk0) cwkVar.b()).getValue();
        return ((ycl) idd.d(new ycl(t9o0Var.b), new ycl(t9o0Var.f))).f42389a;
    }

    public static final void d(mm40 mm40Var, pxe pxeVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-101138988);
        int i2 = i | 6 | (fetVar.g(pxeVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            e(0, 0, fetVar, new x7z(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), rsm0.w(R.string.coefficient_with_dots_new, 0, fetVar));
            qxw.o(fetVar, o7k0.s(mm40Var2, 6.0f));
            mm40 mm40VarE = o7k0.e(mm40Var2, 24.0f);
            if (0.5f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            g(mm40VarE.e(new x7z(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true)), pxeVar, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var2, pxeVar, i, (byte) 11);
        }
    }

    public static final float d0(cwk cwkVar) {
        cwkVar.getClass();
        t9o0 t9o0Var = (t9o0) ((hgk0) cwkVar.b()).getValue();
        return ((ycl) idd.d(new ycl(t9o0Var.c), new ycl(t9o0Var.g))).f42389a;
    }

    public static final void e(int i, int i2, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, String str) {
        int i3;
        y9q0 y9q0Var2;
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-626321707);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            y9q0Var2 = y9q0Var;
            i3 |= fetVar.g(y9q0Var2) ? 32 : 16;
        } else {
            y9q0Var2 = y9q0Var;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            v8q0.a(str2, mm40Var3, 0L, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0Var2, fetVar, ((i3 >> 6) & 14) | ((i3 << 3) & 112), ((i3 << 18) & 29360128) | 24960, 109556);
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var2, (Object) y9q0Var, (Object) str, i, i2, (byte) 7);
        }
    }

    public static final float e0(cwk cwkVar) {
        cwkVar.getClass();
        t9o0 t9o0Var = (t9o0) ((hgk0) cwkVar.b()).getValue();
        return ((ycl) idd.d(new ycl(t9o0Var.d), new ycl(t9o0Var.h))).f42389a;
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1737500431);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 72.0f, 18.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 9);
        }
    }

    public static final float f0(cwk cwkVar) {
        cwkVar.getClass();
        t9o0 t9o0Var = (t9o0) ((hgk0) cwkVar.b()).getValue();
        return ((ycl) idd.d(new ycl(t9o0Var.f33576a), new ycl(t9o0Var.e))).f42389a;
    }

    public static final void g(mm40 mm40Var, pxe pxeVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(261418639);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(pxeVar) : fetVar.i(pxeVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            if (pxeVar instanceof lxe) {
                j43 j43Var = ((lxe) pxeVar).f20811a;
                boolean z = j43Var.d;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(313783117);
                    f(0, fetVar, jr8.f16991a.b(jm40Var, gqw0.c));
                    fetVar.r(false);
                    fetVar2 = fetVar;
                } else {
                    fetVar.e0(313894841);
                    fetVar2 = fetVar;
                    plc.d(o7k0.y(jm40Var, null, 3), j43Var, new exe(), fetVar2, 6, 0);
                    fetVar2.r(false);
                }
            } else {
                fetVar2 = fetVar;
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, pxeVar, i, (byte) 11);
        }
    }

    public static short g0(short s) {
        if (s >= 0) {
            return s;
        }
        if (s == Short.MIN_VALUE) {
            return Short.MAX_VALUE;
        }
        return (short) (-s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void h(int i, int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i3;
        fet fetVar2;
        int i4 = i;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        fetVar3.g0(1828687975);
        int i5 = i2 | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar3.e(i4) ? 256 : 128);
        boolean z = false;
        boolean z2 = 1;
        if (fetVar3.U(i5 & 1, (i5 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 248.0f);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            int i6 = i5;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
            Iterator itO = h97.o(fetVar3, mm40VarC0, shdVar, 458080422, a4xVar);
            fet fetVar4 = fetVar3;
            while (itO.hasNext()) {
                xoh xohVar = (xoh) itO.next();
                x7z x7zVar = new x7z(1.0f, z2);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(x7zVar, 0.0f, 8.0f, z2);
                x5d x5dVarA2 = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar4, 0);
                int iHashCode2 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM2 = fetVar4.m();
                mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarL);
                mkd.c0.getClass();
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function0);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, x5dVarA2, shdVar4);
                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
                jpm0.o(fetVar4, mm40VarC1, shdVar);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 44.0f);
                x5d x5dVarA3 = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar4, 0);
                int iHashCode3 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM3 = fetVar4.m();
                mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarE2);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function0);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, x5dVarA3, shdVar4);
                jpm0.o(fetVar4, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar4, shdVar2, fetVar4);
                jpm0.o(fetVar4, mm40VarC2, shdVar);
                shd shdVar5 = shdVar4;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                shd shdVar6 = shdVar3;
                String str = xohVar.b;
                long j = iph.f;
                Function0 function1 = function0;
                androidx.compose.runtime.d dVar = j1t0.e;
                ((g1t0) fetVar4.k(dVar)).getClass();
                shd shdVar7 = shdVar;
                int i7 = ((i6 >> 6) & 14) | 24960;
                shd shdVar8 = shdVar2;
                v8q0.a(str, mm40VarD, j, null, 0L, null, null, null, 0L, new f2q0(i4), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, i7, 109560);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                String str2 = xohVar.c;
                long j2 = iph.g;
                ((g1t0) fetVar.k(dVar)).getClass();
                v8q0.a(str2, mm40VarD2, j2, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 48, i7, 109560);
                fet fetVar5 = fetVar;
                fetVar5.r(true);
                mbc.o(wfi0.f39073a, null, false, fetVar5, 6, 6);
                fetVar5.r(true);
                z2 = 1;
                i4 = i;
                shdVar = shdVar7;
                i6 = i6;
                xx7Var = xx7Var;
                shdVar4 = shdVar5;
                shdVar2 = shdVar8;
                function0 = function1;
                shdVar3 = shdVar6;
                z = false;
                fetVar4 = fetVar5;
            }
            i3 = i4;
            fetVar4.r(z);
            fetVar4.r(z2);
            fetVar2 = fetVar4;
        } else {
            i3 = i4;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iqh(mm40Var, a4xVar, i3, i2, (byte) 0);
        }
    }

    public static int h0(int i, int i2) {
        if (i <= 0) {
            if (i2 >= 0) {
                return i + i2;
            }
            long j = (-(i + 1)) + (-(i2 + 1));
            if (j >= 2147483647L) {
                return Integer.MIN_VALUE;
            }
            return (-((int) j)) - 2;
        }
        if (i2 <= 0) {
            return i + i2;
        }
        long j2 = ((long) i) + ((long) i2);
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    public static final void i(final cye cyeVar, xdr xdrVar, fet fetVar, final int i) {
        int i2;
        final xdr xdrVar2;
        boolean z = cyeVar.c;
        i680 i680Var = cyeVar.e;
        pxe pxeVar = cyeVar.f5168a;
        fetVar.g0(-405520056);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cyeVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            final ugd ugdVarM = u1c.M(1031033083, new xdr() { // from class: a.qxe
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    cye cyeVar2 = cyeVar;
                    switch (b3) {
                        case 0:
                            i680 i680Var2 = cyeVar2.e;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (!fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                fetVar2.X();
                            } else if (i680Var2 == null) {
                                fetVar2.e0(-1314648917);
                                String str = cyeVar2.d;
                                if (str == null) {
                                    fetVar2.e0(-2099410762);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(-2099410761);
                                    if (cyeVar2.c || (!(cyeVar2.f5168a instanceof jxe) && i680Var2 == null)) {
                                        fetVar2.e0(-601465603);
                                        zcl zclVar = qmk.f28987a;
                                        wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
                                    } else {
                                        fetVar2.e0(-1465516457);
                                    }
                                    fetVar2.r(false);
                                    j47.K(0, 1, fetVar2, null, str);
                                    zcl zclVar2 = qmk.f28987a;
                                    wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(-2099108697);
                                fetVar2.r(false);
                            }
                            break;
                        default:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= fetVar3.g(yhg0Var) ? 4 : 2;
                            }
                            if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                fetVar3.X();
                            } else if (cyeVar2.e == null) {
                                fetVar3.e0(1628400539);
                                zcl zclVar3 = qmk.f28987a;
                                obb.g(yhg0Var.a(0.5f, o7k0.e(jm40.b, 24.0f), true), cyeVar2.f5168a, fetVar3, 0);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(1628757070);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            if (!z && (((pxeVar instanceof jxe) || i680Var != null) && cyeVar.d == null && i680Var == null)) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.rxe
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            int i5 = i;
                            xdr xdrVar3 = ugdVarM;
                            cye cyeVar2 = cyeVar;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    obb.i(cyeVar2, xdrVar3, fetVar2, x8x.L(i5 | 1));
                                    break;
                                default:
                                    obb.i(cyeVar2, xdrVar3, fetVar2, x8x.L(i5 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
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
            wvb.o(null, 20.0f, 0L, fetVar, 0, 5);
            if (z) {
                fetVar.e0(1201123496);
                C(null, cyeVar.b, u1c.M(-1580480620, new xdr() { // from class: a.qxe
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b2;
                        cye cyeVar2 = cyeVar;
                        switch (b3) {
                            case 0:
                                i680 i680Var2 = cyeVar2.e;
                                fet fetVar2 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((y5d) obj).getClass();
                                if (!fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    fetVar2.X();
                                } else if (i680Var2 == null) {
                                    fetVar2.e0(-1314648917);
                                    String str = cyeVar2.d;
                                    if (str == null) {
                                        fetVar2.e0(-2099410762);
                                        fetVar2.r(false);
                                    } else {
                                        fetVar2.e0(-2099410761);
                                        if (cyeVar2.c || (!(cyeVar2.f5168a instanceof jxe) && i680Var2 == null)) {
                                            fetVar2.e0(-601465603);
                                            zcl zclVar2 = qmk.f28987a;
                                            wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
                                        } else {
                                            fetVar2.e0(-1465516457);
                                        }
                                        fetVar2.r(false);
                                        j47.K(0, 1, fetVar2, null, str);
                                        zcl zclVar3 = qmk.f28987a;
                                        wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
                                        fetVar2.r(false);
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(-2099108697);
                                    fetVar2.r(false);
                                }
                                break;
                            default:
                                yhg0 yhg0Var = (yhg0) obj;
                                fet fetVar3 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                yhg0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= fetVar3.g(yhg0Var) ? 4 : 2;
                                }
                                if (!fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    fetVar3.X();
                                } else if (cyeVar2.e == null) {
                                    fetVar3.e0(1628400539);
                                    zcl zclVar4 = qmk.f28987a;
                                    obb.g(yhg0Var.a(0.5f, o7k0.e(jm40.b, 24.0f), true), cyeVar2.f5168a, fetVar3, 0);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(1628757070);
                                    fetVar3.r(false);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 384);
                fetVar.r(false);
            } else if ((pxeVar instanceof jxe) || i680Var != null) {
                fetVar.e0(1201949956);
                fetVar.r(false);
            } else {
                fetVar.e0(1201790120);
                d(null, pxeVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.e0(-1208152662);
            xdrVar2 = ugdVarM;
            xdrVar2.F(y5d.f42040a, fetVar, Integer.valueOf(((i4 >> 3) & 112) | 6));
            fetVar.r(false);
            if (i680Var == null) {
                fetVar.e0(-1208150416);
                wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            } else {
                fetVar.e0(1202090820);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2() { // from class: a.rxe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i5 = i;
                    xdr xdrVar3 = xdrVar2;
                    cye cyeVar2 = cyeVar;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            obb.i(cyeVar2, xdrVar3, fetVar2, x8x.L(i5 | 1));
                            break;
                        default:
                            obb.i(cyeVar2, xdrVar3, fetVar2, x8x.L(i5 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static short i0(short s, short s2) {
        if (s == Short.MIN_VALUE && s2 == Short.MIN_VALUE) {
            return Short.MAX_VALUE;
        }
        return k0(((s * s2) + 16384) >> 15);
    }

    public static final void j(mm40 mm40Var, k2r0 k2r0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        k2r0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-553912135);
        byte b = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(k2r0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            a4x a4xVar = k2r0Var.f17589a;
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new omf(function1, (byte) 12);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new omf(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new omf(function1, (byte) 14);
                fetVar.o0(objP3);
            }
            Function1 function4 = (Function1) objP3;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new omf(function1, (byte) 15);
                fetVar.o0(objP4);
            }
            Function1 function5 = (Function1) objP4;
            boolean z5 = i3 == 2048;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new omf(function1, b);
                fetVar.o0(objP5);
            }
            feb.m(mm40Var, a4xVar, xczVar, function2, function3, function4, function5, (Function1) objP5, fetVar, i2 & 910, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 19, i, (Object) mm40Var, (Object) k2r0Var, (Object) xczVar, (Object) function1);
        }
    }

    public static int j0(int i) {
        if (i == 0) {
            jf4.o("Failed requirement.");
            return 0;
        }
        if (i < 0) {
            if (i <= -1073741824) {
                return 0;
            }
            i = ~i;
        }
        int i2 = (-65536) & i;
        short[] sArr = oiv.g;
        if (i2 != 0) {
            return ((-16777216) & i) != 0 ? sArr[(i >> 24) & 255] - 1 : sArr[(i >> 16) & 255] + 7;
        }
        return (65280 & i) != 0 ? sArr[(i >> 8) & 255] + 15 : sArr[i & 255] + 23;
    }

    public static final void k(mm40 mm40Var, k7h k7hVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        k7hVar.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(-1684725282);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(k7hVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Iterator it = k7hVar.f17819a.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((h7h) it.next()).f12573a == k7hVar.c) {
                    break;
                } else {
                    i3++;
                }
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            zdx.f(o7k0.e(mm40VarD, 40.0f), u1c.M(1458965009, new rgh(k7hVar, function0, b), fetVar), u1c.M(974019760, new y26(i3, (Object) k7hVar, (Object) function1, (byte) 3), fetVar), jiq0.c, fetVar2, 3504);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var, (Object) k7hVar, function1, (wdr) function0, i, (byte) 22);
        }
    }

    public static short k0(int i) {
        if (i < -32768) {
            return Short.MIN_VALUE;
        }
        if (i > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) i;
    }

    public static final void l(final mqh mqhVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        mqhVar.getClass();
        fetVar.g0(-366912537);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mqhVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (mqhVar.f22224a.isEmpty() && mqhVar.b.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.hqh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    obb.l(mqhVar, fetVar2, x8x.L(i | 1));
                                    break;
                                default:
                                    obb.l(mqhVar, fetVar2, x8x.L(i | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                fetVar.k(bmd.n);
                k6z k6zVar = k6z.f17794a;
                kr00.a(u1c.M(431515748, new yfg(mqhVar), fetVar), fetVar, 6);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.hqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            obb.l(mqhVar, fetVar2, x8x.L(i | 1));
                            break;
                        default:
                            obb.l(mqhVar, fetVar2, x8x.L(i | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final pl5 l0(trt trtVar) {
        Long l = trtVar.f34433a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = trtVar.f;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l2.longValue();
        Double d = trtVar.g;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = trtVar.b;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Integer num = trtVar.c;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = trtVar.d;
        return new pl5(jLongValue, jLongValue2, dDoubleValue, dDoubleValue2, iIntValue, num2 != null ? num2.intValue() : 0);
    }

    public static final void m(mm40 mm40Var, trl trlVar, fet fetVar, int i) {
        int i2;
        trlVar.getClass();
        fetVar.g0(-2056978790);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(trlVar) ? 32 : 16;
        }
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (trlVar instanceof rrl) {
            fetVar.e0(1138503616);
            rrl rrlVar = (rrl) trlVar;
            xrl xrlVar = rrlVar.d;
            if (xrlVar.equals(url.f36169a)) {
                fetVar.e0(1138573924);
                n(mm40Var, rrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (xrlVar.equals(vrl.f37904a)) {
                fetVar.e0(1138837827);
                o(mm40Var, rrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(xrlVar instanceof wrl)) {
                    throw b1j.f(-1071652734, fetVar, false);
                }
                fetVar.e0(1139106690);
                p(mm40Var, rrlVar, fetVar, i2 & 126);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            if (!trlVar.equals(srl.f32682a)) {
                throw b1j.f(-1071655251, fetVar, false);
            }
            fetVar.e0(1139389286);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new orl(mm40Var, trlVar, i, b);
        }
    }

    public static final HistoryDateFilterTypeModel m0(wdj wdjVar) {
        if (wdjVar instanceof tdj) {
            return HistoryDateFilterTypeModel.f46397a;
        }
        if (wdjVar.equals(udj.f35481a)) {
            return HistoryDateFilterTypeModel.b;
        }
        if (wdjVar instanceof vdj) {
            return HistoryDateFilterTypeModel.c;
        }
        t9f.b();
        return null;
    }

    public static final void n(mm40 mm40Var, rrl rrlVar, fet fetVar, int i) {
        int i2;
        rrl rrlVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(403234986);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rrlVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.s(piz.R(o7k0.n(jm40Var, 32.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), 6.0f), 24.0f), yx7Var, false, 2);
            String strL = ttm0.L(3, rrlVar.f30990a);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long j = qmk.q;
            long j2 = qmk.r;
            float f = 1.0f;
            v8q0.a(strL, mm40VarW, textPrimary, gfk0.b(j, j2), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarM, fetVar, 0, 24576, 113648);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            mm40 mm40VarE2 = new x7z(f, true).e(new ecu0(yx7Var));
            String str = rrlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            rrlVar2 = rrlVar;
            v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(j, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            dww.a(a8k0.F(R.drawable.ic_status_gray_waiting_circle, 0, fetVar2), null, twn.l(yx7Var, o7k0.n(jm40Var, 24.0f)), fetVar2, 440, 0);
            fetVar2.r(true);
        } else {
            rrlVar2 = rrlVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i, (byte) 2);
        }
    }

    public static final gfa0 n0(sjf sjfVar, hjf hjfVar, ctf0 ctf0Var) {
        String strA;
        ctf0Var.getClass();
        String str = sjfVar.b;
        String str2 = sjfVar.d;
        int i = hjfVar.b;
        if (i > 0) {
            strA = ctf0Var.b.a(R.string.cs2_team_world_rating_v2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        } else {
            strA = "";
        }
        return new gfa0(str, str2, strA);
    }

    public static final void o(mm40 mm40Var, rrl rrlVar, fet fetVar, int i) {
        int i2;
        byte b;
        rrl rrlVar2 = rrlVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(96433435);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rrlVar2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(piz.R(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = o7k0.n(jm40Var, 32.0f);
            zfn zfnVar2 = m8m0.f21378a;
            mm40 mm40VarW = o7k0.w(o7k0.s(piz.R(mm40VarN2, ((StaticColors) fetVar2.k(zfnVar2)).m98getGreen0d7_KjU(), 6.0f), 24.0f), yx7Var, false, 2);
            String strL = ttm0.L(3, rrlVar2.f30990a);
            zfn zfnVar3 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar3)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU();
            long j = qmk.q;
            long j2 = qmk.r;
            v8q0.a(strL, mm40VarW, jM123getWhite0d7_KjU, gfk0.b(j, j2), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarM, fetVar, 0, 24576, 113648);
            mm40 mm40VarE2 = new x7z(1.0f, true).e(new ecu0(yx7Var));
            rrlVar2 = rrlVar;
            String str = rrlVar2.b;
            ((g1t0) fetVar.k(zfnVar3)).getClass();
            v8q0.a(str, mm40VarE2, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), gfk0.b(j, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            mm40 mm40VarN3 = o7k0.n(jm40Var, 24.0f);
            b = 0;
            dww.c(a8k0.F(R.drawable.ic_glyph_checkmark, 0, fetVar2), null, mm40VarN3, ((StaticColors) fetVar2.k(zfnVar2)).m98getGreen0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i, b);
        }
    }

    public static final y9q0 o0(d2m d2mVar) {
        if (d2mVar.equals(c2m.f3631a)) {
            return new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109);
        }
        if (d2mVar.equals(b2m.f1858a)) {
            return new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109);
        }
        t9f.b();
        return null;
    }

    public static final void p(mm40 mm40Var, rrl rrlVar, fet fetVar, int i) {
        int i2;
        rrl rrlVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1409390396);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rrlVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(piz.R(o7k0.e(mm40VarD, 60.0f), afn0.m(fetVar2).getBackgroundContent(), 16.0f), 12.0f, 0.0f, 16.0f, 0.0f, 10);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.s(piz.R(o7k0.n(jm40Var, 32.0f), afn0.m(fetVar2).getPrimary(), 6.0f), 24.0f), yx7Var, false, 2);
            String strL = ttm0.L(3, rrlVar.f30990a);
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long jM123getWhite0d7_KjU = afn0.p(fetVar2).m123getWhite0d7_KjU();
            long j = qmk.q;
            long j2 = qmk.r;
            float f = 1.0f;
            v8q0.a(strL, mm40VarW, jM123getWhite0d7_KjU, gfk0.b(j, j2), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarL, fetVar, 0, 24576, 113648);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            mm40 mm40VarE = new x7z(f, true).e(new ecu0(yx7Var));
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            rrlVar2 = rrlVar;
            String str = rrlVar2.b;
            afn0.v(fetVar).getClass();
            v8q0.a(str, null, afn0.m(fetVar).getTextPrimary(), gfk0.b(j, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.l(), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            String str2 = rrlVar2.c;
            if (str2 == null || str2.length() == 0) {
                fetVar2.e0(-1950647304);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1951109979);
                String str3 = rrlVar2.c;
                afn0.v(fetVar2).getClass();
                v8q0.a(str3, null, afn0.m(fetVar2).getSecondary(), gfk0.b(qmk.p, j), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            dww.a(a8k0.F(R.drawable.ic_status_primary_waiting_circle, 0, fetVar2), null, twn.l(yx7Var, o7k0.n(jm40Var, 24.0f)), fetVar2, 440, 0);
            fetVar2.r(true);
        } else {
            rrlVar2 = rrlVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new prl(mm40Var, rrlVar2, i, b);
        }
    }

    public static final float p0(d2m d2mVar) {
        if (d2mVar.equals(c2m.f3631a)) {
            zcl zclVar = qmk.f28987a;
            return 80.0f;
        }
        if (d2mVar.equals(b2m.f1858a)) {
            zcl zclVar2 = qmk.f28987a;
            return 96.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final void q(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i, int i2) {
        int i3;
        a2mVar.getClass();
        fetVar.g0(-1810577586);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(a2mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (a2mVar instanceof y1m) {
                fetVar.e0(1577594730);
                F(mm40Var, (y1m) a2mVar, z, fetVar, i3 & 1022);
                fetVar.r(false);
            } else {
                if (!(a2mVar instanceof z1m)) {
                    throw b1j.f(-503301113, fetVar, false);
                }
                fetVar.e0(1577790774);
                H(mm40Var, (z1m) a2mVar, fetVar, i3 & 126);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5(mm40Var2, (Object) a2mVar, z, i, i2, (byte) 2);
        }
    }

    public static final void r(mm40 mm40Var, String str, long j, qol qolVar, Integer num, tol tolVar, Function0 function0, fet fetVar, int i) {
        int i2;
        float f;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(84386925);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar2.g(qolVar) : fetVar2.i(qolVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.e(tolVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 34.0f), "DATE_CONTAINER_ROW");
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            int i3 = i2;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (num != null) {
                fetVar2.e0(378589172);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarJ = lgb.J(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 26.0f), vgg0.a(6.0f));
                zfn zfnVar = zaq0.b;
                mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                f = 1.0f;
                z = true;
                dww.c(a8k0.F(num.intValue(), (i3 >> 12) & 14, fetVar2), null, o2e.e0(o7k0.n(jm40Var, 16.0f), "ICON_DATE"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                f = 1.0f;
                z = true;
                fetVar2.e0(379274365);
                fetVar2.r(false);
            }
            if (f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE1 = o2e.e0(s5x0.N(new x7z(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, z), 0.0f, 0.0f, 12.0f, 0.0f, 11), "NAME_DATE_CONTAINER");
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            aad.e(str, mm40VarE1, y9q0.a(g1t0.n(), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, true, 2, 0, null, new n05(qmk.q, qmk.r, qmk.n), fetVar, ((i3 >> 3) & 14) | 1794048, 392);
            fetVar2 = fetVar;
            fetVar2.r(z);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1382410697, new ds8(j, qolVar, tolVar, function0), fetVar2), fetVar2, 56);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jc9(mm40Var, str, j, qolVar, num, tolVar, function0, i);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1499329440);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 124.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 15);
        }
    }

    public static final void t(mm40 mm40Var, hym hymVar, fet fetVar, int i) {
        if (hymVar instanceof cym) {
            fetVar.e0(1656804508);
            tdc.l(mm40Var, (cym) hymVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (hymVar instanceof dym) {
            fetVar.e0(1656996801);
            ieb.r(mm40Var, (dym) hymVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (hymVar instanceof eym) {
            fetVar.e0(1657184289);
            jeb.t(mm40Var, (eym) hymVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (hymVar instanceof fym) {
            fetVar.e0(1657371777);
            bfb.s(mm40Var, (fym) hymVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(hymVar instanceof gym)) {
                throw b1j.f(-639292824, fetVar, false);
            }
            fetVar.e0(1657559265);
            lgb.m(mm40Var, (gym) hymVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void u(mm40 mm40Var, v0g0 v0g0Var, boolean z, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        float f;
        v0g0Var.getClass();
        function1.getClass();
        fetVar.g0(-1011321093);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(v0g0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (v0g0Var instanceof q0g0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, v0g0Var, (byte) 14);
                fetVar.o0(objP);
            }
            a8k0.n(y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28), f2, 0L, null, ay3.h, u1c.M(1049328187, new jv1((Object) v0g0Var, z, (byte) 18), fetVar), ay3.i, fetVar, 1797120, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) mm40Var, (Object) v0g0Var, z, (wdr) function1, i, (byte) 20);
        }
    }

    public static final void v(mm40 mm40Var, isn isnVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        isnVar.getClass();
        fetVar2.g0(-1744835453);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(isnVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, background, vgg0.a(16.0f)), 12.0f, 10.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 10.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = isnVar.f15313a;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarH, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 26, i, mm40Var, isnVar);
        }
    }

    public static final void w(iij0 iij0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1607967832);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(iij0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = g6o.f10777a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) iij0Var, (byte) 19);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40Var, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(iij0Var, i, (byte) 25);
        }
    }

    public static final void x(mm40 mm40Var, g9n g9nVar, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(909719620);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(g9nVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f), "MENU_ROW_NEW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            v8q0.a(g9nVar.f10922a, o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, true)), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            mm40 mm40VarS = o7k0.s(o7k0.c(jm40Var, 1.0f), 36.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 8);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE1 = o2e.e0(y860.W(mm40VarS, null, null, false, null, (Function0) objP, 28), "XGAME_ICON_TAG");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1845373678, new yfg(g9nVar, (byte) 17), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, g9nVar, function0, i, (byte) 7);
        }
    }

    public static final void y(pz40 pz40Var, Function2 function2, Function0 function0, fet fetVar, int i) {
        function2.getClass();
        function0.getClass();
        fetVar.g0(657550845);
        int i2 = (fetVar.g(pz40Var) ? 4 : 2) | i | (fetVar.i(function2) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            k3p k3pVar = ((et7) pz40Var.getValue()).b;
            boolean z = ((et7) pz40Var.getValue()).f8363a;
            byte b = 3;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(xczVarA);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new wi6(xczVarA, null, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, k3pVar, (Function2) objP);
            lmc.t(z, function0, u1c.M(321299750, new elm(k3pVar, (byte) 6), fetVar), u1c.M(-1681933539, new eyn(k3pVar, xczVarA, function2, b), fetVar), fetVar, (i2 & 896) | 27654);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(pz40Var, function2, function0, i, (byte) 14);
        }
    }

    public static final void z(mm40 mm40Var, p3w p3wVar, Function1 function1, Function2 function2, Function2 function3, Function2 function4, Function2 function5, fet fetVar, int i) {
        int i2;
        fetVar.g0(-612209200);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function5) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "LARGE_HISTORY_CARD_TEST_TAG");
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 27, backgroundContent);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarE0, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarK, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ghm0.i(s5x0.M(jm40.b, 12.0f, 12.0f, 12.0f, 4.0f), p3wVar, function1, fetVar, i2 & 1008);
            gkb.s(0, fetVar, null);
            if (function3 == null) {
                fetVar.e0(-1807485229);
                fetVar.r(false);
            } else {
                fetVar.e0(1188620014);
                h97.q((i2 >> 12) & 14, fetVar, function3, false);
            }
            if (function5 == null) {
                fetVar.e0(-1807445549);
                fetVar.r(false);
            } else {
                fetVar.e0(1188621294);
                h97.q((i2 >> 18) & 14, fetVar, function5, false);
            }
            if (function4 == null) {
                fetVar.e0(-1807410829);
                fetVar.r(false);
            } else {
                fetVar.e0(1188622414);
                h97.q((i2 >> 15) & 14, fetVar, function4, false);
            }
            if (function2 == null) {
                fetVar.e0(-1807386029);
                fetVar.r(false);
            } else {
                fetVar.e0(1188623214);
                h97.q((i2 >> 9) & 14, fetVar, function2, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) p3wVar, (Object) function1, (Object) function2, (Object) function3, (Object) function4, (Object) function5, i, (byte) 14);
        }
    }

    public String a0() {
        return null;
    }

    public String b0() {
        return null;
    }
}
