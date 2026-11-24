package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dx2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6825a;
    public final /* synthetic */ int b;

    public /* synthetic */ dx2(int i, byte b) {
        this.f6825a = b;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6825a;
        int i = this.b;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.j2;
                return Boolean.valueOf(((nqq) obj).h1(i));
            case 1:
                Class cls2 = AndroidComposeView.j2;
                return Boolean.valueOf(((nqq) obj).h1(i));
            case 2:
                Class cls3 = AndroidComposeView.j2;
                return Boolean.valueOf(((nqq) obj).h1(i));
            case 3:
                ((vzg0) obj).getClass();
                return new hf7(tlb.T(i), new af7(false, false, 0L, 0L, 0L, 0L, ""), false, "", false);
            case 4:
                Context context = (Context) obj;
                context.getClass();
                Chip chip = new Chip(context, null);
                chip.setStyle(i);
                return chip;
            case 5:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(brm0.l("Collection doesn't contain element at index ", i, '.'));
            case 6:
                Chip chip2 = (Chip) obj;
                chip2.getClass();
                chip2.setText(chip2.getContext().getText(i));
                chip2.setSelected(true);
                return Unit.f46060a;
            case 7:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, i);
                return Unit.f46060a;
            case 8:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.e(i);
                return Unit.f46060a;
            case 9:
                ((vzg0) obj).getClass();
                return new k8k(tlb.T(i), new d8k(0L, 0L, 0L, "", false), false, "", false);
            case 10:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.c(abi0Var2, i);
                return Unit.f46060a;
            case 11:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                cbi0.c(abi0Var3, i);
                return Unit.f46060a;
            case 12:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(i));
            case 13:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(i));
            case 14:
                return Boolean.valueOf(((nqq) obj).h1(i));
            case 15:
                return Boolean.valueOf(((nqq) obj).h1(i));
            case 16:
                return Boolean.valueOf(((nqq) obj).Z0(i));
            case 17:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                Canvas canvasB = vw2.b(fhlVar.A0().i());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                Paint paint = new Paint();
                paint.setColor(fbc.U(y3d.f));
                zcl zclVar = qmk.f28987a;
                paint.setShadowLayer(fhlVar.w0(4.0f), 0.0f, fhlVar.w0(2.0f), i);
                canvasB.drawRoundRect(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 0.0f, 0.0f, paint);
                return Unit.f46060a;
            case 18:
                Context context2 = (Context) obj;
                context2.getClass();
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setId(i);
                return frameLayout;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                abi0 abi0Var4 = (abi0) obj;
                abi0Var4.getClass();
                cbi0.c(abi0Var4, i);
                return Unit.f46060a;
            case 20:
                return c3x.r(vtb.V(i, ((o1x) obj).f24504a));
            case 21:
                return c3x.r(vtb.V(i, ((o1x) obj).f24504a));
            case 22:
                return Boolean.valueOf(((Integer) obj).intValue() > i);
            case 23:
                abi0 abi0Var5 = (abi0) obj;
                abi0Var5.getClass();
                abi0Var5.b(cbi0.b, Integer.valueOf(i));
                return Unit.f46060a;
            case 24:
                abi0 abi0Var6 = (abi0) obj;
                abi0Var6.getClass();
                cbi0.c(abi0Var6, i);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((vzg0) obj).getClass();
                return new gp40(tlb.T(i), null, false, "", false, -1, -1, 0L, false);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kr5 kr5Var = (kr5) obj;
                kr5Var.getClass();
                return Boolean.valueOf(kr5Var.b == i);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kr5 kr5Var2 = (kr5) obj;
                kr5Var2.getClass();
                return Boolean.valueOf(kr5Var2.b == i);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Context context3 = (Context) obj;
                context3.getClass();
                DsCounter dsCounter = new DsCounter(context3, null, 6);
                dsCounter.setComponentStyle(r0m.q);
                dsCounter.setCount(Integer.valueOf(i));
                dsCounter.setTextColor(context3.getColor(R.color.static_white));
                return dsCounter;
            default:
                abi0 abi0Var7 = (abi0) obj;
                abi0Var7.getClass();
                cbi0.c(abi0Var7, i);
                return Unit.f46060a;
        }
    }
}
