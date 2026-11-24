package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryPickerView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rr30 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rr30 f30961a = new rr30(1, b2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bonus_games/impl/databinding/FragmentMemoryBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.flProgress;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flProgress);
        if (frameLayout != null) {
            i = R.id.tvTitleGame;
            TextView textView = (TextView) yum0.f(view, R.id.tvTitleGame);
            if (textView != null) {
                i = R.id.viewMemoryGame;
                MemoryGameView memoryGameView = (MemoryGameView) yum0.f(view, R.id.viewMemoryGame);
                if (memoryGameView != null) {
                    i = R.id.viewSportPicker;
                    MemoryPickerView memoryPickerView = (MemoryPickerView) yum0.f(view, R.id.viewSportPicker);
                    if (memoryPickerView != null) {
                        return new b2r((ConstraintLayout) view, frameLayout, textView, memoryGameView, memoryPickerView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
