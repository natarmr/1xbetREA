package a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o46 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o46 f24617a = new o46(1, jyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/verification/base/impl/databinding/FragmentBaseVerificationBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
        if (materialToolbar != null) {
            return new jyq((LinearLayout) view, materialToolbar);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.toolbar)));
        return null;
    }
}
