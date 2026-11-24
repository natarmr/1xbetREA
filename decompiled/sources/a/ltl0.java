package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ltl0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ltl0 f20635a = new ltl0(1, q5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedSportsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view;
        return new q5r(recyclerView, recyclerView);
    }
}
