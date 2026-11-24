package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32948a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ sx(mm40 mm40Var, int i, Function1 function1, int i2, byte b) {
        this.f32948a = b;
        this.b = mm40Var;
        this.d = i;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f32948a) {
            case 0:
                num.getClass();
                cy2.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                num.intValue();
                p8a.k(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                num.getClass();
                fbc.b(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
            case 3:
                num.getClass();
                nia0.N(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                num.getClass();
                k9x.c(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 5:
                num.getClass();
                p7x.f(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                num.getClass();
                aad.C(this.d, x8x.L(1), fetVar, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sx(mm40 mm40Var, Function1 function1, int i, byte b) {
        this.f32948a = b;
        this.b = mm40Var;
        this.c = function1;
        this.d = i;
    }
}
