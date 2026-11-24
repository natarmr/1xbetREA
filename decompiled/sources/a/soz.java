package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class soz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32565a;
    public final /* synthetic */ hh80 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ soz(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, int i, byte b) {
        this.f32565a = b;
        this.b = hh80Var;
        this.c = l7m0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32565a;
        int i = this.e;
        Function1 function1 = this.d;
        l7m0 l7m0Var = this.c;
        hh80 hh80Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gq80.B(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                wha0.v(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                nia0.K(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                xia0.E(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                xia0.K(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                kc5.h0(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                saj.n(hh80Var, l7m0Var, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
