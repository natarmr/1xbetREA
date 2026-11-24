package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5o f280a = new a5o(3, d1o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticCyberDiceItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_cyber_dice_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.containerPlayerOneHand;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.containerPlayerOneHand);
        if (linearLayout != null) {
            i = R.id.containerPlayerTwoHand;
            LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewInflate, R.id.containerPlayerTwoHand);
            if (linearLayout2 != null) {
                i = R.id.ivFirstDice;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstDice);
                if (imageView != null) {
                    i = R.id.ivSecondDice;
                    ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivSecondDice);
                    if (imageView2 != null) {
                        i = R.id.tvFirstPlayerName;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstPlayerName);
                        if (textView != null) {
                            i = R.id.tvMatchDescription;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                            if (textView2 != null) {
                                i = R.id.tvPlayerOneTotalScoreLabel;
                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvPlayerOneTotalScoreLabel);
                                if (textView3 != null) {
                                    i = R.id.tvPlayerOneTotalScoreValue;
                                    TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvPlayerOneTotalScoreValue);
                                    if (textView4 != null) {
                                        i = R.id.tvPlayerTwoTotalScoreLabel;
                                        TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvPlayerTwoTotalScoreLabel);
                                        if (textView5 != null) {
                                            i = R.id.tvPlayerTwoTotalScoreValue;
                                            TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvPlayerTwoTotalScoreValue);
                                            if (textView6 != null) {
                                                i = R.id.tvSecondPlayerName;
                                                TextView textView7 = (TextView) yum0.f(viewInflate, R.id.tvSecondPlayerName);
                                                if (textView7 != null) {
                                                    i = R.id.vPlayerOneHandDivider;
                                                    View viewF = yum0.f(viewInflate, R.id.vPlayerOneHandDivider);
                                                    if (viewF != null) {
                                                        i = R.id.vPlayerTwoHandDivider;
                                                        View viewF2 = yum0.f(viewInflate, R.id.vPlayerTwoHandDivider);
                                                        if (viewF2 != null) {
                                                            return new d1o0((ConstraintLayout) viewInflate, linearLayout, linearLayout2, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewF, viewF2);
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
