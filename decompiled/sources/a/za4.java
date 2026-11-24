package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class za4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44051a = 1;
    public final /* synthetic */ pkk0 b;
    public final /* synthetic */ wpq c;

    public /* synthetic */ za4(wpq wpqVar, pkk0 pkk0Var) {
        this.c = wpqVar;
        this.b = pkk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44051a;
        wpq wpqVar = this.c;
        pkk0 pkk0Var = this.b;
        switch (b) {
            case 0:
                ((ypq) wpqVar).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            default:
                zie0 zie0Var = z3f0.Y1;
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                ((ypq) wpqVar).b(false);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ za4(pkk0 pkk0Var, wpq wpqVar) {
        this.b = pkk0Var;
        this.c = wpqVar;
    }
}
