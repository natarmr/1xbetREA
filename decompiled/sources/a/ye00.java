package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ye00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ef00 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye00(ef00 ef00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ef00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ef00 ef00Var = this.j;
        switch (b) {
            case 0:
                return new ye00(ef00Var, yjeVar, (byte) 0);
            default:
                return new ye00(ef00Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ye00) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ye00) create((ab50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ef00 ef00Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ef00Var.i.k(pzb.C(new w800((byte) 2)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ef00Var.x0.f(je00.f16352a);
                break;
        }
        return Unit.f46060a;
    }
}
