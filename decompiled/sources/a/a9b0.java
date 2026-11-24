package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a9b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g9b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9b0(g9b0 g9b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g9b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g9b0 g9b0Var = this.k;
        switch (b) {
            case 0:
                a9b0 a9b0Var = new a9b0(g9b0Var, yjeVar, (byte) 0);
                a9b0Var.j = obj;
                return a9b0Var;
            default:
                a9b0 a9b0Var2 = new a9b0(g9b0Var, yjeVar, (byte) 1);
                a9b0Var2.j = obj;
                return a9b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a9b0) create((x8b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a9b0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g9b0 g9b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((yqc) g9b0Var.q.b).z().g(((x8b0) obj2) instanceof t8b0);
                break;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a != sw00Var.b && g9b0Var.A.y()) {
                    g9b0Var.A(s8b0.f31793a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
