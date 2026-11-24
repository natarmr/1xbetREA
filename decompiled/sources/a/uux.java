package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleWinningFormula;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class uux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticsEventCard f36322a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleWinningFormula d;

    public uux(SyntheticsEventCard syntheticsEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleWinningFormula eventCardMiddleWinningFormula) {
        this.f36322a = syntheticsEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleWinningFormula;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36322a;
    }
}
