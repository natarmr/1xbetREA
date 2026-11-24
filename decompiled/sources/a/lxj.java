package a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class lxj extends qnk0 {
    public final jxj c;
    public AnimatorSet d;

    public lxj(jxj jxjVar) {
        this.c = jxjVar;
    }

    @Override // a.qnk0
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.d;
        rnk0 rnk0Var = (rnk0) this.c.b;
        if (animatorSet == null) {
            rnk0Var.c(this);
            return;
        }
        if (!rnk0Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.r(animatorSet);
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animator from operation " + rnk0Var + " has been canceled" + (rnk0Var.g ? " with seeking." : Separators.DOT) + Separators.SP);
        }
    }

    @Override // a.qnk0
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        rnk0 rnk0Var = (rnk0) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            rnk0Var.c(this);
            return;
        }
        animatorSet.start();
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animator from operation " + rnk0Var + " has started.");
        }
    }

    @Override // a.qnk0
    public final void c(pb5 pb5Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        rnk0 rnk0Var = (rnk0) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            rnk0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !rnk0Var.c.n) {
            return;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + rnk0Var);
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (pb5Var.c * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + rnk0Var);
        }
        ga3.x(animatorSet, j);
    }

    @Override // a.qnk0
    public final void d(ViewGroup viewGroup) {
        lxj lxjVar;
        viewGroup.getClass();
        jxj jxjVar = this.c;
        if (jxjVar.C0()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        iqi iqiVarN1 = jxjVar.n1(context);
        this.d = iqiVarN1 != null ? (AnimatorSet) iqiVarN1.b : null;
        rnk0 rnk0Var = (rnk0) jxjVar.b;
        Fragment fragment = rnk0Var.c;
        boolean z = rnk0Var.f30792a == tnk0.d;
        View view = fragment.l1;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            lxjVar = this;
            animatorSet.addListener(new kxj(viewGroup, view, z, rnk0Var, lxjVar));
        } else {
            lxjVar = this;
        }
        AnimatorSet animatorSet2 = lxjVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
