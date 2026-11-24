package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tf20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rg20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf20(rg20 rg20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rg20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rg20 rg20Var = this.k;
        switch (b) {
            case 0:
                tf20 tf20Var = new tf20(rg20Var, yjeVar, (byte) 0);
                tf20Var.j = obj;
                return tf20Var;
            case 1:
                tf20 tf20Var2 = new tf20(rg20Var, yjeVar, (byte) 1);
                tf20Var2.j = obj;
                return tf20Var2;
            case 2:
                tf20 tf20Var3 = new tf20(rg20Var, yjeVar, (byte) 2);
                tf20Var3.j = obj;
                return tf20Var3;
            case 3:
                tf20 tf20Var4 = new tf20(rg20Var, yjeVar, (byte) 3);
                tf20Var4.j = obj;
                return tf20Var4;
            default:
                tf20 tf20Var5 = new tf20(rg20Var, yjeVar, (byte) 4);
                tf20Var5.j = obj;
                return tf20Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tf20) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tf20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        rg20 rg20Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                rg20Var.p.b((Throwable) obj2, new gd20(rg20Var, (byte) 3));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                rg20Var.P.n((jg7) obj2);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                rg20Var.p.b((Throwable) obj2, new gd20(rg20Var, (byte) 4));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                rg20Var.p.b((Throwable) obj2, new gd20(rg20Var, (byte) 5));
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                rg20Var.p.b((Throwable) obj2, new gd20(rg20Var, (byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
