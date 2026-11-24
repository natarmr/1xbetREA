package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uid0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uid0 f35725a = new uid0(1, o3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/authqr/impl/databinding/FragmentQrSendConfirmationMailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnConfirm;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.btnConfirm);
        if (dsBottomBar != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.textViewDescription;
                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.textViewDescription);
                if (materialTextView != null) {
                    return new o3r((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, materialTextView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
