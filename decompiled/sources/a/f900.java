package a;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f900 extends c2 {
    public static final uob i = new uob(Float.class, "animationFraction", 13);
    public ObjectAnimator c;
    public final f0p d;
    public final k900 e;
    public int f;
    public boolean g;
    public float h;

    public f900(k900 k900Var) {
        super(3);
        this.f = 1;
        this.e = k900Var;
        this.d = new f0p((byte) 1);
    }

    @Override // a.c2
    public final void J() {
        Q();
        R();
        this.c.start();
    }

    public final void Q() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new xh(this, (byte) 9));
        }
    }

    public final void R() {
        this.g = true;
        this.f = 1;
        for (uhl uhlVar : (ArrayList) this.b) {
            k900 k900Var = this.e;
            uhlVar.c = k900Var.e[0];
            uhlVar.d = k900Var.i / 2;
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
        this.c.setDuration((long) (this.e.n * 333.0f));
        R();
    }
}
