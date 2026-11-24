package a;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class q7h0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Window f28249a;
    public p7h0 b;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f28249a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        l8x.X("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f28249a == null) {
            l8x.X("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            l8x.X("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f28249a.getAttributes();
        attributes.screenBrightness = f;
        this.f28249a.setAttributes(attributes);
        l8x.U("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(kzw kzwVar) {
        l8x.U("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public kzw getScreenFlash() {
        return this.b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(uy9 uy9Var) {
        ofm0.m();
    }

    public void setScreenFlashWindow(Window window) {
        ofm0.m();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f28249a);
        l8x.U("ScreenFlashView", sb.toString());
        if (this.f28249a != window) {
            this.b = window == null ? null : new p7h0(this);
        }
        this.f28249a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
