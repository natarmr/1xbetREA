package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s2q extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2q f31514a = new s2q(1, nik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/sportgame/markets/settings/impl/databinding/DialogFilterActionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_filter_action, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.tvRowOne;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvRowOne);
        if (textView != null) {
            i = R.id.tvRowTwo;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvRowTwo);
            if (textView2 != null) {
                i = R.id.tvTitle;
                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                if (textView3 != null) {
                    i = R.id.vDivider;
                    View viewF = yum0.f(viewInflate, R.id.vDivider);
                    if (viewF != null) {
                        return new nik(constraintLayout, textView, textView2, textView3, viewF);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
