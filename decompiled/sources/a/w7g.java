package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;
import org.xplatform.cyber.calendar.impl.presentation.content.month.CyberCalendarMonthView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class w7g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y7g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7g(y7g y7gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = y7gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y7g y7gVar = this.k;
        switch (b) {
            case 0:
                w7g w7gVar = new w7g(y7gVar, yjeVar, (byte) 0);
                w7gVar.j = obj;
                return w7gVar;
            default:
                w7g w7gVar2 = new w7g(y7gVar, yjeVar, (byte) 1);
                w7gVar2.j = obj;
                return w7gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w7g) create((r8g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w7g) create((o8g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [a.x7g] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.x7g] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        final y7g y7gVar = this.k;
        int i = 0;
        int i2 = 0;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                r8g r8gVar = (r8g) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                std stdVar = y7g.Q1;
                y7gVar.G0().c.a(r8gVar.f30023a);
                CyberCalendarMonthView cyberCalendarMonthView = y7gVar.G0().e;
                List list = r8gVar.b;
                list.getClass();
                for (Object obj3 : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    hxm0.l(cyberCalendarMonthView, 2L, new bh1(cyberCalendarMonthView, i, (x5g) obj3, b2));
                    i = i3;
                }
                return Unit.f46060a;
            default:
                o8g o8gVar = (o8g) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(o8gVar, m8g.f21368a)) {
                    std stdVar2 = y7g.Q1;
                    pb10 pb10VarK = ((Boolean) y7gVar.P1.n(y7gVar, y7g.R1[2])).booleanValue() ? pb10.q : ozb.K(-1L);
                    DSLottieEmptyContainer dSLottieEmptyContainer = y7gVar.G0().d;
                    g2v g2vVar = y7gVar.L1;
                    if (g2vVar == null) {
                        Intrinsics.h("lottieEmptyConfigurator");
                        throw null;
                    }
                    dSLottieEmptyContainer.a(g2v.d(g2vVar, pb10VarK, null, null, 0, 0, null, 510));
                    y7gVar.G0().d.setVisibility(0);
                    y7gVar.G0().b.setVisibility(0);
                    y7gVar.G0().c.setVisibility(0);
                    y7gVar.G0().e.setVisibility(0);
                } else if (o8gVar instanceof l8g) {
                    std stdVar3 = y7g.Q1;
                    y7gVar.G0().b.setVisibility(8);
                    y7gVar.G0().c.setVisibility(0);
                    y7gVar.G0().e.setVisibility(8);
                    y7gVar.G0().d.setVisibility(0);
                    Class<u8g> cls = u8g.class;
                    y7gVar.G0().d.setButtonOnClickListener(new oye(0, y7gVar.H0(), cls, "onRefreshClick", "onRefreshClick()V", 0, (byte) 17));
                    l8g l8gVar = (l8g) o8gVar;
                    y7gVar.G0().d.b(l8gVar.f19602a, l8gVar.b, new oye(0, y7gVar.H0(), cls, "setEndTimerState", "setEndTimerState()V", 0, (byte) 18));
                } else {
                    if (!(o8gVar instanceof n8g)) {
                        t9f.b();
                        return null;
                    }
                    std stdVar4 = y7g.Q1;
                    y7gVar.G0().b.setVisibility(0);
                    y7gVar.G0().c.setVisibility(0);
                    y7gVar.G0().e.setVisibility(0);
                    y7gVar.G0().d.setVisibility(8);
                    CyberCalendarMonthView cyberCalendarMonthView2 = y7gVar.G0().e;
                    ArrayList arrayList = ((n8g) o8gVar).b;
                    final byte b3 = i == true ? (byte) 1 : (byte) 0;
                    ?? r13 = new Function1() { // from class: a.x7g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b4 = b3;
                            y7g y7gVar2 = y7gVar;
                            switch (b4) {
                                case 0:
                                    i9g i9gVar = (i9g) obj4;
                                    std stdVar5 = y7g.Q1;
                                    String simpleName = v4g.class.getSimpleName();
                                    if (y7gVar2.C().J(simpleName) == null) {
                                        kud kudVar = v4g.l2;
                                        String str = i9gVar.d;
                                        l7g l7gVar = i9gVar.f;
                                        CyberCalendarChampInfoParams cyberCalendarChampInfoParams = new CyberCalendarChampInfoParams(str, l7gVar.f19556a, l7gVar.b, l7gVar.c, l7gVar.d, l7gVar.e, l7gVar.f, l7gVar.g, i9gVar.f14383a);
                                        boolean zBooleanValue = ((Boolean) y7gVar2.P1.n(y7gVar2, y7g.R1[2])).booleanValue();
                                        kudVar.getClass();
                                        kud.f(cyberCalendarChampInfoParams, zBooleanValue).H0(y7gVar2.C(), simpleName);
                                    }
                                    break;
                                default:
                                    long jLongValue = ((Long) obj4).longValue();
                                    std stdVar6 = y7g.Q1;
                                    u8g u8gVarH0 = y7gVar2.H0();
                                    sac.V(jiu0.a(u8gVarH0), new p8g(u8gVarH0, (byte) 0), null, u8gVarH0.j.f22085a, new ey((Object) u8gVarH0, jLongValue, (yje) null, (byte) 14), 10);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    final byte b4 = 1;
                    ?? r14 = new Function1() { // from class: a.x7g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b5 = b4;
                            y7g y7gVar2 = y7gVar;
                            switch (b5) {
                                case 0:
                                    i9g i9gVar = (i9g) obj4;
                                    std stdVar5 = y7g.Q1;
                                    String simpleName = v4g.class.getSimpleName();
                                    if (y7gVar2.C().J(simpleName) == null) {
                                        kud kudVar = v4g.l2;
                                        String str = i9gVar.d;
                                        l7g l7gVar = i9gVar.f;
                                        CyberCalendarChampInfoParams cyberCalendarChampInfoParams = new CyberCalendarChampInfoParams(str, l7gVar.f19556a, l7gVar.b, l7gVar.c, l7gVar.d, l7gVar.e, l7gVar.f, l7gVar.g, i9gVar.f14383a);
                                        boolean zBooleanValue = ((Boolean) y7gVar2.P1.n(y7gVar2, y7g.R1[2])).booleanValue();
                                        kudVar.getClass();
                                        kud.f(cyberCalendarChampInfoParams, zBooleanValue).H0(y7gVar2.C(), simpleName);
                                    }
                                    break;
                                default:
                                    long jLongValue = ((Long) obj4).longValue();
                                    std stdVar6 = y7g.Q1;
                                    u8g u8gVarH0 = y7gVar2.H0();
                                    sac.V(jiu0.a(u8gVarH0), new p8g(u8gVarH0, (byte) 0), null, u8gVarH0.j.f22085a, new ey((Object) u8gVarH0, jLongValue, (yje) null, (byte) 14), 10);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    Iterator it = arrayList.iterator();
                    while (true) {
                        int i4 = i2;
                        if (it.hasNext()) {
                            Object next = it.next();
                            i2 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            hxm0.l(cyberCalendarMonthView2, 2L, new n33(cyberCalendarMonthView2, (p6g) next, i4, arrayList, (x7g) r13, (x7g) r14));
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
