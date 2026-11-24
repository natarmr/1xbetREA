package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wru0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wru0 f39663a = new wru0(1, o6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentVirtualGridSectionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) view;
        return new o6r(recyclerView, recyclerView);
    }
}
