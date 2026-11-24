package a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class xjc extends c2 {
    public static final f0p k = n73.b;
    public static final int[] l = {0, 1500, 3000, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final uob n;
    public static final uob o;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final dkc f;
    public int g;
    public float h;
    public float i;
    public s06 j;

    static {
        Class<Float> cls = Float.class;
        n = new uob(cls, "animationFraction", (byte) 10);
        o = new uob(cls, "completeEndFraction", (byte) 11);
    }

    public xjc(Context context, dkc dkcVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = dkcVar;
        this.e = g7x.W(context, R.attr.motionEasingStandardInterpolator, k);
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
        if (((d5x) this.f3600a).isVisible()) {
            this.d.start();
        } else {
            d();
        }
    }

    @Override // a.c2
    public final void J() {
        Q();
        this.g = 0;
        ((uhl) ((ArrayList) this.b).get(0)).c = this.f.e[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // a.c2
    public final void K() {
        this.j = null;
    }

    public final void Q() {
        ObjectAnimator objectAnimator = this.c;
        dkc dkcVar = this.f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (dkcVar.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new wjc(this, (byte) 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (dkcVar.n * 500.0f));
            this.d.addListener(new wjc(this, (byte) 1));
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
        dkc dkcVar = this.f;
        objectAnimator.setDuration((long) (dkcVar.n * 6000.0f));
        this.d.setDuration((long) (dkcVar.n * 500.0f));
        this.g = 0;
        ((uhl) ((ArrayList) this.b).get(0)).c = dkcVar.e[0];
        this.i = 0.0f;
    }
}
