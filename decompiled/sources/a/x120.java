package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x120 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w220 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x120(w220 w220Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = w220Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w220 w220Var = this.k;
        switch (b) {
            case 0:
                x120 x120Var = new x120(w220Var, yjeVar, (byte) 0);
                x120Var.j = obj;
                return x120Var;
            case 1:
                x120 x120Var2 = new x120(w220Var, yjeVar, (byte) 1);
                x120Var2.j = obj;
                return x120Var2;
            case 2:
                x120 x120Var3 = new x120(w220Var, yjeVar, (byte) 2);
                x120Var3.j = obj;
                return x120Var3;
            case 3:
                x120 x120Var4 = new x120(w220Var, yjeVar, (byte) 3);
                x120Var4.j = obj;
                return x120Var4;
            default:
                x120 x120Var5 = new x120(w220Var, yjeVar, (byte) 4);
                x120Var5.j = obj;
                return x120Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x120) create((w950) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((x120) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((x120) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((x120) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x120) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        w220 w220Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                w220Var.s0.e("NavBarScreenTypes", ((w950) obj2).f38762a);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                w220Var.e0.b((Throwable) obj2, new n120(w220Var, (byte) 1));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                w220Var.e0.b((Throwable) obj2, new n120(w220Var, (byte) 2));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                w220Var.e0.b((Throwable) obj2, new n120(w220Var, (byte) 3));
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                w220Var.e0.b((Throwable) obj2, new n120(w220Var, (byte) 4));
                break;
        }
        return Unit.f46060a;
    }
}
