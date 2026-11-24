package a;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class whv0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ div0 f39186a;
    public final /* synthetic */ xiv0 b;
    public final /* synthetic */ xiv0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public whv0(div0 div0Var, xiv0 xiv0Var, xiv0 xiv0Var2, int i, View view) {
        this.f39186a = div0Var;
        this.b = xiv0Var;
        this.c = xiv0Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        liv0 fiv0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        div0 div0Var = this.f39186a;
        civ0 civ0Var = div0Var.f6156a;
        civ0Var.e(animatedFraction);
        float fC = civ0Var.c();
        PathInterpolator pathInterpolator = yhv0.e;
        int i = Build.VERSION.SDK_INT;
        xiv0 xiv0Var = this.b;
        if (i >= 36) {
            fiv0Var = new kiv0(xiv0Var);
        } else if (i >= 35) {
            fiv0Var = new jiv0(xiv0Var);
        } else if (i >= 34) {
            fiv0Var = new iiv0(xiv0Var);
        } else if (i >= 31) {
            fiv0Var = new hiv0(xiv0Var);
        } else if (i >= 30) {
            fiv0Var = new giv0(xiv0Var);
        } else {
            fiv0Var = i >= 29 ? new fiv0(xiv0Var) : new eiv0(xiv0Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            uiv0 uiv0Var = xiv0Var.f40966a;
            if (i3 == 0) {
                fiv0Var.d(i2, uiv0Var.i(i2));
            } else {
                pfx pfxVarI = uiv0Var.i(i2);
                pfx pfxVarI2 = this.c.f40966a.i(i2);
                float f = 1.0f - fC;
                fiv0Var.d(i2, xiv0.e(pfxVarI, (int) (((double) ((pfxVarI.f26926a - pfxVarI2.f26926a) * f)) + 0.5d), (int) (((double) ((pfxVarI.b - pfxVarI2.b) * f)) + 0.5d), (int) (((double) ((pfxVarI.c - pfxVarI2.c) * f)) + 0.5d), (int) (((double) ((pfxVarI.d - pfxVarI2.d) * f)) + 0.5d)));
            }
        }
        yhv0.h(this.e, fiv0Var.b(), Collections.singletonList(div0Var));
    }
}
