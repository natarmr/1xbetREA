package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit_web_games.top_games_collection.WebGamesTopGamesCollection;

/* JADX INFO: loaded from: classes3.dex */
public final class q7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f28241a;
    public final WebGamesTopGamesCollection b;

    public q7b0(FrameLayout frameLayout, WebGamesTopGamesCollection webGamesTopGamesCollection) {
        this.f28241a = frameLayout;
        this.b = webGamesTopGamesCollection;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28241a;
    }
}
