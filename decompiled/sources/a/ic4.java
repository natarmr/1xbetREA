package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ic4 extends bnn0 implements Function1 {
    public gnu i;
    public boolean j;
    public final /* synthetic */ kc4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic4(kc4 kc4Var, yje yjeVar) {
        super(1, yjeVar);
        this.k = kc4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new ic4(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ic4) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        gnu gnuVar;
        Object objR;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        kc4 kc4Var = this.k;
        if (!z) {
            z1x.P(obj);
            int i = kc4.Y;
            p7m0 p7m0Var = kc4Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, mb4.a((mb4) value, false, false, true, null, null, null, 0, false, null, null, false, 16375)));
            gnuVar = kc4Var.r;
            ali aliVar = kc4Var.G;
            this.i = gnuVar;
            this.j = true;
            objR = aliVar.r(false, this);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gnu gnuVar2 = this.i;
            z1x.P(obj);
            gnuVar = gnuVar2;
            objR = obj;
        }
        gnuVar.c((List) objR);
        kc4Var.G(new hb4(new PickerParams.Phone(new Integer(((mb4) kc4Var.D()).h), false, true)));
        return Unit.f46060a;
    }
}
