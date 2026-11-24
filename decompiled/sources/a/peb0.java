package a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.popular_classic.impl.navigation.PopularClassicScreenFactoryImpl$getScreen$1;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class peb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26845a;

    public /* synthetic */ peb0(kd30 kd30Var) {
        this.f26845a = (byte) 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strC = null;
        switch (this.f26845a) {
            case 0:
                oeb0 oeb0Var = (oeb0) obj;
                oeb0Var.getClass();
                return sre0.f32672a.b(oeb0Var.getClass());
            case 1:
                m1r m1rVar = (m1r) obj;
                m1rVar.getClass();
                return new PopularClassicScreenFactoryImpl$getScreen$1().a(m1rVar);
            case 2:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 3:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 4:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 8.0f;
                return pi9Var.a(new r2a0((byte) 2, (((long) Float.floatToRawIntBits(density)) & 4294967295L) | (((long) Float.floatToRawIntBits(density)) << 32)));
            case 5:
                ((pkb0) obj).getClass();
                return Unit.f46060a;
            case 6:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 2, null, null, ccq0.e, 6);
                return Unit.f46060a;
            case 7:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8z.f(i8zVar, 6, null, null, ccq0.f, 14);
                return Unit.f46060a;
            case 8:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                fhl.u(fhlVar3, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 9:
                fhl fhlVar4 = (fhl) obj;
                fhlVar4.getClass();
                pz40 pz40Var4 = s6t0.f31722a;
                fhl.u(fhlVar4, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 10:
                idb0 idb0Var = (idb0) obj;
                idb0Var.getClass();
                if (idb0Var.f14577a) {
                    return gdb0.f11097a;
                }
                if (idb0Var.b) {
                    return cdb0.f4154a;
                }
                if (idb0Var.c && !idb0Var.d) {
                    return bdb0.f2391a;
                }
                if (idb0Var.e) {
                    return edb0.f7608a;
                }
                if (idb0Var.g) {
                    return ddb0.f5888a;
                }
                if (idb0Var.f) {
                    return fdb0.f9352a;
                }
                return null;
            case 11:
                return (skb0) obj;
            case 12:
                List list = (List) obj;
                list.getClass();
                return dyb.r0(list);
            case 13:
                String str = (String) obj;
                str.getClass();
                aoo0.f1212a.getClass();
                return s9m0.g(str);
            case 14:
                ql5 ql5Var = (ql5) obj;
                if (ql5Var != null) {
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(ql5Var.b, p3u0.c);
                }
                return strC == null ? "" : strC;
            case 15:
                ql5 ql5Var2 = (ql5) obj;
                strC = ql5Var2 != null ? ql5Var2.f : null;
                return strC == null ? "" : strC;
            case 16:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.e = new jr2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 17:
                ckv ckvVar = (ckv) obj;
                ckvVar.getClass();
                return new yib0(ckvVar);
            case 18:
                rmb0 rmb0Var = (rmb0) obj;
                if (rmb0Var.isAttachedToWindow()) {
                    rmb0Var.r();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return (ql5) feeVar.c();
            case 20:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                return (sob0) feeVar2.c();
            case 21:
                fee feeVar3 = (fee) obj;
                feeVar3.getClass();
                return (List) feeVar3.c();
            case 22:
                fee feeVar4 = (fee) obj;
                feeVar4.getClass();
                return (List) feeVar4.c();
            case 23:
                fee feeVar5 = (fee) obj;
                feeVar5.getClass();
                Boolean bool = (Boolean) feeVar5.c();
                bool.booleanValue();
                return bool;
            case 24:
                fee feeVar6 = (fee) obj;
                feeVar6.getClass();
                return (cit0) feeVar6.c();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fee feeVar7 = (fee) obj;
                feeVar7.getClass();
                return (a5w) feeVar7.c();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fee feeVar8 = (fee) obj;
                feeVar8.getClass();
                return (String) feeVar8.c();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fhl fhlVar5 = (fhl) obj;
                fhlVar5.getClass();
                pz40 pz40Var5 = s6t0.f31722a;
                fhl.u(fhlVar5, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Context context = (Context) obj;
                context.getClass();
                return new DsTeamLogo(new ContextThemeWrapper(context, R.style.Widget_DSSportTeamLogo_Size32), null);
            default:
                return lyb0.b;
        }
    }

    public /* synthetic */ peb0(byte b) {
        this.f26845a = b;
    }
}
