package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i3d extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nyq0 j;
    public final /* synthetic */ agk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3d(nyq0 nyq0Var, agk0 agk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nyq0Var;
        this.k = agk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        agk0 agk0Var = this.k;
        nyq0 nyq0Var = this.j;
        switch (b) {
            case 0:
                return new i3d(nyq0Var, agk0Var, yjeVar, (byte) 0);
            default:
                return new i3d(nyq0Var, agk0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((i3d) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        oyq0 state;
        oyq0 state2;
        oyq0 state3;
        oyq0 state4;
        byte b = this.i;
        Float f = null;
        nyq0 nyq0Var = this.j;
        agk0 agk0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (nyq0Var != null && (state2 = nyq0Var.getState()) != null) {
                    f = new Float(state2.f26070a);
                }
                if (!Intrinsics.b(agk0Var.l(), f) && nyq0Var != null && (state = nyq0Var.getState()) != null) {
                    state.f26070a = agk0Var.l();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (nyq0Var != null && (state4 = nyq0Var.getState()) != null) {
                    f = new Float(state4.f26070a);
                }
                if (!Intrinsics.b(agk0Var.l(), f) && nyq0Var != null && (state3 = nyq0Var.getState()) != null) {
                    state3.f26070a = agk0Var.l();
                }
                break;
        }
        return Unit.f46060a;
    }
}
