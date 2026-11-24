package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class sux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicEventCard f32840a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleCricket d;

    public sux(BasicEventCard basicEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleCricket eventCardMiddleCricket) {
        this.f32840a = basicEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleCricket;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32840a;
    }
}
