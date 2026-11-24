package a;

import android.widget.TextView;
import java.util.List;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;

/* JADX INFO: loaded from: classes4.dex */
public final class gia extends zje {
    public TextView i;
    public List j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ CardFootballView m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gia(CardFootballView cardFootballView, zje zjeVar) {
        super(zjeVar);
        this.m = cardFootballView;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        int i = CardFootballView.x;
        return this.m.u(null, null, this);
    }
}
