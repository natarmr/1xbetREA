package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class kwe0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18998a;
    public final /* synthetic */ cqq b;
    public final /* synthetic */ wpq c;
    public final /* synthetic */ pkk0 d;

    public /* synthetic */ kwe0(cqq cqqVar, wpq wpqVar, pkk0 pkk0Var, byte b) {
        this.f18998a = b;
        this.b = cqqVar;
        this.c = wpqVar;
        this.d = pkk0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f18998a;
        pkk0 pkk0Var = this.d;
        wpq wpqVar = this.c;
        cqq cqqVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                cqq.a(cqqVar);
                ((ypq) wpqVar).b(true);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                cqq.a(cqqVar);
                ((ypq) wpqVar).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
            default:
                ((Boolean) obj).getClass();
                cqq.a(cqqVar);
                ((ypq) wpqVar).b(true);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                break;
        }
        return Unit.f46060a;
    }
}
