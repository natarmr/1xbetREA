package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rdd0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rdd0 f30286a = new rdd0(1, hjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/captcha/databinding/DialogPushCaptchaBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_push_captcha, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        if (((TextView) yum0.f(viewInflate, R.id.qrText)) != null) {
            return new hjk(linearLayout);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.qrText)));
        return null;
    }
}
