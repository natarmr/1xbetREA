package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z23 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43652a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z23(xdr xdrVar, xdr xdrVar2, xdr xdrVar3, int i, int i2) {
        this.f43652a = (byte) 2;
        this.f = xdrVar;
        this.c = xdrVar2;
        this.b = xdrVar3;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43652a;
        int i = this.d;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y860.f((xdr) obj4, (mm40) obj5, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dwi0.b((Function1) obj3, (mm40) obj5, (Function1) obj4, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vbw0.h((xdr) obj4, (xdr) obj5, (xdr) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                x4d0.s((mm40) obj5, (vcd) obj4, (u12) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                v3c.z((Function0) obj4, (Function0) obj5, (clz) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 5:
                ((Integer) obj2).getClass();
                rcb.r((mm40) obj5, (se) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 6:
                ((Integer) obj2).getClass();
                v3c.n((mm40) obj5, (wxl) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 7:
                ((Integer) obj2).getClass();
                vdb.w((mm40) obj5, (t2m) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 8:
                ((Integer) obj2).getClass();
                qzb.p((mm40) obj5, (String) obj4, (y3d) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 9:
                ((Integer) obj2).getClass();
                tlb.o((mm40) obj5, (h5n) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1), this.e);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                byte b2 = this.e;
                oja0.N((mm40) obj5, b2, (ebm0) obj4, (jbm0) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                byte b3 = this.e;
                oja0.R((mm40) obj5, b3, (dbm0) obj4, (jbm0) obj3, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z23(wdr wdrVar, Object obj, Object obj2, int i, int i2, byte b) {
        this.f43652a = b;
        this.f = wdrVar;
        this.c = obj;
        this.b = obj2;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z23(mm40 mm40Var, int i, ebm0 ebm0Var, jbm0 jbm0Var, int i2, byte b) {
        this.f43652a = b;
        this.c = mm40Var;
        this.e = i;
        this.f = ebm0Var;
        this.b = jbm0Var;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z23(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f43652a = b;
        this.c = mm40Var;
        this.f = obj;
        this.b = obj2;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z23(Function1 function1, mm40 mm40Var, Function1 function2, int i, int i2) {
        this.f43652a = (byte) 1;
        this.b = function1;
        this.c = mm40Var;
        this.f = function2;
        this.d = i;
        this.e = i2;
    }
}
