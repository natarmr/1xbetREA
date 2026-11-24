package a;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bvn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3286a;
    public final /* synthetic */ ra10 b;

    public /* synthetic */ bvn(ra10 ra10Var, byte b) {
        this.f3286a = b;
        this.b = ra10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3286a;
        ra10 ra10Var = this.b;
        LottieView lottieView = (LottieView) obj;
        switch (b) {
            case 0:
                lottieView.getClass();
                lottieView.v(ra10Var);
                Context context = lottieView.getContext();
                context.getClass();
                int iB = m5d.b(R.attr.uikitSecondary, context);
                Context context2 = lottieView.getContext();
                context2.getClass();
                lottieView.B(iB, m5d.b(R.attr.uikitPrimaryForeground, context2));
                break;
            case 1:
                lottieView.getClass();
                lottieView.v(ra10Var);
                TypedValue typedValue = j5d.f15927a;
                Context context3 = lottieView.getContext();
                context3.getClass();
                int iA = j5d.a(context3, R.attr.uikitSecondary, false);
                Context context4 = lottieView.getContext();
                context4.getClass();
                lottieView.B(iA, j5d.a(context4, R.attr.uikitSecondary, false));
                break;
            case 2:
                lottieView.getClass();
                lottieView.v(ra10Var);
                TypedValue typedValue2 = j5d.f15927a;
                Context context5 = lottieView.getContext();
                context5.getClass();
                int iA2 = j5d.a(context5, R.attr.uikitSecondary, false);
                Context context6 = lottieView.getContext();
                context6.getClass();
                lottieView.B(iA2, j5d.a(context6, R.attr.uikitSecondary, false));
                break;
            case 3:
                lottieView.getClass();
                lottieView.v(ra10Var);
                TypedValue typedValue3 = j5d.f15927a;
                Context context7 = lottieView.getContext();
                context7.getClass();
                int iA3 = j5d.a(context7, R.attr.uikitSecondary, false);
                Context context8 = lottieView.getContext();
                context8.getClass();
                lottieView.B(iA3, j5d.a(context8, R.attr.uikitSecondary, false));
                break;
            case 4:
                lottieView.getClass();
                Context context9 = lottieView.getContext();
                context9.getClass();
                int iB2 = m5d.b(R.attr.uikitSecondary, context9);
                Context context10 = lottieView.getContext();
                context10.getClass();
                lottieView.B(iB2, m5d.b(R.attr.uikitSecondary, context10));
                lottieView.w(ra10Var);
                break;
            default:
                lottieView.getClass();
                Context context11 = lottieView.getContext();
                context11.getClass();
                int iB3 = m5d.b(R.attr.uikitSecondary, context11);
                Context context12 = lottieView.getContext();
                context12.getClass();
                lottieView.B(iB3, m5d.b(R.attr.uikitSecondary, context12));
                lottieView.w(ra10Var);
                break;
        }
        return Unit.f46060a;
    }
}
