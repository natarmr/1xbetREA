package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gvm0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hvm0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvm0(hvm0 hvm0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hvm0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hvm0 hvm0Var = this.k;
        switch (b) {
            case 0:
                gvm0 gvm0Var = new gvm0(hvm0Var, yjeVar, (byte) 0);
                gvm0Var.j = obj;
                return gvm0Var;
            default:
                gvm0 gvm0Var2 = new gvm0(hvm0Var, yjeVar, (byte) 1);
                gvm0Var2.j = obj;
                return gvm0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gvm0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gvm0) create((ra10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hvm0 hvm0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                y2m0 y2m0Var = hvm0.j2;
                ((fxm0) hvm0Var.i2.getValue()).A(list);
                hvm0Var.L0().b.setVisibility(list.isEmpty() ? 0 : 8);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hvm0Var.L0().b.v((ra10) obj2);
                break;
        }
        return Unit.f46060a;
    }
}
