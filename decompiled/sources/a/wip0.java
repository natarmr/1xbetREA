package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wip0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wip0 f39228a = new wip0(1, ijp0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bet_constructor/impl/databinding/TeamSelectorDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.team_selector_dialog, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvTeamSelector);
        if (recyclerView != null) {
            return new ijp0(linearLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvTeamSelector)));
        return null;
    }
}
