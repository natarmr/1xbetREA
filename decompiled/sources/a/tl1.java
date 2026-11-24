package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tl1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34123a;
    public final /* synthetic */ gr00 b;

    public /* synthetic */ tl1(gr00 gr00Var, byte b) {
        this.f34123a = b;
        this.b = gr00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34123a;
        byte b2 = 1;
        gr00 gr00Var = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new tl1(gr00Var, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(((h7i) ((fvt0) gr00Var.c).f10231a).d().o()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }
}
