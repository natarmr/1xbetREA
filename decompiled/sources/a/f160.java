package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8751a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f160(a4x a4xVar, mm40 mm40Var, boolean z, boolean z2, Function1 function1) {
        this.d = a4xVar;
        this.e = mm40Var;
        this.b = z;
        this.c = z2;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8751a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj4;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new m160(new mb50((byte) 16), a4xVar, (byte) 1), new ap30(a4xVar, (byte) 25), new ugd(802480018, true, new o160(a4xVar, (mm40) obj3, this.b, this.c, (Function1) obj2)));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(uxs0.c(((kgb0) obj4).U, ((pbv) obj3).f26728a, null, this.b, (String) obj2, 6)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(!this.c, bjkVar, bjkVar);
                return Unit.f46060a;
            default:
                return new xpj0(this.b, (Function0) obj4, (Function0) obj3, (ypj0) obj, (Function1) obj2, this.c);
        }
    }

    public /* synthetic */ f160(kgb0 kgb0Var, pbv pbvVar, boolean z, String str, boolean z2) {
        this.d = kgb0Var;
        this.e = pbvVar;
        this.b = z;
        this.f = str;
        this.c = z2;
    }

    public /* synthetic */ f160(boolean z, Function0 function0, Function0 function1, Function1 function2, boolean z2) {
        this.b = z;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.c = z2;
    }
}
