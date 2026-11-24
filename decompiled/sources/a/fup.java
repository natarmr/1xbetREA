package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fup implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10175a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a4x d;

    public /* synthetic */ fup(mm40 mm40Var, a4x a4xVar, boolean z, int i) {
        this.b = mm40Var;
        this.d = a4xVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10175a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wvb.G(x8x.L(1), fetVar, this.d, this.b, this.c);
                break;
            default:
                jar0.N(x8x.L(1), fetVar, this.d, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fup(mm40 mm40Var, boolean z, a4x a4xVar, int i) {
        this.b = mm40Var;
        this.c = z;
        this.d = a4xVar;
    }
}
