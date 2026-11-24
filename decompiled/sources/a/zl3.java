package a;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;
import org.xplatform.uikit.components.loader.DsLoader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zl3 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zl3 f44562a = new zl3(1, em3.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/app_update/impl/databinding/AppUpdateFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.flLoader;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flLoader);
        if (frameLayout != null) {
            i = R.id.loader;
            if (((DsLoader) yum0.f(view, R.id.loader)) != null) {
                i = R.id.screenContainer;
                AppUpdateScreenLayout appUpdateScreenLayout = (AppUpdateScreenLayout) yum0.f(view, R.id.screenContainer);
                if (appUpdateScreenLayout != null) {
                    return new em3((FrameLayout) view, frameLayout, appUpdateScreenLayout);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
