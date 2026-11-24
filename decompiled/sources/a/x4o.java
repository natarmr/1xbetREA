package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.CrystalFieldInfoView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalPlayerLogView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x4o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4o f40276a = new x4o(3, a1o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticCrystalItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_crystal_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivCrystalFieldBackground;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivCrystalFieldBackground);
        if (imageView != null) {
            i = R.id.syntheticTimerView;
            SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(viewInflate, R.id.syntheticTimerView);
            if (syntheticTimerView != null) {
                i = R.id.tvFieldDescription;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFieldDescription);
                if (textView != null) {
                    i = R.id.tvMatchDescription;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvMatchDescription);
                    if (textView2 != null) {
                        i = R.id.tvPlayerOneName;
                        TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvPlayerOneName);
                        if (textView3 != null) {
                            i = R.id.tvPlayerTwoName;
                            TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvPlayerTwoName);
                            if (textView4 != null) {
                                i = R.id.vCrystalField;
                                CrystalFieldView crystalFieldView = (CrystalFieldView) yum0.f(viewInflate, R.id.vCrystalField);
                                if (crystalFieldView != null) {
                                    i = R.id.vCrystalFieldInfo;
                                    CrystalFieldInfoView crystalFieldInfoView = (CrystalFieldInfoView) yum0.f(viewInflate, R.id.vCrystalFieldInfo);
                                    if (crystalFieldInfoView != null) {
                                        i = R.id.viewPlayerOneGameLog;
                                        CrystalPlayerLogView crystalPlayerLogView = (CrystalPlayerLogView) yum0.f(viewInflate, R.id.viewPlayerOneGameLog);
                                        if (crystalPlayerLogView != null) {
                                            i = R.id.viewPlayerTwoGameLog;
                                            CrystalPlayerLogView crystalPlayerLogView2 = (CrystalPlayerLogView) yum0.f(viewInflate, R.id.viewPlayerTwoGameLog);
                                            if (crystalPlayerLogView2 != null) {
                                                return new a1o0((ConstraintLayout) viewInflate, imageView, syntheticTimerView, textView, textView2, textView3, textView4, crystalFieldView, crystalFieldInfoView, crystalPlayerLogView, crystalPlayerLogView2);
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
