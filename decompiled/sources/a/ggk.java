package a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ggk extends zjb {
    public final /* synthetic */ byte e;

    public /* synthetic */ ggk(byte b) {
        this.e = b;
    }

    @Override // a.zjb
    public final float I(Object obj) {
        switch (this.e) {
            case 0:
                return ((hgk) obj).p.b * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    @Override // a.zjb
    public final void M(Object obj, float f) {
        switch (this.e) {
            case 0:
                hgk hgkVar = (hgk) obj;
                hgkVar.p.b = f / 10000.0f;
                hgkVar.invalidateSelf();
                int i = (int) f;
                u06 u06Var = hgkVar.b;
                if (u06Var.b(true)) {
                    Context context = hgkVar.f32217a;
                    if (hgkVar.t == null) {
                        LinearInterpolator linearInterpolator = n73.f23021a;
                        hgkVar.v = g7x.W(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        hgkVar.w = g7x.W(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        hgkVar.t = valueAnimator;
                        valueAnimator.setDuration(500L);
                        hgkVar.t.setFloatValues(0.0f, 1.0f);
                        hgkVar.t.setInterpolator(null);
                        hgkVar.t.addUpdateListener(new fd5(hgkVar, (byte) 9));
                    }
                    float f2 = i;
                    float f3 = (f2 < u06Var.o * 10000.0f || f2 > u06Var.p * 10000.0f) ? 0.0f : 1.0f;
                    float f4 = hgkVar.q;
                    ValueAnimator valueAnimator2 = hgkVar.t;
                    if (f3 != f4) {
                        if (valueAnimator2.isRunning()) {
                            hgkVar.t.cancel();
                        }
                        hgkVar.q = f3;
                        if (f3 != 1.0f) {
                            hgkVar.u = hgkVar.w;
                            hgkVar.t.reverse();
                        } else {
                            hgkVar.u = hgkVar.v;
                            hgkVar.t.start();
                        }
                    } else if (!valueAnimator2.isRunning()) {
                        hgkVar.p.e = f3;
                        hgkVar.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
