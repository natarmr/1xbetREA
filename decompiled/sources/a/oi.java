package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oi extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oi f25289a = new oi(1, gik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/sportgame/action_menu/impl/databinding/DialogActionMenuBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_action_menu, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvActions);
        if (recyclerView != null) {
            return new gik(frameLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvActions)));
        return null;
    }
}
