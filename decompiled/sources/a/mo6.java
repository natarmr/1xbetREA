package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mo6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ po6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo6(po6 po6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = po6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        po6 po6Var = this.k;
        switch (b) {
            case 0:
                mo6 mo6Var = new mo6(po6Var, yjeVar, (byte) 0);
                mo6Var.j = obj;
                return mo6Var;
            case 1:
                mo6 mo6Var2 = new mo6(po6Var, yjeVar, (byte) 1);
                mo6Var2.j = obj;
                return mo6Var2;
            case 2:
                mo6 mo6Var3 = new mo6(po6Var, yjeVar, (byte) 2);
                mo6Var3.j = obj;
                return mo6Var3;
            case 3:
                mo6 mo6Var4 = new mo6(po6Var, yjeVar, (byte) 3);
                mo6Var4.j = obj;
                return mo6Var4;
            default:
                mo6 mo6Var5 = new mo6(po6Var, yjeVar, (byte) 4);
                mo6Var5.j = obj;
                return mo6Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mo6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mo6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mo6) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mo6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mo6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        po6 po6Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                po6Var.F.b((Throwable) obj2, new gh5((byte) 17));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                po6Var.F.b((Throwable) obj2, new gh5((byte) 18));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                po6Var.U.n((jg7) obj2);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                po6Var.F.b((Throwable) obj2, new gh5((byte) 19));
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                po6Var.F.b((Throwable) obj2, new gh5((byte) 20));
                break;
        }
        return Unit.f46060a;
    }
}
