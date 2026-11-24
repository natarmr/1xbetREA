package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yzx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43538a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yzx(mm40 mm40Var, Object obj, int i, int i2, byte b) {
        this.f43538a = b;
        this.d = mm40Var;
        this.e = obj;
        this.c = i;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43538a;
        int i = this.c;
        Object obj3 = this.e;
        boolean z = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                l8x.w((mm40) obj4, (jpr0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ntr.U((csv) obj4, z, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                xww.f((l7m0) obj4, z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                int i2 = z ? 1 : 0;
                vbw0.y(iL, i2, (fet) obj, (mm40) obj4, (Function1) obj3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                q8a.z(z, (Function1) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                k9x.j((mm40) obj4, (j00) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                d9x.p((mm40) obj4, (rw80) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gfx.k((mm40) obj4, (efa0) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                gfx.s((dfa0) obj4, (xx7) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                efx.l((mm40) obj4, (ehm0) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 10:
                ((Integer) obj2).getClass();
                x4n0.a((mm40) obj4, (Function2) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 11:
                ((Integer) obj2).intValue();
                qsm0.f((gxo0) obj4, z, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                cvm0.e(z, (xsf0) obj4, (k7q0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zsm0.f((mm40) obj4, z, (v3n) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yzx(Object obj, Object obj2, boolean z, int i, byte b) {
        this.f43538a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ yzx(Object obj, boolean z, Object obj2, int i, byte b) {
        this.f43538a = b;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ yzx(boolean z, Object obj, Object obj2, int i, byte b) {
        this.f43538a = b;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
