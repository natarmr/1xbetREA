package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.loader.DsLoader;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class upb extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final upb f36056a = new upb(1, yyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/personal/impl/databinding/FragmentChangeLoginBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bbSave;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bbSave);
        if (dsBottomBar != null) {
            i = R.id.clLoginParent;
            if (((ConstraintLayout) yum0.f(view, R.id.clLoginParent)) != null) {
                i = R.id.ivInfoIcon;
                if (((ImageView) yum0.f(view, R.id.ivInfoIcon)) != null) {
                    i = R.id.lLoader;
                    if (((DsLoader) yum0.f(view, R.id.lLoader)) != null) {
                        i = R.id.llInfo;
                        if (((LinearLayout) yum0.f(view, R.id.llInfo)) != null) {
                            i = R.id.navigationBar;
                            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                            if (dsNavigationBarBasic != null) {
                                i = R.id.progress;
                                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                                if (frameLayout != null) {
                                    i = R.id.tfLogin;
                                    DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfLogin);
                                    if (dsTextField != null) {
                                        i = R.id.tvInfoText;
                                        TextView textView = (TextView) yum0.f(view, R.id.tvInfoText);
                                        if (textView != null) {
                                            return new yyq((ConstraintLayout) view, dsBottomBar, dsNavigationBarBasic, frameLayout, dsTextField, textView);
                                        }
                                    }
                                }
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
