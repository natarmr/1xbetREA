package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dbj extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dbj f5807a = new dbj(1, lik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/registration/core/databinding/DialogDataRetrievalErrorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_data_retrieval_error, (ViewGroup) null, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.errorMessage);
        if (textView != null) {
            return new lik((FrameLayout) viewInflate, textView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.errorMessage)));
        return null;
    }
}
