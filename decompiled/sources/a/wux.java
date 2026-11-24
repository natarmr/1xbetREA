package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSette;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class wux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticsEventCard f39811a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleSette d;

    public wux(SyntheticsEventCard syntheticsEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleSette eventCardMiddleSette) {
        this.f39811a = syntheticsEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleSette;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39811a;
    }
}
