package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hz80 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hz80 f13895a = new hz80(1, cjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/settings/impl/databinding/DialogPassBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pass, (ViewGroup) null, false);
        int i = R.id.apply_button;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.apply_button);
        if (materialButton != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            AppCompatEditText appCompatEditText = (AppCompatEditText) yum0.f(viewInflate, R.id.pass_field);
            if (appCompatEditText != null) {
                return new cjk(linearLayout, materialButton, appCompatEditText);
            }
            i = R.id.pass_field;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
