package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hce0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hce0 f12820a = new hce0(1, t3r.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/responsible_game_impl/databinding/FragmentRealityLimitErrorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_reality_limit_error, (ViewGroup) null, false);
        int i = R.id.ivConfirmDepositLimit;
        if (((ImageView) yum0.f(viewInflate, R.id.ivConfirmDepositLimit)) != null) {
            i = R.id.tvTitle;
            if (((TextView) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                return new t3r((LinearLayout) viewInflate);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
