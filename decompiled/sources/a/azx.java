package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes7.dex */
public final class azx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f1741a;
    public final DsMenuCell b;
    public final WebGamesGameCollection c;
    public final DsCellLeftIcon d;
    public final DsCellRightButton e;
    public final DsCellMiddleTitle f;

    public azx(LinearLayout linearLayout, DsMenuCell dsMenuCell, WebGamesGameCollection webGamesGameCollection, DsCellLeftIcon dsCellLeftIcon, DsCellRightButton dsCellRightButton, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f1741a = linearLayout;
        this.b = dsMenuCell;
        this.c = webGamesGameCollection;
        this.d = dsCellLeftIcon;
        this.e = dsCellRightButton;
        this.f = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1741a;
    }
}
