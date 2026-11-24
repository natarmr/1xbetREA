package a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class hxj implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rnk0 f13816a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ixj d;

    public hxj(rnk0 rnk0Var, ViewGroup viewGroup, View view, ixj ixjVar) {
        this.f13816a = rnk0Var;
        this.b = viewGroup;
        this.c = view;
        this.d = ixjVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new b1(viewGroup, this.c, this.d, (byte) 12));
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f13816a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f13816a + " has reached onAnimationStart.");
        }
    }
}
