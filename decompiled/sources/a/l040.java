package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l040 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19180a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l040(int i, a4x a4xVar, bdz bdzVar, Function1 function1, boolean z) {
        this.f19180a = (byte) 4;
        this.b = bdzVar;
        this.e = a4xVar;
        this.d = z;
        this.f = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19180a;
        int i = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zvw.i((mm40) obj5, (my30) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.d ? 1 : 0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                zvw.c((mm40) obj5, (pqv) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1), this.d ? 1 : 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                m8x.q((mm40) obj5, (q180) obj4, this.d, (k6z) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                boolean z = this.d;
                cww.e((gf50) obj5, z, (Function0) obj4, (Function0) obj3, (fet) obj, iL);
                break;
            case 4:
                ((Integer) obj2).getClass();
                epv0.q((bdz) obj5, (a4x) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                d9x.n((mm40) obj5, (uw80) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ucx.M((mm40) obj5, (String) obj4, (w6n) obj3, (fet) obj, x8x.L(i | 1), this.d ? 1 : 0);
                break;
            case 7:
                ((Integer) obj2).getClass();
                cww.i((mm40) obj5, (ifa0) obj4, (x0a0) obj3, this.d, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                b5x.n((mm40) obj5, (hvb0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.d ? 1 : 0);
                break;
            case 9:
                ((Integer) obj2).getClass();
                epv0.A((String) obj5, (String) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                c3x.j((mm40) obj5, (hh80) obj4, this.d, (guc0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                l7x.i((mm40) obj5, (ivi0) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                l8x.a((mm40) obj5, (zb) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                nsm0.d((mm40) obj5, (uvo0) obj4, this.d, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                qem0.b((mm40) obj5, (a2n) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ewm0.c(iL2, (fet) obj, (mm40) obj5, (String) obj4, (Function0) obj3, this.d);
                break;
            case 16:
                ((Integer) obj2).getClass();
                i4w0.K((mm40) obj5, (nts0) obj4, this.d, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                s7n0.f((mm40) obj5, (s180) obj4, this.d, (k6z) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                egm0.d((mm40) obj5, (t180) obj4, this.d, (k6z) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xcm0.f((mm40) obj5, (g7t0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1), this.d ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l040(byte b, int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f19180a = b;
        this.b = obj;
        this.e = obj2;
        this.d = z;
        this.f = obj3;
        this.c = i;
    }

    public /* synthetic */ l040(mm40 mm40Var, ifa0 ifa0Var, x0a0 x0a0Var, boolean z, int i) {
        this.f19180a = (byte) 7;
        this.b = mm40Var;
        this.e = ifa0Var;
        this.f = x0a0Var;
        this.d = z;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l040(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f19180a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ l040(Object obj, boolean z, Object obj2, Function0 function0, int i, byte b) {
        this.f19180a = b;
        this.b = obj;
        this.d = z;
        this.e = obj2;
        this.f = function0;
        this.c = i;
    }
}
