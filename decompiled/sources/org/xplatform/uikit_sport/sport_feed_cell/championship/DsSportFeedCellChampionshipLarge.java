package org.xplatform.uikit_sport.sport_feed_cell.championship;

import a.h3l0;
import a.s2n;
import a.t9f;
import android.content.Context;
import android.util.AttributeSet;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSportFeedCellChampionshipLarge extends DsSportCell {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsSportFeedCellChampionshipLarge(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    public final void setChampionshipStyle(boolean z) {
        setComponentStyle(z ? s2n.b : s2n.f31509a);
    }

    public final void setComponentStyle(s2n s2nVar) {
        s2nVar.getClass();
        switch (s2nVar.ordinal()) {
            case 0:
            case 8:
                SportCellRightView cellRightView = getCellRightView();
                if (cellRightView != null) {
                    cellRightView.setVisibility(8);
                }
                break;
            case 1:
                SportCellRightView cellRightView2 = getCellRightView();
                if (cellRightView2 != null) {
                    cellRightView2.setStyle(h3l0.h);
                }
                break;
            case 2:
                SportCellRightView cellRightView3 = getCellRightView();
                if (cellRightView3 != null) {
                    cellRightView3.setStyle(h3l0.b);
                }
                break;
            case 3:
                SportCellRightView cellRightView4 = getCellRightView();
                if (cellRightView4 != null) {
                    cellRightView4.setStyle(h3l0.f12391a);
                }
                break;
            case 4:
                SportCellRightView cellRightView5 = getCellRightView();
                if (cellRightView5 != null) {
                    cellRightView5.setStyle(h3l0.c);
                }
                break;
            case 5:
                SportCellRightView cellRightView6 = getCellRightView();
                if (cellRightView6 != null) {
                    cellRightView6.setStyle(h3l0.d);
                }
                break;
            case 6:
                SportCellRightView cellRightView7 = getCellRightView();
                if (cellRightView7 != null) {
                    cellRightView7.setStyle(h3l0.f);
                }
                break;
            case 7:
                SportCellRightView cellRightView8 = getCellRightView();
                if (cellRightView8 != null) {
                    cellRightView8.setVisibility(8);
                }
                break;
            case 9:
                break;
            default:
                t9f.b();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportFeedCellChampionshipLarge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportFeedCellChampionshipLarge(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
