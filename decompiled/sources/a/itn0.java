package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$playerTransfersScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.swipex.impl.navigation.SwipexInternalScreenFactory$getSwipexFilterScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class itn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15363a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ itn0(Object obj, Object obj2, byte b) {
        this.f15363a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15363a;
        byte b2 = 18;
        byte b3 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                List list = u0d.f34849a;
                u0d.l(((jtn0) obj3).k, ((htn0) ((cp) obj2).u()).e);
                return Unit.f46060a;
            case 1:
                List list2 = u0d.f34849a;
                u0d.l(((ktn0) obj3).p, ((stn0) ((cp) obj2).u()).e);
                return Unit.f46060a;
            case 2:
                Function1 function1 = (Function1) obj3;
                b3q b3qVar = (b3q) obj2;
                h2l0 h2l0Var = (h2l0) obj;
                h2l0Var.getClass();
                if (vtn0.f38017a[h2l0Var.ordinal()] == 1) {
                    function1.invoke(new kvn0(b3qVar));
                }
                return Unit.f46060a;
            case 3:
                Function1 function2 = (Function1) obj3;
                t3q t3qVar = (t3q) obj2;
                h2l0 h2l0Var2 = (h2l0) obj;
                h2l0Var2.getClass();
                int iOrdinal = h2l0Var2.ordinal();
                if (iOrdinal == 1) {
                    function2.invoke(new lvn0(t3qVar));
                } else if (iOrdinal == 2) {
                    function2.invoke(new mvn0(t3qVar));
                }
                return Unit.f46060a;
            case 4:
                g5l0 g5l0Var = (g5l0) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                m6m0 m6m0Var = ((zyn0) obj3).v;
                long j = g5l0Var.f10726a;
                long j2 = g5l0Var.b;
                m6m0Var.getClass();
                k0w0Var.h(new SwipexInternalScreenFactory$getSwipexFilterScreen$1(j, j2));
                return Unit.f46060a;
            case 5:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                ((s9o0) obj3).b.U(qpg0Var, (r9o0) obj2);
                return Unit.f46060a;
            case 6:
                kxv kxvVar = (kxv) obj2;
                String str = kxvVar.c;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(((zco0) obj3).d0.b(kxvVar.i ? j700.b : j700.f16016a, new m8h0(str, xun.f41520a, false), cui0.b(Long.valueOf(kxvVar.f19077a)), kxvVar.b, str));
                return Unit.f46060a;
            case 7:
                d240 d240Var = (d240) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(((fho0) obj3).m.q(new fr1(new fs80(d240Var.g, d240Var.d, null, null, 0L, false, 124), null, 2)));
                return Unit.f46060a;
            case 8:
                c240 c240Var = (c240) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                peg0 peg0Var = ((fho0) obj3).m;
                String str2 = c240Var.g;
                long j3 = c240Var.e;
                if (j3 > 0) {
                    str2 = null;
                }
                k0w0Var4.h(peg0Var.q(new fr1(new fs80(str2 == null ? "" : str2, c240Var.d, null, null, j3, false, 108), null, 2)));
                return Unit.f46060a;
            case 9:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(oct.f(((fho0) obj3).n, 0L, null, 0, (t270) obj2, null, 23));
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                c8d c8dVar = (c8d) k0w0Var6.h(jh70.i(((fho0) obj3).p, (zuc0) obj2)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 11:
                jdk0 jdk0Var = ((fho0) obj3).X;
                vh0 vh0Var = ((gx10) obj2).b;
                long j4 = vh0Var.g;
                String str3 = vh0Var.b;
                boolean z = vh0Var.i;
                long j5 = vh0Var.h;
                boolean z2 = vh0Var.j;
                jdk0Var.getClass();
                c8d c8dVar2 = (c8d) ((k0w0) obj).h(jdk0.f(j4, str3, 0L, z, j5, z2, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 12:
                c240 c240Var2 = (c240) obj2;
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                peg0 peg0Var2 = ((rio0) obj3).n;
                String str4 = c240Var2.g;
                long j6 = c240Var2.e;
                if (j6 > 0) {
                    str4 = null;
                }
                k0w0Var7.h(peg0Var2.q(new fr1(new fs80(str4 == null ? "" : str4, c240Var2.d, null, null, j6, false, 108), null, 2)));
                return Unit.f46060a;
            case 13:
                d240 d240Var2 = (d240) obj2;
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                k0w0Var8.h(((rio0) obj3).n.q(new fr1(new fs80(d240Var2.g, d240Var2.d, null, null, 0L, true, 92), null, 2)));
                return Unit.f46060a;
            case 14:
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                k0w0Var9.h(oct.f(((rio0) obj3).o, 0L, null, 0, (t270) obj2, null, 23));
                return Unit.f46060a;
            case 15:
                vh0 vh0Var2 = (vh0) obj2;
                jdk0 jdk0Var2 = ((rio0) obj3).f0;
                long j7 = vh0Var2.g;
                String str5 = vh0Var2.b;
                boolean z3 = vh0Var2.i;
                long j8 = vh0Var2.h;
                boolean z4 = vh0Var2.j;
                jdk0Var2.getClass();
                c8d c8dVar3 = (c8d) ((k0w0) obj).h(jdk0.f(j7, str5, 0L, z3, j8, z4, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 16:
                jdk0 jdk0Var3 = ((rio0) obj3).f0;
                vh0 vh0Var3 = ((gx10) obj2).b;
                long j9 = vh0Var3.g;
                String str6 = vh0Var3.b;
                boolean z5 = vh0Var3.i;
                long j10 = vh0Var3.h;
                boolean z6 = vh0Var3.j;
                jdk0Var3.getClass();
                c8d c8dVar4 = (c8d) ((k0w0) obj).h(jdk0.f(j9, str6, 0L, z5, j10, z6, true, 0, false, false, false, "", true)).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                return Unit.f46060a;
            case 17:
                x77 x77Var = (x77) obj3;
                Function1 function3 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                if (x77Var.h instanceof pv7) {
                    hcz.e(hczVar, null, null, new ugd(-1547298276, true, new nhl0(x77Var, function3, (byte) 15)), 3);
                }
                ArrayList arrayList = x77Var.g;
                byte b4 = 6;
                hczVar.f(arrayList.size(), new zcn0(new ofo0(b4), arrayList, b4), new t9l0(arrayList, (byte) 6), new ugd(2039820996, true, new h8w((List) arrayList, (Object) x77Var, function3, (byte) 28)));
                if (x77Var.j && !x77Var.k) {
                    hcz.e(hczVar, null, null, gq80.f, 3);
                }
                return Unit.f46060a;
            case 18:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar = ((mhe) obj3).b;
                hczVar2.f(a4xVar.size(), null, new adn0(a4xVar, (byte) 12), new ugd(802480018, true, new njh0(a4xVar, (Function1) obj2, b2)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xcp xcpVar = (xcp) obj2;
                k0w0 k0w0Var10 = (k0w0) obj;
                k0w0Var10.getClass();
                ifp ifpVar = ((q4p0) obj3).v;
                long j11 = xcpVar.f40657a;
                tnp0 tnp0Var = xcpVar.b;
                String str7 = xcpVar.c;
                long jC = tnp0Var.c();
                rnp0 rnp0Var = tnp0Var instanceof rnp0 ? (rnp0) tnp0Var : null;
                k0w0Var10.h(ifpVar.a(j11, tnp0Var, str7, jC, rnp0Var != null ? rnp0Var.c : 0L, xcpVar.i));
                return Unit.f46060a;
            case 20:
                v8p0 v8p0Var = (v8p0) obj3;
                hcz hczVar3 = (hcz) obj;
                s2m0 s2m0Var = x8p0.l2;
                hczVar3.getClass();
                a4x a4xVar2 = v8p0Var.f36998a;
                hczVar3.f(a4xVar2.size(), null, new adn0(a4xVar2, (byte) 18), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) v8p0Var, (Function1) obj2, (byte) 29)));
                return Unit.f46060a;
            case 21:
                ((iz3) obj).getClass();
                ((pz40) obj2).setValue(((qbp0) obj3).d);
                return Unit.f46060a;
            case 22:
                wbp0 wbp0Var = (wbp0) obj3;
                k0w0 k0w0Var11 = (k0w0) obj;
                k0w0Var11.getClass();
                vqc vqcVar = wbp0Var.u;
                long j12 = ((a8p0) obj2).f438a;
                TeamDetailsParams teamDetailsParams = wbp0Var.p;
                TeamDetailsParams teamDetailsParams2 = new TeamDetailsParams(j12, teamDetailsParams.b, teamDetailsParams.c);
                vqcVar.getClass();
                k0w0Var11.h(new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(vqcVar, teamDetailsParams2));
                return Unit.f46060a;
            case 23:
                wbp0 wbp0Var2 = (wbp0) obj3;
                k0w0 k0w0Var12 = (k0w0) obj;
                k0w0Var12.getClass();
                vqc vqcVar2 = wbp0Var2.u;
                PlayerTransfersScreenParams playerTransfersScreenParams = new PlayerTransfersScreenParams(wbp0Var2.p.f46569a, ((l8p0) obj2).f19617a);
                vqcVar2.getClass();
                k0w0Var12.h(new CyberGamesScreenFactoryImpl$playerTransfersScreen$1(vqcVar2, playerTransfersScreenParams));
                return Unit.f46060a;
            case 24:
                ((View) obj).getClass();
                ((ngp0) obj3).g.invoke(((cp) obj2).u());
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gjp0 gjp0Var = (gjp0) obj3;
                hcz hczVar4 = (hcz) obj;
                s9m0 s9m0Var = ajp0.r2;
                hczVar4.getClass();
                a4x a4xVar3 = gjp0Var.f11412a;
                hczVar4.f(a4xVar3.size(), null, new adn0(a4xVar3, (byte) 19), new ugd(2039820996, true, new zip0(a4xVar3, (ajp0) obj2, gjp0Var, b3)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ykp0 ykp0Var = (ykp0) obj3;
                k0w0 k0w0Var13 = (k0w0) obj;
                k0w0Var13.getClass();
                rl70 rl70Var = ykp0Var.v;
                String str8 = ((ekp0) ((gkp0) obj2)).f7964a;
                long j13 = ((qkp0) ykp0Var.D()).f28897a;
                String str9 = ykp0Var.u;
                rl70Var.getClass();
                k0w0Var13.h(rl70.d(j13, str8, str9));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ctf0 ctf0Var = (ctf0) obj3;
                tup0 tup0Var = (tup0) obj;
                tup0Var.getClass();
                String strK = ((rpt) obj2).k();
                ctf0Var.getClass();
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(R.string.telegram_personal_bonus_title, Arrays.copyOf(new Object[0], 0));
                String strA2 = lsm0Var.a(R.string.telegram_personal_bonus_subtitle, Arrays.copyOf(new Object[0], 0));
                String strA3 = lsm0Var.a(R.string.telegram_personal_bonus_description_v2, Arrays.copyOf(new Object[]{strK}, 1));
                String str10 = tup0Var.f34562a;
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                return new uup0(strA, strA2, strA3, str10, new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.telegram_copy_code, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, true));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                x0q0 x0q0Var = (x0q0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                bby bbyVar = (bby) ((mie0) obj3).f21842a;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                x0q0Var.y.b(th, new a6p0(th, x0q0Var, (byte) 10));
                return Unit.f46060a;
            default:
                return new pr0((pz40) obj3, obj2, (byte) 21);
        }
    }
}
