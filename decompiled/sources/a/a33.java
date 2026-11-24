package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a33 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f153a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a33(xdr xdrVar, mm40 mm40Var, Function1 function1, Function1 function2, Function1 function3, int i, int i2) {
        this.f153a = (byte) 0;
        this.h = xdrVar;
        this.c = mm40Var;
        this.b = function1;
        this.d = function2;
        this.e = function3;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f153a;
        int i = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1 | i);
                y860.g((xdr) obj3, this.c, (Function1) obj6, (Function1) obj5, (Function1) obj4, (fet) obj, iL, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1 | i);
                dwi0.c((Function1) obj6, this.c, (Function1) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, iL2, this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1 | i);
                p8a.e(this.c, this.h, (gfm0) obj6, (gfm0) obj5, (qge) obj4, (fet) obj, iL3, this.g);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1 | i);
                saj.e(this.c, (pm80) obj3, (qge) obj6, (hh80) obj5, (Function0) obj4, (fet) obj, iL4, this.g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1 | i);
                oja0.k(this.c, (String) obj3, (Integer) obj6, (qge) obj5, (u12) obj4, (fet) obj, iL5, this.g);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1 | i);
                jiq0.y(this.c, (gy30) obj3, (Function0) obj6, (Function0) obj5, (Function0) obj4, (fet) obj, iL6, this.g);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1 | i);
                lmc.k(this.c, (l5i) obj3, (a4x) obj6, (jjm) obj5, (Function0) obj4, (fet) obj, iL7, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(1);
                g8x.f(this.c, (String) obj3, this.f, (y3d) obj6, (y3d) obj5, (qge) obj4, (fet) obj, iL8, this.g);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a33(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, byte b) {
        this.f153a = b;
        this.c = mm40Var;
        this.h = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a33(mm40 mm40Var, String str, int i, y3d y3dVar, y3d y3dVar2, qge qgeVar, int i2, int i3) {
        this.f153a = (byte) 7;
        this.c = mm40Var;
        this.h = str;
        this.f = i;
        this.b = y3dVar;
        this.d = y3dVar2;
        this.e = qgeVar;
        this.g = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a33(Function1 function1, mm40 mm40Var, Function1 function2, Function1 function3, Function1 function4, int i, int i2) {
        this.f153a = (byte) 1;
        this.b = function1;
        this.c = mm40Var;
        this.d = function2;
        this.e = function3;
        this.h = function4;
        this.f = i;
        this.g = i2;
    }
}
