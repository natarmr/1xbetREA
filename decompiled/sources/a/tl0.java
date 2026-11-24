package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34122a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ wdr c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tl0(int i, Function2 function2, ugd ugdVar, Function2 function3, Function2 function4, vhv0 vhv0Var, Function2 function5, int i2) {
        this.e = i;
        this.b = function2;
        this.f = ugdVar;
        this.g = function3;
        this.h = function4;
        this.d = vhv0Var;
        this.c = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34122a;
        wdr wdrVar = this.c;
        Object obj3 = this.d;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y9a.c((mm40) obj7, (on0) obj6, (d9z) obj5, (xcz) obj4, (Function1) obj3, (Function0) wdrVar, (fet) obj, x8x.L(7), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bkb.e((mm40) obj7, (mp0) obj6, (pp0) obj5, (lh80) obj4, (Function0) wdrVar, (Function1) obj3, (fet) obj, x8x.L(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                uzb.y((mm40) obj7, (htr) obj6, (hh80) obj4, (d9z) obj5, (Function2) wdrVar, (Function1) obj3, (fet) obj, x8x.L(1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                uzb.x((mm40) obj7, (htr) obj6, (lh80) obj5, (xcz) obj4, (Function2) wdrVar, (Function1) obj3, (fet) obj, x8x.L(1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                m8x.z(this.e, (Function2) obj7, (ugd) obj6, (Function2) obj5, (Function2) obj4, (vhv0) obj3, (Function2) wdrVar, (fet) obj, iL);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tl0(mm40 mm40Var, on0 on0Var, d9z d9zVar, xcz xczVar, Function1 function1, Function0 function0, int i, int i2) {
        this.b = mm40Var;
        this.f = on0Var;
        this.g = d9zVar;
        this.h = xczVar;
        this.d = function1;
        this.c = function0;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tl0(mm40 mm40Var, mp0 mp0Var, pp0 pp0Var, lh80 lh80Var, Function0 function0, Function1 function1, int i) {
        this.b = mm40Var;
        this.f = mp0Var;
        this.g = pp0Var;
        this.h = lh80Var;
        this.c = function0;
        this.d = function1;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tl0(mm40 mm40Var, htr htrVar, hh80 hh80Var, d9z d9zVar, Function2 function2, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.f = htrVar;
        this.h = hh80Var;
        this.g = d9zVar;
        this.c = function2;
        this.d = function1;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tl0(mm40 mm40Var, htr htrVar, lh80 lh80Var, xcz xczVar, Function2 function2, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.f = htrVar;
        this.g = lh80Var;
        this.h = xczVar;
        this.c = function2;
        this.d = function1;
        this.e = i2;
    }
}
