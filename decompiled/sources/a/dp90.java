package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dp90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dp90 f6454a = new dp90(1, uik.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/picker/impl/databinding/DialogFragmentPickerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return new uik((ComposeView) view);
    }
}
