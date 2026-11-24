package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w3w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3w f38518a = new w3w(1, qa7.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/BetInfoDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bet_info_dialog, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recycler);
        if (recyclerView != null) {
            return new qa7(constraintLayout, recyclerView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler)));
        return null;
    }
}
