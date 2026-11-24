package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q3l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28058a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ ngk0 g;
    public final /* synthetic */ pz40 h;

    public /* synthetic */ q3l0(a4x a4xVar, xdr xdrVar, Function1 function1, Function0 function0, Function0 function2, ngk0 ngk0Var, pz40 pz40Var, byte b) {
        this.f28058a = b;
        this.b = a4xVar;
        this.c = xdrVar;
        this.d = function1;
        this.e = function0;
        this.f = function2;
        this.g = ngk0Var;
        this.h = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28058a) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                jak0 jak0Var = new jak0((byte) 18);
                a4x a4xVar = this.b;
                hczVar.f(a4xVar.size(), new o3l0(jak0Var, a4xVar, (byte) 1), new y9k0(a4xVar, (byte) 4), new ugd(2039820996, true, new z3l0(a4xVar, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 0)));
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                jak0 jak0Var2 = new jak0((byte) 19);
                a4x a4xVar2 = this.b;
                hczVar2.f(a4xVar2.size(), new o3l0(jak0Var2, a4xVar2, (byte) 2), new y9k0(a4xVar2, (byte) 5), new ugd(2039820996, true, new z3l0(a4xVar2, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 1)));
                break;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                jak0 jak0Var3 = new jak0((byte) 20);
                a4x a4xVar3 = this.b;
                hczVar3.f(a4xVar3.size(), new o3l0(jak0Var3, a4xVar3, (byte) 3), new y9k0(a4xVar3, (byte) 6), new ugd(2039820996, true, new z3l0(a4xVar3, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 2)));
                break;
            default:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                jak0 jak0Var4 = new jak0((byte) 21);
                a4x a4xVar4 = this.b;
                hczVar4.f(a4xVar4.size(), new o3l0(jak0Var4, a4xVar4, (byte) 4), new y9k0(a4xVar4, (byte) 7), new ugd(2039820996, true, new z3l0(a4xVar4, this.c, this.d, this.e, this.f, this.g, this.h, (byte) 3)));
                break;
        }
        return Unit.f46060a;
    }
}
