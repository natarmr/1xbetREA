package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wb5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38860a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ wb5(mm40 mm40Var, int i, Function0 function0, int i2, byte b) {
        this.f38860a = b;
        this.b = mm40Var;
        this.d = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f38860a) {
            case 0:
                num.intValue();
                j120.g(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 1:
                num.getClass();
                i120.q(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 2:
                num.getClass();
                fbc.m(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            case 3:
                num.getClass();
                mbc.j(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            case 4:
                num.getClass();
                obc.k(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            case 5:
                num.getClass();
                qbc.g(this.d, x8x.L(7), fetVar, this.b, this.c);
                break;
            case 6:
                num.getClass();
                hxm0.g(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            case 7:
                num.getClass();
                ewm0.b(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 8:
                num.getClass();
                ewm0.a(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            case 9:
                num.getClass();
                pvm0.b(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
            default:
                num.getClass();
                pvm0.a(x8x.L(this.d | 1), fetVar, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wb5(mm40 mm40Var, Function0 function0, int i, byte b) {
        this.f38860a = b;
        this.b = mm40Var;
        this.c = function0;
        this.d = i;
    }

    public /* synthetic */ wb5(Function0 function0, mm40 mm40Var, int i, byte b) {
        this.f38860a = b;
        this.c = function0;
        this.b = mm40Var;
        this.d = i;
    }
}
