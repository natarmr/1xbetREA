package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t88 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33502a;
    public final /* synthetic */ v88 b;

    public /* synthetic */ t88(v88 v88Var, byte b) {
        this.f33502a = b;
        this.b = v88Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33502a;
        v88 v88Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                v88Var.b.b(th, new i87((byte) 22));
                break;
            default:
                th.getClass();
                v88Var.b.b(th, new i87((byte) 21));
                break;
        }
        return Unit.f46060a;
    }
}
