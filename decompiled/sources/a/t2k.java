package a;

import android.view.View;
import androidx.cardview.widget.CardView;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes5.dex */
public final class t2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f33219a;
    public final WebGamesGameCollection b;
    public final DsHeader c;

    public t2k(CardView cardView, WebGamesGameCollection webGamesGameCollection, DsHeader dsHeader) {
        this.f33219a = cardView;
        this.b = webGamesGameCollection;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33219a;
    }
}
