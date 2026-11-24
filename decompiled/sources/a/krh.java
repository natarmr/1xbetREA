package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class krh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18764a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ krh(mm40 mm40Var, a4x a4xVar, hxh0 hxh0Var, dxh0 dxh0Var, ycl yclVar, long j, Function0 function0, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.f = a4xVar;
        this.g = hxh0Var;
        this.h = dxh0Var;
        this.i = yclVar;
        this.c = j;
        this.j = function0;
        this.k = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18764a;
        int i = this.d;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                lgb.w(this.b, (mm40) obj8, (o0x) obj7, (m0x) obj6, this.c, (u12) obj5, (a4d) obj4, (qge) obj3, (fet) obj, iL, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ntb.n(this.b, (a4x) obj8, (hxh0) obj7, (dxh0) obj6, (ycl) obj5, this.c, (Function0) obj4, (Function1) obj3, (fet) obj, iL2, this.e);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ krh(mm40 mm40Var, mm40 mm40Var2, o0x o0xVar, m0x m0xVar, long j, u12 u12Var, a4d a4dVar, qge qgeVar, int i, int i2) {
        this.b = mm40Var;
        this.f = mm40Var2;
        this.g = o0xVar;
        this.h = m0xVar;
        this.c = j;
        this.i = u12Var;
        this.j = a4dVar;
        this.k = qgeVar;
        this.d = i;
        this.e = i2;
    }
}
