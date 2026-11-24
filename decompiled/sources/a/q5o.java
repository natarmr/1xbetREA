package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5o f28161a = new q5o(3, f6o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticKillerJokerItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_killer_joker_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.imgJokerBackground;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imgJokerBackground);
        if (imageView != null) {
            i = R.id.ivBackground;
            ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.ivBackground);
            if (shapeableImageView != null) {
                i = R.id.syntheticTimerView;
                SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(viewInflate, R.id.syntheticTimerView);
                if (syntheticTimerView != null) {
                    i = R.id.tvTimerDescription;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTimerDescription);
                    if (textView != null) {
                        i = R.id.vKillerJoker;
                        KillerJokerView killerJokerView = (KillerJokerView) yum0.f(viewInflate, R.id.vKillerJoker);
                        if (killerJokerView != null) {
                            i = R.id.vSeparator;
                            View viewF = yum0.f(viewInflate, R.id.vSeparator);
                            if (viewF != null) {
                                return new f6o0((ConstraintLayout) viewInflate, imageView, shapeableImageView, syntheticTimerView, textView, killerJokerView, viewF);
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
