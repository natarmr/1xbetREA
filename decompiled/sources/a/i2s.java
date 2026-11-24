package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i2s extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2s f14066a = new i2s(1, y4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/sportgame/classic/impl/databinding/FragmentSportGameClassicBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        return new y4r(composeView, composeView);
    }
}
