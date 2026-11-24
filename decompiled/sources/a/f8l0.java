package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f8l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9112a;

    public /* synthetic */ f8l0(byte b) {
        this.f9112a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 2;
        byte b2 = 1;
        switch (this.f9112a) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 7, null, null, mrv.i, 6);
                return Unit.f46060a;
            case 1:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new fpl0(sjdVar);
            case 2:
                return String.valueOf(((Long) obj).longValue());
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                Context context = cpVar.f40887a.getContext();
                context.getClass();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((ih3) cpVar.u).b, (Property<AppCompatImageView, Float>) View.ROTATION_Y, 0.0f, context.getResources().getConfiguration().getLayoutDirection() == 1 ? -180.0f : 180.0f);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.setAutoCancel(true);
                cpVar.t(new go5(cpVar, objectAnimatorOfFloat, cpVar, objectAnimatorOfFloat, (byte) 1));
                cpVar.x(new eo5(cpVar, objectAnimatorOfFloat, (byte) 1));
                cpVar.y(new fo5(objectAnimatorOfFloat, (byte) 3));
                fo5 fo5Var = new fo5(objectAnimatorOfFloat, (byte) 4);
                if (cpVar.z != null) {
                    jf4.n("onFailedToRecycleView { ... } is already defined. Only one onFailedToRecycleView { ... } is allowed.");
                    return null;
                }
                cpVar.z = fo5Var;
                cpVar.z(new fo5(objectAnimatorOfFloat, (byte) 5));
                return Unit.f46060a;
            case 4:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 5:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 6:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 6.0f;
                return pi9Var.a(new rja((((long) Float.floatToRawIntBits(density)) & 4294967295L) | (((long) Float.floatToRawIntBits(density)) << 32), new vtm0(pi9Var.getDensity() * 1.0f, 0.0f, 0, 0, null, 30), b));
            case 7:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                float density2 = pi9Var2.getDensity() * 6.0f;
                return pi9Var2.a(new rja((((long) Float.floatToRawIntBits(density2)) << 32) | (((long) Float.floatToRawIntBits(density2)) & 4294967295L), new vtm0(pi9Var2.getDensity() * 1.0f, 0.0f, 0, 0, null, 30), b2));
            case 8:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 9:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 10:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 11:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar3 = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar, StaticColors.INSTANCE.m75getBlack600d7_KjU(), 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 12:
                kvl0 kvl0Var = (kvl0) obj;
                kvl0Var.getClass();
                return Long.valueOf(kvl0Var.f18961a);
            case 13:
                jhm0 jhm0Var = (jhm0) obj;
                jhm0Var.getClass();
                return Integer.valueOf(jhm0Var.f16535a);
            case 14:
                ((jhm0) obj).getClass();
                return sre0.f32672a.b(jhm0.class);
            case 15:
                bcy bcyVar = (bcy) obj;
                bcyVar.getClass();
                bcyVar.b = true;
                bcyVar.d = true;
                bcyVar.c = true;
                bcyVar.e = true;
                bcyVar.f2375a = true;
                return Unit.f46060a;
            case 16:
                xum0 xum0Var = (xum0) obj;
                xum0Var.getClass();
                return CollectionsKt.I(xum0Var.f);
            case 17:
                xt20 xt20Var = (xt20) obj;
                xt20Var.getClass();
                return CollectionsKt.I(xt20Var.f41445a);
            case 18:
                List list = (List) obj;
                list.getClass();
                return new sx3(list, (byte) 1);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                for (int i = 0; i < 20; i++) {
                    hcz.e(hczVar2, null, null, i120.e, 3);
                }
                return Unit.f46060a;
            case 20:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 21:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(x8z.b));
            case 22:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                if (a2nVar instanceof q56) {
                    return Long.valueOf(((q56) a2nVar).a());
                }
                if (a2nVar instanceof w56) {
                    return Long.valueOf(((w56) a2nVar).a());
                }
                if (a2nVar instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar).a());
                }
                return a2nVar instanceof b2o0 ? Long.valueOf(((b2o0) a2nVar).a()) : axq.g();
            case 23:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 24:
                ncn0 ncn0Var = (ncn0) obj;
                ncn0Var.getClass();
                return new ocn0(ncn0Var.c, dyb.r0(ncn0Var.d), ncn0Var.f23303a, ncn0Var.b);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(x8z.b));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                if (a2nVar2 instanceof q56) {
                    return Long.valueOf(((q56) a2nVar2).a());
                }
                if (a2nVar2 instanceof w56) {
                    return Long.valueOf(((w56) a2nVar2).a());
                }
                if (a2nVar2 instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar2).a());
                }
                return a2nVar2 instanceof b2o0 ? Long.valueOf(((b2o0) a2nVar2).a()) : axq.g();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new ddn0(sjdVar2);
            default:
                sjd sjdVar3 = (sjd) obj;
                sjdVar3.getClass();
                return new vbn0(sjdVar3);
        }
    }
}
