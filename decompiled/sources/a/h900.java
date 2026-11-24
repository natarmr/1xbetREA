package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h900 extends c2 {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final uob m = new uob(Float.class, "animationFraction", 14);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final k900 f;
    public int g;
    public boolean h;
    public float i;
    public s06 j;

    public h900(Context context, k900 k900Var) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = k900Var;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // a.c2
    public final void F(s06 s06Var) {
        this.j = s06Var;
    }

    @Override // a.c2
    public final void H() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        d();
        if (((d5x) this.f3600a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // a.c2
    public final void J() {
        Q();
        R();
        this.c.start();
    }

    @Override // a.c2
    public final void K() {
        this.j = null;
    }

    public final void Q() {
        ObjectAnimator objectAnimator = this.c;
        byte b = 0;
        k900 k900Var = this.f;
        uob uobVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, uobVar, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (k900Var.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new g900(this, b));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, uobVar, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (k900Var.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new g900(this, (byte) 1));
        }
    }

    public final void R() {
        this.g = 0;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((uhl) it.next()).c = this.f.e[0];
        }
    }

    @Override // a.c2
    public final void d() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // a.c2
    public final void t() {
        Q();
        ObjectAnimator objectAnimator = this.c;
        k900 k900Var = this.f;
        objectAnimator.setDuration((long) (k900Var.n * 1800.0f));
        this.d.setDuration((long) (k900Var.n * 1800.0f));
        R();
    }
}
