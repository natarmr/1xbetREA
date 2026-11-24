package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z5s0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5s0 f43835a = new z5s0(1, yw1.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentStagePrizesFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new yw1(composeView, composeView);
    }
}
