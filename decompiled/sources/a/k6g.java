package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarDaysOfWeekView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarWeekView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class k6g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l6g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6g(l6g l6gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l6gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l6g l6gVar = this.k;
        switch (b) {
            case 0:
                k6g k6gVar = new k6g(l6gVar, yjeVar, (byte) 0);
                k6gVar.j = obj;
                return k6gVar;
            default:
                k6g k6gVar2 = new k6g(l6gVar, yjeVar, (byte) 1);
                k6gVar2.j = obj;
                return k6gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k6g) create((r8g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k6g) create((q6g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        l6g l6gVar = this.k;
        byte b2 = 0;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kwd kwdVar = l6g.Q1;
                CyberCalendarWeekView cyberCalendarWeekView = l6gVar.G0().e;
                x5g x5gVar = ((r8g) obj2).f30023a;
                j6g j6gVar = new j6g(l6gVar, b2);
                vd7 vd7Var = cyberCalendarWeekView.f46488a;
                ((CyberCalendarDaysOfWeekView) vd7Var.c).a(x5gVar);
                CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = (CyberCalendarDaysOfWeekView) vd7Var.d;
                y5g y5gVar = y5g.b;
                List list = x5gVar.f40314a;
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = x5gVar.b;
                list.getClass();
                cyberCalendarDaysOfWeekView.a(new x5g(list, cyberCalendarPeriodUiModel, y5gVar));
                cyberCalendarWeekView.b = list;
                cyberCalendarWeekView.d = j6gVar;
                cyberCalendarWeekView.requestLayout();
                return Unit.f46060a;
            default:
                q6g q6gVar = (q6g) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(q6gVar, o6g.f24734a)) {
                    kwd kwdVar2 = l6g.Q1;
                    pb10 pb10VarK = ((Boolean) l6gVar.P1.n(l6gVar, l6g.R1[2])).booleanValue() ? pb10.q : ozb.K(-1L);
                    DSLottieEmptyContainer dSLottieEmptyContainer = l6gVar.G0().d;
                    g2v g2vVar = l6gVar.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    dSLottieEmptyContainer.a(g2v.d(g2vVar, pb10VarK, null, null, 0, 0, null, 510));
                    l6gVar.G0().d.setVisibility(0);
                    l6gVar.G0().e.setVisibility(0);
                    l6gVar.G0().b.setVisibility(0);
                    l6gVar.G0().c.setVisibility(8);
                } else if (q6gVar instanceof n6g) {
                    kwd kwdVar3 = l6g.Q1;
                    l6gVar.G0().d.setVisibility(0);
                    l6gVar.G0().c.setVisibility(8);
                    l6gVar.G0().b.setVisibility(8);
                    l6gVar.G0().d.setButtonOnClickListener(new oye(0, l6gVar.H0(), w6g.class, "onRefreshClick", "onRefreshClick()V", 0, (byte) 15));
                    n6g n6gVar = (n6g) q6gVar;
                    l6gVar.G0().d.b(n6gVar.f22996a, n6gVar.b, new oye(0, l6gVar.H0(), w6g.class, "setEndTimerState", "setEndTimerState()V", 0, (byte) 16));
                } else {
                    if (!(q6gVar instanceof p6g)) {
                        t9f.b();
                        return null;
                    }
                    kwd kwdVar4 = l6g.Q1;
                    l6gVar.G0().d.setVisibility(8);
                    l6gVar.G0().c.setVisibility(0);
                    l6gVar.G0().e.setVisibility(0);
                    l6gVar.G0().b.setVisibility(0);
                    l6gVar.G0().c.f(((CyberCalendarDaysOfWeekParams) l6gVar.O1.n(l6gVar, l6g.R1[1])).f46486a, ((p6g) q6gVar).b, new j6g(l6gVar, (byte) 1), new vlf((byte) 13));
                }
                return Unit.f46060a;
        }
    }
}
