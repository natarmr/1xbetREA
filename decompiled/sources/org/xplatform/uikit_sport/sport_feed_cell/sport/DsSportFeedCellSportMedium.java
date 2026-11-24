package org.xplatform.uikit_sport.sport_feed_cell.sport;

import a.h3l0;
import a.t9f;
import a.u2n;
import android.content.Context;
import android.util.AttributeSet;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSportFeedCellSportMedium extends DsSportCell {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsSportFeedCellSportMedium(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    public final void setComponentStyle(u2n u2nVar) {
        u2nVar.getClass();
        int iOrdinal = u2nVar.ordinal();
        if (iOrdinal == 0) {
            SportCellRightView cellRightView = getCellRightView();
            if (cellRightView != null) {
                cellRightView.setStyle(h3l0.f12391a);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            SportCellRightView cellRightView2 = getCellRightView();
            if (cellRightView2 != null) {
                cellRightView2.setVisibility(8);
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            SportCellRightView cellRightView3 = getCellRightView();
            if (cellRightView3 != null) {
                cellRightView3.setStyle(h3l0.c);
                return;
            }
            return;
        }
        if (iOrdinal == 3) {
            SportCellRightView cellRightView4 = getCellRightView();
            if (cellRightView4 != null) {
                cellRightView4.setStyle(h3l0.e);
                return;
            }
            return;
        }
        if (iOrdinal != 4) {
            t9f.b();
            return;
        }
        SportCellRightView cellRightView5 = getCellRightView();
        if (cellRightView5 != null) {
            cellRightView5.setStyle(h3l0.f);
        }
    }

    public final void setSportStyle(boolean z) {
        setComponentStyle(z ? u2n.b : u2n.f34954a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportFeedCellSportMedium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportFeedCellSportMedium(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
