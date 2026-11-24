package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e1d0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1d0 f7032a = new e1d0(1, h3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/prophylaxis/impl/databinding/FragmentProphylaxisBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.imageViewTechnical;
        if (((ImageView) yum0.f(view, R.id.imageViewTechnical)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            TextView textView = (TextView) yum0.f(view, R.id.textViewDescription);
            if (textView != null) {
                return new h3r(constraintLayout, textView);
            }
            i = R.id.textViewDescription;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
