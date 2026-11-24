package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h28 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h28 f12319a = new h28(1, oyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentBindEmailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.emailRecommendations;
            if (((LinearLayout) yum0.f(view, R.id.emailRecommendations)) != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.tfEmail;
                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfEmail);
                    if (dsTextField != null) {
                        i = R.id.tvMessage;
                        if (((MaterialTextView) yum0.f(view, R.id.tvMessage)) != null) {
                            i = R.id.tvMessageInfo;
                            MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvMessageInfo);
                            if (materialTextView != null) {
                                return new oyq((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, dsTextField, materialTextView);
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
