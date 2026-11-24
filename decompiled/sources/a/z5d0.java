package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z5d0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5d0 f43811a = new z5d0(1, gjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/proxy/impl/databinding/DialogProxyCheckingBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_proxy_checking, (ViewGroup) null, false);
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.buttonsDivider1;
            View viewF = yum0.f(viewInflate, R.id.buttonsDivider1);
            if (viewF != null) {
                i = R.id.progress;
                if (((ProgressBar) yum0.f(viewInflate, R.id.progress)) != null) {
                    return new gjk((LinearLayout) viewInflate, materialButton, viewF);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
