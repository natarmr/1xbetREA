package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class qeo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28594a;
    public final /* synthetic */ deo0 b;

    public /* synthetic */ qeo0(deo0 deo0Var, byte b) {
        this.f28594a = b;
        this.b = deo0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28594a;
        deo0 deo0Var = this.b;
        switch (b) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.u(fhlVar, deo0Var.h, 0L, 0L, 0.0f, null, null, 0, 126);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.u(fhlVar2, deo0Var.h, 0L, 0L, 0.0f, null, null, 0, 126);
                break;
        }
        return Unit.f46060a;
    }
}
