package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27334a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wdr c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pol(mm40 mm40Var, zrm zrmVar, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, int i, int i2) {
        this.f27334a = (byte) 1;
        this.b = mm40Var;
        this.f = zrmVar;
        this.c = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.j = function4;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27334a;
        int i = this.d;
        wdr wdrVar = this.c;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                fxb.k((Date) obj7, (qol) obj6, this.b, (tol) obj5, (iol) obj4, (sol) obj3, (Function0) wdrVar, (fet) obj, iL, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                agc.r(this.b, (zrm) obj7, (Function0) wdrVar, (Function0) obj6, (Function0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, iL2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                g7x.j(this.b, (azc0) obj7, (wyc0) obj6, (Function1) obj5, (Function0) wdrVar, (Function2) obj4, (Function2) obj3, (fet) obj, iL3, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                d7x.k(this.b, (zyc0) obj7, (vyc0) obj6, (Function1) obj5, (Function0) wdrVar, (Function2) obj4, (Function2) obj3, (fet) obj, iL4, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                unh0.Q(this.b, (e1n0) obj7, (c6q0) obj6, (tvi0) obj5, (wui0) obj4, (hh80) obj3, (Function1) wdrVar, (fet) obj, iL5, this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pol(mm40 mm40Var, e1n0 e1n0Var, c6q0 c6q0Var, tvi0 tvi0Var, wui0 wui0Var, hh80 hh80Var, Function1 function1, int i, int i2) {
        this.f27334a = (byte) 4;
        this.b = mm40Var;
        this.f = e1n0Var;
        this.g = c6q0Var;
        this.h = tvi0Var;
        this.i = wui0Var;
        this.j = hh80Var;
        this.c = function1;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pol(mm40 mm40Var, Object obj, Enum r3, Function1 function1, Function0 function0, Function2 function2, Function2 function3, int i, int i2, byte b) {
        this.f27334a = b;
        this.b = mm40Var;
        this.f = obj;
        this.g = r3;
        this.h = function1;
        this.c = function0;
        this.i = function2;
        this.j = function3;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pol(Date date, qol qolVar, mm40 mm40Var, tol tolVar, iol iolVar, sol solVar, Function0 function0, int i, int i2) {
        this.f27334a = (byte) 0;
        this.f = date;
        this.g = qolVar;
        this.b = mm40Var;
        this.h = tolVar;
        this.i = iolVar;
        this.j = solVar;
        this.c = function0;
        this.d = i;
        this.e = i2;
    }
}
