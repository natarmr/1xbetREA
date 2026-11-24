package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleSingleTeam;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class dvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicEventCard f6767a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardInfoLive d;
    public final EventCardMiddleSingleTeam e;

    public dvx(BasicEventCard basicEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardInfoLive eventCardInfoLive, EventCardMiddleSingleTeam eventCardMiddleSingleTeam) {
        this.f6767a = basicEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardInfoLive;
        this.e = eventCardMiddleSingleTeam;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6767a;
    }
}
