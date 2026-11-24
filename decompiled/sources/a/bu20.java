package a;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;

/* JADX INFO: loaded from: classes6.dex */
public final class bu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventCardBottomMarketMultiline f3211a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public pkm f;
    public Function2 g;
    public Function2 h;
    public Function0 i;
    public xdr j;

    public bu20(EventCardBottomMarketMultiline eventCardBottomMarketMultiline) {
        this.f3211a = eventCardBottomMarketMultiline;
    }

    public final pkm a() {
        pkm pkmVar = this.f;
        if (pkmVar != null) {
            return pkmVar;
        }
        EventCardBottomMarketMultiline eventCardBottomMarketMultiline = this.f3211a;
        Context context = eventCardBottomMarketMultiline.getContext();
        context.getClass();
        pkm pkmVar2 = new pkm(context);
        pkmVar2.setVisibility(8);
        dyb.b0(pkmVar2, ymx.INTERVAL_500, new km00(this, (byte) 23));
        eventCardBottomMarketMultiline.addView(pkmVar2);
        this.f = pkmVar2;
        return pkmVar2;
    }
}
