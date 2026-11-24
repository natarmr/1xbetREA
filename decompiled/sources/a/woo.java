package a;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class woo extends muu0 {
    public static final DecelerateInterpolator m1 = new DecelerateInterpolator();
    public static final AccelerateInterpolator n1 = new AccelerateInterpolator();
    public int[] l1;

    @Override // a.muu0
    public final ObjectAnimator W(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        int[] iArr = this.l1;
        if (mns0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) mns0Var2.f22105a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Z(viewGroup, rect, iArr);
        return tnq0.k(view, mns0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, m1, this);
    }

    @Override // a.muu0
    public final ObjectAnimator X(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        float f;
        float f2;
        int[] iArr = this.l1;
        if (mns0Var == null) {
            return null;
        }
        Rect rect = (Rect) mns0Var.f22105a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr2 = (int[]) mns0Var.b.getTag(R.id.transition_position);
        if (iArr2 != null) {
            int i3 = iArr2[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr2[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        Z(viewGroup, rect, iArr);
        return tnq0.k(view, mns0Var, i, i2, translationX, translationY, f + iArr[0], f2 + iArr[1], n1, this);
    }

    public final void Z(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int[] iArr2 = this.l1;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        int iRound = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
        int iRound2 = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        float fCenterX = rect.centerX() - iRound;
        float fCenterY = rect.centerY() - iRound2;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iRound - i;
        int i4 = iRound2 - i2;
        float fMax = Math.max(i3, viewGroup.getWidth() - i3);
        float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void a0(mns0 mns0Var) {
        View view = mns0Var.b;
        int[] iArr = this.l1;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        mns0Var.f22105a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // a.muu0, a.gms0
    public final void f(mns0 mns0Var) {
        muu0.U(mns0Var);
        a0(mns0Var);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        muu0.U(mns0Var);
        a0(mns0Var);
    }
}
