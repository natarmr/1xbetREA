package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ltl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20634a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wdr d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ltl(Function0 function0, mm40 mm40Var, boolean z, wvw wvwVar, yjj0 yjj0Var, ugd ugdVar, int i, int i2) {
        this.f20634a = (byte) 3;
        this.g = function0;
        this.b = mm40Var;
        this.c = z;
        this.h = wvwVar;
        this.i = yjj0Var;
        this.d = ugdVar;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20634a;
        int i = this.e;
        wdr wdrVar = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                bkb.f(this.b, (mtl) obj5, (ma80) obj4, this.c, (hh80) obj3, (Function1) wdrVar, (fet) obj, iL, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ibc.o(this.b, (a4x) obj5, (hxh0) obj4, this.c, (Function0) obj3, (Function1) wdrVar, (fet) obj, iL2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                tdc.m(this.b, (a4x) obj5, (v3n) obj4, this.c, (xcz) obj3, (Function1) wdrVar, (fet) obj, iL3, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                zvw.d((Function0) obj5, this.b, this.c, (wvw) obj4, (yjj0) obj3, (ugd) wdrVar, (fet) obj, iL4, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ltl(mm40 mm40Var, Object obj, Object obj2, boolean z, Object obj3, Function1 function1, int i, int i2, byte b) {
        this.f20634a = b;
        this.b = mm40Var;
        this.g = obj;
        this.h = obj2;
        this.c = z;
        this.i = obj3;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }
}
