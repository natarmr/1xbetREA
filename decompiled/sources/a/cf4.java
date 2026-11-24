package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cf4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4240a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ int d;

    public /* synthetic */ cf4(l7m0 l7m0Var, mm40 mm40Var, int i) {
        this.f4240a = (byte) 1;
        this.b = l7m0Var;
        this.c = mm40Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4240a;
        int i = this.d;
        l7m0 l7m0Var = this.b;
        mm40 mm40Var = this.c;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                lv00.l(x8x.L(i | 1), fetVar, mm40Var, l7m0Var);
                break;
            case 1:
                j120.H(x8x.L(i | 1), fetVar, mm40Var, l7m0Var);
                break;
            case 2:
                j5n0.r(x8x.L(i | 1), fetVar, mm40Var, l7m0Var);
                break;
            case 3:
                idm0.g(x8x.L(i | 1), fetVar, mm40Var, l7m0Var);
                break;
            default:
                qem0.i(x8x.L(i | 1), fetVar, mm40Var, l7m0Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cf4(mm40 mm40Var, l7m0 l7m0Var, int i, byte b) {
        this.f4240a = b;
        this.c = mm40Var;
        this.b = l7m0Var;
        this.d = i;
    }
}
