package a;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k110 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17497a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k110(nn20 nn20Var, m97 m97Var, m97 m97Var2) {
        this.f17497a = (byte) 22;
        this.c = m97Var;
        this.b = m97Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        gx4 gx4VarA;
        kuw kuwVar;
        Object value;
        b820 b820Var;
        kuw kuwVar2;
        gao0 fao0Var;
        byte b = this.f17497a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 10;
        byte b3 = 0;
        yje yjeVar = null;
        byte b4 = 1;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x9x.s((g110) obj6, (mm40) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                kcx.o((m110) obj6, (mm40) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ufx.c((g610) obj6, (mm40) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                uvw.c((c610) obj6, (mm40) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                y3h y3hVar = (y3h) obj6;
                String str = (String) obj5;
                m310 m310Var = (m310) obj2;
                ((oyg0) obj).getClass();
                m310Var.getClass();
                g310 g310Var = m310Var.j;
                o4i0 o4i0Var = g310Var.c;
                Iterator it = y3hVar.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((c4h) next).f3725a.equals(str)) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                c4h c4hVar = (c4h) obj3;
                String str2 = c4hVar != null ? c4hVar.f3725a : o4i0Var.f24637a;
                Iterator it2 = y3hVar.g.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((c4h) next2).f3725a.equals(str)) {
                            obj4 = next2;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                c4h c4hVar2 = (c4h) obj4;
                return m310.a(m310Var, null, null, null, null, null, null, false, g310.a(g310Var, 0L, 0L, o4i0.a(str2, c4hVar2 != null ? c4hVar2.f3725a : o4i0Var.b), 0L, null, 0L, false, 251), null, null, false, null, false, false, null, null, 33553919);
            case 5:
                ((Integer) obj2).getClass();
                x0x.h((d250) obj6, (Function1) obj5, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                km10.i((vm10) obj6, (Function1) obj5, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                km10.k((co10) obj6, (Function1) obj5, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 8:
                yr10 yr10Var = (yr10) obj6;
                ViewPager2 viewPager2 = (ViewPager2) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                wsz wszVar = yr10.R1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarQ = gkb.Q(vtb.N(((ds10) yr10Var.M1.getValue()).e), null, fetVar, 0, 7);
                    Integer numValueOf = Integer.valueOf(((ru9) pz40VarQ.getValue()).c);
                    boolean zI = fetVar.i(viewPager2) | fetVar.g(pz40VarQ);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new xr10(viewPager2, pz40VarQ, null, (byte) 0);
                        fetVar.o0(objP);
                    }
                    m0x0.t(fetVar, numValueOf, (Function2) objP);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(jm40.b, 12.0f, 8.0f);
                    a4x a4xVar = ((ru9) pz40VarQ.getValue()).f31115a;
                    dxh0 dxh0Var = ((ru9) pz40VarQ.getValue()).b;
                    boolean zG = fetVar.g(pz40VarQ);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new rip(pz40VarQ, (byte) 11);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zI2 = fetVar.i(yr10Var);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new km00(yr10Var, b2);
                        fetVar.o0(objP3);
                    }
                    ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP3, fetVar, 384, 16);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                m7x.d((nv10) obj6, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                nv10 nv10Var = (nv10) obj6;
                qv10 qv10Var = (qv10) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                htz htzVar = qv10.O1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI3 = fetVar2.i(qv10Var);
                    Object objP4 = fetVar2.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new mv10(qv10Var, b4);
                        fetVar2.o0(objP4);
                    }
                    m7x.d(nv10Var, (Function0) objP4, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                q7x.d((mm40) obj5, (eb10) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((f120) obj6).H(new yr0((Throwable) obj5, (byte) 10));
                return Unit.f46060a;
            case 13:
                cit0 cit0Var = (cit0) obj6;
                nn20 nn20Var = (nn20) obj5;
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                gx4 gx4Var = b820Var2.f;
                if (gx4Var != null) {
                    dx6 dx6Var = gx4Var.c;
                    vw6 vw6Var = dx6Var.b;
                    double d = cit0Var.C;
                    double d2 = cit0Var.F;
                    double d3 = cit0Var.E;
                    boolean z = cit0Var.M;
                    double d4 = z ? 9.99999999999999E12d : d2;
                    String str3 = b820Var2.c.c.f;
                    if (z) {
                        d2 = 9.99999999999999E12d;
                    }
                    gx4VarA = gx4.a(gx4Var, null, null, dx6.a(dx6Var, null, vw6.a(vw6Var, 0.0d, 0.0d, d, d3, d4, str3, z, false, new AutoMaxUiModel(d2, nn20Var.G.j()), !(cit0Var.C == 0.0d), false, false, false, 49283), 1), null, null, 27);
                } else {
                    gx4VarA = null;
                }
                return b820.a(b820Var2, null, null, null, null, null, gx4VarA, null, false, false, false, false, false, 8159);
            case 14:
                on20 on20Var = (on20) obj6;
                Throwable th = (Throwable) obj5;
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                on20Var.getClass();
                if ((th instanceof zhi0) && ((kuwVar = ((zhi0) th).c) == i2o.WrongToken || kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine)) {
                    on20Var.G(new pc20(new xdk0(pek0.f26859a, str4, null, null, null, null, 124)));
                }
                on20Var.H(new fd20((byte) 21));
                bby bbyVar = on20Var.g1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                on20Var.g1 = i3t0.K(on20Var, null, null, new hj20(on20Var, yjeVar, b4), 3);
                return Unit.f46060a;
            case 15:
                nn20 nn20Var2 = (nn20) obj6;
                Throwable th2 = (Throwable) obj5;
                String str5 = (String) obj2;
                ((Throwable) obj).getClass();
                str5.getClass();
                nn20Var2.getClass();
                if ((th2 instanceof zhi0) && ((kuwVar2 = ((zhi0) th2).c) == i2o.WrongToken || kuwVar2 == i2o.A || kuwVar2 == i2o.GameIsNotInLine)) {
                    nn20Var2.G(new qc20(new xdk0(pek0.f26859a, str5, null, null, null, null, 124)));
                }
                p7m0 p7m0Var = nn20Var2.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    b820Var = (b820) value;
                    nn20Var2.f.getClass();
                } while (!p7m0Var.m(value, b820.a(b820Var, null, null, an5.a(b820Var.c, new g40(0.0d, e40.d)), null, null, null, null, false, false, false, false, false, 8187)));
                bby bbyVar2 = nn20Var2.T0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                nn20Var2.T0 = i3t0.K(nn20Var2, null, null, new mj20(nn20Var2, yjeVar, b3), 3);
                return Unit.f46060a;
            case 16:
                gx4 gx4Var2 = (gx4) obj6;
                b820 b820Var3 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var3.getClass();
                return b820.a(b820Var3, null, null, null, null, null, gx4.a(gx4Var2, null, null, null, null, mnb0.a(gx4Var2.e, true, null, (String) obj5, 2), 15), null, false, false, false, false, false, 8159);
            case 17:
                gx4 gx4Var3 = (gx4) obj6;
                b820 b820Var4 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var4.getClass();
                return b820.a(b820Var4, null, null, null, null, null, gx4.a(gx4Var3, null, null, dx6.a(gx4Var3.c, (a8q0) obj5, null, 2), null, null, 27), null, false, false, false, false, false, 8159);
            case 18:
                on20 on20Var2 = (on20) obj6;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                pvj0 pvj0Var = a820Var.e;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, null, knb0.a(on20Var2.h0(pvj0Var.f27665a.b.p, null), (String) obj5, on20Var2.r0()), null, null, null, false, 61), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hnd0 hnd0Var = (hnd0) obj6;
                b820 b820Var5 = (b820) obj2;
                rvj0 rvj0Var = b820Var5.d;
                return b820.a(b820Var5, null, null, null, rvj0.a(rvj0Var, null, null, null, mnd0.a(rvj0Var.d, false, hnd0Var.b, hnd0Var.c, hnd0Var.d, ((ql5) obj5).f, 33), null, 23), null, null, null, false, false, false, false, false, 8183);
            case 20:
                on20 on20Var3 = (on20) obj6;
                en7 en7Var = (en7) obj5;
                a820 a820Var2 = (a820) obj2;
                txe txeVar = a820Var2.b;
                int i = on20.m1;
                q4f q4fVarA = on20Var3.b0.a();
                if ((q4fVarA != q4f.g || on20Var3.Z.a() <= 2) && q4fVarA != q4f.e) {
                    fao0Var = dao0.f5760a;
                } else {
                    fao0Var = (en7Var.f8078a == 0 && en7Var.c == 0) ? eao0.f7477a : new fao0(en7Var);
                }
                return a820.a(a820Var2, txe.a(txeVar, 0L, 0, fao0Var, null, null, false, null, 123), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
            case 21:
                q4f q4fVar = (q4f) obj5;
                a820 a820Var3 = (a820) obj2;
                txe txeVar2 = a820Var3.b;
                int i2 = on20.m1;
                return a820.a(a820Var3, txe.a(txeVar2, 0L, ((on20) obj6).c0(), null, m0d.a(a820Var3.b.d, null, !q3d.j(q4f.g, q4f.f, q4f.h, q4f.j, q4f.k, q4f.m).contains(q4fVar) ? o0d.b : o0d.f24418a, 63), null, false, null, 117), null, null, null, null, null, null, false, q4fVar, 0.0f, false, null, 0, false, false, false, 261629);
            case 22:
                b820 b820Var6 = (b820) obj2;
                ly6 ly6Var = b820Var6.f2138a;
                return b820.a(b820Var6, ly6.a(ly6Var, null, jur.a(ly6Var.d, nn20.Y(((m97) obj6).m, ((m97) obj5).m, czc.d), null, 27), null, null, 87), null, null, null, null, null, null, false, false, false, false, false, 8190);
            case 23:
                ((Integer) obj2).getClass();
                ep20.a((mm40) obj5, (wls) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                b5x.e((mm40) obj5, (gho) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                q7x.e((mm40) obj5, (lgs) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                l8x.C((ry20) obj6, (Function1) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dz20 dz20Var = (dz20) obj2;
                ((oyg0) obj).getClass();
                dz20Var.getClass();
                dz20 dz20VarA = dz20.a(dz20Var, null, null, null, null, Long.valueOf(((xvm0) obj6).getId()), null, false, null, null, null, false, 4079);
                ((uz20) obj5).o.e("KEY_CURRENT_SUB_GAME_ID", dz20VarA.e);
                return dz20VarA;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                js20 js20Var = (js20) obj6;
                dz20 dz20Var2 = (dz20) obj2;
                ((oyg0) obj).getClass();
                dz20Var2.getClass();
                dz20 dz20VarA2 = dz20.a(dz20Var2, null, js20Var, Long.valueOf(js20Var.a()), null, null, null, false, null, null, null, false, 4089);
                ((uz20) obj5).o.e("KEY_CURRENT_CATEGORY_ID", dz20VarA2.c);
                return dz20VarA2;
            default:
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) obj6;
                View view = (View) obj;
                View view2 = (View) obj2;
                int i3 = MatchInfoContainerView.t1;
                view.getClass();
                view2.getClass();
                matchInfoContainerView.D(view, view2, new mbz(matchInfoContainerView, (ArrayList) obj5, (byte) 22));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ k110(byte b, int i, mm40 mm40Var, Object obj) {
        this.f17497a = b;
        this.b = mm40Var;
        this.c = obj;
    }

    public /* synthetic */ k110(Object obj, Object obj2, byte b) {
        this.f17497a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ k110(Object obj, Object obj2, int i, byte b) {
        this.f17497a = b;
        this.c = obj;
        this.b = obj2;
    }
}
