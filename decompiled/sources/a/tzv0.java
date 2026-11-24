package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tzv0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tzv0 f34823a = new tzv0(1, s6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentXGamesSectionMenuBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view;
        return new s6r(recyclerView, recyclerView);
    }
}
