package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zhq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44406a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ agk0 c;

    public /* synthetic */ zhq(Function0 function0, agk0 agk0Var, byte b) {
        this.f44406a = b;
        this.b = function0;
        this.c = agk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44406a;
        agk0 agk0Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                agk0Var.m(agk0Var.l() + 360.0f);
                function0.invoke();
                break;
            case 1:
                agk0Var.m(agk0Var.l() + 360.0f);
                function0.invoke();
                break;
            case 2:
                agk0Var.m(agk0Var.l() + 360.0f);
                function0.invoke();
                break;
            case 3:
                agk0Var.m(agk0Var.l() + 360.0f);
                function0.invoke();
                break;
            default:
                agk0Var.m(agk0Var.l() + 360.0f);
                function0.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
