package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class v6g extends bnn0 implements Function2 {
    public final /* synthetic */ long i;
    public final /* synthetic */ w6g j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ CyberCalendarPeriodUiModel l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6g(long j, w6g w6gVar, ArrayList arrayList, CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel, yje yjeVar) {
        super(2, yjeVar);
        this.i = j;
        this.j = w6gVar;
        this.k = arrayList;
        this.l = cyberCalendarPeriodUiModel;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v6g(this.i, this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(this.i);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(5);
        w6g w6gVar = this.j;
        c5g c5gVar = new c5g(i, i2, i3, i4, w6gVar.c.f46486a, false);
        bby bbyVar = w6gVar.s;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        w6gVar.s = sac.V(jiu0.a(w6gVar), new s6g(w6gVar, (byte) 3), null, w6gVar.j.f22085a, new kv(w6gVar, c5gVar, this.k, this.l, null, (byte) 7), 10);
        return Unit.f46060a;
    }
}
