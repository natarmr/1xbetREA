package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class m5g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n5g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5g(n5g n5gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n5gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n5g n5gVar = this.k;
        switch (b) {
            case 0:
                m5g m5gVar = new m5g(n5gVar, yjeVar, (byte) 0);
                m5gVar.j = obj;
                return m5gVar;
            default:
                m5g m5gVar2 = new m5g(n5gVar, yjeVar, (byte) 1);
                m5gVar2.j = obj;
                return m5gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m5g) create((CyberCalendarPeriodUiModel) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m5g) create((och) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        n5g n5gVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                qud qudVar = n5g.S1;
                n5gVar.G0().b.setDate(((CyberCalendarPeriodUiModel) obj2).f46479a);
                return Unit.f46060a;
            default:
                och ochVar = (och) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ochVar != null) {
                    if (ochVar instanceof nch) {
                        qud qudVar2 = n5g.S1;
                        pb10 pb10VarK = ((CyberCalendarParams) n5gVar.R1.n(n5gVar, n5g.U1[1])).d ? pb10.q : ozb.K(-1L);
                        DSLottieEmptyContainer dSLottieEmptyContainer = n5gVar.G0().d;
                        g2v g2vVar = n5gVar.L1;
                        if (g2vVar == null) {
                            Intrinsics.h("lottieEmptyConfigurator");
                            throw null;
                        }
                        dSLottieEmptyContainer.a(g2v.d(g2vVar, pb10VarK, null, null, 0, 0, null, 510));
                        n5gVar.G0().d.setVisibility(0);
                        n5gVar.G0().e.setVisibility(8);
                        n5gVar.H0().A(null);
                    } else if (ochVar instanceof lch) {
                        qud qudVar3 = n5g.S1;
                        n5gVar.G0().d.setVisibility(8);
                        n5gVar.G0().e.setVisibility(0);
                        n5gVar.H0().A(((lch) ochVar).f19799a);
                    } else if (ochVar instanceof mch) {
                        qud qudVar4 = n5g.S1;
                        n5gVar.G0().e.setVisibility(8);
                        n5gVar.G0().d.setVisibility(0);
                        n5gVar.H0().A(iun.f15405a);
                        n5gVar.G0().e.getRecycledViewPool().a();
                        Class<h6g> cls = h6g.class;
                        n5gVar.G0().d.setButtonOnClickListener(new oye(0, n5gVar.I0(), cls, "onRefreshClick", "onRefreshClick()V", 0, (byte) 13));
                        mch mchVar = (mch) ochVar;
                        n5gVar.G0().d.b(mchVar.f21551a, mchVar.b, new oye(0, n5gVar.I0(), cls, "setEndTimerState", "setEndTimerState()V", 0, (byte) 14));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
