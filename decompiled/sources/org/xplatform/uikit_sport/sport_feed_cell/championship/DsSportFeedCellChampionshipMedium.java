package org.xplatform.uikit_sport.sport_feed_cell.championship;

import a.h3l0;
import a.r0m;
import a.s2n;
import a.t9f;
import android.content.Context;
import android.util.AttributeSet;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSportFeedCellChampionshipMedium extends DsSportCell {
    /* JADX WARN: Illegal instructions before constructor call */
    public DsSportFeedCellChampionshipMedium(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
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
                    cellRightView2.setCounterStyle(r0m.n);
                }
                SportCellRightView cellRightView3 = getCellRightView();
                if (cellRightView3 != null) {
                    cellRightView3.setStyle(h3l0.e);
                }
                break;
            case 2:
                SportCellRightView cellRightView4 = getCellRightView();
                if (cellRightView4 != null) {
                    cellRightView4.setCounterStyle(r0m.n);
                }
                SportCellRightView cellRightView5 = getCellRightView();
                if (cellRightView5 != null) {
                    cellRightView5.setStyle(h3l0.d);
                }
                break;
            case 3:
                SportCellRightView cellRightView6 = getCellRightView();
                if (cellRightView6 != null) {
                    cellRightView6.setCounterStyle(r0m.n);
                }
                SportCellRightView cellRightView7 = getCellRightView();
                if (cellRightView7 != null) {
                    cellRightView7.setStyle(h3l0.f);
                }
                break;
            case 4:
                SportCellRightView cellRightView8 = getCellRightView();
                if (cellRightView8 != null) {
                    cellRightView8.setCounterStyle(r0m.o);
                }
                SportCellRightView cellRightView9 = getCellRightView();
                if (cellRightView9 != null) {
                    cellRightView9.setStyle(h3l0.c);
                }
                break;
            case 5:
                SportCellRightView cellRightView10 = getCellRightView();
                if (cellRightView10 != null) {
                    cellRightView10.setCounterStyle(r0m.o);
                }
                SportCellRightView cellRightView11 = getCellRightView();
                if (cellRightView11 != null) {
                    cellRightView11.setStyle(h3l0.d);
                }
                break;
            case 6:
                SportCellRightView cellRightView12 = getCellRightView();
                if (cellRightView12 != null) {
                    cellRightView12.setCounterStyle(r0m.o);
                }
                SportCellRightView cellRightView13 = getCellRightView();
                if (cellRightView13 != null) {
                    cellRightView13.setStyle(h3l0.f);
                }
                break;
            case 7:
                SportCellRightView cellRightView14 = getCellRightView();
                if (cellRightView14 != null) {
                    cellRightView14.setStyle(h3l0.c);
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
    public DsSportFeedCellChampionshipMedium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportFeedCellChampionshipMedium(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
