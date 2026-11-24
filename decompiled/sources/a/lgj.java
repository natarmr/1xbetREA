package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.dayexpress.impl.presentation.view.ShowcaseExpressView;
import org.xplatform.uikit.components.bottom_sheet.presets.PresetButtonsLinearLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lgj extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lgj f20010a = new lgj(1, rzq.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/feature/dayexpress/impl/databinding/FragmentDayExpressDetailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_day_express_detail, (ViewGroup) null, false);
        int i = R.id.actionButtons;
        if (((PresetButtonsLinearLayout) yum0.f(viewInflate, R.id.actionButtons)) != null) {
            i = R.id.addToCoupon;
            DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.addToCoupon);
            if (dsButton != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                i = R.id.dayExpressRv;
                RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.dayExpressRv);
                if (recyclerView != null) {
                    i = R.id.header;
                    View viewF = yum0.f(viewInflate, R.id.header);
                    if (viewF != null) {
                        int i2 = R.id.endGuideline;
                        if (((Guideline) yum0.f(viewF, R.id.endGuideline)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewF;
                            i2 = R.id.separator;
                            if (((DsSeparator) yum0.f(viewF, R.id.separator)) != null) {
                                i2 = R.id.showcase_express_view;
                                ShowcaseExpressView showcaseExpressView = (ShowcaseExpressView) yum0.f(viewF, R.id.showcase_express_view);
                                if (showcaseExpressView != null) {
                                    i2 = R.id.startGuideline;
                                    if (((Guideline) yum0.f(viewF, R.id.startGuideline)) != null) {
                                        i2 = R.id.tv_coef;
                                        if (((TextView) yum0.f(viewF, R.id.tv_coef)) != null) {
                                            i2 = R.id.tv_coef_value;
                                            TextView textView = (TextView) yum0.f(viewF, R.id.tv_coef_value);
                                            if (textView != null) {
                                                i2 = R.id.tv_events;
                                                if (((TextView) yum0.f(viewF, R.id.tv_events)) != null) {
                                                    i2 = R.id.tv_events_value;
                                                    TextView textView2 = (TextView) yum0.f(viewF, R.id.tv_events_value);
                                                    if (textView2 != null) {
                                                        i2 = R.id.tv_title;
                                                        TextView textView3 = (TextView) yum0.f(viewF, R.id.tv_title);
                                                        if (textView3 != null) {
                                                            jk3 jk3Var = new jk3(constraintLayout, showcaseExpressView, textView, textView2, textView3, (byte) 3);
                                                            i = R.id.makeBet;
                                                            DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.makeBet);
                                                            if (dsButton2 != null) {
                                                                return new rzq(frameLayout, dsButton, recyclerView, jk3Var, dsButton2);
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
                        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                        return null;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
