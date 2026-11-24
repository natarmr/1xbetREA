package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class seq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32086a;
    public final /* synthetic */ weq0 b;

    public /* synthetic */ seq0(weq0 weq0Var, byte b) {
        this.f32086a = b;
        this.b = weq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32086a;
        yje yjeVar = null;
        weq0 weq0Var = this.b;
        switch (b) {
            case 0:
                s9m0 s9m0Var = weq0.Q1;
                wfq0 wfq0VarJ0 = weq0Var.J0();
                bvc bvcVarA = jiu0.a(wfq0VarJ0);
                mne mneVar = wfq0VarJ0.q;
                rwj rwjVar = mneVar.f22085a;
                sac.V(bvcVarA, sfq0.f32129a, null, rwjVar, new meq0((Object) wfq0VarJ0, (Object) dy5.f6877a, yjeVar, (byte) 1), 10);
                wfq0VarJ0.x();
                if (((kgq0) wfq0VarJ0.k.b).c.f2464a.c != yeq0.f42501a) {
                    sac.V(jiu0.a(wfq0VarJ0), new w6q0(1, wfq0VarJ0, wfq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.f22085a, new tfq0(wfq0VarJ0, yjeVar, (byte) 0), 10);
                }
                return Unit.f46060a;
            case 1:
                s9m0 s9m0Var2 = weq0.Q1;
                i1w0 i1w0VarF = a4n0.f(weq0Var);
                exi exiVar = weq0Var.L1;
                if (exiVar != null) {
                    return new ry3(i1w0VarF, exiVar);
                }
                Intrinsics.h("tileMatchingGameViewModelFactory");
                throw null;
            default:
                s9m0 s9m0Var3 = weq0.Q1;
                return new ueq0(weq0Var);
        }
    }
}
