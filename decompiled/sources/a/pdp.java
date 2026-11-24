package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pdp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26817a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ qdp c;
    public final /* synthetic */ int d;

    public /* synthetic */ pdp(mm40 mm40Var, qdp qdpVar, int i, byte b) {
        this.f26817a = b;
        this.b = mm40Var;
        this.c = qdpVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26817a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ckb.t(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                ckb.p(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
