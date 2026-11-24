package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ztc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44951a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ztc0(String str, String str2, boolean z, mm40 mm40Var, xdr xdrVar, int i) {
        this.f44951a = (byte) 9;
        this.f = str;
        this.g = str2;
        this.c = z;
        this.b = mm40Var;
        this.d = xdrVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44951a;
        int i = this.e;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                nnw0.t(this.b, (cuc0) obj5, (guc0) obj4, (Function1) obj3, (fet) obj, iL, this.c ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                n2x.p(this.b, (a4x) obj5, (hh80) obj4, this.c, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                g7x.i(this.b, this.c, this.e, (wyc0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                d7x.j(this.b, this.c, this.e, (vyc0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                zvw.q(this.b, (String) obj5, (tnd0) obj4, this.c, (Function0) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                bsr0.l(this.b, this.c, (a4x) obj5, (kec) obj4, (Function1) obj3, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                l7x.C(this.b, (ovi0) obj5, this.c, (gy40) obj4, (Function0) obj3, (fet) obj, iL7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                d9x.B(this.b, (d4n) obj5, this.c, (Function1) obj3, (Function1) obj4, (fet) obj, iL8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iL9 = x8x.L(i | 1);
                f1t0.y(this.b, (a4x) obj5, this.c, (mtl) obj4, (Function1) obj3, (fet) obj, iL9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iL10 = x8x.L(i | 1);
                ycm0.f((String) obj5, (String) obj4, this.c, this.b, (xdr) obj3, (fet) obj, iL10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iL11 = x8x.L(1 | i);
                etm0.c(this.b, (lrq0) obj5, (y9q0) obj4, (y9q0) obj3, (fet) obj, iL11, this.c ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL12 = x8x.L(i | 1);
                m0x0.E(this.b, (l7m0) obj5, this.c, (xcz) obj4, (Function1) obj3, (fet) obj, iL12);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ztc0(mm40 mm40Var, Object obj, Object obj2, Object obj3, int i, int i2, byte b) {
        this.f44951a = b;
        this.b = mm40Var;
        this.f = obj;
        this.g = obj2;
        this.d = obj3;
        this.e = i;
        this.c = i2;
    }

    public /* synthetic */ ztc0(mm40 mm40Var, Object obj, Object obj2, boolean z, wdr wdrVar, int i, byte b) {
        this.f44951a = b;
        this.b = mm40Var;
        this.f = obj;
        this.g = obj2;
        this.c = z;
        this.d = wdrVar;
        this.e = i;
    }

    public /* synthetic */ ztc0(mm40 mm40Var, Object obj, boolean z, Object obj2, wdr wdrVar, int i, byte b) {
        this.f44951a = b;
        this.b = mm40Var;
        this.f = obj;
        this.c = z;
        this.g = obj2;
        this.d = wdrVar;
        this.e = i;
    }

    public /* synthetic */ ztc0(mm40 mm40Var, boolean z, int i, Enum r4, Function0 function0, xdr xdrVar, int i2, byte b) {
        this.f44951a = b;
        this.b = mm40Var;
        this.c = z;
        this.e = i;
        this.f = r4;
        this.g = function0;
        this.d = xdrVar;
    }

    public /* synthetic */ ztc0(mm40 mm40Var, boolean z, a4x a4xVar, kec kecVar, Function1 function1, int i) {
        this.f44951a = (byte) 5;
        this.b = mm40Var;
        this.c = z;
        this.f = a4xVar;
        this.g = kecVar;
        this.d = function1;
        this.e = i;
    }

    public /* synthetic */ ztc0(mm40 mm40Var, d4n d4nVar, boolean z, Function1 function1, Function1 function2, int i) {
        this.f44951a = (byte) 7;
        this.b = mm40Var;
        this.f = d4nVar;
        this.c = z;
        this.d = function1;
        this.g = function2;
        this.e = i;
    }
}
