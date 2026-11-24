package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rl1 extends i1w0 {
    public final ehf0 h;

    public rl1(ehf0 ehf0Var) {
        this.h = ehf0Var;
    }

    public final void g(lr1 lr1Var) {
        lr1Var.getClass();
        FragmentScreen fragmentScreenW = this.h.w(lr1Var.b, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), false);
        b(new asc(fragmentScreenW, fragmentScreenW.getF45455a()));
    }

    public final void h(lr1 lr1Var, FragmentScreen fragmentScreen) {
        lr1Var.getClass();
        b(new tb50(fragmentScreen, this.h.w(lr1Var.b, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), false).getF45455a()));
    }
}
