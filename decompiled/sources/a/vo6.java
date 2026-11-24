package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vo6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37750a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vo6(int i, o8w o8wVar, x77 x77Var, Function1 function1, int i2) {
        this.f37750a = (byte) 9;
        this.b = i;
        this.e = o8wVar;
        this.f = x77Var;
        this.c = function1;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37750a;
        int i = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gq80.R((fop0) obj3, this.b, (Function1) obj5, (ugd) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                unh0.X((a4x) obj3, this.b, (String) obj4, (Function1) obj5, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ju70.b((mm40) obj3, (String) obj5, this.b, (Function0) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ohq0.x((mm40) obj3, (vpl) obj5, this.b, (Function2) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                x9x.g(this.e, this.b, (qbz) obj5, (ugd) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                s5x0.y(this.b, (xx7) obj3, (mm40) obj5, (ugd) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cy2.n((Map) obj3, (List) obj5, this.b, (v9c) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ucx.S((znp0) obj3, (znp0) obj5, this.b, this.d, (mpm) obj4, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                xf0.d((oyq0) obj3, (ki5) obj4, this.b, (Function1) obj5, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                nnw0.e(this.b, (o8w) obj3, (x77) obj4, (Function1) obj5, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ffb0.l((pz40) obj3, (String) obj4, this.b, (Function1) obj5, (fet) obj, x8x.L(i | 1));
                break;
            default:
                vhv0 vhv0Var = (vhv0) obj3;
                c5n0 c5n0Var = (c5n0) obj5;
                ugd ugdVar = (ugd) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bgx bgxVar = new bgx(vhv0Var, c5n0Var);
                    ugdVar.F(new lh80(s5x0.B(bgxVar, c5n0Var.getLayoutDirection()), c5n0Var.r0(i) + c5n0Var.r0(this.b), s5x0.A(bgxVar, c5n0Var.getLayoutDirection()), bgxVar.a()), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vo6(int i, xx7 xx7Var, mm40 mm40Var, ugd ugdVar, int i2) {
        this.f37750a = (byte) 5;
        this.b = i;
        this.e = xx7Var;
        this.c = mm40Var;
        this.f = ugdVar;
        this.d = i2;
    }

    public /* synthetic */ vo6(a4x a4xVar, int i, String str, Function1 function1, int i2) {
        this.f37750a = (byte) 1;
        this.e = a4xVar;
        this.b = i;
        this.f = str;
        this.c = function1;
        this.d = i2;
    }

    public /* synthetic */ vo6(znp0 znp0Var, znp0 znp0Var2, int i, int i2, mpm mpmVar, int i3) {
        this.f37750a = (byte) 7;
        this.e = znp0Var;
        this.c = znp0Var2;
        this.b = i;
        this.d = i2;
        this.f = mpmVar;
    }

    public /* synthetic */ vo6(vhv0 vhv0Var, c5n0 c5n0Var, int i, int i2, ugd ugdVar) {
        this.f37750a = (byte) 11;
        this.e = vhv0Var;
        this.c = c5n0Var;
        this.b = i;
        this.d = i2;
        this.f = ugdVar;
    }

    public /* synthetic */ vo6(Object obj, int i, Object obj2, ugd ugdVar, int i2, byte b) {
        this.f37750a = b;
        this.e = obj;
        this.b = i;
        this.c = obj2;
        this.f = ugdVar;
        this.d = i2;
    }

    public /* synthetic */ vo6(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.f37750a = b;
        this.e = obj;
        this.c = obj2;
        this.b = i;
        this.f = obj3;
        this.d = i2;
    }

    public /* synthetic */ vo6(Object obj, Object obj2, int i, Function1 function1, int i2, byte b) {
        this.f37750a = b;
        this.e = obj;
        this.f = obj2;
        this.b = i;
        this.c = function1;
        this.d = i2;
    }
}
