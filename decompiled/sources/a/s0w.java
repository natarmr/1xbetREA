package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0w f31428a = new s0w(1, a47.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/BetHistoryDateFilterTypeDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bet_history_date_filter_type_dialog, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvDateFilter);
        if (recyclerView != null) {
            return new a47(constraintLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvDateFilter)));
        return null;
    }
}
