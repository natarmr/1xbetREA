package a;

import android.app.Activity;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Window;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.uikit.components.chips.DsChips;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t13 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33149a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t13(xyl xylVar, List list, boolean z, Integer num) {
        this.f33149a = (byte) 8;
        wxl wxlVar = wxl.PRIMARY;
        uyl uylVar = uyl.f36494a;
        this.c = xylVar;
        this.d = list;
        this.b = z;
        this.e = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        sek sekVar;
        long j;
        long j2;
        byte b = this.f33149a;
        byte b2 = 20;
        byte b3 = 10;
        byte b4 = 5;
        byte b5 = 9;
        byte b6 = 1;
        boolean z = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                vz2 vz2Var = (vz2) obj3;
                m78 m78Var = (m78) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                a6a a6aVar = g7zVar.f10839a;
                if (!((Boolean) ((Function0) obj4).invoke()).booleanValue()) {
                    return Unit.f46060a;
                }
                if (z) {
                    long jE0 = a6aVar.E0();
                    nr nrVar = a6aVar.b;
                    long jP = nrVar.p();
                    nrVar.i().l();
                    try {
                        ((fvt0) nrVar.b).z(-1.0f, 1.0f, jE0);
                        fhl.m0(g7zVar, vz2Var, 0L, 0.0f, m78Var, 0, 46);
                    } finally {
                        defpackage.c.g(nrVar, jP);
                    }
                } else {
                    fhl.m0(g7zVar, vz2Var, 0L, 0.0f, m78Var, 0, 46);
                }
                return Unit.f46060a;
            case 1:
                a570 a570Var = (a570) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(((lf8) obj4).F.f(x1x.D(a570Var), a570Var, (String) obj2, this.b));
                return Unit.f46060a;
            case 2:
                Calendar calendar = (Calendar) obj4;
                hdj hdjVar = (hdj) obj3;
                Function1 function1 = (Function1) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (!z) {
                    return Unit.f46060a;
                }
                calendar.setTimeInMillis(jLongValue);
                SimpleDate simpleDate = new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                if (bsr0.W(simpleDate, hdjVar.b) < 0 || bsr0.W(simpleDate, hdjVar.c) > 0) {
                    return Unit.f46060a;
                }
                if (!simpleDate.equals(hdjVar.a())) {
                    hdjVar.d.setValue(simpleDate);
                    function1.invoke(simpleDate);
                }
                return Unit.f46060a;
            case 3:
                List list = (List) obj3;
                pz40 pz40Var = (pz40) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                float fL = ((f3d) obj4).f8856a.l();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    pu90 pu90Var = (pu90) list.get(i);
                    Object objN = pu90Var.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "BACKGROUND_KEY")) {
                        ou90Var.m(pu90Var, 0, z ? -si30.b(fL) : 0, 0.0f);
                    } else if (Intrinsics.d(objG0, "COLLAPSING_HEADER_KEY")) {
                        ou90Var.m(pu90Var, 0, ((Number) pz40Var.getValue()).intValue() - si30.b(fL), 0.0f);
                    } else if (Intrinsics.d(objG0, "TOOLBAR_KEY")) {
                        ou90Var.m(pu90Var, 0, 0, 1.0f);
                    }
                }
                return Unit.f46060a;
            case 4:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((p2r0) obj4).b;
                hczVar.f(a4xVar.size(), new vtf(new jyf((byte) 26), a4xVar, b6), new dx8(a4xVar, (byte) 24), new ugd(2039820996, true, new ezg(a4xVar, (mm40) obj3, this.b, (Function1) obj2, (byte) 0)));
                return Unit.f46060a;
            case 5:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = ((q2r0) obj4).b;
                hczVar2.f(a4xVar2.size(), new vtf(new jyf((byte) 27), a4xVar2, (byte) 2), new dx8(a4xVar2, (byte) 25), new ugd(2039820996, true, new ezg(a4xVar2, (mm40) obj3, this.b, (Function1) obj2, (byte) 1)));
                return Unit.f46060a;
            case 6:
                omv omvVar = (omv) obj4;
                Function1 function2 = (Function1) obj3;
                yk9 yk9Var = (yk9) obj2;
                ((qk9) obj).getClass();
                if (z) {
                    ckb.a0(omvVar, 3);
                    function2.invoke(Long.valueOf(yk9Var.f42776a));
                }
                return Unit.f46060a;
            case 7:
                ebl eblVar = (ebl) obj4;
                m9s m9sVar = (m9s) obj3;
                String str = (String) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                qgh qghVar = eblVar.N;
                bek bekVar = sip.f32274a;
                CyberGameDotaScreenParams cyberGameDotaScreenParams = eblVar.r;
                boolean z2 = cyberGameDotaScreenParams.b;
                bekVar.getClass();
                sip sipVarF = bek.f(z2);
                long j3 = cyberGameDotaScreenParams.d;
                ArrayList arrayListW = e3c.w(e9l.f, z);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
                Iterator it = arrayListW.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((e9l) it.next()).f7427a.f33572a));
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVarF, dam0.f5756a, 40L, j3, str, arrayList, ckb.L(((f9l) eblVar.D()).m, ((f9l) eblVar.D()).d, m9sVar, ((f9l) eblVar.D()).v, z));
                qghVar.getClass();
                k0w0Var2.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
            case 8:
                wxl wxlVar = wxl.PRIMARY;
                uyl uylVar = uyl.f36494a;
                Integer num = (Integer) obj2;
                DsChips dsChips = (DsChips) obj;
                dsChips.getClass();
                dsChips.setStyle(wxlVar);
                dsChips.setEnabled(true);
                dsChips.setDsChipsType((xyl) obj4);
                dsChips.setChips((List) obj3);
                dsChips.setSelectionMode(uylVar);
                dsChips.setLoading(z);
                if (num != null) {
                    dsChips.setCustomHorizontalMargin(num.intValue());
                }
                return Unit.f46060a;
            case 9:
                a4x a4xVar3 = (a4x) obj4;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(a4xVar3.size(), null, new v2m(a4xVar3, (byte) 14), new ugd(802480018, true, new vfe((List) a4xVar3, obj3, this.b, (Function1) obj2, (byte) 1)));
                return Unit.f46060a;
            case 10:
                a4x a4xVar4 = (a4x) obj4;
                xcz xczVar = (xcz) obj3;
                Function1 function3 = (Function1) obj2;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    xczVar.k(xczVar.h(), xczVar.i());
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    hczVar4.f(a4xVar4.size(), new ctl((Object) new mmn(b6), (Object) a4xVar4, (byte) 21), new v2m(a4xVar4, (byte) 20), new ugd(802480018, true, new cz0(a4xVar4, z, function3, (byte) 4)));
                    return Unit.f46060a;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            case 11:
                odd oddVar = (odd) obj4;
                jzj jzjVar = (jzj) obj3;
                vpq vpqVar = (vpq) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    if (l8x.j0()) {
                        Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th2);
                    }
                    oddVar.b0(th2);
                } else {
                    k0g0 k0g0Var = (k0g0) jzjVar.getCompleted();
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "propagateToFocusMeteringResultDeferred: result3A = " + k0g0Var);
                    }
                    byte b7 = k0g0Var.f17465a;
                    if (b7 == 4) {
                        dw9.z("Camera is not active.", oddVar);
                    } else if (b7 == 2) {
                        oddVar.N(new sek());
                    } else {
                        vpqVar.getClass();
                        if (k0g0Var.f17465a == 0) {
                            pz2 pz2Var = k0g0Var.b;
                            if (pz2Var != null) {
                                CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
                                key.getClass();
                            }
                            if (z) {
                                List list2 = q70.b;
                                ArrayList arrayList2 = vpqVar.m;
                                if (arrayList2 != null) {
                                    arrayList2.contains(new q70(1));
                                }
                            }
                            sekVar = new sek();
                        } else {
                            sekVar = new sek();
                        }
                        oddVar.N(sekVar);
                    }
                }
                return Unit.f46060a;
            case 12:
                w03 w03Var = (w03) obj4;
                w03 w03Var2 = (w03) obj3;
                i9q i9qVar = (i9q) obj2;
                a4x a4xVar5 = i9qVar.c;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                w03Var.i();
                w03Var2.i();
                nr nrVarA0 = fhlVar.A0();
                long jP2 = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    fvt0 fvt0Var = (fvt0) nrVarA0.b;
                    Throwable th3 = null;
                    fvt0Var.z(z ? -1.0f : 1.0f, -1.0f, p7x.u(((nr) fvt0Var.f10231a).p()));
                    qcc.R(fhlVar, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                    long j4 = i9qVar.j;
                    long j5 = i9qVar.g;
                    Iterator it2 = a4xVar5.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        try {
                            Object next = it2.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                Throwable th4 = th3;
                                q3d.p();
                                throw th4;
                            }
                            p9q p9qVar = (p9q) next;
                            Throwable th5 = th3;
                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(p9qVar.b);
                            bigDecimalValueOf.getClass();
                            j2 = jP2;
                            Iterator it3 = it2;
                            try {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j5);
                                bigDecimalValueOf2.getClass();
                                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j4);
                                bigDecimalValueOf3.getClass();
                                float fP = (float) tdc.P(bigDecimalValueOf, fIntBitsToFloat, bigDecimalValueOf3, bigDecimalValueOf2);
                                long j6 = j4;
                                float fP2 = (float) tdc.P(new BigDecimal(String.valueOf(p9qVar.f26620a)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)), new BigDecimal(String.valueOf(i9qVar.f14399a)), new BigDecimal(String.valueOf(i9qVar.b)));
                                if (i2 == 0) {
                                    w03Var.f(fP, fP2);
                                } else {
                                    w03Var.e(fP, fP2);
                                }
                                it2 = it3;
                                i2 = i3;
                                th3 = th5;
                                j4 = j6;
                                jP2 = j2;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j2 = jP2;
                        }
                        j = j2;
                        defpackage.c.g(nrVarA0, j);
                        throw th;
                    }
                    long j7 = jP2;
                    long j8 = j4;
                    pz40 pz40Var2 = s6t0.f31722a;
                    long primary = s6t0.b().f33626a.getPrimary();
                    zcl zclVar = qmk.f28987a;
                    j = j7;
                    try {
                        fhl.C0(fhlVar, w03Var, primary, 0.0f, new vtm0(fhlVar.w0(2.0f), 0.0f, 0, 1, null, 22), 52);
                        w03.a(w03Var2, w03Var);
                        p9q p9qVar2 = (p9q) CollectionsKt.f0(a4xVar5);
                        if (p9qVar2 == null) {
                            Unit unit = Unit.f46060a;
                            defpackage.c.g(nrVarA0, j);
                            return unit;
                        }
                        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(p9qVar2.b);
                        bigDecimalValueOf4.getClass();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j5);
                        bigDecimalValueOf5.getClass();
                        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j8);
                        bigDecimalValueOf6.getClass();
                        w03Var2.e((float) tdc.P(bigDecimalValueOf4, fIntBitsToFloat2, bigDecimalValueOf6, bigDecimalValueOf5), 0.0f);
                        w03Var2.e(0.0f, 0.0f);
                        w03Var2.c();
                        fhl.C0(fhlVar, w03Var2, s6t0.b().f33626a.getPrimary20(), 0.0f, null, 60);
                        defpackage.c.g(nrVarA0, j);
                        return Unit.f46060a;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    j = jP2;
                }
                break;
            case 13:
                Window window = (Window) obj4;
                Activity activity = (Activity) obj3;
                l7m0 l7m0Var = (l7m0) obj2;
                ((ilz) obj).getClass();
                if (window != null) {
                    ofm0.y(window, activity, R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, ((Boolean) l7m0Var.getValue()).booleanValue(), !z);
                }
                return new pa2((byte) 9);
            case 14:
                k0w0 k0w0Var3 = (k0w0) obj;
                ck60 ck60Var = new ck60((pm60) obj4, (a570) obj3, (String) obj2, (byte) 2);
                k0w0Var3.getClass();
                c8d c8dVar = (c8d) k0w0Var3.b(new a1w0(ck60Var)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
                return Unit.f46060a;
            case 15:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar2 = (c8d) k0w0Var4.b(new b1w0(new je2((f47) obj4, (z470) obj3, this.b, (String) obj2, null))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 16:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar6 = (a4x) ((l7m0) obj4).getValue();
                hczVar5.f(a4xVar6.size(), new m160(new ev80(b5), a4xVar6, b2), new m160(new ev80(b3), a4xVar6, (byte) 21), new ugd(802480018, true, new vfe(a4xVar6, z, (qdz) obj3, (Function1) obj2)));
                return Unit.f46060a;
            case 17:
                a4x a4xVar7 = (a4x) obj4;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(a4xVar7.size(), new zu90(b4, new jfa0(b6), a4xVar7), new a580(a4xVar7, (byte) 22), new ugd(2039820996, true, new vfe((List) a4xVar7, obj3, this.b, (Function1) obj2, (byte) 5)));
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var5 = (k0w0) obj;
                ck60 ck60Var2 = new ck60((g9b0) obj4, (a570) obj3, (String) obj2, b5);
                k0w0Var5.getClass();
                c8d c8dVar3 = (c8d) k0w0Var5.b(new a1w0(ck60Var2)).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(z, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rbb rbbVar = (rbb) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                qv2 qv2Var = ((tjb0) obj4).p;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.UNKNOWN;
                long j9 = ((ygs) obj3).f42600a;
                long j10 = rbbVar.n;
                ygs ygsVar = (ygs) CollectionsKt.firstOrNull(rbbVar.p);
                k0w0Var6.h(qv2Var.h(new GameScreenGeneralParams(j9, j9, j10, ygsVar != null ? ygsVar.B : 0L, this.b, rbbVar.f30176a, rbbVar.m, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, k1gVar)));
                return Unit.f46060a;
            case 20:
                ArrayList arrayList3 = (ArrayList) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    pu90 pu90Var2 = (pu90) arrayList3.get(i4);
                    if (z) {
                        ou90Var2.g(pu90Var2, ((Number) arrayList5.get(i4)).intValue(), 0, 1.0f);
                    } else {
                        ou90Var2.m(pu90Var2, ((Number) arrayList5.get(i4)).intValue(), 0, 1.0f);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    pu90 pu90Var3 = (pu90) arrayList4.get(i5);
                    if (z) {
                        ou90Var2.g(pu90Var3, 0, 0, 0.0f);
                    } else {
                        ou90Var2.m(pu90Var3, 0, 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 21:
                rek0 rek0Var = ((xxi0) obj4).G0;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams((String) obj3, z, (String) obj2);
                rek0Var.getClass();
                ((k0w0) obj).h(new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams));
                return Unit.f46060a;
            case 22:
                rek0 rek0Var2 = ((odj0) obj4).D0;
                AppUpdateScreenParams appUpdateScreenParams2 = new AppUpdateScreenParams((String) obj3, z, (String) obj2);
                rek0Var2.getClass();
                ((k0w0) obj).h(new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams2));
                return Unit.f46060a;
            case 23:
                rek0 rek0Var3 = ((org.xplatform.settings.impl.presentation.a) obj4).t0;
                AppUpdateScreenParams appUpdateScreenParams3 = new AppUpdateScreenParams((String) obj3, z, (String) obj2);
                rek0Var3.getClass();
                ((k0w0) obj).h(new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams3));
                return Unit.f46060a;
            case 24:
                rek0 rek0Var4 = ((ngj0) obj4).G0;
                AppUpdateScreenParams appUpdateScreenParams4 = new AppUpdateScreenParams((String) obj3, z, (String) obj2);
                rek0Var4.getClass();
                ((k0w0) obj).h(new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams4));
                return Unit.f46060a;
            default:
                og00 og00Var = (og00) obj4;
                String strSubstring = (String) obj3;
                nqv0 nqv0Var = (nqv0) obj2;
                Throwable th10 = (Throwable) obj;
                if (th10 instanceof eqv0) {
                    og00Var.c.compareAndSet(-256, ((eqv0) th10).f8255a);
                }
                if (z && strSubstring != null) {
                    int iHashCode = nqv0Var.f23975a.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        sf3.e(iHashCode, strSubstring);
                    } else {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        try {
                            Method method = afn0.d;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                afn0.d = method;
                            }
                            if (method == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            method.invoke(null, Long.valueOf(afn0.f787a), strSubstring, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            if (e instanceof InvocationTargetException) {
                                Throwable cause = ((InvocationTargetException) e).getCause();
                                if (cause instanceof RuntimeException) {
                                    throw cause;
                                }
                                ohq.p(cause);
                                return null;
                            }
                            Log.v("Trace", "Unable to call asyncTraceEnd via reflection", e);
                        }
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t13(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.f33149a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ t13(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.f33149a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ t13(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.f33149a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ t13(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.f33149a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
