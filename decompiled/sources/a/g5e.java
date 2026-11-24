package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g5e extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g5e f10713a = new g5e(1, jik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantFileBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_consultant_file, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.selectCamera;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.selectCamera);
        if (textView != null) {
            i = R.id.selectFile;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.selectFile);
            if (textView2 != null) {
                i = R.id.selectPhoto;
                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.selectPhoto);
                if (textView3 != null) {
                    i = R.id.separatorCamera;
                    View viewF = yum0.f(viewInflate, R.id.separatorCamera);
                    if (viewF != null) {
                        return new jik(linearLayout, textView, textView2, textView3, viewF);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
