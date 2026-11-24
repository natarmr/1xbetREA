package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class tux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticsEventCard f34572a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleFighting d;

    public tux(SyntheticsEventCard syntheticsEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleFighting eventCardMiddleFighting) {
        this.f34572a = syntheticsEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleFighting;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34572a;
    }
}
