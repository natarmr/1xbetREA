package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vyd extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vyd f38242a = new vyd(1, q4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentSendConfirmationEmailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.tvMessage;
                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvMessage);
                if (materialTextView != null) {
                    i = R.id.tvTitleMessage;
                    if (((MaterialTextView) yum0.f(view, R.id.tvTitleMessage)) != null) {
                        i = R.id.vRoundedBackground;
                        View viewF = yum0.f(view, R.id.vRoundedBackground);
                        if (viewF != null) {
                            return new q4r((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, materialTextView, viewF);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
