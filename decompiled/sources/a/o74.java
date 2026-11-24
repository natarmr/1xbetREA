package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o74 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24766a = 1;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ o74(a4x a4xVar, Function0 function0, Function1 function1) {
        this.b = a4xVar;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 17;
        hcz hczVar = (hcz) obj;
        switch (this.f24766a) {
            case 0:
                hczVar.getClass();
                for (f94 f94Var : this.b) {
                    if (f94Var != null) {
                        if (f94Var instanceof c94) {
                            hcz.e(hczVar, null, null, nnw0.f23845a, 3);
                        } else if (f94Var instanceof e94) {
                            hcz.e(hczVar, null, null, new ugd(-747535759, true, new un6(f94Var, (byte) 18)), 3);
                        } else if (f94Var instanceof e84) {
                            hcz.e(hczVar, null, null, new ugd(-201143118, true, new ri1(f94Var, this.c, (byte) 29)), 3);
                        } else if (f94Var instanceof r84) {
                            Function1 function1 = this.d;
                            function1.getClass();
                            a4x a4xVar = ((r84) f94Var).f30007a;
                            ij4 ij4Var = new ij4((byte) 10);
                            ij4 ij4Var2 = new ij4((byte) 11);
                            hczVar.f(a4xVar.size(), new b8(xdx.E(a4xVar, ij4Var), (byte) 25), new ci2(ij4Var2, a4xVar, b), new ugd(-1311333631, true, new c8((List) a4xVar, (Object) a4xVar, function1, (byte) 7)));
                        }
                    }
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            default:
                hczVar.getClass();
                x0h0 x0h0Var = new x0h0((byte) 16);
                a4x a4xVar2 = this.b;
                hczVar.f(a4xVar2.size(), new pwe0(x0h0Var, a4xVar2, (byte) 17), new d1c0(a4xVar2, (byte) 22), new ugd(2039820996, true, new gq4((List) a4xVar2, (Object) a4xVar2, (Object) this.c, this.d, (byte) 9)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o74(a4x a4xVar, Function1 function1, Function0 function0) {
        this.b = a4xVar;
        this.d = function1;
        this.c = function0;
    }
}
