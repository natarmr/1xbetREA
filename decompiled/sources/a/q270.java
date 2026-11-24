package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q270 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27988a;
    public final /* synthetic */ cyu b;
    public final /* synthetic */ int c;

    public /* synthetic */ q270(cyu cyuVar, int i, byte b) {
        this.f27988a = b;
        this.b = cyuVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27988a;
        cyu cyuVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new q270(cyuVar, this.c, (byte) 1));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(oct.f((oct) cyuVar.f5196a, 0L, null, this.c, null, null, 27));
                break;
        }
        return Unit.f46060a;
    }
}
