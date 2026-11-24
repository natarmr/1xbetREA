package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p460 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26337a;
    public final /* synthetic */ s460 b;

    public /* synthetic */ p460(s460 s460Var, byte b) {
        this.f26337a = b;
        this.b = s460Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26337a;
        s460 s460Var = this.b;
        switch (b) {
            case 0:
                x5a x5aVar = s460Var.q1;
                x5aVar.getClass();
                s460Var.a1(x5aVar, s460Var.p1);
                break;
            default:
                s460 s460Var2 = s460Var.w;
                if (s460Var2 != null) {
                    s460Var2.o1();
                }
                break;
        }
        return Unit.f46060a;
    }
}
