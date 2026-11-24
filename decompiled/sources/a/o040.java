package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o040 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24404a;
    public final /* synthetic */ wdr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o040(mm40 mm40Var, s0 s0Var, long j, Function0 function0, ugd ugdVar, int i) {
        this.f24404a = (byte) 4;
        this.e = mm40Var;
        this.f = s0Var;
        this.c = j;
        this.b = function0;
        this.g = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24404a;
        int i = this.d;
        Object obj3 = this.g;
        wdr wdrVar = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                p8a.A((mm40) obj5, (o0x) obj4, this.d, (y3d) obj3, this.c, (Function0) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                uvw.e((Function0) wdrVar, this.c, (em40) obj5, (t33) obj4, (ugd) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                l8x.B((ir8) obj5, (dil0) obj4, this.c, (ugd) obj3, (ugd) wdrVar, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                l8x.A((ir8) obj5, (cil0) obj4, this.c, (ugd) obj3, (ugd) wdrVar, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                q8x.k((mm40) obj5, (s0) obj4, this.c, (Function0) wdrVar, (ugd) obj3, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o040(ir8 ir8Var, eil0 eil0Var, long j, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f24404a = b;
        this.e = ir8Var;
        this.f = eil0Var;
        this.c = j;
        this.g = ugdVar;
        this.b = ugdVar2;
        this.d = i;
    }

    public /* synthetic */ o040(mm40 mm40Var, o0x o0xVar, int i, y3d y3dVar, long j, Function0 function0, int i2) {
        this.f24404a = (byte) 0;
        this.e = mm40Var;
        this.f = o0xVar;
        this.d = i;
        this.g = y3dVar;
        this.c = j;
        this.b = function0;
    }

    public /* synthetic */ o040(Function0 function0, long j, em40 em40Var, t33 t33Var, ugd ugdVar, int i) {
        this.f24404a = (byte) 1;
        this.b = function0;
        this.c = j;
        this.e = em40Var;
        this.f = t33Var;
        this.g = ugdVar;
        this.d = i;
    }
}
