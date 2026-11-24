package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lfo0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lfo0 f19967a = new lfo0(1, n5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedAggregatorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view;
        return new n5r(recyclerView, recyclerView);
    }
}
