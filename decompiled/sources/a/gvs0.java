package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gvs0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gvs0 f11991a = new gvs0(1, rjk.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/DialogTwoFactorAuthenticationQrCodeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.ivClose;
        ImageView imageView = (ImageView) yum0.f(view, R.id.ivClose);
        if (imageView != null) {
            i = R.id.ivQr;
            ImageView imageView2 = (ImageView) yum0.f(view, R.id.ivQr);
            if (imageView2 != null) {
                return new rjk((FrameLayout) view, imageView, imageView2);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
