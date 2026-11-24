package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.loader.DsLoader;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s1j0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1j0 f31459a = new s1j0(1, s4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/settings/impl/databinding/FragmentSettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.flLoader;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flLoader);
        if (frameLayout != null) {
            i = R.id.lLoader;
            if (((DsLoader) yum0.f(view, R.id.lLoader)) != null) {
                i = R.id.rvSettings;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvSettings);
                if (recyclerView != null) {
                    return new s4r((FrameLayout) view, frameLayout, recyclerView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
