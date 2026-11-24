package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.SettoeMezzoDashedLineView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h6o f12539a = new h6o(3, e8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticSettoemezzoItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_settoemezzo_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.dealerCardContainer;
        FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.dealerCardContainer);
        if (frameLayout != null) {
            i = R.id.ivBackground;
            ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.ivBackground);
            if (shapeableImageView != null) {
                i = R.id.playerCardContainer;
                FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewInflate, R.id.playerCardContainer);
                if (frameLayout2 != null) {
                    i = R.id.syntheticTimerView;
                    SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(viewInflate, R.id.syntheticTimerView);
                    if (syntheticTimerView != null) {
                        i = R.id.tvDealerNameAndScore;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDealerNameAndScore);
                        if (textView != null) {
                            i = R.id.tvPlayerNameAndScore;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvPlayerNameAndScore);
                            if (textView2 != null) {
                                i = R.id.tvTimerDescription;
                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvTimerDescription);
                                if (textView3 != null) {
                                    i = R.id.vDash;
                                    if (((SettoeMezzoDashedLineView) yum0.f(viewInflate, R.id.vDash)) != null) {
                                        i = R.id.vSeparator;
                                        View viewF = yum0.f(viewInflate, R.id.vSeparator);
                                        if (viewF != null) {
                                            return new e8o0((ConstraintLayout) viewInflate, frameLayout, shapeableImageView, frameLayout2, syntheticTimerView, textView, textView2, textView3, viewF);
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
