package a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class ewo extends muu0 {
    public ewo(int i) {
        Y(i);
    }

    public static float a0(mns0 mns0Var, float f) {
        Float f2;
        return (mns0Var == null || (f2 = (Float) mns0Var.f22105a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // a.muu0
    public final ObjectAnimator W(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        bmu0.f2855a.getClass();
        return Z(view, a0(mns0Var, 0.0f), 1.0f);
    }

    @Override // a.muu0
    public final ObjectAnimator X(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2) {
        bmu0.f2855a.getClass();
        ObjectAnimator objectAnimatorZ = Z(view, a0(mns0Var, 1.0f), 0.0f);
        if (objectAnimatorZ == null) {
            bmu0.b(view, a0(mns0Var2, 1.0f));
        }
        return objectAnimatorZ;
    }

    public final ObjectAnimator Z(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bmu0.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, bmu0.b, f2);
        dwo dwoVar = new dwo(view);
        objectAnimatorOfFloat.addListener(dwoVar);
        w().a(dwoVar);
        return objectAnimatorOfFloat;
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        muu0.U(mns0Var);
        View view = mns0Var.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(bmu0.f2855a.z(view)) : Float.valueOf(0.0f);
        }
        mns0Var.f22105a.put("android:fade:transitionAlpha", fValueOf);
    }
}
