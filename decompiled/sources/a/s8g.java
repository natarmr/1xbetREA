package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class s8g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ u8g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8g(u8g u8gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = u8gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u8g u8gVar = this.j;
        switch (b) {
            case 0:
                return new s8g(u8gVar, yjeVar, (byte) 0);
            case 1:
                return new s8g(u8gVar, yjeVar, (byte) 1);
            default:
                return new s8g(u8gVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s8g) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((s8g) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 1;
        u8g u8gVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                u8g u8gVar2 = this.j;
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = u8gVar2.c;
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModelO = fre0.O(cyberCalendarPeriodUiModel.f46479a);
                long j = cyberCalendarPeriodUiModel.f46479a;
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                calendar.setTimeInMillis(j);
                calendar.set(5, calendar.getActualMinimum(5));
                calendar.getTimeInMillis();
                calendar.set(7, calendar.getFirstDayOfWeek());
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                long timeInMillis = calendar.getTimeInMillis();
                Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                calendar2.setTimeInMillis(j);
                calendar2.set(5, calendar2.getActualMaximum(5));
                calendar2.getTimeInMillis();
                calendar2.set(7, calendar2.getFirstDayOfWeek());
                calendar2.add(5, 6);
                calendar2.set(11, 23);
                calendar2.set(12, 59);
                calendar2.set(13, 59);
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2 = new CyberCalendarPeriodUiModel(timeInMillis, calendar2.getTimeInMillis());
                Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                calendar3.setTimeInMillis(timeInMillis);
                ArrayList arrayList = new ArrayList();
                while (calendar3.getTimeInMillis() < cyberCalendarPeriodUiModel2.b) {
                    ArrayList arrayListL = q3d.l(fre0.Q(calendar3));
                    for (int i = 1; i < 7; i++) {
                        calendar3.add(6, 1);
                        arrayListL.add(fre0.Q(calendar3));
                    }
                    calendar3.add(6, 1);
                    arrayList.add(arrayListL);
                }
                p7m0 p7m0Var = u8gVar2.m;
                x5g x5gVar = new x5g((List) CollectionsKt.U(arrayList), cyberCalendarPeriodUiModelO, y5g.f42044a);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new x5g((List) it.next(), cyberCalendarPeriodUiModelO, y5g.b));
                }
                r8g r8gVar = new r8g(x5gVar, arrayList2);
                p7m0Var.getClass();
                yje yjeVar = null;
                p7m0Var.o(null, r8gVar);
                bby bbyVar = u8gVar2.r;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                u8gVar2.r = sac.V(jiu0.a(u8gVar2), new p8g(u8gVar2, (byte) 2), null, u8gVar2.j.b, new g6g(u8gVar2, arrayList, cyberCalendarPeriodUiModel2, yjeVar, (byte) 2), 10);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                u8gVar.y();
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!(u8gVar.n.getValue() instanceof n8g)) {
                    sac.V(jiu0.a(u8gVar), new p8g(u8gVar, b3), null, u8gVar.j.b, new s8g(u8gVar, null, b2), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
