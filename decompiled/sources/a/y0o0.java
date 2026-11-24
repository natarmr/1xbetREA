package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;

/* JADX INFO: loaded from: classes3.dex */
public final class y0o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardFootballView f41818a;
    public final CardFootballView b;

    public y0o0(CardFootballView cardFootballView, CardFootballView cardFootballView2) {
        this.f41818a = cardFootballView;
        this.b = cardFootballView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41818a;
    }
}
