package a;

import android.content.res.Resources;
import android.view.inputmethod.BaseInputConnection;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rcz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30264a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rcz(Object obj, byte b) {
        this.f30264a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f30264a;
        boolean z = true;
        Object obj = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                tcz tczVar = (tcz) obj2;
                qls0 qls0VarP = pgi0.p(CollectionsKt.I(tczVar.f33739a.j().l), scz.f32008a);
                Iterator it = qls0VarP.f28951a.iterator();
                while (it.hasNext()) {
                    Object objInvoke = qls0VarP.b.invoke(it.next());
                    ucz uczVar = (ucz) objInvoke;
                    if (uczVar.f35454a.p <= ((Number) tczVar.b.invoke(tczVar, uczVar)).intValue()) {
                        obj = objInvoke;
                    }
                }
                return (ucz) obj;
            case 1:
                return new xcz(0, 0, (pvj) obj2);
            case 2:
                return new xcz((uwq) obj2, 0, 0);
            case 3:
                return (vfz) ((gii0) ((lbu) obj2).b).b(sre0.f32672a.b(vfz.class));
            case 4:
                return ((vgz) obj2).b;
            case 5:
                LeaderBoardScreenParams leaderBoardScreenParams = (LeaderBoardScreenParams) obj2;
                lel0.Companion.getClass();
                return new ihz(leaderBoardScreenParams, leaderBoardScreenParams.f46564a, 0, leaderBoardScreenParams.c == ggz.b ? xhz.TEAMS_TYPE : xhz.PRIZES_TYPE, qgz.AMERICA, epe.HLTV, new ypl0(0L, "", kel0.a()), iun.f15405a, j2h.f15779a, null, null, null, null, null, false, true, false);
            case 6:
                return new BaseInputConnection(((ejz) obj2).f7930a, false);
            case 7:
                zn20 zn20Var = (zn20) ((klz) obj2).f18514a.b;
                if (!zn20Var.b) {
                    if (zn20Var.c) {
                        esb0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zn20Var.a();
                    zn20Var.c = true;
                }
                return Unit.f46060a;
            case 8:
                qpz qpzVar = (qpz) obj2;
                p7m0 p7m0Var = qpzVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    qpzVar.f.getClass();
                } while (!p7m0Var.m(value, opz.a((opz) value, null, null, false, 3)));
                return Unit.f46060a;
            case 9:
                lqz lqzVar = (lqz) obj2;
                p7m0 p7m0Var2 = lqzVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    lqzVar.f.getClass();
                } while (!p7m0Var2.m(value2, jqz.a((jqz) value2, null, null, false, 3)));
                return Unit.f46060a;
            case 10:
                irz irzVar = (irz) obj2;
                p7m0 p7m0Var3 = irzVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    irzVar.f.getClass();
                } while (!p7m0Var3.m(value3, erz.a((erz) value3, null, null, false, false, 11)));
                return Unit.f46060a;
            case 11:
                xuz xuzVar = zuz.N1;
                fiu0 fiu0Var = ((zuz) obj2).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                pji pjiVar = ((hwz) obj2).K1;
                if (pjiVar != null) {
                    return new q0h0(pjiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 13:
                htz htzVar = q000.P1;
                fiu0 fiu0Var2 = ((q000) obj2).L1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 14:
                p100 p100Var = (p100) obj2;
                p7m0 p7m0Var4 = p100Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    p100Var.f.getClass();
                } while (!p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, null, 4087)));
                return Unit.f46060a;
            case 15:
                return (kuz) ((gii0) ((abu) obj2).b).b(sre0.f32672a.b(kuz.class));
            case 16:
                sji sjiVar = ((c400) obj2).K1;
                if (sjiVar != null) {
                    return new q0h0(sjiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 17:
                return Float.valueOf(LineChartView.a((LineChartView) obj2));
            case 18:
                xuz xuzVar2 = ha00.S1;
                fiu0 fiu0Var3 = ((ha00) obj2).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((uwh0) obj2).f36392a.size());
            case 20:
                return m2x.l(((kh00) obj2).b);
            case 21:
                return (ni00) ((gii0) ((lbu) obj2).b).b(sre0.f32672a.b(ni00.class));
            case 22:
                return ((qi00) obj2).u.a();
            case 23:
                mez mezVar = (mez) obj2;
                if (mezVar.g() != 0 || (!mezVar.c() && !mezVar.d())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                fiu0 fiu0Var4 = ((yl00) obj2).g2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((fsd) ((pzu) obj2).f27863a).a().f36976a == 999);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i = LoadableImageView.i;
                return new r0x((LoadableImageView) obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i2 = LoaderView.e;
                return new tq00((LoaderView) obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (gs00) ((gii0) ((zn00) obj2).f44650a).b(sre0.f32672a.b(gs00.class));
            default:
                us00 us00Var = (us00) obj2;
                Resources resources = us00Var.getApplicationContext().getResources();
                resources.getClass();
                l4x l4xVar = us00Var.f36186a;
                Object applicationContext = us00Var.getApplicationContext();
                applicationContext.getClass();
                z7z z7zVar = ((ApplicationLoader) ((xs00) applicationContext)).p;
                return new vs00(resources, l4xVar, z7zVar != null ? ((j1q0) z7zVar.get()).f15748a.f21021a.a().getBoolean("TEST_MULTIPLY_STRINGS_ENABLE", false) : false);
        }
    }
}
