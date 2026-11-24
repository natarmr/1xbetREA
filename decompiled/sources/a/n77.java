package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n77 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n77 f23027a = new n77(1, r77.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/BetHistoryTypeDialogNewBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bet_history_type_dialog_new, (ViewGroup) null, false);
        int i = R.id.divider;
        View viewF = yum0.f(viewInflate, R.id.divider);
        if (viewF != null) {
            i = R.id.hideHistoryContainer;
            LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.hideHistoryContainer);
            if (linearLayout != null) {
                i = R.id.ivHideHistory;
                if (((ImageView) yum0.f(viewInflate, R.id.ivHideHistory)) != null) {
                    i = R.id.recycler;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recycler);
                    if (recyclerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.tvHideHistory;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvHideHistory);
                        if (textView != null) {
                            return new r77(constraintLayout, viewF, linearLayout, recyclerView, textView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
