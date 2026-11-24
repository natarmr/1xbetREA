package a;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.ranges.IntRange;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;

/* JADX INFO: loaded from: classes6.dex */
public final class ht8 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13622a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ht8(FrameLayout frameLayout, boolean z, byte b) {
        this.f13622a = b;
        this.c = frameLayout;
        this.b = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f13622a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f13622a;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        animator.getClass();
        switch (b) {
            case 0:
                gt8 gt8Var = ((it8) frameLayout).n;
                if (gt8Var != null) {
                    BracketItemView bracketItemView = (BracketItemView) gt8Var;
                    bracketItemView.o = true;
                    bracketItemView.l1 = false;
                    bracketItemView.k1 = null;
                    hs8 hs8Var = bracketItemView.p;
                    if (hs8Var != null) {
                        lk50 lk50Var = !z ? bracketItemView.m : null;
                        vju0 vju0Var = (vju0) ((zas0) hs8Var).b;
                        LinearLayoutManager linearLayoutManager = vju0Var.E;
                        RecyclerView recyclerView = vju0Var.v;
                        Iterator it = new IntRange(linearLayoutManager != null ? linearLayoutManager.f1() : 0, linearLayoutManager != null ? linearLayoutManager.h1() : 0, 1).iterator();
                        while (((kkx) it).c) {
                            int iNextInt = ((bkx) it).nextInt();
                            xhe0 xhe0VarO = recyclerView != null ? recyclerView.O(iNextInt) : null;
                            View view = xhe0VarO != null ? xhe0VarO.f40887a : null;
                            if ((xhe0VarO instanceof vju0) && view != null && recyclerView != null) {
                                vju0.v(recyclerView, (BracketItemView) dc3.a(view).d, iNextInt);
                            }
                        }
                        if (lk50Var != null) {
                            vju0Var.x(lk50Var, true);
                        }
                    }
                }
                break;
            default:
                x4d x4dVar = (x4d) frameLayout;
                x4dVar.m = z ? aoo0.d : aoo0.b;
                x4dVar.j.setVisibility(z ? 8 : 0);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f13622a;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f13622a;
        animator.getClass();
        switch (b) {
            case 0:
                break;
            default:
                ((x4d) this.c).j.setVisibility(0);
                break;
        }
    }
}
