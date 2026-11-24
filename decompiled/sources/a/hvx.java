package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.BasicEventCard;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class hvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicEventCard f13744a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardInfoLine d;
    public final EventCardMiddleTwoTeams e;

    public hvx(BasicEventCard basicEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardInfoLine eventCardInfoLine, EventCardMiddleTwoTeams eventCardMiddleTwoTeams) {
        this.f13744a = basicEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardInfoLine;
        this.e = eventCardMiddleTwoTeams;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13744a;
    }
}
