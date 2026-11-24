package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kch0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18060a;
    public final /* synthetic */ mch0 b;
    public final /* synthetic */ qdz c;

    public /* synthetic */ kch0(mch0 mch0Var, qdz qdzVar, int i, byte b) {
        this.f18060a = b;
        this.b = mch0Var;
        this.c = qdzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18060a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                azw.s(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                pzw.p(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                pzw.p(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
