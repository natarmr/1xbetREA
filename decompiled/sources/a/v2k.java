package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes5.dex */
public final class v2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f36687a;
    public final WebGamesGameCollection b;
    public final DsHeader c;

    public v2k(LinearLayout linearLayout, WebGamesGameCollection webGamesGameCollection, DsHeader dsHeader) {
        this.f36687a = linearLayout;
        this.b = webGamesGameCollection;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36687a;
    }
}
