package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hrh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ irh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrh0(irh0 irh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = irh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        irh0 irh0Var = this.j;
        switch (b) {
            case 0:
                return new hrh0(irh0Var, yjeVar, (byte) 0);
            case 1:
                return new hrh0(irh0Var, yjeVar, (byte) 1);
            case 2:
                return new hrh0(irh0Var, yjeVar, (byte) 2);
            default:
                return new hrh0(irh0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hrh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hrh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hrh0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hrh0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        irh0 irh0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                irh0Var.I.f(new vqh0(pek0.f26859a, irh0Var.u.f(R.string.personal_data_is_filling, new Object[0])));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                irh0Var.I.f(new vqh0(pek0.f26859a, irh0Var.u.f(R.string.security_phone_saved, new Object[0])));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                irh0Var.I.f(new vqh0(pek0.f26859a, irh0Var.u.f(R.string.security_secret_question_saved, new Object[0])));
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                irh0Var.x();
                break;
        }
        return Unit.f46060a;
    }
}
