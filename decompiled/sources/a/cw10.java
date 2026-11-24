package a;

import android.content.Intent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cw10 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5058a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cw10(Object obj, byte b) {
        this.f5058a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f5058a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((bh0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                b120 b120Var = new b120((xqj0) obj, (byte) 1);
                int i = f120.p0;
                ((f120) obj2).H(b120Var);
                return Unit.f46060a;
            case 8:
                return b((Intent) obj, yjeVar);
            case 9:
                Object objInvoke8 = ((e000) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 10:
                Object objInvoke9 = ((e000) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 11:
                Object objInvoke10 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 12:
                Object objInvoke11 = ((u620) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 13:
                Object objInvoke12 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 14:
                Object objInvoke13 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                Object objInvoke14 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 16:
                Object objInvoke15 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 17:
                Object objInvoke16 = ((khx) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                Object objInvoke17 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke18 = ((u620) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 20:
                Object objInvoke19 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 21:
                Object objInvoke20 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 22:
                Object objInvoke21 = ((w620) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 23:
                Object objInvoke22 = ((u620) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 24:
                Object objInvoke23 = ((u620) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke24 = ((t620) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke25 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke26 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke27 = ((dm10) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
            default:
                Object objInvoke28 = ((g820) obj2).invoke(obj, yjeVar);
                return objInvoke28 == wne.f39444a ? objInvoke28 : Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(Intent intent, yje yjeVar) {
        h220 h220Var;
        w220 w220Var = (w220) this.b;
        if (yjeVar instanceof h220) {
            h220Var = (h220) yjeVar;
            int i = h220Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h220Var.k = i - Integer.MIN_VALUE;
            } else {
                h220Var = new h220(this, yjeVar);
            }
        } else {
            h220Var = new h220(this, yjeVar);
        }
        Object obj = h220Var.i;
        wne wneVar = wne.f39444a;
        int i2 = h220Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (Intrinsics.d(intent.getAction(), "RESTART") || (intent.hasCategory("android.intent.category.LAUNCHER") && Intrinsics.d(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.DEFAULT"))) {
                bby bbyVar = w220Var.n1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                h220Var.k = 1;
                qcc.G(h220Var);
                return wneVar;
            }
            if (intent.getBooleanExtra("DISMISS_DIALOGS", true)) {
                w220Var.y1.f(Unit.f46060a);
            }
            erj erjVar = w220Var.l0;
            h220Var.k = 2;
            if (erjVar.K(intent, h220Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 == 1) {
                z1x.P(obj);
                csj.b();
                return null;
            }
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
