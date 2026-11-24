package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e3h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7135a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ j83 c;
    public final /* synthetic */ y9q0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ e3h0(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, int i, byte b) {
        this.f7135a = b;
        this.b = mm40Var;
        this.c = j83Var;
        this.d = y9q0Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7135a;
        int i = this.e;
        y9q0 y9q0Var = this.d;
        j83 j83Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                t9x.u(mm40Var, j83Var, y9q0Var, fetVar, x8x.L(i | 1));
                break;
            case 1:
                w9x.s(mm40Var, j83Var, y9q0Var, fetVar, x8x.L(i | 1));
                break;
            case 2:
                x9x.w(mm40Var, j83Var, y9q0Var, fetVar, x8x.L(i | 1));
                break;
            case 3:
                kcx.r(mm40Var, j83Var, y9q0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                ucx.E(mm40Var, j83Var, y9q0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
