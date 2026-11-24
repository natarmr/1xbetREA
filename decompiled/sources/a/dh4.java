package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final class dh4 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ fh4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh4(String str, fh4 fh4Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = str;
        this.k = fh4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new dh4(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((dh4) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            uu4 uu4VarA = vu4.a(new AuthDataModel.Qr(this.j));
            int i = fh4.c0;
            fh4 fh4Var = this.k;
            p7m0 p7m0Var = fh4Var.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, true, null, null, null, 0, false, null, null, false, false, 32759)));
            fh4Var.W.f40449a = 0;
            im4 im4Var = fh4Var.p;
            ml4 ml4Var = new ml4(uu4VarA, fh4Var.J.g());
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
