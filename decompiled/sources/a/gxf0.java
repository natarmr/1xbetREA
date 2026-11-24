package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gxf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gxf0 f12076a = new gxf0(1, h4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentRestoreByEmailBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.emailDescription;
        TextView textView = (TextView) yum0.f(view, R.id.emailDescription);
        if (textView != null) {
            i = R.id.emailForceDescription;
            TextView textView2 = (TextView) yum0.f(view, R.id.emailForceDescription);
            if (textView2 != null) {
                i = R.id.emailTextField;
                DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.emailTextField);
                if (dsTextField != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) yum0.f(view, R.id.title);
                    if (textView3 != null) {
                        return new h4r((ConstraintLayout) view, textView, textView2, dsTextField, textView3);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
