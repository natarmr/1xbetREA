package a;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;

/* JADX INFO: loaded from: classes6.dex */
public final class gym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a530 f12138a;
    public final mj8 b;
    public ex7 c;
    public hhk d;
    public List e = iun.f15405a;
    public ms2 f = new zq2();
    public a9g g;
    public int h;

    public gym0(a530 a530Var, mj8 mj8Var) {
        this.f12138a = a530Var;
        this.b = mj8Var;
    }

    public final void a(l5r l5rVar, SelectedTabState selectedTabState, Function0 function0) {
        int i;
        l5rVar.getClass();
        selectedTabState.getClass();
        if (!(selectedTabState instanceof SelectedTabState.Position) || (i = ((SelectedTabState.Position) selectedTabState).f47016a) == this.h) {
            return;
        }
        ((ViewPager2) l5rVar.c.f).e(i, false);
        function0.invoke();
    }
}
