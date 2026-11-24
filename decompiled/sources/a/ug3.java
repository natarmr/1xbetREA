package a;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.app_start.impl.presentation.view.AppStartScreenLayout;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ug3 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ug3 f35604a = new ug3(1, zxq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/app_start/impl/databinding/FragmentAppStartBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        AppStartScreenLayout appStartScreenLayout = (AppStartScreenLayout) yum0.f(view, R.id.screenContainer);
        if (appStartScreenLayout != null) {
            return new zxq((FrameLayout) view, appStartScreenLayout);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.screenContainer)));
        return null;
    }
}
