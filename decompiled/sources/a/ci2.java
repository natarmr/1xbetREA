package a;

import android.view.KeyEvent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ci2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4391a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci2(Object obj, Object obj2, byte b) {
        this.f4391a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hge0 hge0Var;
        qgv0 qgv0Var;
        switch (this.f4391a) {
            case 0:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 1:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 2:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 3:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 4:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 5:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 6:
                int iIntValue = ((Number) obj).intValue();
                return ((ma2) this.c).invoke(Integer.valueOf(iIntValue), ((a4x) this.b).get(iIntValue));
            case 7:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 8:
                return ((xd2) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 9:
                String str = (String) obj;
                vm2 um2Var = ((nn2) ((on2) this.c)).b;
                um2 um2Var2 = um2Var instanceof um2 ? (um2) um2Var : null;
                if (um2Var2 != null) {
                    nxy nxyVar = um2Var2.f35900a;
                    nxyVar.getClass();
                    um2Var = new um2(nxyVar, str);
                }
                ((Function1) this.b).invoke(um2Var);
                return Unit.f46060a;
            case 10:
                return ((xd2) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 11:
                yex yexVar = (yex) this.c;
                synchronized (yexVar.c) {
                    try {
                        yexVar.e = true;
                        xz40 xz40Var = yexVar.d;
                        Object[] objArr = xz40Var.f41739a;
                        int i = xz40Var.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            q860 q860Var = (q860) ((g1v0) objArr[i2]).get();
                            if (q860Var != null && (hge0Var = q860Var.b) != null) {
                                hge0Var.closeConnection();
                                q860Var.b = null;
                            }
                        }
                        yexVar.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o8q0 o8q0Var = ((c13) this.b).b;
                o8q0Var.b.set(null);
                o8q0Var.f24843a.b();
                return Unit.f46060a;
            case 12:
                r23 r23Var = (r23) this.c;
                s23 s23Var = (s23) this.b;
                synchronized (r23Var.e) {
                    r23Var.g.remove(s23Var);
                }
                return Unit.f46060a;
            case 13:
                ((t23) this.c).f33197a.removeFrameCallback((s23) this.b);
                return Unit.f46060a;
            case 14:
                int iIntValue2 = ((Number) obj).intValue();
                return ((o33) this.c).invoke(Integer.valueOf(iIntValue2), ((List) this.b).get(iIntValue2));
            case 15:
                return ((or3) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 16:
                int iIntValue3 = ((Number) obj).intValue();
                return ((o33) this.c).invoke(Integer.valueOf(iIntValue3), ((a4x) this.b).get(iIntValue3));
            case 17:
                return ((ij4) this.c).invoke(((a4x) this.b).get(((Number) obj).intValue()));
            case 18:
                return ((ij4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ij4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 20:
                KeyEvent keyEvent = ((gky) obj).f11467a;
                pz40 pz40Var = (pz40) this.b;
                if (!((bxq0) this.c).b()) {
                    pz40Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 21:
                return ((h26) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 22:
                return ((h26) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 23:
                return ((h26) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 24:
                return ((h26) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue4 = ((Number) obj).intValue();
                return ((os6) this.c).invoke(Integer.valueOf(iIntValue4), ((ArrayList) this.b).get(iIntValue4));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue5 = ((Number) obj).intValue();
                return (iIntValue5 != 1 || (qgv0Var = ((x77) ((z77) this.b)).i) == null) ? sre0.f32672a.b(((o8w) ((ArrayList) this.c).get(iIntValue5)).getClass()) : qgv0Var;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.c).invoke(new stg0(((Number) obj).floatValue(), ((f8k0) this.b).c));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((nk7) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            default:
                return ((nk7) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
        }
    }
}
