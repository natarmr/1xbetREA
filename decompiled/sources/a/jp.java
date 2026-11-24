package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16875a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ jp(rop ropVar, mm40 mm40Var, String str, aj00 aj00Var, long j, j700 j700Var, int i) {
        this.e = ropVar;
        this.b = mm40Var;
        this.f = str;
        this.g = aj00Var;
        this.c = j;
        this.h = j700Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16875a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                cwr0.a(this.b, this.d, (lh80) obj6, this.c, (IntRange) obj5, (ycl) obj3, (ugd) obj4, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                vzb.a(this.b, (a4x) obj6, this.c, (String) obj5, (String) obj3, (Function1) obj4, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                n4c.a(this.b, this.c, (o0x) obj6, (pm80) obj5, (Boolean) obj3, (Boolean) obj4, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                vdb.b(this.b, (o0x) obj6, this.d, this.c, (y3d) obj5, (y3d) obj3, (y3d) obj4, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                nek nekVar = rop.a2;
                int iL5 = x8x.L(i | 1);
                ((rop) obj6).I0(this.b, (String) obj5, (aj00) obj3, this.c, (j700) obj4, (fet) obj, iL5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                q8x.b(this.b, (s0) obj6, this.c, (Function0) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, iL6);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jp(mm40 mm40Var, int i, lh80 lh80Var, long j, IntRange intRange, ycl yclVar, ugd ugdVar, int i2) {
        this.b = mm40Var;
        this.d = i;
        this.e = lh80Var;
        this.c = j;
        this.f = intRange;
        this.g = yclVar;
        this.h = ugdVar;
    }

    public /* synthetic */ jp(mm40 mm40Var, long j, o0x o0xVar, pm80 pm80Var, Boolean bool, Boolean bool2, int i) {
        this.b = mm40Var;
        this.c = j;
        this.e = o0xVar;
        this.f = pm80Var;
        this.g = bool;
        this.h = bool2;
        this.d = i;
    }

    public /* synthetic */ jp(mm40 mm40Var, s0 s0Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, int i) {
        this.b = mm40Var;
        this.e = s0Var;
        this.c = j;
        this.f = function0;
        this.h = ugdVar;
        this.g = ugdVar2;
        this.d = i;
    }

    public /* synthetic */ jp(mm40 mm40Var, o0x o0xVar, int i, long j, y3d y3dVar, y3d y3dVar2, y3d y3dVar3, int i2) {
        this.b = mm40Var;
        this.e = o0xVar;
        this.d = i;
        this.c = j;
        this.f = y3dVar;
        this.g = y3dVar2;
        this.h = y3dVar3;
    }

    public /* synthetic */ jp(mm40 mm40Var, a4x a4xVar, long j, String str, String str2, Function1 function1, int i) {
        this.b = mm40Var;
        this.e = a4xVar;
        this.c = j;
        this.f = str;
        this.g = str2;
        this.h = function1;
        this.d = i;
    }
}
