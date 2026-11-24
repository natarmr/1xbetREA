package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gkt extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gkt f11460a = new gkt(1, tlt.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/blocking/databinding/GeoblockingLayoutBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.authButton;
        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.authButton);
        if (materialButton != null) {
            i = R.id.barrier;
            if (((Barrier) yum0.f(view, R.id.barrier)) != null) {
                i = R.id.guideline;
                if (((Guideline) yum0.f(view, R.id.guideline)) != null) {
                    i = R.id.guideline_45;
                    if (((Guideline) yum0.f(view, R.id.guideline_45)) != null) {
                        i = R.id.icon;
                        ImageView imageView = (ImageView) yum0.f(view, R.id.icon);
                        if (imageView != null) {
                            i = R.id.settingButton;
                            MaterialButton materialButton2 = (MaterialButton) yum0.f(view, R.id.settingButton);
                            if (materialButton2 != null) {
                                i = R.id.siteButton;
                                MaterialButton materialButton3 = (MaterialButton) yum0.f(view, R.id.siteButton);
                                if (materialButton3 != null) {
                                    i = R.id.text;
                                    TextView textView = (TextView) yum0.f(view, R.id.text);
                                    if (textView != null) {
                                        return new tlt((ConstraintLayout) view, materialButton, imageView, materialButton2, materialButton3, textView);
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
