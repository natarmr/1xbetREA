package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f7q0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ k7q0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7q0(k7q0 k7q0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = k7q0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        k7q0 k7q0Var = this.j;
        switch (b) {
            case 0:
                return new f7q0(k7q0Var, yjeVar, (byte) 0);
            case 1:
                return new f7q0(k7q0Var, yjeVar, (byte) 1);
            case 2:
                return new f7q0(k7q0Var, yjeVar, (byte) 2);
            default:
                return new f7q0(k7q0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((f7q0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        k7q0 k7q0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                k7q0Var.B = false;
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                k7q0Var.c();
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                k7q0Var.a(k7q0Var.B);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                k7q0Var.o();
                break;
        }
        return Unit.f46060a;
    }
}
