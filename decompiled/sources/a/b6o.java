package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b6o f2065a = new b6o(3, u7o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticSeaBattleItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_sea_battle_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.guidelineCenterLeft;
        if (((Guideline) yum0.f(viewInflate, R.id.guidelineCenterLeft)) != null) {
            i = R.id.guidelineCenterRight;
            if (((Guideline) yum0.f(viewInflate, R.id.guidelineCenterRight)) != null) {
                i = R.id.guidelineLeft;
                if (((Guideline) yum0.f(viewInflate, R.id.guidelineLeft)) != null) {
                    i = R.id.guidelineRight;
                    if (((Guideline) yum0.f(viewInflate, R.id.guidelineRight)) != null) {
                        i = R.id.ivPlayerOneIcon;
                        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivPlayerOneIcon);
                        if (imageView != null) {
                            i = R.id.ivPlayerTwoIcon;
                            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivPlayerTwoIcon);
                            if (imageView2 != null) {
                                i = R.id.tvMatchDescription;
                                TextView textView = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                                if (textView != null) {
                                    i = R.id.tvPlayerOneName;
                                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvPlayerOneName);
                                    if (textView2 != null) {
                                        i = R.id.tvPlayerOneScore;
                                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvPlayerOneScore);
                                        if (textView3 != null) {
                                            i = R.id.tvPlayerTwoName;
                                            TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvPlayerTwoName);
                                            if (textView4 != null) {
                                                i = R.id.tvPlayerTwoScore;
                                                TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvPlayerTwoScore);
                                                if (textView5 != null) {
                                                    i = R.id.vPlayerOneField;
                                                    SeaBattleView seaBattleView = (SeaBattleView) yum0.f(viewInflate, R.id.vPlayerOneField);
                                                    if (seaBattleView != null) {
                                                        i = R.id.vPlayerTwoField;
                                                        SeaBattleView seaBattleView2 = (SeaBattleView) yum0.f(viewInflate, R.id.vPlayerTwoField);
                                                        if (seaBattleView2 != null) {
                                                            return new u7o0((ConstraintLayout) viewInflate, imageView, imageView2, textView, textView2, textView3, textView4, textView5, seaBattleView, seaBattleView2);
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
