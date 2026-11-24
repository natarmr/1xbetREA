package a;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a7g0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f368a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7g0(Object obj, byte b) {
        this.f368a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        Object value;
        Object value2;
        byte b = this.f368a;
        boolean z = false;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = c7g0.P1;
                fiu0 fiu0Var = ((c7g0) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                cge0 cge0Var = n7g0.p2;
                fiu0 fiu0Var2 = ((n7g0) obj).k2;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                return (i6g0) ((gii0) ((kd30) obj).f18086a).b(sre0.f32672a.b(i6g0.class));
            case 3:
                return (o0g0) ((gii0) ((dq00) obj).b).b(sre0.f32672a.b(o0g0.class));
            case 4:
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) obj;
                int i = RoundCornerImageView.g;
                return new RectF(0.0f, 0.0f, roundCornerImageView.getWidth(), roundCornerImageView.getHeight());
            case 5:
                return ((ckg0) obj).c;
            case 6:
                ((htg0) obj).b = gtg0.b;
                return Unit.f46060a;
            case 7:
                ClassLoader classLoader = (ClassLoader) ((iw20) obj).f15470a;
                Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                if (declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                fiu0 fiu0Var3 = ((mug0) obj).k2;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                azg0 azg0Var = (azg0) obj;
                u0h0 u0h0Var = azg0Var.f1716a;
                Object obj2 = azg0Var.d;
                if (obj2 != null) {
                    return u0h0Var.a(azg0Var, obj2);
                }
                jf4.o("Value should be initialized");
                return null;
            case 10:
                nw20 nw20Var = ((izg0) obj).c;
                if (nw20Var == null) {
                    return null;
                }
                lun.f20680a.getClass();
                Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
                nw20Var.q(bundleV);
                if (bundleV.isEmpty()) {
                    return null;
                }
                return bundleV;
            case 11:
                return zzg0.c((riu0) obj);
            case 12:
                i0h0 i0h0Var = (i0h0) obj;
                i0h0Var.x().a(new ige0(i0h0Var, z ? (byte) 1 : (byte) 0));
                return Unit.f46060a;
            case 13:
                return new od5((f3h0) obj);
            case 14:
                return (i6h0) ((d7h0) obj).f5593a.b(sre0.f32672a.b(i6h0.class));
            case 15:
                ((ebh) obj).invoke(ufj.f35580a);
                return Unit.f46060a;
            case 16:
                ((ebh) obj).invoke(wfj.f39074a);
                return Unit.f46060a;
            case 17:
                vah0 vah0Var = (vah0) obj;
                bz2 bz2Var = (bz2) mbc.R(vah0Var, xf80.f40779a);
                vah0Var.B = bz2Var;
                vah0Var.Y = bz2Var != null ? new az2(bz2Var.f3444a, bz2Var.b, bz2Var.c, bz2Var.d) : null;
                return Unit.f46060a;
            case 18:
                SeaBattleView seaBattleView = (SeaBattleView) obj;
                return new ddh0(seaBattleView.f46539a, seaBattleView.b);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gle0 gle0Var = kjh0.o2;
                fiu0 fiu0Var4 = ((kjh0) obj).k2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                akh0 akh0Var = (akh0) obj;
                return n2x.w(akh0Var.f1023a, akh0Var.b);
            case 21:
                ((irh0) obj).x();
                return Unit.f46060a;
            case 22:
                pvh0 pvh0Var = (pvh0) obj;
                oms0 oms0Var = pvh0Var.f;
                pvh0Var.g = oms0Var != null ? ((Number) oms0Var.m.getValue()).longValue() : 0L;
                return Unit.f46060a;
            case 23:
                gne0 gne0Var2 = n0i0.R1;
                fiu0 fiu0Var5 = ((n0i0) obj).L1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                gne0 gne0Var3 = n0i0.R1;
                ((nxh0) obj).invoke(j0i0.f15684a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gne0 gne0Var4 = n0i0.R1;
                ((nxh0) obj).invoke(a0i0.f26a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                eke0 eke0Var = f2i0.q2;
                return Boolean.valueOf(DateFormat.is24HourFormat(((f2i0) obj).o0()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                p7m0 p7m0Var = ((cai0) obj).g;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.FALSE));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p7m0 p7m0Var2 = ((ldi0) obj).H;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, uci0.a((uci0) value2, false, false, false, false, null, false, false, 2047)));
                return Unit.f46060a;
            default:
                wgi0 wgi0Var = (wgi0) obj;
                return Integer.valueOf(n2x.D(wgi0Var, wgi0Var.k));
        }
    }
}
