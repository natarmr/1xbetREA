package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelTimerView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class em10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final em10 f8027a = new em10(1, g1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/lucky_wheel/databinding/FragmentLuckyWheelBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnBonusInfo;
        Button button = (Button) yum0.f(view, R.id.btnBonusInfo);
        if (button != null) {
            i = R.id.btnPrizesContinue;
            Button button2 = (Button) yum0.f(view, R.id.btnPrizesContinue);
            if (button2 != null) {
                i = R.id.btnResultActivate;
                Button button3 = (Button) yum0.f(view, R.id.btnResultActivate);
                if (button3 != null) {
                    i = R.id.btnResultContinue;
                    Button button4 = (Button) yum0.f(view, R.id.btnResultContinue);
                    if (button4 != null) {
                        i = R.id.btnResultSpin;
                        Button button5 = (Button) yum0.f(view, R.id.btnResultSpin);
                        if (button5 != null) {
                            i = R.id.btnSpin;
                            Button button6 = (Button) yum0.f(view, R.id.btnSpin);
                            if (button6 != null) {
                                i = R.id.btnSpinAll;
                                Button button7 = (Button) yum0.f(view, R.id.btnSpinAll);
                                if (button7 != null) {
                                    i = R.id.containerPrizes;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.containerPrizes);
                                    if (constraintLayout != null) {
                                        i = R.id.containerResult;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.containerResult);
                                        if (constraintLayout2 != null) {
                                            i = R.id.gradientBottom;
                                            View viewF = yum0.f(view, R.id.gradientBottom);
                                            if (viewF != null) {
                                                i = R.id.imbLightBack;
                                                if (((ImageView) yum0.f(view, R.id.imbLightBack)) != null) {
                                                    i = R.id.imvBonus;
                                                    ImageView imageView = (ImageView) yum0.f(view, R.id.imvBonus);
                                                    if (imageView != null) {
                                                        i = R.id.rvPrizes;
                                                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvPrizes);
                                                        if (recyclerView != null) {
                                                            i = R.id.timerContainerMain;
                                                            LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.timerContainerMain);
                                                            if (linearLayout != null) {
                                                                i = R.id.timerContainerResult;
                                                                LinearLayout linearLayout2 = (LinearLayout) yum0.f(view, R.id.timerContainerResult);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.tvBonusDescription;
                                                                    TextView textView = (TextView) yum0.f(view, R.id.tvBonusDescription);
                                                                    if (textView != null) {
                                                                        i = R.id.tvResultTimer;
                                                                        LuckyWheelTimerView luckyWheelTimerView = (LuckyWheelTimerView) yum0.f(view, R.id.tvResultTimer);
                                                                        if (luckyWheelTimerView != null) {
                                                                            i = R.id.tvResultTimerLabel;
                                                                            if (((TextView) yum0.f(view, R.id.tvResultTimerLabel)) != null) {
                                                                                i = R.id.tvTimer;
                                                                                LuckyWheelTimerView luckyWheelTimerView2 = (LuckyWheelTimerView) yum0.f(view, R.id.tvTimer);
                                                                                if (luckyWheelTimerView2 != null) {
                                                                                    i = R.id.tvTimerLabel;
                                                                                    if (((TextView) yum0.f(view, R.id.tvTimerLabel)) != null) {
                                                                                        i = R.id.tvWinTitle;
                                                                                        TextView textView2 = (TextView) yum0.f(view, R.id.tvWinTitle);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.wheelView;
                                                                                            LuckyWheelView luckyWheelView = (LuckyWheelView) yum0.f(view, R.id.wheelView);
                                                                                            if (luckyWheelView != null) {
                                                                                                return new g1r((ConstraintLayout) view, button, button2, button3, button4, button5, button6, button7, constraintLayout, constraintLayout2, viewF, imageView, recyclerView, linearLayout, linearLayout2, textView, luckyWheelTimerView, luckyWheelTimerView2, textView2, luckyWheelView);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
