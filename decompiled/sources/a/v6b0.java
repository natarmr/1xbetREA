package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes3.dex */
public final class v6b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f36869a;
    public final WebGamesGameCollection b;
    public final DsHeader c;

    public v6b0(LinearLayout linearLayout, WebGamesGameCollection webGamesGameCollection, DsHeader dsHeader) {
        this.f36869a = linearLayout;
        this.b = webGamesGameCollection;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36869a;
    }
}
