package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class exe0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8573a;
    public final /* synthetic */ cqq b;
    public final /* synthetic */ wpq c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ exe0(cqq cqqVar, wpq wpqVar, pz40 pz40Var, byte b) {
        this.f8573a = b;
        this.b = cqqVar;
        this.c = wpqVar;
        this.d = pz40Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f8573a;
        pz40 pz40Var = this.d;
        wpq wpqVar = this.c;
        cqq cqqVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                cqq.a(cqqVar);
                ((ypq) wpqVar).b(false);
                ((Function1) pz40Var.getValue()).invoke(pve0.f27659a);
                break;
            default:
                ((Boolean) obj).getClass();
                cqq.a(cqqVar);
                ((ypq) wpqVar).b(false);
                ((Function1) pz40Var.getValue()).invoke(c9f0.f3959a);
                break;
        }
        return Unit.f46060a;
    }
}
