package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sn3 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sn3 f32473a = new sn3(1, un3.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/app_update/impl/databinding/AppUpdateWhatsNewDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.app_update_whats_new_dialog, (ViewGroup) null, false);
        int i = R.id.closeBtn;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.closeBtn);
        if (dsButton != null) {
            i = R.id.description;
            MaterialTextView materialTextView = (MaterialTextView) yum0.f(viewInflate, R.id.description);
            if (materialTextView != null) {
                i = R.id.separator;
                if (((DsSeparator) yum0.f(viewInflate, R.id.separator)) != null) {
                    i = R.id.title;
                    MaterialTextView materialTextView2 = (MaterialTextView) yum0.f(viewInflate, R.id.title);
                    if (materialTextView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        return new un3(constraintLayout, dsButton, materialTextView, materialTextView2, constraintLayout);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
