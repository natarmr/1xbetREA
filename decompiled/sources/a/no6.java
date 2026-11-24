package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class no6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public /* synthetic */ long j;
    public final /* synthetic */ po6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no6(po6 po6Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.k = po6Var;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        po6 po6Var = this.k;
        switch (b) {
            case 0:
                return new no6(po6Var, this.j, yjeVar);
            default:
                no6 no6Var = new no6(po6Var, yjeVar);
                no6Var.j = ((Number) obj).longValue();
                return no6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((no6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((no6) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        po6 po6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayListB = po6Var.h.b(this.j);
                ArrayList arrayListL = o050.L(arrayListB, arrayListB, po6Var.r.f37705a.a(), po6Var.n.d(), false, po6Var.B);
                boolean zIsEmpty = arrayListL.isEmpty();
                p7m0 p7m0Var = po6Var.R;
                yv7 yv7Var = new yv7(CollectionsKt.q0(po6Var.x(), arrayListL), zIsEmpty);
                p7m0Var.getClass();
                p7m0Var.o(null, yv7Var);
                break;
            default:
                long j = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                po6Var.A(j == 0);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no6(po6 po6Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = po6Var;
    }
}
