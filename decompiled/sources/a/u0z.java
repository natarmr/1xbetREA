package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u0z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34879a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ u0z(byte b, a4x a4xVar, cgk0 cgk0Var, Function1 function1) {
        this.f34879a = b;
        this.b = a4xVar;
        this.c = cgk0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34879a;
        byte b2 = 4;
        Function1 function1 = this.d;
        cgk0 cgk0Var = this.c;
        a4x<e1z> a4xVar = this.b;
        byte b3 = 3;
        byte b4 = 1;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        switch (b) {
            case 0:
                for (e1z e1zVar : a4xVar) {
                    hcz.h(hczVar, new ugd(-922901171, true, new d2s(e1zVar, cgk0Var, b2)), 3);
                    a4x a4xVar2 = e1zVar.b;
                    hczVar.f(a4xVar2.size(), null, new ygy(new djx((byte) 21), a4xVar2, b3), new ugd(802480018, true, new a1z((byte) 0, a4xVar2, cgk0Var, function1)));
                }
                break;
            default:
                Iterator<E> it = a4xVar.iterator();
                while (it.hasNext()) {
                    f1z f1zVar = (f1z) it.next();
                    hcz.h(hczVar, new ugd(-1808685174, true, new d2s(f1zVar, cgk0Var, (byte) 6)), 3);
                    a4x a4xVar3 = f1zVar.b;
                    hczVar.f(a4xVar3.size(), null, new ygy(new djx((byte) 22), a4xVar3, b2), new ugd(802480018, true, new a1z(b4, a4xVar3, cgk0Var, function1)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
