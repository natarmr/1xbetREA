package a;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.segmented_control.DsSegmentItem;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aim implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f929a;

    public /* synthetic */ aim(byte b) {
        this.f929a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strJ;
        switch (this.f929a) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.g(true);
                if (Build.VERSION.SDK_INT >= 31) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(40.0f, 40.0f, Shader.TileMode.CLAMP);
                    renderEffectCreateBlurEffect.getClass();
                    uag0Var.j(new n13(renderEffectCreateBlurEffect));
                }
                return Unit.f46060a;
            case 1:
                ((e0x) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(null, 0.0f, 3), kzn.e(null, 3));
            case 3:
                int i = DsMenuCell.g1;
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 4:
                ((String) obj).getClass();
                return Unit.f46060a;
            case 5:
                ((Boolean) obj).getClass();
                return Unit.f46060a;
            case 6:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_info_circle_filled);
                return Unit.f46060a;
            case 7:
                ((x5q0) obj).getClass();
                return Unit.f46060a;
            case 8:
                ((x5q0) obj).getClass();
                return Unit.f46060a;
            case 9:
                ((String) obj).getClass();
                return Unit.f46060a;
            case 10:
                w6k w6kVar = (w6k) obj;
                w6kVar.getClass();
                zcl zclVar = qmk.f28987a;
                return new ikx((((long) (-w6kVar.T(1.0f))) & 4294967295L) | (((long) (-w6kVar.T(1.0f))) << 32));
            case 11:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                nr nrVar = g7zVar.f10839a.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).k(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    g7zVar.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 12:
                int i2 = DsSegmentItem.q;
                ((DsSegmentItem) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Integer) obj).getClass();
                int i3 = DsSegmentedGroup.o;
                return Unit.f46060a;
            case 14:
                ((mzl) obj).getClass();
                return Unit.f46060a;
            case 15:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                yai0.j(abi0Var2);
                return Unit.f46060a;
            case 16:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                yai0.j(abi0Var3);
                return Unit.f46060a;
            case 17:
                abi0 abi0Var4 = (abi0) obj;
                abi0Var4.getClass();
                yai0.j(abi0Var4);
                return Unit.f46060a;
            case 18:
                abi0 abi0Var5 = (abi0) obj;
                abi0Var5.getClass();
                yai0.j(abi0Var5);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                return Long.valueOf(m9nVar.getId());
            case 20:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                return sre0.f32672a.b(m9nVar2.getClass());
            case 21:
                m9n m9nVar3 = (m9n) obj;
                m9nVar3.getClass();
                return Long.valueOf(m9nVar3.getId());
            case 22:
                m9n m9nVar4 = (m9n) obj;
                m9nVar4.getClass();
                return sre0.f32672a.b(m9nVar4.getClass());
            case 23:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case 24:
                wim wimVar = (wim) obj;
                wimVar.getClass();
                return Integer.valueOf(wimVar.f39221a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                l9s l9sVar = (l9s) obj;
                strJ = l9sVar != null ? l9sVar.j() : null;
                return strJ == null ? "" : strJ;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                l9s l9sVar2 = (l9s) obj;
                strJ = l9sVar2 != null ? l9sVar2.g() : null;
                return strJ == null ? "" : strJ;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                y130 y130Var = (y130) obj;
                y130Var.getClass();
                return new bdn(y130Var);
            default:
                ((Integer) obj).getClass();
                int i4 = EasternNightsGameView.u;
                return Boolean.FALSE;
        }
    }
}
