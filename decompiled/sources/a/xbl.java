package a;

import android.view.View;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketLineView;

/* JADX INFO: loaded from: classes6.dex */
public final class xbl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40606a;
    public final /* synthetic */ zbl b;
    public final /* synthetic */ BracketLineView c;
    public final /* synthetic */ BracketItemView d;
    public final /* synthetic */ BracketItemView e;
    public final /* synthetic */ lk50 f;
    public final /* synthetic */ lk50 g;

    public /* synthetic */ xbl(zbl zblVar, BracketLineView bracketLineView, BracketItemView bracketItemView, BracketItemView bracketItemView2, lk50 lk50Var, lk50 lk50Var2, byte b) {
        this.f40606a = b;
        this.b = zblVar;
        this.c = bracketLineView;
        this.d = bracketItemView;
        this.e = bracketItemView2;
        this.f = lk50Var;
        this.g = lk50Var2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f40606a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                int i9 = zbl.A;
                this.b.t(this.c, this.d, this.e, this.f, this.g);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                int i10 = zbl.A;
                this.b.t(this.c, this.d, this.e, this.f, this.g);
                break;
        }
    }
}
