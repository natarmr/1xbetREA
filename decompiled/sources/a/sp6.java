package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sp6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public /* synthetic */ long j;
    public final /* synthetic */ vp6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp6(vp6 vp6Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.k = vp6Var;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vp6 vp6Var = this.k;
        switch (b) {
            case 0:
                return new sp6(vp6Var, this.j, yjeVar);
            default:
                sp6 sp6Var = new sp6(vp6Var, yjeVar);
                sp6Var.j = ((Number) obj).longValue();
                return sp6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sp6) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        vp6 vp6Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayListB = vp6Var.u.b(this.j);
                vp6Var.S(arrayListB, !vp6.O(arrayListB));
                break;
            default:
                long j = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = j == 0;
                int i = vp6.W;
                vp6Var.R(z);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp6(vp6 vp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = vp6Var;
    }
}
