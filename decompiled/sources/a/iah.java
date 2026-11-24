package a;

import android.animation.Animator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;

/* JADX INFO: loaded from: classes4.dex */
public final class iah implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14438a;
    public final /* synthetic */ CyberPlayerCardsView b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public iah(ArrayList arrayList, CyberPlayerCardsView cyberPlayerCardsView, List list, boolean z) {
        this.f14438a = arrayList;
        this.b = cyberPlayerCardsView;
        this.c = list;
        this.d = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrameLayout frameLayout;
        animator.getClass();
        Iterator it = this.f14438a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            CyberPlayerCardsView cyberPlayerCardsView = this.b;
            if (!zHasNext) {
                int i = CyberPlayerCardsView.o;
                cyberPlayerCardsView.a(this.c, this.d);
                return;
            }
            int iIntValue = ((Number) it.next()).intValue();
            p1o0 p1o0Var = (p1o0) cyberPlayerCardsView.l.get(Integer.valueOf(iIntValue));
            if (p1o0Var != null && (frameLayout = p1o0Var.f26214a) != null) {
                hxm0.v(frameLayout);
            }
            cyberPlayerCardsView.l.remove(Integer.valueOf(iIntValue));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
    }
}
