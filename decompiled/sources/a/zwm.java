package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45112a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ azp d;

    public /* synthetic */ zwm(mm40 mm40Var, a4x a4xVar, azp azpVar, int i, byte b) {
        this.f45112a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = azpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45112a;
        azp azpVar = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fbc.B(mm40Var, a4xVar, azpVar, fetVar, x8x.L(1));
                break;
            case 1:
                kbc.s(mm40Var, a4xVar, azpVar, fetVar, x8x.L(1));
                break;
            case 2:
                mbc.v(mm40Var, a4xVar, azpVar, fetVar, x8x.L(1));
                break;
            case 3:
                obc.v(mm40Var, a4xVar, azpVar, fetVar, x8x.L(7));
                break;
            default:
                qbc.r(mm40Var, a4xVar, azpVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
