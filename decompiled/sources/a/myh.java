package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class myh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Function1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myh(yje yjeVar, Function1 function1, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function1 function1 = this.k;
        switch (b) {
            case 0:
                myh myhVar = new myh(yjeVar, function1, (byte) 0);
                myhVar.j = obj;
                return myhVar;
            case 1:
                myh myhVar2 = new myh(yjeVar, function1, (byte) 1);
                myhVar2.j = obj;
                return myhVar2;
            case 2:
                myh myhVar3 = new myh(function1, yjeVar, (byte) 2);
                myhVar3.j = obj;
                return myhVar3;
            default:
                myh myhVar4 = new myh(function1, yjeVar, (byte) 3);
                myhVar4.j = obj;
                return myhVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((myh) create((lva0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((myh) create((lva0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((myh) create((az40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((myh) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                lva0 lva0Var = (lva0) this.j;
                lva0Var.getClass();
                return function1.invoke(lva0Var.d());
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                lva0 lva0Var2 = (lva0) this.j;
                lva0Var2.getClass();
                return function1.invoke(lva0Var2.d());
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                function1.invoke((az40) this.j);
                return Unit.f46060a;
            default:
                Throwable th = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(th);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myh(Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = function1;
    }
}
