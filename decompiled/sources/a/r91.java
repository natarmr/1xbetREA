package a;

import android.view.View;
import android.window.OnBackInvokedDispatcher;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.cyber.game.lol.api.LolScreenParams;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r91 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30054a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r91(Object obj, Object obj2, boolean z, byte b) {
        this.f30054a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        zr8 zr8Var;
        int iU;
        String upperCase;
        String upperCase2;
        String upperCase3;
        byte b = this.f30054a;
        final byte b2 = 3;
        final byte b3 = 2;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Throwable th = null;
        final byte b4 = 1;
        boolean z = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((s91) obj3).b.w(((lr1) obj2).b, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), z));
                return Unit.f46060a;
            case 1:
                List list = (List) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(list.size(), null, new b8(list, (byte) 16), new ugd(802480018, true, new cz0(list, z, (Function1) obj2, b4)));
                return Unit.f46060a;
            case 2:
                qbs0 qbs0Var = (qbs0) obj2;
                qv2 qv2Var = ((ul2) obj3).w;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.UNKNOWN;
                bcs0 bcs0Var = qbs0Var.f28453a;
                ((k0w0) obj).h(qv2Var.h(new GameScreenGeneralParams(bcs0Var.f2368a, qbs0Var.b.f21523a, bcs0Var.b, bcs0Var.c, this.b, bcs0Var.e, bcs0Var.d, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, k1gVar)));
                return Unit.f46060a;
            case 3:
                d0t d0tVar = (d0t) obj2;
                ((k0w0) obj).h(((yn2) obj3).D.h(new GameScreenGeneralParams(qzb.i0(d0tVar), d0tVar.f5282a, d0tVar.v, d0tVar.u, this.b, d0tVar.n, d0tVar.C, GameBroadcastType.c, grs.b, "favorite", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                return Unit.f46060a;
            case 4:
                ov0 ov0Var = (ov0) obj3;
                hj6 hj6Var = (hj6) obj2;
                ji6 ji6Var = (ji6) obj;
                if (ji6Var != null) {
                    if (ji6Var instanceof hi6) {
                        hi6 hi6Var = (hi6) ji6Var;
                        return h8x.T(hi6Var.f13098a, hi6Var.c, this.b, (ctf0) ov0Var.d, (List) ((fee) ov0Var.c.getValue()).c(), udl0.ADVANCED, hi6Var.b, (aw20) ((fee) ov0Var.b.getValue()).c(), null, hj6Var.h == oxk0.DEFAULT_EACHWAY);
                    }
                    if (!(ji6Var instanceof ii6) && !(ji6Var instanceof gi6)) {
                        t9f.b();
                    }
                }
                return null;
            case 5:
                jie0 jie0Var = (jie0) obj3;
                et8 et8Var = (et8) obj2;
                t33 t33Var = (t33) obj;
                t33Var.getClass();
                int iFloatValue = (int) (((Number) t33Var.d()).floatValue() - jie0Var.f16571a);
                jie0Var.f16571a = ((Number) t33Var.d()).floatValue();
                if (iFloatValue != 0 && (zr8Var = et8Var.b) != null) {
                    zr8Var.a(iFloatValue, 0, true, z);
                }
                return Unit.f46060a;
            case 6:
                mi70 mi70Var = ((kyd) obj3).g;
                tbi0 tbi0Var = new tbi0((String) obj2, z);
                mi70Var.getClass();
                ((k0w0) obj).k(new SendConfirmationSMSScreen(tbi0Var));
                return Unit.f46060a;
            case 7:
                a4x a4xVar = (a4x) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), new vtf(new vlf((byte) 7), a4xVar, objArr == true ? 1 : 0), new dx8(a4xVar, (byte) 22), new ugd(802480018, true, new gx(a4xVar, z, (String) obj2, b4)));
                return Unit.f46060a;
            case 8:
                Long l = (Long) obj2;
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.c = ((gbd0) obj3).c;
                n1gVar.e = new jq2(l.longValue());
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = z ? k1g.OPEN_FROM_PUSH : k1g.OPEN_FROM_BANNER;
                n1gVar.b = l.longValue();
                return Unit.f46060a;
            case 9:
                t4m t4mVar = (t4m) obj3;
                j4m j4mVar = (j4m) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 6.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) - density;
                jge0 jge0Var = new jge0(0.0f, density, fIntBitsToFloat, fIntBitsToFloat2);
                w4m w4mVar = t4mVar.f33327a;
                long j = t4mVar.c.c;
                long j2 = t4mVar.b.c;
                a4x a4xVar2 = w4mVar.f38547a;
                float density2 = pi9Var.getDensity() * j4mVar.e;
                float f = (fIntBitsToFloat2 - density) / (j4mVar.b * 2.0f);
                w03 w03VarA = z03.a();
                Iterator it = a4xVar2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        Throwable th2 = th;
                        q3d.p();
                        throw th2;
                    }
                    v4m v4mVar = (v4m) next;
                    Throwable th3 = th;
                    int i3 = j4mVar.g;
                    float f2 = i3 > 0 ? (v4mVar.f36788a * density2) / i3 : i * density2;
                    Iterator it2 = it;
                    t4m t4mVar2 = t4mVar;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)) - ((v4mVar.b - j4mVar.f15891a) * f);
                    if (i == 0) {
                        w03VarA.f(f2, fIntBitsToFloat3);
                    } else {
                        w03VarA.e(f2, fIntBitsToFloat3);
                    }
                    t4mVar = t4mVar2;
                    i = i2;
                    th = th3;
                    it = it2;
                }
                t4m t4mVar3 = t4mVar;
                w03 w03VarA2 = z03.a();
                w03.a(w03VarA2, w03VarA);
                w03VarA2.e(jge0Var.c, Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)));
                w03VarA2.e(jge0Var.f16474a, Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)));
                w03VarA2.c();
                return pi9Var.a(new rfe(t4mVar3, w03VarA, w03VarA2, this.b, yk5.n(q3d.j(new y3d(j2), new y3d(y3d.c(0.1f, j2))), 0.0f, Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)), 8), yk5.n(q3d.j(new y3d(y3d.c(0.1f, j)), new y3d(j)), Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)), jge0Var.d, 8), jge0Var, j4mVar));
            case 10:
                xcz xczVar = (xcz) obj3;
                xcz xczVar2 = (xcz) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float fE = xczVar.j.e(z ? fFloatValue : -fFloatValue);
                if (!z) {
                    fFloatValue = -fFloatValue;
                }
                xczVar2.e(fFloatValue);
                return Float.valueOf(-fE);
            case 11:
                String str = (String) obj3;
                pz40 pz40Var = (pz40) obj2;
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                if (z && a9q0Var.f() && (iU = StringsKt.U((char) 8294, 0, 6, str)) > 0) {
                    String strN = ohs0.n(StringsKt.w0(str.substring(0, iU), ' ', ','), "…");
                    if (!Intrinsics.d((String) pz40Var.getValue(), strN)) {
                        pz40Var.setValue(strN);
                    }
                }
                return Unit.f46060a;
            case 12:
                qhj qhjVar = (qhj) obj2;
                ((k0w0) obj).c(((tqo) obj3).x.h(new GameScreenGeneralParams(qhjVar.q, qhjVar.p, qhjVar.r, 0L, this.b, 0L, qhjVar.A, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                return Unit.f46060a;
            case 13:
                pz40 pz40Var2 = (pz40) obj2;
                ilz ilzVar = (ilz) obj;
                ilzVar.getClass();
                OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = ((View) obj3).findOnBackInvokedDispatcher();
                if (!z || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                    return new pa2((byte) 6);
                }
                ma3 ma3Var = new ma3(pz40Var2, (byte) 2);
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, ma3Var);
                return new f5d(ilzVar, onBackInvokedDispatcherFindOnBackInvokedDispatcher, ma3Var, (byte) 1);
            case 14:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.b(new b1w0(new hnp(k0w0Var2, (nnp) obj3, this.b, (npn) obj2, null, (byte) 0))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 15:
                ygs ygsVar = (ygs) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                qv2 qv2Var2 = ((nnp) obj3).y;
                GameBroadcastType gameBroadcastType2 = GameBroadcastType.c;
                grs grsVar2 = grs.b;
                ors orsVar2 = ors.f25750a;
                k1g k1gVar2 = k1g.UNKNOWN;
                long j3 = ygsVar.f42600a;
                k0w0Var3.h(qv2Var2.h(new GameScreenGeneralParams(j3, j3, ygsVar.d, ygsVar.B, this.b, ygsVar.f, ygsVar.c, gameBroadcastType2, grsVar2, "main_screen", ygsVar.e, orsVar2, 0, false, k1gVar2)));
                return Unit.f46060a;
            case 16:
                gmp gmpVar = (gmp) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                qv2 qv2Var3 = ((nnp) obj3).y;
                GameBroadcastType gameBroadcastType3 = GameBroadcastType.c;
                grs grsVar3 = grs.b;
                ors orsVar3 = ors.f25750a;
                k1g k1gVar3 = k1g.UNKNOWN;
                vhp vhpVar = gmpVar.f11551a;
                long j4 = vhpVar.f37442a;
                long j5 = vhpVar.c;
                long j6 = vhpVar.d;
                long j7 = vhpVar.g;
                boolean z2 = vhpVar.e;
                String str2 = vhpVar.f;
                str2.getClass();
                k0w0Var4.h(qv2Var3.h(new GameScreenGeneralParams(j4, j4, j5, j6, this.b, j7, z2, gameBroadcastType3, grsVar3, "main_screen", str2, orsVar3, (int) gmpVar.f11551a.h, false, k1gVar3)));
                return Unit.f46060a;
            case 17:
                List list2 = (List) obj3;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, new ugd(431650548, true, new o3m((kpm) obj2, z, b3)), 3);
                hczVar3.f(list2.size(), null, new v2m(list2, (byte) 29), new ugd(802480018, true, new xy1(list2, (byte) 15)));
                return Unit.f46060a;
            case 18:
                u610 u610Var = (u610) obj3;
                String str3 = (String) obj2;
                k0w0 k0w0Var5 = (k0w0) obj;
                qgh qghVar = u610Var.N;
                bek bekVar = sip.f32274a;
                LolScreenParams lolScreenParams = u610Var.r;
                boolean z3 = lolScreenParams.b;
                bekVar.getClass();
                sip sipVarF = bek.f(z3);
                long j8 = lolScreenParams.d;
                ArrayList arrayListU = efx.u(efx.t(n310.g, z), z);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
                Iterator it3 = arrayListU.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Integer.valueOf(((n310) it3.next()).f22827a.f33572a));
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVarF, dam0.f5756a, 40L, j8, str3, arrayList, c9x.r(((m310) u610Var.D()).n, ((m310) u610Var.D()).d, d5c.C(((m310) u610Var.D()).c)));
                qghVar.getClass();
                k0w0Var5.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                bfw bfwVar = (bfw) obj3;
                m730 m730Var = (m730) obj2;
                Map map = (Map) obj;
                map.getClass();
                n0o0 n0o0Var = bfwVar.e;
                cx7 cx7Var = (cx7) map.get(((fee) n0o0Var.getValue()).c());
                if (cx7Var == null || (cx7Var instanceof ax7)) {
                    return null;
                }
                if (!(cx7Var instanceof ww7)) {
                    if (cx7Var instanceof uw7) {
                        return iun.f15405a;
                    }
                    if (cx7Var instanceof yw7) {
                        return iun.f15405a;
                    }
                    t9f.b();
                    return null;
                }
                ww7 ww7Var = (ww7) cx7Var;
                ArrayList arrayList2 = ww7Var.f39874a;
                long j9 = ww7Var.b;
                ctf0 ctf0Var = bfwVar.c;
                List list3 = (List) ((fee) bfwVar.d.getValue()).c();
                udl0 udl0Var = (udl0) bfwVar.i;
                long jLongValue = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                aw20 aw20Var = (aw20) ((fee) bfwVar.f.getValue()).c();
                ycs ycsVar = (ycs) ((fee) bfwVar.g.getValue()).c();
                oxk0 oxk0Var = m730Var.h;
                return h8x.T(arrayList2, j9, this.b, ctf0Var, list3, udl0Var, jLongValue, aw20Var, ycsVar, oxk0Var == oxk0.DEFAULT_EACHWAY || oxk0Var == oxk0.DEFAULT_OPTIONBET_EACHWAY);
            case 20:
                o440 o440Var = (o440) obj2;
                qv2 qv2Var4 = ((m940) obj3).v;
                GameBroadcastType gameBroadcastType4 = GameBroadcastType.c;
                grs grsVar4 = grs.b;
                ors orsVar4 = ors.f25750a;
                k1g k1gVar4 = k1g.UNKNOWN;
                long j10 = o440Var.f24615a;
                ((k0w0) obj).h(qv2Var4.h(new GameScreenGeneralParams(j10, j10, o440Var.b, 0L, this.b, o440Var.c, o440Var.d, gameBroadcastType4, grsVar4, "main_screen", "", orsVar4, 0, false, k1gVar4)));
                return Unit.f46060a;
            case 21:
                qbs0 qbs0Var2 = (qbs0) obj2;
                qv2 qv2Var5 = ((v360) obj3).y;
                GameBroadcastType gameBroadcastType5 = GameBroadcastType.c;
                grs grsVar5 = grs.b;
                ors orsVar5 = ors.f25750a;
                k1g k1gVar5 = k1g.UNKNOWN;
                bcs0 bcs0Var2 = qbs0Var2.f28453a;
                ((k0w0) obj).h(qv2Var5.h(new GameScreenGeneralParams(bcs0Var2.f2368a, qbs0Var2.b.f21523a, bcs0Var2.b, bcs0Var2.c, this.b, bcs0Var2.e, bcs0Var2.d, gameBroadcastType5, grsVar5, "main_screen", "", orsVar5, 0, false, k1gVar5)));
                return Unit.f46060a;
            case 22:
                d0t d0tVar2 = (d0t) obj2;
                ((k0w0) obj).h(((v360) obj3).y.h(new GameScreenGeneralParams(qzb.i0(d0tVar2), d0tVar2.f5282a, d0tVar2.v, d0tVar2.u, this.b, d0tVar2.n, d0tVar2.C, GameBroadcastType.c, grs.b, "favorite", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                return Unit.f46060a;
            case 23:
                final xk80 xk80Var = (xk80) obj3;
                final vne vneVar = (vne) obj2;
                abi0 abi0Var = (abi0) obj;
                if (z) {
                    final Object[] objArr3 = objArr2 == true ? 1 : 0;
                    Function0 function0 = new Function0() { // from class: a.hk80
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = objArr3;
                            boolean z4 = false;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var2 = xk80Var;
                            switch (b5) {
                                case 0:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 1:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 2:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                            }
                        }
                    };
                    iiy[] iiyVarArr = yai0.f42300a;
                    abi0Var.b(mai0.y, new m6(null, function0));
                    abi0Var.b(mai0.A, new m6(null, new Function0() { // from class: a.hk80
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            boolean z4 = false;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var2 = xk80Var;
                            switch (b5) {
                                case 0:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 1:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 2:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                            }
                        }
                    }));
                } else {
                    Function0 function1 = new Function0() { // from class: a.hk80
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b3;
                            boolean z4 = false;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var2 = xk80Var;
                            switch (b5) {
                                case 0:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 1:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 2:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                            }
                        }
                    };
                    iiy[] iiyVarArr2 = yai0.f42300a;
                    abi0Var.b(mai0.z, new m6(null, function1));
                    abi0Var.b(mai0.B, new m6(null, new Function0() { // from class: a.hk80
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b2;
                            boolean z4 = false;
                            vne vneVar2 = vneVar;
                            xk80 xk80Var2 = xk80Var;
                            switch (b5) {
                                case 0:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 1:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                case 2:
                                    if (xk80Var2.c()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 2), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (xk80Var2.d()) {
                                        qjj.W(vneVar2, null, null, new si60(xk80Var2, null, (byte) 3), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                            }
                        }
                    }));
                }
                return Unit.f46060a;
            case 24:
                ow80 ow80Var = (ow80) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                cad cadVar = ((gz80) obj3).t;
                long j11 = ow80Var.f25958a;
                long j12 = ow80Var.b;
                long j13 = ow80Var.c;
                boolean z4 = ow80Var.g;
                GameBroadcastType gameBroadcastType6 = GameBroadcastType.c;
                grs grsVar6 = grs.b;
                String str4 = ow80Var.d;
                long j14 = ow80Var.e;
                int i4 = ow80Var.f;
                k1g k1gVar6 = k1g.OPEN_REGULAR;
                k0w0Var6.h(cadVar.a(j11, j12, j13, this.b, j14, z4, gameBroadcastType6, grsVar6, str4, i4, false));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                c8d c8dVar2 = (c8d) k0w0Var7.b(new b1w0(new hnp(k0w0Var7, (rua0) obj3, this.b, (npn) obj2, null, (byte) 4))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                zgb zgbVar = (zgb) obj2;
                qv2 qv2Var6 = ((r4b0) obj3).d;
                GameBroadcastType gameBroadcastType7 = GameBroadcastType.c;
                grs grsVar7 = grs.b;
                ors orsVar6 = ors.f25750a;
                k1g k1gVar7 = k1g.UNKNOWN;
                long j15 = zgbVar.j;
                ((k0w0) obj).h(qv2Var6.h(new GameScreenGeneralParams(j15, j15, zgbVar.b, zgbVar.c, this.b, zgbVar.f44336a, zgbVar.h, gameBroadcastType7, grsVar7, "main_screen", "", orsVar6, 0, false, k1gVar7)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function1 function2 = (Function1) obj3;
                pfc0 pfc0Var = (pfc0) obj2;
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    w5q0 w5q0Var = (w5q0) x5q0Var;
                    if (z) {
                        upperCase = w5q0Var.f38596a.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = w5q0Var.f38596a;
                    }
                    pfc0Var.getClass();
                    function2.invoke(new p9f0(u0f0.u, upperCase));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Function1 function3 = (Function1) obj3;
                qfc0 qfc0Var = (qfc0) obj2;
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    w5q0 w5q0Var2 = (w5q0) x5q0Var2;
                    if (z) {
                        upperCase2 = w5q0Var2.f38596a.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                    } else {
                        upperCase2 = w5q0Var2.f38596a;
                    }
                    qfc0Var.getClass();
                    function3.invoke(new ewe0(u0f0.u, upperCase2));
                }
                return Unit.f46060a;
            default:
                Function1 function4 = (Function1) obj3;
                rfc0 rfc0Var = (rfc0) obj2;
                x5q0 x5q0Var3 = (x5q0) obj;
                x5q0Var3.getClass();
                if (x5q0Var3 instanceof w5q0) {
                    w5q0 w5q0Var3 = (w5q0) x5q0Var3;
                    if (z) {
                        upperCase3 = w5q0Var3.f38596a.toUpperCase(Locale.ROOT);
                        upperCase3.getClass();
                    } else {
                        upperCase3 = w5q0Var3.f38596a;
                    }
                    rfc0Var.getClass();
                    function4.invoke(new n3f0(u0f0.u, upperCase3));
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ r91(Object obj, boolean z, Object obj2, byte b) {
        this.f30054a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ r91(boolean z, Object obj, Object obj2, byte b) {
        this.f30054a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
