package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kbe extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kbe f18010a = new kbe(1, kik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantSendErrorMessageBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_consultant_send_error_message, (ViewGroup) null, false);
        int i = R.id.buttonDelete;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.buttonDelete);
        if (textView != null) {
            i = R.id.buttonResend;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.buttonResend);
            if (textView2 != null) {
                i = R.id.buttonRetryDownload;
                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.buttonRetryDownload);
                if (textView3 != null) {
                    i = R.id.buttonRetryUpload;
                    TextView textView4 = (TextView) yum0.f(viewInflate, R.id.buttonRetryUpload);
                    if (textView4 != null) {
                        i = R.id.resendSeparator;
                        View viewF = yum0.f(viewInflate, R.id.resendSeparator);
                        if (viewF != null) {
                            i = R.id.retryDownloadSeparator;
                            View viewF2 = yum0.f(viewInflate, R.id.retryDownloadSeparator);
                            if (viewF2 != null) {
                                i = R.id.retryUploadSeparator;
                                View viewF3 = yum0.f(viewInflate, R.id.retryUploadSeparator);
                                if (viewF3 != null) {
                                    return new kik((LinearLayout) viewInflate, textView, textView2, textView3, textView4, viewF, viewF2, viewF3);
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
