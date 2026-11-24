package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y54 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y54 f42031a = new y54(1, hik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/auth/entrypoints/impl/databinding/DialogAuthEntryPointsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_auth_entry_points, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvAuthEntryPoints);
        if (recyclerView != null) {
            return new hik(linearLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvAuthEntryPoints)));
        return null;
    }
}
