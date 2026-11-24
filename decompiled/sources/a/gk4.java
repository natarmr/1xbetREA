package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final class gk4 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ hk4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk4(String str, hk4 hk4Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = str;
        this.k = hk4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new gk4(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((gk4) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            uu4 uu4VarA = vu4.a(new AuthDataModel.Qr(this.j));
            int i = hk4.b0;
            hk4 hk4Var = this.k;
            p7m0 p7m0Var = hk4Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, tj4.a((tj4) value, false, false, true, null, null, null, 0, false, null, null, false, 65527)));
            hk4Var.V.f40449a = 0;
            im4 im4Var = hk4Var.p;
            ml4 ml4Var = new ml4(uu4VarA, hk4Var.H.g());
            this.i = true;
            im4Var.getClass();
            if (im4Var.a(ml4Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
