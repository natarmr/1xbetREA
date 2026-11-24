package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ubp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wbp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubp0(wbp0 wbp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wbp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wbp0 wbp0Var = this.k;
        switch (b) {
            case 0:
                ubp0 ubp0Var = new ubp0(wbp0Var, yjeVar, (byte) 0);
                ubp0Var.j = ((Boolean) obj).booleanValue();
                return ubp0Var;
            default:
                return new ubp0(wbp0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ubp0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ubp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        wbp0 wbp0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = wbp0.L;
                p7m0 p7m0Var = wbp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, mbp0.a((mbp0) value, z, null, null, null, null, null, null, null, 32766)));
                if (z) {
                    if (((mbp0) wbp0Var.D()).h instanceof dbp0) {
                        e3c.n(wbp0Var.I);
                        wbp0Var.I = i3t0.K(wbp0Var, null, null, new vbp0(wbp0Var, null), 3);
                    } else {
                        e3c.n(wbp0Var.J);
                        wbp0Var.J = i3t0.K(wbp0Var, null, null, new hhb0(wbp0Var, null, (byte) 22), 3);
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                reu reuVar = wbp0Var.r;
                TeamDetailsParams teamDetailsParams = wbp0Var.p;
                long j = teamDetailsParams.f46569a;
                String str = teamDetailsParams.c;
                this.j = true;
                Object objD = ((epi0) reuVar.b).d(j, this, str);
                return objD == wneVar2 ? wneVar2 : objD;
        }
    }
}
