package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ehq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ehq0 f7820a = new ehq0(1, ssh.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/section/impl/databinding/CybergameBottomSheetTimeFilterDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_bottom_sheet_time_filter_dialog, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recycler_view);
        if (recyclerView != null) {
            return new ssh(linearLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view)));
        return null;
    }
}
