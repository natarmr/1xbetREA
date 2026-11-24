package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj(wj wjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wjVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wj wjVar = this.k;
        switch (b) {
            case 0:
                uj ujVar = new uj(wjVar, yjeVar, (byte) 0);
                ujVar.j = obj;
                return ujVar;
            default:
                uj ujVar2 = new uj(wjVar, yjeVar, (byte) 1);
                ujVar2.j = obj;
                return ujVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uj) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uj) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        wj wjVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = wjVar.w;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, yi.a((yi) value, !list.isEmpty(), false, false, false, false, null, 32763)));
                break;
            default:
                px7 px7Var = (px7) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = wjVar.w;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, yi.a((yi) value2, false, false, false, false, false, px7Var, 28671)));
                break;
        }
        return Unit.f46060a;
    }
}
