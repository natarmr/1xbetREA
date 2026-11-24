package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41175a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    public /* synthetic */ xnl(mm40 mm40Var, int i, hh80 hh80Var, ow3 ow3Var, sw3 sw3Var, ugd ugdVar, int i2) {
        this.f41175a = (byte) 0;
        this.b = mm40Var;
        this.c = i;
        this.e = hh80Var;
        this.f = ow3Var;
        this.g = sw3Var;
        this.h = ugdVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41175a;
        int i = this.d;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                wvb.J((mm40) obj6, this.c, (hh80) obj5, (ow3) obj4, (sw3) obj3, (ugd) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ibc.K((mm40) obj6, (dxh0) obj5, (hxh0) obj4, (a4x) obj3, this.c, (Function1) wdrVar, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                kbc.G((mm40) obj6, (rwh0) obj5, this.c, (lxh0) obj4, (Function0) obj3, (Function0) wdrVar, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                kkb.d((mm40) obj6, (o43) obj5, (k43) obj4, (wz40) obj3, this.c, (Function0) wdrVar, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1572865);
                rsm0.n((ywv0) obj6, (l7m0) obj5, this.c, this.d, (Function2) obj4, (Function2) obj3, (ugd) wdrVar, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xnl(byte b, int i, int i2, wdr wdrVar, mm40 mm40Var, Object obj, Object obj2, Object obj3) {
        this.f41175a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = i;
        this.h = wdrVar;
        this.d = i2;
    }

    public /* synthetic */ xnl(mm40 mm40Var, rwh0 rwh0Var, int i, lxh0 lxh0Var, Function0 function0, Function0 function1, int i2) {
        this.f41175a = (byte) 2;
        this.b = mm40Var;
        this.e = rwh0Var;
        this.c = i;
        this.f = lxh0Var;
        this.g = function0;
        this.h = function1;
        this.d = i2;
    }

    public /* synthetic */ xnl(ywv0 ywv0Var, l7m0 l7m0Var, int i, int i2, Function2 function2, Function2 function3, ugd ugdVar, int i3) {
        this.f41175a = (byte) 4;
        this.b = ywv0Var;
        this.e = l7m0Var;
        this.c = i;
        this.d = i2;
        this.f = function2;
        this.g = function3;
        this.h = ugdVar;
    }
}
