package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class z0z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43593a;
    public final /* synthetic */ agk0 b;
    public final /* synthetic */ cgk0 c;

    public /* synthetic */ z0z(agk0 agk0Var, cgk0 cgk0Var, byte b) {
        this.f43593a = b;
        this.b = agk0Var;
        this.c = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43593a;
        cgk0 cgk0Var = this.c;
        agk0 agk0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(agk0Var.l() < ((float) cgk0Var.l()));
            default:
                return Boolean.valueOf(agk0Var.l() < ((float) cgk0Var.l()));
        }
    }
}
