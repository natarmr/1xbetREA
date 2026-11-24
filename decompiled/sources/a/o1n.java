package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24489a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xem c;
    public final /* synthetic */ int d;

    public /* synthetic */ o1n(mm40 mm40Var, xem xemVar, int i, byte b) {
        this.f24489a = b;
        this.b = mm40Var;
        this.c = xemVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24489a;
        int i = this.d;
        xem xemVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ebc.z(mm40Var, xemVar, fetVar, x8x.L(i | 1));
                break;
            default:
                jar0.n(mm40Var, xemVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
