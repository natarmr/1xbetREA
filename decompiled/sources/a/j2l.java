package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.futuregame.item.DotaStatisticFutureGameView;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickHeroItemView;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickItemView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j2l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15784a;

    public /* synthetic */ j2l(byte b) {
        this.f15784a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        byte b = 0;
        switch (this.f15784a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.dota_ban_pick_item, viewGroup, false);
                int i = R.id.darkTeamItem;
                DotaBanPickHeroItemView dotaBanPickHeroItemView = (DotaBanPickHeroItemView) yum0.f(viewF, R.id.darkTeamItem);
                if (dotaBanPickHeroItemView != null) {
                    i = R.id.lightTeamItem;
                    DotaBanPickHeroItemView dotaBanPickHeroItemView2 = (DotaBanPickHeroItemView) yum0.f(viewF, R.id.lightTeamItem);
                    if (dotaBanPickHeroItemView2 != null) {
                        return new l2l((LinearLayout) viewF, dotaBanPickHeroItemView, dotaBanPickHeroItemView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.dota_ban_pick_view, viewGroup2, false);
                if (viewF2 != null) {
                    DotaBanPickItemView dotaBanPickItemView = (DotaBanPickItemView) viewF2;
                    return new w2l(dotaBanPickItemView, dotaBanPickItemView);
                }
                hny.u("rootView");
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.dota_statistic_future_game_header_item, viewGroup3, false);
                ImageView imageView = (ImageView) yum0.f(viewF3, R.id.ivTeamImage);
                if (imageView != null) {
                    return new h9l((FrameLayout) viewF3, imageView);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.ivTeamImage)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.dota_statistic_future_game_item, viewGroup4, false);
                if (viewF4 != null) {
                    return new m9l((DotaStatisticFutureGameView) viewF4);
                }
                hny.u("rootView");
                return null;
            case 4:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new n2l((byte) 23));
                function2.invoke(new rtj((byte) 29));
                return Unit.f46060a;
            case 5:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new n2l((byte) 24));
                function4.invoke(new xal(b));
                return Unit.f46060a;
            case 6:
                f9l f9lVar = (f9l) obj2;
                ((oyg0) obj).getClass();
                f9lVar.getClass();
                z6l z6lVar = f9lVar.j;
                return f9l.a(f9lVar, null, null, null, null, null, null, false, z6l.a(z6lVar, 0L, 0L, null, null, 0L, 0L, !z6lVar.g, 63), null, false, null, false, false, null, 0, 0, null, 67108351);
            case 7:
                ((Map) obj).getClass();
                ((Map) obj2).getClass();
                return Boolean.FALSE;
            case 8:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fhlVar.w0(32.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(32.0f))) & 4294967295L);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) / 2.0f;
                pm80 pm80Var = nu90Var.f24139a;
                ((fvt0) fhlVar.A0().b).u(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    pm80Var.e(fhlVar, jFloatToRawIntBits, nu90Var.b, nu90Var.c);
                    return Unit.f46060a;
                } finally {
                    f = -fIntBitsToFloat;
                    f2 = -fIntBitsToFloat2;
                    ((fvt0) fhlVar.A0().b).u(f, f2, f, f2);
                }
            case 9:
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
            case 10:
                fhl fhlVar2 = (fhl) obj;
                nu90 nu90Var2 = (nu90) obj2;
                fhlVar2.getClass();
                nu90Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fhlVar2.w0(40.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar2.w0(40.0f))) & 4294967295L);
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) / 2.0f;
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (fhlVar2.d() & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits2))) / 2.0f;
                pm80 pm80Var2 = nu90Var2.f24139a;
                ((fvt0) fhlVar2.A0().b).u(fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    pm80Var2.e(fhlVar2, jFloatToRawIntBits2, nu90Var2.b, nu90Var2.c);
                    return Unit.f46060a;
                } finally {
                    f3 = -fIntBitsToFloat3;
                    f4 = -fIntBitsToFloat4;
                    ((fvt0) fhlVar2.A0().b).u(f3, f4, f3, f4);
                }
            case 11:
                fhl fhlVar3 = (fhl) obj;
                nu90 nu90Var3 = (nu90) obj2;
                fhlVar3.getClass();
                nu90Var3.getClass();
                zcl zclVar3 = qmk.f28987a;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fhlVar3.w0(40.0f))) << 32) | (((long) Float.floatToRawIntBits(fhlVar3.w0(40.0f))) & 4294967295L);
                float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (fhlVar3.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32))) / 2.0f;
                float fIntBitsToFloat6 = (Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits3))) / 2.0f;
                pm80 pm80Var3 = nu90Var3.f24139a;
                ((fvt0) fhlVar3.A0().b).u(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat5, fIntBitsToFloat6);
                try {
                    pm80Var3.e(fhlVar3, jFloatToRawIntBits3, nu90Var3.b, nu90Var3.c);
                    return Unit.f46060a;
                } finally {
                    f5 = -fIntBitsToFloat5;
                    f6 = -fIntBitsToFloat6;
                    ((fvt0) fhlVar3.A0().b).u(f5, f6, f5, f6);
                }
            case 12:
                Map map2 = (Map) obj2;
                ((azg0) obj).getClass();
                map2.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(wp20.a(map2.size()));
                for (Map.Entry entry3 : map2.entrySet()) {
                    linkedHashMap3.put(String.valueOf(((Number) entry3.getKey()).longValue()), entry3.getValue());
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(wp20.a(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    linkedHashMap4.put(entry4.getKey(), Integer.valueOf(fbc.U(((y3d) entry4.getValue()).f41946a)));
                }
                return linkedHashMap4;
            case 13:
                Map map3 = (Map) obj2;
                ((azg0) obj).getClass();
                map3.getClass();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(wp20.a(map3.size()));
                for (Map.Entry entry5 : map3.entrySet()) {
                    linkedHashMap5.put(String.valueOf(((Number) entry5.getKey()).longValue()), entry5.getValue());
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(wp20.a(linkedHashMap5.size()));
                for (Map.Entry entry6 : linkedHashMap5.entrySet()) {
                    linkedHashMap6.put(entry6.getKey(), Integer.valueOf(fbc.U(((y3d) entry6.getValue()).f41946a)));
                }
                return linkedHashMap6;
            case 14:
                Integer num = (Integer) obj;
                num.getClass();
                pe0 pe0Var = (pe0) obj2;
                pe0Var.getClass();
                return new Pair(pe0Var instanceof st0 ? Long.valueOf(((st0) pe0Var).f32750a) : pe0Var instanceof ra0 ? -1L : Integer.valueOf(-pe0Var.hashCode()), num);
            case 15:
                ((Long) obj).getClass();
                ((Boolean) obj2).getClass();
                return Unit.f46060a;
            case 16:
                Integer num2 = (Integer) obj;
                int iIntValue = num2.intValue();
                gol golVar = (gol) obj2;
                golVar.getClass();
                return new Pair(golVar instanceof eol ? ((eol) golVar).f8144a : Integer.valueOf(-iIntValue), num2);
            case 17:
                Integer num3 = (Integer) obj;
                int iIntValue2 = num3.intValue();
                gol golVar2 = (gol) obj2;
                golVar2.getClass();
                return new Pair(golVar2 instanceof eol ? ((eol) golVar2).f8144a : Integer.valueOf(-iIntValue2), num3);
            case 18:
                int iIntValue3 = ((Integer) obj).intValue();
                ((fr5) obj2).getClass();
                return sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue3;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue4 = ((Integer) obj).intValue();
                fr5 fr5Var = (fr5) obj2;
                fr5Var.getClass();
                return fr5Var.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue4;
            case 20:
                int iIntValue5 = ((Integer) obj).intValue();
                fr5 fr5Var2 = (fr5) obj2;
                fr5Var2.getClass();
                return fr5Var2.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue5;
            case 21:
                int iIntValue6 = ((Integer) obj).intValue();
                fr5 fr5Var3 = (fr5) obj2;
                fr5Var3.getClass();
                return fr5Var3.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue6;
            case 22:
                int iIntValue7 = ((Integer) obj).intValue();
                fr5 fr5Var4 = (fr5) obj2;
                fr5Var4.getClass();
                return fr5Var4.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue7;
            case 23:
                int iIntValue8 = ((Integer) obj).intValue();
                fr5 fr5Var5 = (fr5) obj2;
                fr5Var5.getClass();
                return fr5Var5.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue8;
            case 24:
                int iIntValue9 = ((Integer) obj).intValue();
                fr5 fr5Var6 = (fr5) obj2;
                fr5Var6.getClass();
                return fr5Var6.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue9;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue10 = ((Integer) obj).intValue();
                fr5 fr5Var7 = (fr5) obj2;
                fr5Var7.getClass();
                return fr5Var7.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue10;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue11 = ((Integer) obj).intValue();
                fr5 fr5Var8 = (fr5) obj2;
                fr5Var8.getClass();
                return fr5Var8.f10004a + BundleUtil.UNDERLINE_TAG + sre0.f32672a.b(fr5.class).J() + BundleUtil.UNDERLINE_TAG + iIntValue11;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar.e0(-155219100);
                niq niqVar = new niq(0);
                fetVar.r(false);
                return niqVar;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(17391290);
                fetVar2.r(false);
                return Boolean.FALSE;
            default:
                Integer num4 = (Integer) obj;
                num4.intValue();
                a3m a3mVar = (a3m) obj2;
                a3mVar.getClass();
                if (a3mVar instanceof y2m) {
                    return Long.valueOf(((y2m) a3mVar).f41911a);
                }
                if (a3mVar instanceof z2m) {
                    return num4;
                }
                t9f.b();
                return null;
        }
    }
}
