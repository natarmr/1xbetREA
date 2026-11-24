package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes3.dex */
public final class bzx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3495a;
    public final DsMenuCell b;
    public final WebGamesGameCollection c;
    public final DsCellLeftIcon d;
    public final DsCellRightButton e;
    public final DsCellMiddleTitle f;

    public bzx(LinearLayout linearLayout, DsMenuCell dsMenuCell, WebGamesGameCollection webGamesGameCollection, DsCellLeftIcon dsCellLeftIcon, DsCellRightButton dsCellRightButton, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f3495a = linearLayout;
        this.b = dsMenuCell;
        this.c = webGamesGameCollection;
        this.d = dsCellLeftIcon;
        this.e = dsCellRightButton;
        this.f = dsCellMiddleTitle;
    }

    public static bzx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_x_games_scrollable_menu_item, viewGroup, false);
        int i = R.id.cell;
        DsMenuCell dsMenuCell = (DsMenuCell) yum0.f(viewInflate, R.id.cell);
        if (dsMenuCell != null) {
            i = R.id.gameCollection;
            WebGamesGameCollection webGamesGameCollection = (WebGamesGameCollection) yum0.f(viewInflate, R.id.gameCollection);
            if (webGamesGameCollection != null) {
                i = R.id.icon;
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.icon);
                if (dsCellLeftIcon != null) {
                    i = R.id.moreButton;
                    DsCellRightButton dsCellRightButton = (DsCellRightButton) yum0.f(viewInflate, R.id.moreButton);
                    if (dsCellRightButton != null) {
                        i = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new bzx((LinearLayout) viewInflate, dsMenuCell, webGamesGameCollection, dsCellLeftIcon, dsCellRightButton, dsCellMiddleTitle);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3495a;
    }
}
