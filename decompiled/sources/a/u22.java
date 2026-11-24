package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u22 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34926a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ u22(Function1 function1, a4x a4xVar, mm40 mm40Var, int i) {
        this.f34926a = (byte) 14;
        this.d = function1;
        this.c = a4xVar;
        this.b = mm40Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34926a;
        int i = this.e;
        Function1 function1 = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                jiq0.a(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                hew0.m(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                lgb.d(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                bkb.x(this.b, this.e, this.c, this.d, (fet) obj, iL);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                bkb.x(this.b, this.e, this.c, this.d, (fet) obj, iL2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                xbc.f(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 6:
                ((Integer) obj2).getClass();
                jd8.G(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 7:
                ((Integer) obj2).getClass();
                p8a.v(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 8:
                ((Integer) obj2).getClass();
                jar0.u(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 9:
                ((Integer) obj2).getClass();
                d5c.A(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 10:
                ((Integer) obj2).getClass();
                o050.w(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 11:
                ((Integer) obj2).getClass();
                o050.C(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ntr.A(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 13:
                ((Integer) obj2).getClass();
                x4d0.S(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 14:
                ((Integer) obj2).getClass();
                dwi0.z(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 15:
                ((Integer) obj2).getClass();
                hp4.z(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            case 16:
                ((Integer) obj2).getClass();
                lv00.F(x8x.L(i | 1), (fet) obj, a4xVar, mm40Var, function1);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                gq80.z(this.b, this.e, this.c, this.d, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u22(mm40 mm40Var, a4x a4xVar, Function1 function1, int i, byte b) {
        this.f34926a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = function1;
        this.e = i;
    }

    public /* synthetic */ u22(mm40 mm40Var, int i, a4x a4xVar, Function1 function1, int i2, byte b) {
        this.f34926a = b;
        this.b = mm40Var;
        this.e = i;
        this.c = a4xVar;
        this.d = function1;
    }
}
