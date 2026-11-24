package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ojx extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ojx f25381a = new ojx(1, n6q.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetInstrumentsDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fin_bet_instruments_dialog, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvInstruments);
        if (recyclerView != null) {
            return new n6q(linearLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvInstruments)));
        return null;
    }
}
