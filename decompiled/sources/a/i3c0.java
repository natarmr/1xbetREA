package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i3c0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3c0 f14091a = new i3c0(1, ejk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/blocking/databinding/DialogProgressGeoBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_progress_geo, (ViewGroup) null, false);
        int i = R.id.fake_view;
        View viewF = yum0.f(viewInflate, R.id.fake_view);
        if (viewF != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = R.id.message;
            if (((TextView) yum0.f(viewInflate, R.id.message)) != null) {
                i2 = R.id.progress_bar;
                if (((ProgressBar) yum0.f(viewInflate, R.id.progress_bar)) != null) {
                    i2 = R.id.title;
                    if (((TextView) yum0.f(viewInflate, R.id.title)) != null) {
                        return new ejk(constraintLayout, viewF);
                    }
                }
            }
            i = i2;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
