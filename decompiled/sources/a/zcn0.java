package a;

import android.javax.sip.message.Response;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class zcn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44175a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zcn0(Object obj, Object obj2, byte b) {
        this.f44175a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44175a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((f8l0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                h2l0 h2l0Var = (h2l0) obj;
                aan0 aan0Var = (aan0) obj2;
                Function1 function1 = (Function1) obj3;
                h2l0Var.getClass();
                int iOrdinal = h2l0Var.ordinal();
                if (iOrdinal == 3) {
                    function1.invoke(new zdn0(aan0Var));
                } else if (iOrdinal == 4) {
                    function1.invoke(new aen0(aan0Var));
                }
                return Unit.f46060a;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((acm0) obj3).invoke(Integer.valueOf(iIntValue), ((a4x) obj2).get(iIntValue));
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                return ((acm0) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 4:
                return ((rgn0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 5:
                return ((rgn0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 6:
                int iIntValue3 = ((Number) obj).intValue();
                return ((ofo0) obj3).invoke(Integer.valueOf(iIntValue3), ((ArrayList) obj2).get(iIntValue3));
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                return ((ofo0) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 8:
                int iIntValue5 = ((Number) obj).intValue();
                return ((ofo0) obj3).invoke(Integer.valueOf(iIntValue5), ((ArrayList) obj2).get(iIntValue5));
            case 9:
                return ((meo0) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 10:
                int iIntValue6 = ((Number) obj).intValue();
                return ((ofo0) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            case 11:
                return ((meo0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                int iIntValue7 = ((Number) obj).intValue();
                return ((ofo0) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
            case 13:
                ((h2l0) obj).getClass();
                ((Function1) obj3).invoke(new v3p0(((m3p0) ((n3p0) obj2)).b));
                return Unit.f46060a;
            case 14:
                int iIntValue8 = ((Number) obj).intValue();
                return ((zgp0) obj3).invoke(Integer.valueOf(iIntValue8), ((List) obj2).get(iIntValue8));
            case 15:
                KeyEvent keyEvent = ((gky) obj).f11467a;
                wpq wpqVar = (wpq) obj3;
                InputDevice device = keyEvent.getDevice();
                boolean zI = false;
                if (device != null && device.supportsSource(Response.MESSAGE_TOO_LARGE) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && n7x.H(keyEvent) == 2 && keyEvent.getSource() != 257)) {
                    if (ltt0.q(19, keyEvent)) {
                        zI = ((ypq) wpqVar).i(5, true);
                    } else if (ltt0.q(20, keyEvent)) {
                        zI = ((ypq) wpqVar).i(6, true);
                    } else if (ltt0.q(21, keyEvent)) {
                        zI = ((ypq) wpqVar).i(3, true);
                    } else if (ltt0.q(22, keyEvent)) {
                        zI = ((ypq) wpqVar).i(4, true);
                    } else if (ltt0.q(23, keyEvent)) {
                        pkk0 pkk0Var = ((djz) obj2).c;
                        if (pkk0Var != null) {
                            ((r3k) pkk0Var).b();
                        }
                        zI = true;
                    }
                }
                return Boolean.valueOf(zI);
            case 16:
                int iIntValue9 = ((Number) obj).intValue();
                return ((shq0) obj3).invoke(Integer.valueOf(iIntValue9), ((List) obj2).get(iIntValue9));
            case 17:
                return ((t6q0) obj3).invoke(((a4x) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((t6q0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue10 = ((Number) obj).intValue();
                return ((shq0) obj3).invoke(Integer.valueOf(iIntValue10), ((a4x) obj2).get(iIntValue10));
            case 20:
                return ((t9r0) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 21:
                ((h2l0) obj).getClass();
                ((Function1) obj3).invoke(new jkb0(((h1b0) obj2).f12275a));
                return Unit.f46060a;
            case 22:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                a2n a2nVar = (a2n) obj3;
                egd egdVarE0 = null;
                w56 w56Var = a2nVar instanceof w56 ? (w56) a2nVar : null;
                if (w56Var != null) {
                    if ((w56Var instanceof s56) || (w56Var instanceof t56)) {
                        egdVarE0 = uzb.E0(j6zVar, 0.0f, (15 & 2) != 0 ? 0.0f : sj3.X(-12), 0.0f, (15 & 8) != 0 ? 0.0f : 0.0f, 16);
                    } else if ((w56Var instanceof r56) || (w56Var instanceof u56) || (w56Var instanceof v56)) {
                        egdVarE0 = uzb.E0(j6zVar, 0.0f, (15 & 2) != 0 ? 0.0f : sj3.X(-16), 0.0f, (15 & 8) != 0 ? 0.0f : 0.0f, 16);
                    }
                }
                if (egdVarE0 != null) {
                    ((Function1) obj2).invoke(new ekb0(new ukb0(egdVarE0)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue11 = ((Number) obj).intValue();
                return ((shq0) obj3).invoke(Integer.valueOf(iIntValue11), ((ArrayList) obj2).get(iIntValue11));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((t9r0) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            default:
                return ((t9r0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
