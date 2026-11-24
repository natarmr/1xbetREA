package a;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodEventItemView;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinWheelView;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes6.dex */
public final class r9g implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30079a;
    public final /* synthetic */ Object b;

    public r9g(LuckyWheelView luckyWheelView, List list) {
        this.f30079a = (byte) 8;
        this.b = list;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30079a) {
            case 0:
                break;
            case 1:
                animator.getClass();
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                break;
            case 6:
                animator.getClass();
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                break;
            default:
                animator.getClass();
                ((SpinAndWinWheelView) this.b).b = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f30079a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                animator.getClass();
                ((DragonsGoldGameView) obj).getOnEndMove().invoke();
                break;
            case 2:
                animator.getClass();
                ((org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.b) obj).a();
                break;
            case 3:
                animator.getClass();
                DsCheckbox dsCheckbox = (DsCheckbox) obj;
                dsCheckbox.e.g(dsCheckbox.b, dsCheckbox.c, dsCheckbox.isEnabled());
                break;
            case 4:
                animator.getClass();
                ((EasternNightsGameView) obj).getOnEndMove().invoke();
                break;
            case 5:
                animator.getClass();
                KillerJokerView killerJokerView = (KillerJokerView) obj;
                TextView firstPlayerCardSizeView = killerJokerView.getFirstPlayerCardSizeView();
                Context context = killerJokerView.getContext();
                context.getClass();
                firstPlayerCardSizeView.setBackground(context.getDrawable(killerJokerView.x));
                TextView secondPlayerCardSizeView = killerJokerView.getSecondPlayerCardSizeView();
                Context context2 = killerJokerView.getContext();
                context2.getClass();
                secondPlayerCardSizeView.setBackground(context2.getDrawable(killerJokerView.y));
                break;
            case 6:
                animator.getClass();
                break;
            case 7:
                animator.getClass();
                ((LoaderView) obj).getBinding().c.clearAnimation();
                break;
            case 8:
                break;
            case 9:
                animator.getClass();
                ((mof0) obj).b.invoke();
                break;
            case 10:
                l8x.U("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                ((wss) obj).run();
                break;
            default:
                animator.getClass();
                SpinAndWinWheelView spinAndWinWheelView = (SpinAndWinWheelView) obj;
                spinAndWinWheelView.c.invoke();
                spinAndWinWheelView.b = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f30079a) {
            case 0:
                break;
            case 1:
                animator.getClass();
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                break;
            case 6:
                animator.getClass();
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f30079a;
        Object obj = this.b;
        switch (b) {
            case 0:
                CyberCalendarPeriodEventItemView cyberCalendarPeriodEventItemView = ((m7g) obj).f21319a;
                cyberCalendarPeriodEventItemView.getClass();
                cyberCalendarPeriodEventItemView.setVisibility(0);
                break;
            case 1:
                animator.getClass();
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                break;
            case 6:
                animator.getClass();
                ((yhn) obj).invoke(Boolean.TRUE);
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                int i = LuckyWheelView.x;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setLayerType(2, null);
                }
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                break;
            default:
                animator.getClass();
                break;
        }
    }

    public /* synthetic */ r9g(Object obj, byte b) {
        this.f30079a = b;
        this.b = obj;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }
}
