package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ut2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36236a;
    public final /* synthetic */ agk0 b;
    public final /* synthetic */ rv2 c;

    public /* synthetic */ ut2(agk0 agk0Var, rv2 rv2Var, byte b) {
        this.f36236a = b;
        this.b = agk0Var;
        this.c = rv2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36236a;
        rv2 rv2Var = this.c;
        agk0 agk0Var = this.b;
        ((lwk) obj).getClass();
        switch (b) {
            case 0:
                return new ku2(agk0Var, rv2Var, (byte) 1);
            case 1:
                return new ku2(agk0Var, rv2Var, (byte) 2);
            case 2:
                return new ku2(agk0Var, rv2Var, (byte) 0);
            default:
                return new ku2(agk0Var, rv2Var, (byte) 3);
        }
    }
}
