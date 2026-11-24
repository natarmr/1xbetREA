package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o2n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24538a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l2n c;
    public final /* synthetic */ int d;

    public /* synthetic */ o2n(mm40 mm40Var, l2n l2nVar, int i, byte b) {
        this.f24538a = b;
        this.b = mm40Var;
        this.c = l2nVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24538a;
        int i = this.d;
        l2n l2nVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obc.C(mm40Var, l2nVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                obc.H(mm40Var, l2nVar, fetVar, x8x.L(i | 1));
                break;
            default:
                obc.E(mm40Var, l2nVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
