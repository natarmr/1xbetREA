package a;

import android.view.View;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;
import org.xplatform.uikit_sport.eventcard.container.SyntheticsEventCard;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleBaccarat;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class avx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticsEventCard f1546a;
    public final EventCardBottomMarketMultiline b;
    public final EventCardHeader c;
    public final EventCardMiddleBaccarat d;

    public avx(SyntheticsEventCard syntheticsEventCard, EventCardBottomMarketMultiline eventCardBottomMarketMultiline, EventCardHeader eventCardHeader, EventCardMiddleBaccarat eventCardMiddleBaccarat) {
        this.f1546a = syntheticsEventCard;
        this.b = eventCardBottomMarketMultiline;
        this.c = eventCardHeader;
        this.d = eventCardMiddleBaccarat;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1546a;
    }
}
