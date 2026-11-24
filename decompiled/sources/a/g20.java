package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.main_menu.impl.presentation.common.views.AggregatorBanner;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10539a;

    public /* synthetic */ g20(byte b) {
        this.f10539a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f10539a;
        byte b2 = 25;
        byte b3 = 1;
        oh0 oh0Var = oh0.f25241a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uc9.C(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_aggregator_banner_compact, viewGroup, false);
                if (viewF != null) {
                    return new vrx((AggregatorBanner) viewF);
                }
                hny.u("rootView");
                return null;
            case 5:
                Map map = (Map) obj2;
                ((azg0) obj).getClass();
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(String.valueOf(((Number) entry.getKey()).longValue()), entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), Integer.valueOf(fbc.U(((y3d) entry2.getValue()).f41946a)));
                }
                return linkedHashMap2;
            case 6:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(24.0f);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fW0) / 2.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - fW0) / 2.0f;
                pm80 pm80Var = nu90Var.f24139a;
                ((fvt0) fhlVar.A0().b).A(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    pm80Var.e(fhlVar, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), nu90Var.b, nu90Var.c);
                    return Unit.f46060a;
                } finally {
                    ((fvt0) fhlVar.A0().b).A(-fIntBitsToFloat, -fIntBitsToFloat2);
                }
            case 7:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_aggregator_banner_line, viewGroup2, false);
                if (viewF2 != null) {
                    return new wrx((AggregatorBanner) viewF2);
                }
                hny.u("rootView");
                return null;
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new b5((byte) 23));
                function2.invoke(new mg0((byte) 0));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                x8f.O(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                Integer num = (Integer) obj;
                num.intValue();
                ph0 ph0Var = (ph0) obj2;
                ph0Var.getClass();
                if (ph0Var instanceof nh0) {
                    return Long.valueOf(((nh0) ph0Var).f23509a);
                }
                if (Intrinsics.d(ph0Var, oh0Var)) {
                    return num;
                }
                t9f.b();
                return null;
            case 14:
                Integer num2 = (Integer) obj;
                num2.intValue();
                ph0 ph0Var2 = (ph0) obj2;
                ph0Var2.getClass();
                if (ph0Var2 instanceof nh0) {
                    return Long.valueOf(((nh0) ph0Var2).f23509a);
                }
                if (Intrinsics.d(ph0Var2, oh0Var)) {
                    return num2;
                }
                t9f.b();
                return null;
            case 15:
                Integer num3 = (Integer) obj;
                num3.intValue();
                ph0 ph0Var3 = (ph0) obj2;
                ph0Var3.getClass();
                if (ph0Var3 instanceof nh0) {
                    return Long.valueOf(((nh0) ph0Var3).f23509a);
                }
                if (Intrinsics.d(ph0Var3, oh0Var)) {
                    return num3;
                }
                t9f.b();
                return null;
            case 16:
                Integer num4 = (Integer) obj;
                num4.intValue();
                ph0 ph0Var4 = (ph0) obj2;
                ph0Var4.getClass();
                if (ph0Var4 instanceof nh0) {
                    return Long.valueOf(((nh0) ph0Var4).f23509a);
                }
                if (Intrinsics.d(ph0Var4, oh0Var)) {
                    return num4;
                }
                t9f.b();
                return null;
            case 17:
                Integer num5 = (Integer) obj;
                num5.intValue();
                am0 am0Var = (am0) obj2;
                am0Var.getClass();
                return new Pair(am0Var.getClass(), num5);
            case 18:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new eo0(b3));
                function4.invoke(new mg0((byte) 4));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                return Unit.f46060a;
            case 23:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new eo0((byte) 14));
                function6.invoke(new mg0((byte) 25));
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fhl fhlVar2 = (fhl) obj;
                nu90 nu90Var2 = (nu90) obj2;
                fhlVar2.getClass();
                nu90Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fW1 = fhlVar2.w0(56.0f);
                float fW2 = fhlVar2.w0(40.0f);
                float fIntBitsToFloat3 = ((Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) - fW1) - fhlVar2.w0(2.0f)) / 2.0f;
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - fW2) / 2.0f;
                pz40 pz40Var = s6t0.f31722a;
                long jM126getWhite200d7_KjU = StaticColors.INSTANCE.m126getWhite200d7_KjU();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
                float fW3 = fhlVar2.w0(8.0f);
                fhl.o0(fhlVar2, jM126getWhite200d7_KjU, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fW3)) & 4294967295L) | (Float.floatToRawIntBits(fW3) << 32), null, 240);
                pm80 pm80Var2 = nu90Var2.f24139a;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fhlVar2.w0(24.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar2.w0(24.0f))) & 4294967295L);
                float fIntBitsToFloat5 = ((fW1 - Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32))) / 2.0f) + fIntBitsToFloat3;
                float fIntBitsToFloat6 = ((fW2 - Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L))) / 2.0f) + fIntBitsToFloat4;
                ((fvt0) fhlVar2.A0().b).A(fIntBitsToFloat5, fIntBitsToFloat6);
                try {
                    try {
                        pm80Var2.e(fhlVar2, jFloatToRawIntBits3, nu90Var2.b, nu90Var2.c);
                        ((fvt0) fhlVar2.A0().b).A(-fIntBitsToFloat5, -fIntBitsToFloat6);
                        return Unit.f46060a;
                    } catch (Throwable th) {
                        th = th;
                        fhlVar2 = fhlVar2;
                        ((fvt0) fhlVar2.A0().b).A(-fIntBitsToFloat5, -fIntBitsToFloat6);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new eo0(b2));
                function8.invoke(new c51((byte) 4));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            default:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(new eo0((byte) 26));
                function10.invoke(new c51((byte) 5));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g20(int i, byte b) {
        this.f10539a = b;
    }
}
