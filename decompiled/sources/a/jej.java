package a;

import java.util.Locale;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class jej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f16377a;
    public final SimpleDate b;
    public final SimpleDate c;
    public final int d;
    public final Integer e;
    public final pz40 f;

    public jej(Locale locale, SimpleDate simpleDate, SimpleDate simpleDate2, int i, Integer num, pz40 pz40Var) {
        simpleDate.getClass();
        simpleDate2.getClass();
        pz40Var.getClass();
        this.f16377a = locale;
        this.b = simpleDate;
        this.c = simpleDate2;
        this.d = i;
        this.e = num;
        this.f = pz40Var;
    }

    public final DateRangeModel a() {
        DateRangeModel dateRangeModel = (DateRangeModel) this.f.getValue();
        return dateRangeModel == null ? new DateRangeModel(null, null) : dateRangeModel;
    }
}
