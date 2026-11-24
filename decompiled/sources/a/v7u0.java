package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v7u0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v7u0 f36947a = new v7u0(1, x7u0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/verification/status/impl/databinding/VerificationNotifyDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.verification_notify_dialog, (ViewGroup) null, false);
        int i = R.id.content;
        if (((TextView) yum0.f(viewInflate, R.id.content)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i2 = R.id.skipButton;
            MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.skipButton);
            if (materialButton != null) {
                i2 = R.id.verificationButton;
                MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.verificationButton);
                if (materialButton2 != null) {
                    return new x7u0(linearLayout, linearLayout, materialButton, materialButton2);
                }
            }
            i = i2;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
