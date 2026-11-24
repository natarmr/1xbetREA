package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mw7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22490a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ mw7(int i, pu90 pu90Var, int i2) {
        this.f22490a = (byte) 2;
        this.c = i;
        this.b = pu90Var;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22490a;
        int i = this.d;
        int i2 = this.c;
        pu90 pu90Var = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.m(pu90Var, i2, i, 0.0f);
                break;
            case 1:
                ou90Var.g(pu90Var, i2, i, 0.0f);
                break;
            case 2:
                ou90Var.g(pu90Var, si30.b((i2 - pu90Var.f27604a) / 2.0f), si30.b((i - pu90Var.b) / 2.0f), 0.0f);
                break;
            default:
                ou90Var.g(pu90Var, i2, i, 0.0f);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mw7(pu90 pu90Var, int i, int i2, byte b) {
        this.f22490a = b;
        this.b = pu90Var;
        this.c = i;
        this.d = i2;
    }
}
