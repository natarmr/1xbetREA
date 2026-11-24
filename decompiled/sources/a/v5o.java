package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5o f36834a = new v5o(3, g1o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticCyberPokerItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_cyber_poker_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.container);
        if (linearLayout != null) {
            i = R.id.firstPlayerCombinationContainer;
            LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewInflate, R.id.firstPlayerCombinationContainer);
            if (linearLayout2 != null) {
                i = R.id.guideline;
                if (((Guideline) yum0.f(viewInflate, R.id.guideline)) != null) {
                    i = R.id.ivDeck;
                    if (((ImageView) yum0.f(viewInflate, R.id.ivDeck)) != null) {
                        i = R.id.ivFirstPlayerOneFirstCard;
                        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstPlayerOneFirstCard);
                        if (imageView != null) {
                            i = R.id.ivFirstPlayerSecondCard;
                            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivFirstPlayerSecondCard);
                            if (imageView2 != null) {
                                i = R.id.ivSecondPlayerFirstCard;
                                ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.ivSecondPlayerFirstCard);
                                if (imageView3 != null) {
                                    i = R.id.ivSecondPlayerSecondCard;
                                    ImageView imageView4 = (ImageView) yum0.f(viewInflate, R.id.ivSecondPlayerSecondCard);
                                    if (imageView4 != null) {
                                        i = R.id.matchDescription;
                                        TextView textView = (TextView) yum0.f(viewInflate, R.id.matchDescription);
                                        if (textView != null) {
                                            i = R.id.secondPlayerCombinationContainer;
                                            LinearLayout linearLayout3 = (LinearLayout) yum0.f(viewInflate, R.id.secondPlayerCombinationContainer);
                                            if (linearLayout3 != null) {
                                                i = R.id.timerView;
                                                if (((DsTimer) yum0.f(viewInflate, R.id.timerView)) != null) {
                                                    i = R.id.tvFirstPlayer;
                                                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayer);
                                                    if (textView2 != null) {
                                                        i = R.id.tvFirstPlayerCombination;
                                                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerCombination);
                                                        if (textView3 != null) {
                                                            i = R.id.tvSecondPlayer;
                                                            TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayer);
                                                            if (textView4 != null) {
                                                                i = R.id.tvSecondPlayerCombination;
                                                                TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerCombination);
                                                                if (textView5 != null) {
                                                                    return new g1o0((ConstraintLayout) viewInflate, linearLayout, linearLayout2, imageView, imageView2, imageView3, imageView4, textView, linearLayout3, textView2, textView3, textView4, textView5);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
