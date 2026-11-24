package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyber;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class gvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicEventCard f11996a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardInfoLive d;
    public final EventCardMiddleCyber e;

    public gvx(BasicEventCard basicEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardInfoLive eventCardInfoLive, EventCardMiddleCyber eventCardMiddleCyber) {
        this.f11996a = basicEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardInfoLive;
        this.e = eventCardMiddleCyber;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11996a;
    }
}
