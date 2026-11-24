package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyberPoker;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class vux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticsEventCard f38070a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleCyberPoker d;

    public vux(SyntheticsEventCard syntheticsEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleCyberPoker eventCardMiddleCyberPoker) {
        this.f38070a = syntheticsEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleCyberPoker;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38070a;
    }
}
