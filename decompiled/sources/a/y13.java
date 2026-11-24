package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y13 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41836a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y13(mm40 mm40Var, Function0 function0, boolean z, int i) {
        this.f41836a = (byte) 0;
        this.b = mm40Var;
        this.e = function0;
        this.d = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41836a;
        byte b2 = this.c;
        boolean z = this.d;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(b2 | 1);
                eeq.F(iL, (fet) obj, (mm40) obj4, (Function0) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ju70.h((mm40) obj4, (ugd) obj3, (fet) obj, x8x.L(b2 | 1), z ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                n6m.b((mm40) obj4, (o6m) obj3, (fet) obj, x8x.L(b2 | 1), z ? 1 : 0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ro4.z((mm40) obj4, z, (cbm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                nkb.n(this.d, (Function0) obj3, (Function0) obj4, (fet) obj, iL2, this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                d9x.A((mm40) obj4, z, (ttm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                e9x.D((mm40) obj4, z, (utm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                k9x.v((mm40) obj4, z, (vtm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                t9x.x((mm40) obj4, z, (wtm) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                iom0.b((mm40) obj4, z, (nar0) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y13(mm40 mm40Var, Object obj, int i, int i2, byte b) {
        this.f41836a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y13(byte b, int i, mm40 mm40Var, Object obj, boolean z) {
        this.f41836a = b;
        this.b = mm40Var;
        this.d = z;
        this.e = obj;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y13(boolean z, Function0 function0, Function0 function1, int i, int i2) {
        this.f41836a = (byte) 4;
        this.d = z;
        this.e = function0;
        this.b = function1;
        this.c = i2;
    }
}
