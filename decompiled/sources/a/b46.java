package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class b46 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1943a;
    public final /* synthetic */ g46 b;

    public /* synthetic */ b46(g46 g46Var, byte b) {
        this.f1943a = b;
        this.b = g46Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        byte b = this.f1943a;
        g46 g46Var = this.b;
        switch (b) {
            case 0:
                f46 f46Var = g46Var.i;
                if (f46Var != null && (context = g46Var.h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    f46Var.getLocationInWindow(iArr);
                    int height = (iHeight - (f46Var.getHeight() + iArr[1])) + ((int) f46Var.getTranslationY());
                    int i = g46Var.p;
                    if (height < i) {
                        ViewGroup.LayoutParams layoutParams = f46Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(g46.A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            int i2 = g46Var.p;
                            g46Var.q = i2;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
                            f46Var.requestLayout();
                        }
                    } else {
                        g46Var.q = i;
                    }
                    break;
                }
                break;
            case 1:
                g46Var.c(3);
                break;
            default:
                f46 f46Var2 = g46Var.i;
                if (f46Var2 != null) {
                    if (f46Var2.getParent() != null) {
                        f46Var2.setVisibility(0);
                    }
                    if (f46Var2.getAnimationMode() != 1) {
                        int height2 = f46Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = f46Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        f46Var2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(g46Var.e);
                        valueAnimator.setDuration(g46Var.c);
                        valueAnimator.addListener(new a46(g46Var, (byte) 0));
                        valueAnimator.addUpdateListener(new z36(g46Var, (byte) 2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(g46Var.d);
                        valueAnimatorOfFloat.addUpdateListener(new z36(g46Var, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(g46Var.f);
                        valueAnimatorOfFloat2.addUpdateListener(new z36(g46Var, (byte) 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(g46Var.f10649a);
                        animatorSet.addListener(new a46(g46Var, (byte) 1));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
