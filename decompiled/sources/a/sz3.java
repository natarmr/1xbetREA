package a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sz3 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33051a;

    public /* synthetic */ sz3(byte b) {
        this.f33051a = b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.f33051a) {
            case 0:
                throw rw2.g(message.obj);
            default:
                int i = message.what;
                byte b = 1;
                byte b2 = 0;
                if (i == 0) {
                    g46 g46Var = (g46) message.obj;
                    f46 f46Var = g46Var.i;
                    if (f46Var.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = f46Var.getLayoutParams();
                        if (layoutParams instanceof ble) {
                            ble bleVar = (ble) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            fvt0 fvt0Var = baseTransientBottomBar$Behavior.i;
                            fvt0Var.getClass();
                            fvt0Var.f10231a = g46Var.u;
                            baseTransientBottomBar$Behavior.b = new yk50((Object) g46Var, (byte) 11);
                            bleVar.b(baseTransientBottomBar$Behavior);
                            bleVar.g = 80;
                        }
                        ViewGroup viewGroup = g46Var.g;
                        f46Var.k = true;
                        viewGroup.addView(f46Var);
                        f46Var.k = false;
                        g46Var.g();
                        f46Var.setVisibility(4);
                    }
                    if (f46Var.isLaidOut()) {
                        g46Var.f();
                        return true;
                    }
                    g46Var.r = true;
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                g46 g46Var2 = (g46) message.obj;
                int i2 = message.arg1;
                f46 f46Var2 = g46Var2.i;
                AccessibilityManager accessibilityManager = g46Var2.t;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || f46Var2.getVisibility() != 0) {
                    g46Var2.c(i2);
                    return true;
                }
                if (f46Var2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(g46Var2.d);
                    valueAnimatorOfFloat.addUpdateListener(new z36(g46Var2, (byte) 0));
                    valueAnimatorOfFloat.setDuration(g46Var2.b);
                    valueAnimatorOfFloat.addListener(new y36(g46Var2, i2, b2));
                    valueAnimatorOfFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                f46 f46Var3 = g46Var2.i;
                int height = f46Var3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = f46Var3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(g46Var2.e);
                valueAnimator.setDuration(g46Var2.c);
                valueAnimator.addListener(new y36(g46Var2, i2, b));
                valueAnimator.addUpdateListener(new z36(g46Var2, (byte) 3));
                valueAnimator.start();
                return true;
        }
    }
}
