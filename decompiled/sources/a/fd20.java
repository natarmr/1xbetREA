package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fd20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9338a;

    public /* synthetic */ fd20(byte b) {
        this.f9338a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vtb0 vtb0Var;
        vtb0 vtb0Var2;
        wtb0 wtb0Var;
        wtb0 wtb0Var2;
        vtb0 vtb0Var3;
        Object objA = null;
        switch (this.f9338a) {
            case 0:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 1:
                sg20 sg20Var = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var.getClass();
                eo7 eo7Var = sg20Var.d;
                if (eo7Var.equals(bo7.f2918a)) {
                    qvj0 qvj0Var = sg20Var.e;
                    return sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, null, null, jwo0.a(qvj0Var.c, false, false, 0.0d, iun.f15405a, 22), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                }
                if (eo7Var.equals(yn7.f42924a)) {
                    return sg20Var;
                }
                t9f.b();
                return null;
            case 2:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                dx6 dx6Var = rvj0Var.f31171a;
                rvj0 rvj0VarA = rvj0.a(rvj0Var, dx6.a(dx6Var, null, vw6.a(dx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, true, false, 49151), 1), null, null, null, null, 30);
                gx4 gx4Var = b820Var.f;
                if (gx4Var != null) {
                    dx6 dx6Var2 = gx4Var.c;
                    objA = gx4.a(gx4Var, null, null, dx6.a(dx6Var2, null, vw6.a(dx6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, true, false, 49151), 1), null, null, 27);
                }
                return b820.a(b820Var, null, null, null, rvj0VarA, null, objA, null, false, false, false, false, false, 8151);
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                vtb0 vtb0Var4 = a820Var.h;
                if (vtb0Var4 != null) {
                    vtb0Var = vtb0.a(vtb0Var4, 0.0d, 127);
                } else {
                    tw6 tw6Var = a820Var.e.f27665a.b;
                    vtb0Var = new vtb0(tw6Var.c() * tw6Var.f34633a, false, false, false, null, null, g920.CUSTOM, true);
                }
                return a820.a(a820Var, null, null, null, null, null, null, vtb0Var, false, null, 0.0f, false, null, 0, false, false, false, 262015);
            case 5:
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                fo7 fo7Var = b820Var2.b;
                if (fo7Var.equals(co7.b)) {
                    rvj0 rvj0Var2 = b820Var2.d;
                    return b820.a(b820Var2, null, null, null, rvj0.a(rvj0Var2, null, null, kwo0.a(rvj0Var2.c, false, false, 0.0d, iun.f15405a, 28), null, null, 27), null, null, null, false, false, false, false, false, 8183);
                }
                if (fo7Var.equals(xn7.b)) {
                    gx4 gx4Var2 = b820Var2.f;
                    return b820.a(b820Var2, null, null, null, null, null, gx4Var2 != null ? gx4.a(gx4Var2, null, null, null, kwo0.a(gx4Var2.d, false, false, 0.0d, iun.f15405a, 28), null, 23) : null, null, false, false, false, false, false, 8159);
                }
                if (fo7Var.equals(zn7.b)) {
                    return b820Var2;
                }
                t9f.b();
                return null;
            case 6:
                sg20 sg20Var2 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var2.getClass();
                qvj0 qvj0Var2 = sg20Var2.e;
                cx6 cx6Var = qvj0Var2.f29389a;
                return sg20.a(sg20Var2, null, null, null, qvj0.a(qvj0Var2, cx6.a(cx6Var, null, uw6.a(cx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, false, false, true, false, 12287), 1), null, null, null, 30), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 7:
                b820 b820Var3 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var3.getClass();
                vw6 vw6Var = b820Var3.d.f31171a.b;
                return b820.a(b820Var3, null, null, null, null, null, null, new wtb0(vw6Var.c() * vw6Var.f38133a, false, false, false, null, null), false, false, false, false, false, 8127);
            case 8:
                sg20 sg20Var3 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var3.getClass();
                qvj0 qvj0Var3 = sg20Var3.e;
                cx6 cx6Var2 = qvj0Var3.f29389a;
                return sg20.a(sg20Var3, null, null, null, qvj0.a(qvj0Var3, cx6.a(cx6Var2, null, uw6.a(cx6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, false, false, false, false, 12287), 1), null, null, null, 30), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 9:
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                pvj0 pvj0Var = a820Var2.e;
                bx6 bx6Var = pvj0Var.f27665a;
                return a820.a(a820Var2, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(bx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 49151), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 10:
                sg20 sg20Var4 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var4.getClass();
                qvj0 qvj0Var4 = sg20Var4.e;
                return sg20.a(sg20Var4, null, null, null, qvj0.a(qvj0Var4, null, null, jwo0.a(qvj0Var4.c, false, false, 0.0d, iun.f15405a, 22), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 11:
                a820 a820Var3 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var3.getClass();
                return a820.a(a820Var3, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262015);
            case 12:
                b820 b820Var4 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var4.getClass();
                gx4 gx4Var3 = b820Var4.f;
                return b820.a(b820Var4, null, null, null, null, null, gx4Var3 != null ? gx4.a(gx4Var3, null, null, null, kwo0.a(gx4Var3.d, false, false, 0.0d, iun.f15405a, 21), null, 23) : null, null, false, false, false, false, false, 8159);
            case 13:
                a820 a820Var4 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var4.getClass();
                tw6 tw6Var2 = a820Var4.e.f27665a.b;
                return a820.a(a820Var4, null, null, null, null, null, null, new vtb0(tw6Var2.f34633a * tw6Var2.c(), false, false, false, null, null, g920.CUSTOM, false), false, null, 0.0f, false, null, 0, false, false, false, 262015);
            case 14:
                b820 b820Var5 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var5.getClass();
                rvj0 rvj0Var3 = b820Var5.d;
                dx6 dx6Var3 = rvj0Var3.f31171a;
                return b820.a(b820Var5, null, null, null, rvj0.a(rvj0Var3, dx6.a(dx6Var3, null, vw6.a(dx6Var3.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 49151), 1), null, null, null, null, 30), null, null, null, false, false, false, false, false, 8183);
            case 15:
                b820 b820Var6 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var6.getClass();
                rvj0 rvj0Var4 = b820Var6.d;
                return b820.a(b820Var6, null, null, null, rvj0.a(rvj0Var4, null, null, kwo0.a(rvj0Var4.c, false, false, 0.0d, iun.f15405a, 28), null, null, 27), null, null, null, false, false, false, false, false, 8183);
            case 16:
                a820 a820Var5 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var5.getClass();
                hx4 hx4Var = a820Var5.g;
                bx6 bx6Var2 = hx4Var.c;
                return a820.a(a820Var5, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var2, null, tw6.a(bx6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 49151), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 17:
                a820 a820Var6 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var6.getClass();
                vtb0 vtb0Var5 = a820Var6.h;
                if (vtb0Var5 != null) {
                    vtb0Var2 = vtb0.a(vtb0Var5, 0.0d, 251);
                } else {
                    tw6 tw6Var3 = a820Var6.e.f27665a.b;
                    vtb0Var2 = new vtb0(tw6Var3.c() * tw6Var3.f34633a, false, true, false, null, null, g920.CUSTOM, false);
                }
                return a820.a(a820Var6, null, null, null, null, null, null, vtb0Var2, false, null, 0.0f, false, null, 0, false, false, false, 262015);
            case 18:
                a820 a820Var7 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var7.getClass();
                hx4 hx4Var2 = a820Var7.g;
                return a820.a(a820Var7, null, null, null, null, null, hx4.a(hx4Var2, null, null, null, iwo0.a(hx4Var2.d, false, false, 0.0d, iun.f15405a, 21), null, false, 55), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a);
            case 20:
                ql5 ql5Var3 = (ql5) obj;
                ql5 ql5Var4 = (ql5) obj2;
                ql5Var3.getClass();
                ql5Var4.getClass();
                return Boolean.valueOf(ql5Var3.f28916a == ql5Var4.f28916a);
            case 21:
                a820 a820Var8 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var8.getClass();
                return a820.a(a820Var8, null, null, xm5.a(a820Var8.d, null, false, null, new h40(0.0d, f40.d), 7), null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262135);
            case 22:
                b820 b820Var7 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var7.getClass();
                wtb0 wtb0Var3 = b820Var7.g;
                if (wtb0Var3 != null) {
                    wtb0Var = wtb0.a(wtb0Var3, 0.0d, 59);
                } else {
                    vw6 vw6Var2 = b820Var7.d.f31171a.b;
                    wtb0Var = new wtb0(vw6Var2.c() * vw6Var2.f38133a, false, true, false, null, null);
                }
                return b820.a(b820Var7, null, null, null, null, null, null, wtb0Var, false, false, false, false, false, 8127);
            case 23:
                b820 b820Var8 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var8.getClass();
                wtb0 wtb0Var4 = b820Var8.g;
                if (wtb0Var4 != null) {
                    wtb0Var2 = wtb0.a(wtb0Var4, 0.0d, 55);
                } else {
                    vw6 vw6Var3 = b820Var8.d.f31171a.b;
                    wtb0Var2 = new wtb0(vw6Var3.c() * vw6Var3.f38133a, false, false, true, null, null);
                }
                return b820.a(b820Var8, null, null, null, null, null, null, wtb0Var2, false, false, false, false, false, 8127);
            case 24:
                b820 b820Var9 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var9.getClass();
                gx4 gx4Var4 = b820Var9.f;
                if (gx4Var4 != null) {
                    dx6 dx6Var4 = gx4Var4.c;
                    objA = gx4.a(gx4Var4, null, null, dx6.a(dx6Var4, null, vw6.a(dx6Var4.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 49151), 1), null, null, 27);
                }
                return b820.a(b820Var9, null, null, null, null, null, objA, null, false, false, false, false, false, 8159);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a820 a820Var9 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var9.getClass();
                pvj0 pvj0Var2 = a820Var9.e;
                pvj0 pvj0VarA = pvj0.a(pvj0Var2, null, knb0.b(pvj0Var2.b, false, null, 6), null, null, null, false, 61);
                hx4 hx4Var3 = a820Var9.g;
                return a820.a(a820Var9, null, null, null, pvj0VarA, null, hx4.a(hx4Var3, null, null, null, null, knb0.b(hx4Var3.e, false, null, 6), false, 47), null, false, null, 0.0f, false, null, 0, false, false, false, 262063);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b820 b820Var10 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var10.getClass();
                czc0 czc0Var = b820Var10.e;
                return b820.a(b820Var10, null, null, null, null, null, null, new wtb0(0.0d, false, false, false, czc0Var != null ? (String) czc0Var.f5218a.f34747a.getValue() : null, null), false, false, false, false, false, 8127);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                a820 a820Var10 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var10.getClass();
                vtb0 vtb0Var6 = a820Var10.h;
                if (vtb0Var6 != null) {
                    vtb0Var3 = vtb0.a(vtb0Var6, 0.0d, 247);
                } else {
                    tw6 tw6Var4 = a820Var10.e.f27665a.b;
                    vtb0Var3 = new vtb0(tw6Var4.c() * tw6Var4.f34633a, false, false, true, null, null, g920.CUSTOM, false);
                }
                return a820.a(a820Var10, null, null, null, null, null, null, vtb0Var3, false, null, 0.0f, false, null, 0, false, false, false, 262015);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                a820 a820Var11 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var11.getClass();
                dzc0 dzc0Var = a820Var11.f;
                return a820.a(a820Var11, null, null, null, null, dzc0.a(dzc0Var, syc0.a(dzc0Var.f6938a, androidx.compose.runtime.e.e(null), false, false, 46), olc0.a(dzc0Var.c), false, false, false, 42), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111);
            default:
                a820 a820Var12 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var12.getClass();
                pvj0 pvj0Var3 = a820Var12.e;
                bx6 bx6Var3 = pvj0Var3.f27665a;
                pvj0 pvj0VarA2 = pvj0.a(pvj0Var3, bx6.a(bx6Var3, null, tw6.a(bx6Var3.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, !bx6Var3.c, false, 49151), false, 5), null, null, null, null, false, 62);
                hx4 hx4Var4 = a820Var12.g;
                bx6 bx6Var4 = hx4Var4.c;
                return a820.a(a820Var12, null, null, null, pvj0VarA2, null, hx4.a(hx4Var4, null, null, bx6.a(bx6Var4, null, tw6.a(bx6Var4.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, !bx6Var4.c, false, 49151), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262063);
        }
    }
}
