package a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class ixj extends qnk0 {
    public final jxj c;

    public ixj(jxj jxjVar) {
        this.c = jxjVar;
    }

    @Override // a.qnk0
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        rnk0 rnk0Var = (rnk0) this.c.b;
        View view = rnk0Var.c.l1;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        rnk0Var.c(this);
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animation from operation " + rnk0Var + " has been cancelled.");
        }
    }

    @Override // a.qnk0
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        jxj jxjVar = this.c;
        rnk0 rnk0Var = (rnk0) jxjVar.b;
        if (jxjVar.C0()) {
            rnk0Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = rnk0Var.c.l1;
        context.getClass();
        iqi iqiVarN1 = jxjVar.n1(context);
        if (iqiVarN1 == null) {
            jf4.n("Required value was null.");
            return;
        }
        Animation animation = (Animation) iqiVarN1.c;
        if (animation == null) {
            jf4.n("Required value was null.");
            return;
        }
        if (rnk0Var.f30792a != tnk0.b) {
            view.startAnimation(animation);
            rnk0Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        yxq yxqVar = new yxq(animation, viewGroup, view);
        yxqVar.setAnimationListener(new hxj(rnk0Var, viewGroup, view, this));
        view.startAnimation(yxqVar);
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animation from operation " + rnk0Var + " has started.");
        }
    }
}
