package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y460 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41987a;
    public final /* synthetic */ yhg0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ y460(yhg0 yhg0Var, String str, int i, byte b) {
        this.f41987a = b;
        this.b = yhg0Var;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41987a;
        int i = this.d;
        String str = this.c;
        yhg0 yhg0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                b8k0.c(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 1:
                b8k0.j(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 2:
                b8k0.n(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 3:
                qsm0.d(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 4:
                rsm0.d(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 5:
                vsm0.d(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 6:
                xsm0.c(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 7:
                qsm0.c(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 8:
                rsm0.c(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 9:
                vsm0.e(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 10:
                xsm0.b(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 11:
                vsm0.b(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 12:
                qsm0.b(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 13:
                rsm0.b(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            case 14:
                vsm0.f(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
            default:
                xsm0.a(yhg0Var, str, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
