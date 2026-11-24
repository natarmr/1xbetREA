package a;

import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes4.dex */
public final class yhi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42638a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public Object t;
    public Object u;
    public Object v;

    public yhi(cad cadVar, ugf0 ugf0Var, ilp0 ilp0Var, pmi0 pmi0Var, TypeStageId.Game game, Long l, String str, Long l2, i1w0 i1w0Var, pru pruVar, r9u r9uVar, gii0 gii0Var, m1e m1eVar, wyu wyuVar, l2m0 l2m0Var, knf0 knf0Var, ctf0 ctf0Var, ocl oclVar, uyu uyuVar) {
        this.f42638a = cadVar;
        this.d = gii0Var;
        this.e = l2m0Var;
        this.f = knf0Var;
        this.g = game;
        this.h = l;
        this.i = l2;
        this.j = str;
        this.k = ctf0Var;
        this.l = i1w0Var;
        this.m = oclVar;
        this.b = m1eVar;
        this.o = pmi0Var;
        this.p = pruVar;
        this.q = uyuVar;
        this.r = wyuVar;
        this.s = ugf0Var;
        this.n = r9uVar;
        byte b = 24;
        this.c = mbl.b(new omi(this, 2, b));
        this.u = mbl.b(new omi(this, 1, b));
        this.t = new omi(this, 0, b);
        this.v = new omi(this, 3, b);
    }

    public h03 a() {
        return new h03((nb7) this.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        pwu pwuVar;
        int iX;
        if (zjeVar instanceof pwu) {
            pwuVar = (pwu) zjeVar;
            int i = pwuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwuVar.k = i - Integer.MIN_VALUE;
            } else {
                pwuVar = new pwu(this, zjeVar);
            }
        } else {
            pwuVar = new pwu(this, zjeVar);
        }
        Object objA = pwuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pwuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            iX = 0;
            if (((iqt) this.o).f15225a.a()) {
                rou rouVar = (rou) this.b;
                pwuVar.k = 1;
                objA = rouVar.a(false, pwuVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iX);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        iX = wvb.X(((m2c0) objA).c);
        return new Integer(iX);
    }

    public void c() {
        v3c.N((c4m0) this.t);
        v3c.N((c4m0) this.c);
        v3c.N((c4m0) this.u);
    }

    public mdq d(boolean z, boolean z2, boolean z3) {
        if (z2) {
            g8n0 g8n0Var = (g8n0) ((dj9) this.f).f6172a.b;
            g8n0Var.c.a();
            g8n0Var.b.a();
        }
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z;
        yje yjeVar = null;
        return new mdq(new dnq(new fnq(aoq.c(i120.W(i120.W(vtb.N(((g8n0) ((tvt) this.t).f34618a.b).f10874a))), new twu(this, hie0Var, z3, yjeVar, (byte) 0)), new uwu(hie0Var, yjeVar, (byte) 0), (byte) 4), new xpp((Object) this, z3, yjeVar, (byte) 8), (byte) 1), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public Object e(int i, bvc bvcVar, n0w n0wVar, boolean z, zje zjeVar) {
        vwk0 vwk0Var;
        bvc bvcVar2;
        boolean z2;
        int i2;
        boolean z3;
        uzc uzcVar = (uzc) this.n;
        rwj rwjVar = ((mne) this.d).f22085a;
        if (zjeVar instanceof vwk0) {
            vwk0Var = (vwk0) zjeVar;
            int i3 = vwk0Var.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vwk0Var.o = i3 - Integer.MIN_VALUE;
            } else {
                vwk0Var = new vwk0(this, zjeVar);
            }
        } else {
            vwk0Var = new vwk0(this, zjeVar);
        }
        Object obj = vwk0Var.m;
        wne wneVar = wne.f39444a;
        int i4 = vwk0Var.o;
        byte b = 21;
        byte b2 = 0;
        yje yjeVar = null;
        if (i4 == 0) {
            z1x.P(obj);
            this.v = n0wVar;
            boolean z4 = ((cnv) this.f42638a).f4674a.f523a.f44017a.get();
            ((fmt0) this.p).a(false);
            kzj kzjVarM = qjj.M(bvcVar, null, new yng0(this, yjeVar, b), 3);
            vwk0Var.j = bvcVar;
            vwk0Var.i = i;
            vwk0Var.k = z;
            vwk0Var.l = z4;
            vwk0Var.o = 1;
            Object objQ = kzjVarM.q(vwk0Var);
            if (objQ == wneVar) {
                return wneVar;
            }
            bvcVar2 = bvcVar;
            z2 = z4;
            obj = objQ;
            i2 = i;
            z3 = z;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = vwk0Var.l;
            boolean z6 = vwk0Var.k;
            int i5 = vwk0Var.i;
            bvc bvcVar3 = vwk0Var.j;
            z1x.P(obj);
            z2 = z5;
            bvcVar2 = bvcVar3;
            z3 = z6;
            i2 = i5;
        }
        int iIntValue = ((Number) obj).intValue();
        v3c.N((c4m0) this.t);
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z2;
        int i6 = 2;
        this.t = sac.T(aoq.c(uzcVar.c(), new ywk0(null, this, i2, iIntValue, hie0Var, z3, (byte) 1)), d5c.S(bvcVar2, rwjVar), new tri0(i6, yjeVar, (byte) 8));
        v3c.N((c4m0) this.c);
        hie0 hie0Var2 = new hie0();
        hie0Var2.f13108a = z2;
        this.c = sac.T(aoq.c(uzcVar.c(), new ywk0(null, this, i2, iIntValue, hie0Var2, z3, (byte) 0)), d5c.S(bvcVar2, rwjVar), zwk0.h);
        v3c.N((c4m0) this.u);
        hie0 hie0Var3 = new hie0();
        hie0Var3.f13108a = z2;
        n4u n4uVar = (n4u) this.g;
        n0w n0wVar2 = (n0w) this.v;
        n0wVar2.getClass();
        bvc bvcVar4 = bvcVar2;
        this.u = sac.T(new fnq(new dnq(new a1g(bkb.h0(60L, TimeUnit.SECONDS, new see(n0wVar2, n4uVar, i2, iIntValue, (yje) null)), new bxk0(this, new lqu(hie0Var3, (byte) 21), new wwk0(this, yjeVar, b2), 60L, null), (byte) 20), new xwk0(this, yjeVar, b2), (byte) 1), new myj0((Object) hie0Var3, (Object) this, yjeVar, (byte) 10), (byte) 4), d5c.S(bvcVar4, rwjVar), new tri0(i6, yjeVar, (byte) 7));
        return Unit.f46060a;
    }

    public void f(fk60 fk60Var) {
        fk60Var.getClass();
        switch (fk60Var.ordinal()) {
            case 0:
                rdj0 rdj0Var = ((sdj0) this.d).f32038a;
                q7d0 q7d0Var = rdj0Var.f30295a;
                q7d0Var.getClass();
                rdj0Var.f30295a.e(q7d0Var.a().getInt("SETTINGS_TIPS_SHOWED", 0) + 1, "SETTINGS_TIPS_SHOWED");
                break;
            case 1:
                wt6 wt6Var = ((vt6) this.g).f37988a;
                q7d0 q7d0Var2 = wt6Var.f39724a;
                q7d0Var2.getClass();
                wt6Var.f39724a.e(q7d0Var2.a().getInt("BET_CONSTRUCTOR_TIPS_SHOWED", 0) + 1, "BET_CONSTRUCTOR_TIPS_SHOWED");
                break;
            case 3:
                i4f i4fVar = (i4f) ((dpi0) this.f).f6468a;
                q7d0 q7d0Var3 = i4fVar.f14143a;
                q7d0Var3.getClass();
                i4fVar.f14143a.e(q7d0Var3.a().getInt("COUPON_TIPS_SHOWED", 0) + 1, "COUPON_TIPS_SHOWED");
                break;
            case 4:
                g0h g0hVar = (g0h) ((ilp0) this.h).f14992a;
                q7d0 q7d0Var4 = g0hVar.f10459a;
                q7d0Var4.getClass();
                g0hVar.f10459a.e(q7d0Var4.a().getInt("TIPS_CYBER_GAMES_SHOWED", 0) + 1, "TIPS_CYBER_GAMES_SHOWED");
                break;
            case 5:
                q7d0 q7d0Var5 = ((mrs) this.e).f22287a.f20548a;
                q7d0Var5.getClass();
                q7d0Var5.e(q7d0Var5.a().getInt("TIPS_GAMES_SHOWED_v3", 0) + 1, "TIPS_GAMES_SHOWED_v3");
                break;
            case 6:
                q7d0 q7d0Var6 = (q7d0) ((fck0) ((ani0) this.o).f1155a).b;
                q7d0Var6.getClass();
                q7d0Var6.e(q7d0Var6.a().getInt("TIPS_GAMES_SHOWED", 0) + 1, "TIPS_GAMES_SHOWED");
                break;
            case 7:
                zpu zpuVar = ((g5c) this.b).f10710a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = Build.VERSION.SDK_INT != 27 ? 7 : 30;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jCurrentTimeMillis);
                calendar.add(6, i);
                ((q7d0) zpuVar.b).f("OLD_ANDROID_TIP_SHOWED_DATE_TIME", calendar.getTimeInMillis());
                break;
            case 10:
                v650 v650Var = ((u650) this.p).f35122a;
                v650Var.f36857a.e(v650Var.a() + 1, "TIPS_MY_AGGREGATOR_SHOWED");
                v650Var.b.p++;
                break;
            case 11:
                mp1 mp1Var = (mp1) ((roi0) this.s).f30839a;
                mp1Var.f22155a.e(mp1Var.a() + 1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                mp1Var.b.p++;
                break;
            case 12:
                rh00 rh00Var = ((qh00) this.q).f28713a;
                rh00Var.f30464a.e(rh00Var.a() + 1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                rh00Var.b.p++;
                break;
            case 13:
                xf1 xf1Var = ((wf1) this.r).f39046a;
                xf1Var.f40769a.e(xf1Var.a() + 1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                xf1Var.b.p++;
                break;
            case 14:
                iz1 iz1Var = (iz1) ((owp0) this.t).b;
                iz1Var.f15613a.e(iz1Var.a() + 1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                iz1Var.b.p++;
                break;
            case 15:
                q7d0 q7d0Var7 = ((h2v) this.c).f12354a.b;
                q7d0Var7.getClass();
                q7d0Var7.e(q7d0Var7.a().getInt("TOTO_TIPS_SHOWED", 0) + 1, "TOTO_TIPS_SHOWED");
                break;
            case 16:
                khb0 khb0Var = ((fou) this.u).f9900a;
                q7d0 q7d0Var8 = khb0Var.f18283a;
                q7d0Var8.getClass();
                khb0Var.f18283a.e(q7d0Var8.a().getInt("TIPS_POPULAR_PERSONALIZATION", 0) + 1, "TIPS_POPULAR_PERSONALIZATION");
                break;
            case 17:
                q7d0 q7d0Var9 = ((i2u) this.i).f14070a.f1199a;
                q7d0Var9.getClass();
                q7d0Var9.e(q7d0Var9.a().getInt("TIPS_CYBER_EVENT_SHOWED", 0) + 1, "TIPS_CYBER_EVENT_SHOWED");
                break;
            case 18:
                q7d0 q7d0Var10 = ((pnh) ((owp0) this.j).b).f27286a;
                q7d0Var10.getClass();
                q7d0Var10.e(q7d0Var10.a().getInt("TIPS_CYBER_TOURNAMENT_SHOWED", 0) + 1, "TIPS_CYBER_TOURNAMENT_SHOWED");
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                q7d0 q7d0Var11 = ((rhh) this.k).f30489a.f28738a;
                q7d0Var11.getClass();
                q7d0Var11.e(q7d0Var11.a().getInt("TIPS_CYBER_TEAM_SHOWED", 0) + 1, "TIPS_CYBER_TEAM_SHOWED");
                break;
            case 20:
                q7d0 q7d0Var12 = ((t2u) this.l).f33232a.f35328a;
                q7d0Var12.getClass();
                q7d0Var12.e(q7d0Var12.a().getInt("TIPS_CYBER_PROMO_SHOWED", 0) + 1, "TIPS_CYBER_PROMO_SHOWED");
                break;
            case 21:
                q7d0 q7d0Var13 = ((nag) ((zas0) this.m).b).f23189a;
                q7d0Var13.getClass();
                q7d0Var13.e(q7d0Var13.a().getInt("TIPS_CYBER_CALENDAR_SHOWED", 0) + 1, "TIPS_CYBER_CALENDAR_SHOWED");
                break;
            case 22:
                q7d0 q7d0Var14 = ((s2u) this.n).f31521a.f2256a;
                q7d0Var14.getClass();
                q7d0Var14.e(q7d0Var14.a().getInt("TIPS_CYBER_PARTNERS_SHOWED", 0) + 1, "TIPS_CYBER_PARTNERS_SHOWED");
                break;
            case 24:
                j910 j910Var = (j910) ((ugf0) this.f42638a).f35622a;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jCurrentTimeMillis2);
                calendar2.add(6, 30);
                ((q7d0) j910Var.b).f("OLD_DEVICE_TIP_SHOWN_DATE_TIME", calendar2.getTimeInMillis());
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                q7d0 q7d0Var15 = ((gti0) this.v).f11883a.f40279a;
                q7d0Var15.getClass();
                q7d0Var15.e(q7d0Var15.a().getInt("TIPS_TEAM_BET_SHOWED", 0) + 1, "TIPS_TEAM_BET_SHOWED");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object g(int i, long j, zje zjeVar, String str, boolean z) {
        vwu vwuVar;
        String str2;
        int i2;
        Object objB;
        boolean z2;
        svu svuVar;
        long j2;
        long j3;
        long j4;
        if (zjeVar instanceof vwu) {
            vwuVar = (vwu) zjeVar;
            int i3 = vwuVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vwuVar.r = i3 - Integer.MIN_VALUE;
            } else {
                vwuVar = new vwu(this, zjeVar);
            }
        } else {
            vwuVar = new vwu(this, zjeVar);
        }
        vwu vwuVar2 = vwuVar;
        Object obj = vwuVar2.p;
        Object obj2 = wne.f39444a;
        int i4 = vwuVar2.r;
        if (i4 == 0) {
            z1x.P(obj);
            long jA = ((viu) this.r).a();
            long jF = ynq0.f(jA);
            svu svuVar2 = (svu) this.p;
            vwuVar2.i = svuVar2;
            str2 = str;
            vwuVar2.j = str2;
            vwuVar2.k = z;
            i2 = i;
            vwuVar2.l = i2;
            vwuVar2.m = j;
            vwuVar2.n = jA;
            vwuVar2.o = jF;
            vwuVar2.r = 1;
            objB = b(vwuVar2);
            if (objB != obj2) {
                z2 = z;
                svuVar = svuVar2;
                j2 = jF;
                j3 = j;
                j4 = jA;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j5 = vwuVar2.o;
        long j6 = vwuVar2.n;
        long j7 = vwuVar2.m;
        int i5 = vwuVar2.l;
        boolean z3 = vwuVar2.k;
        String str3 = vwuVar2.j;
        svu svuVar3 = vwuVar2.i;
        z1x.P(obj);
        i2 = i5;
        objB = obj;
        str2 = str3;
        j4 = j6;
        z2 = z3;
        svuVar = svuVar3;
        j2 = j5;
        j3 = j7;
        int iIntValue = ((Number) objB).intValue();
        vwuVar2.i = null;
        vwuVar2.j = null;
        vwuVar2.k = z2;
        vwuVar2.l = i2;
        vwuVar2.m = j3;
        vwuVar2.n = j4;
        vwuVar2.o = j2;
        vwuVar2.r = 2;
        Object objG = ((afm0) svuVar.f32888a).g(str2, iIntValue, i2, j3, z2, j2, vwuVar2);
        return objG == obj2 ? obj2 : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object h(int i, long j, zje zjeVar, String str, boolean z) {
        wwu wwuVar;
        xsu xsuVar;
        if (zjeVar instanceof wwu) {
            wwuVar = (wwu) zjeVar;
            int i2 = wwuVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wwuVar.p = i2 - Integer.MIN_VALUE;
            } else {
                wwuVar = new wwu(this, zjeVar);
            }
        } else {
            wwuVar = new wwu(this, zjeVar);
        }
        wwu wwuVar2 = wwuVar;
        Object obj = wwuVar2.n;
        Object obj2 = wne.f39444a;
        int i3 = wwuVar2.p;
        if (i3 == 0) {
            z1x.P(obj);
            xsu xsuVar2 = (xsu) this.q;
            wwuVar2.i = xsuVar2;
            wwuVar2.j = str;
            wwuVar2.k = z;
            wwuVar2.l = i;
            wwuVar2.m = j;
            wwuVar2.p = 1;
            Object objB = b(wwuVar2);
            if (objB != obj2) {
                obj = objB;
                xsuVar = xsuVar2;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = wwuVar2.m;
        i = wwuVar2.l;
        z = wwuVar2.k;
        str = wwuVar2.j;
        xsuVar = wwuVar2.i;
        z1x.P(obj);
        long j2 = j;
        boolean z2 = z;
        int iIntValue = ((Number) obj).intValue();
        wwuVar2.i = null;
        wwuVar2.j = null;
        wwuVar2.k = z2;
        wwuVar2.l = i;
        wwuVar2.m = j2;
        wwuVar2.p = 2;
        Object objI = ((afm0) xsuVar.f41434a).i(str, iIntValue, i, j2, z2, wwuVar2);
        return objI == obj2 ? obj2 : objI;
    }

    public fiu0 i() {
        iyk iykVar = new iyk(3);
        iykVar.b(umo0.class, (psi) this.t);
        iykVar.b(ezl0.class, (psi) this.u);
        iykVar.b(ghv.class, (psi) this.v);
        return new fiu0(iykVar.a());
    }

    public yhi(mne mneVar, khf0 khf0Var, lbu lbuVar, n4u n4uVar, aqx aqxVar, bqx bqxVar, zpx zpxVar, bqx bqxVar2, aqx aqxVar2, zpx zpxVar2, uzc uzcVar, rou rouVar, iqt iqtVar, cnv cnvVar, fmt0 fmt0Var, v7i v7iVar, v7i v7iVar2, pru pruVar) {
        this.d = mneVar;
        this.e = khf0Var;
        this.f = lbuVar;
        this.g = n4uVar;
        this.h = aqxVar;
        this.i = bqxVar;
        this.j = zpxVar;
        this.k = bqxVar2;
        this.l = aqxVar2;
        this.m = zpxVar2;
        this.n = uzcVar;
        this.o = rouVar;
        this.b = iqtVar;
        this.f42638a = cnvVar;
        this.p = fmt0Var;
        this.q = v7iVar;
        this.r = v7iVar2;
        this.s = pruVar;
        this.v = n0w.f22720a;
    }

    public yhi(zoc zocVar, rvt rvtVar, dj9 dj9Var, lsn lsnVar, svt svtVar, tvt tvtVar, b3c b3cVar, dj9 dj9Var2, cj9 cj9Var, svt svtVar2, rpt rptVar, iqt iqtVar, rou rouVar, x4v x4vVar, svu svuVar, xsu xsuVar, v7i v7iVar, tvt tvtVar2, jc60 jc60Var, gqt gqtVar, pru pruVar, viu viuVar) {
        this.d = zocVar;
        this.e = rvtVar;
        this.f = dj9Var;
        this.g = lsnVar;
        this.h = svtVar;
        this.i = tvtVar;
        this.j = b3cVar;
        this.k = dj9Var2;
        this.l = cj9Var;
        this.m = svtVar2;
        this.n = rptVar;
        this.o = iqtVar;
        this.b = rouVar;
        this.f42638a = x4vVar;
        this.p = svuVar;
        this.q = xsuVar;
        this.s = v7iVar;
        this.t = tvtVar2;
        this.c = jc60Var;
        this.u = gqtVar;
        this.v = pruVar;
        this.r = viuVar;
    }

    public yhi(sdj0 sdj0Var, mrs mrsVar, dpi0 dpi0Var, vt6 vt6Var, ilp0 ilp0Var, i2u i2uVar, owp0 owp0Var, rhh rhhVar, t2u t2uVar, zas0 zas0Var, s2u s2uVar, ani0 ani0Var, g5c g5cVar, ugf0 ugf0Var, u650 u650Var, qh00 qh00Var, wf1 wf1Var, roi0 roi0Var, owp0 owp0Var2, h2v h2vVar, fou fouVar, gti0 gti0Var) {
        this.d = sdj0Var;
        this.e = mrsVar;
        this.f = dpi0Var;
        this.g = vt6Var;
        this.h = ilp0Var;
        this.i = i2uVar;
        this.j = owp0Var;
        this.k = rhhVar;
        this.l = t2uVar;
        this.m = zas0Var;
        this.n = s2uVar;
        this.o = ani0Var;
        this.b = g5cVar;
        this.f42638a = ugf0Var;
        this.p = u650Var;
        this.q = qh00Var;
        this.r = wf1Var;
        this.s = roi0Var;
        this.t = owp0Var2;
        this.c = h2vVar;
        this.u = fouVar;
        this.v = gti0Var;
    }

    public yhi(cad cadVar, ugf0 ugf0Var, ilp0 ilp0Var, pmi0 pmi0Var, r9u r9uVar, pru pruVar, TypeStageId typeStageId, Long l, Long l2, String str, i1w0 i1w0Var, gii0 gii0Var, m1e m1eVar, wyu wyuVar, l2m0 l2m0Var, knf0 knf0Var, ctf0 ctf0Var, ocl oclVar, uyu uyuVar) {
        this.d = typeStageId;
        this.e = l;
        this.f = l2;
        this.g = str;
        this.h = ctf0Var;
        this.f42638a = cadVar;
        this.i = i1w0Var;
        this.j = oclVar;
        this.b = m1eVar;
        this.k = pmi0Var;
        this.l = pruVar;
        this.m = uyuVar;
        this.o = wyuVar;
        this.p = gii0Var;
        this.q = l2m0Var;
        this.r = knf0Var;
        this.s = ugf0Var;
        this.n = r9uVar;
        byte b = 15;
        this.c = mbl.b(new psi(this, 1, b));
        this.t = new psi(this, 0, b);
        this.u = new psi(this, 2, b);
        this.v = new psi(this, 3, b);
    }

    public yhi(cad cadVar, o2j0 o2j0Var, sue sueVar, clc clcVar, wsf0 wsf0Var, iw20 iw20Var, d1p d1pVar, bzu bzuVar, m0k0 m0k0Var, i1w0 i1w0Var, ctf0 ctf0Var, ms2 ms2Var, wdk0 wdk0Var, nb7 nb7Var, h0f h0fVar, m1e m1eVar, gst0 gst0Var, mii0 mii0Var, vqc vqcVar, h3c h3cVar, zfo zfoVar, ii iiVar) {
        this.d = m0k0Var;
        this.e = o2j0Var;
        this.f = ctf0Var;
        this.g = i1w0Var;
        this.h = sueVar;
        this.i = ms2Var;
        this.f42638a = cadVar;
        this.j = clcVar;
        this.k = iw20Var;
        this.l = nb7Var;
        this.m = h0fVar;
        this.n = wsf0Var;
        this.o = gst0Var;
        this.b = m1eVar;
        this.p = mii0Var;
        this.q = d1pVar;
        this.r = vqcVar;
        this.s = h3cVar;
        this.t = bzuVar;
        this.u = zfoVar;
        byte b = 6;
        this.c = n0k0.a(new gji(this, 0, b));
        this.v = new gji(this, 1, b);
    }

    public yhi(cad cadVar, us00 us00Var, oeg0 oeg0Var, GameBroadcastingParams gameBroadcastingParams, m1e m1eVar, yox yoxVar, ntu ntuVar, nhv0 nhv0Var, ysr ysrVar, atr atrVar, rsr rsrVar, m49 m49Var, n49 n49Var, mi70 mi70Var, r9u r9uVar, ik4 ik4Var, vd1 vd1Var, c49 c49Var, viu viuVar) {
        this.d = gameBroadcastingParams;
        this.e = oeg0Var;
        this.f = us00Var;
        this.g = m49Var;
        this.h = ysrVar;
        this.i = nhv0Var;
        this.j = n49Var;
        this.k = atrVar;
        this.l = rsrVar;
        this.m = mi70Var;
        this.n = r9uVar;
        this.o = ntuVar;
        this.b = m1eVar;
        this.f42638a = cadVar;
        this.p = yoxVar;
        this.q = c49Var;
        this.r = viuVar;
        this.s = vd1Var;
        this.t = ik4Var;
        byte b = 28;
        this.c = mbl.b(new dci(this, 1, b));
        this.u = mbl.b(new dci(this, 2, b));
        this.v = new dci(this, 0, b);
    }
}
