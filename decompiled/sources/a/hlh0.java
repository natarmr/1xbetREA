package a;

import org.xplatform.security.api.domain.models.SecretQuestionModel;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class hlh0 extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final mne o;
    public final rsu p;
    public c4m0 q;

    public hlh0(SecretQuestionChoiceScreenParams secretQuestionChoiceScreenParams, ctf0 ctf0Var, mne mneVar, rsu rsuVar) {
        ctf0Var.getClass();
        owd owdVar = new owd(ctf0Var, (byte) 3);
        dff0 dff0Var = new dff0(ctf0Var, secretQuestionChoiceScreenParams, (byte) 25);
        rwj rwjVar = mneVar.f22085a;
        super(null, owdVar, dff0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = mneVar;
        this.p = rsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        SecretQuestionModel secretQuestionModel;
        ukh0 ukh0Var = (ukh0) obj;
        ukh0Var.getClass();
        super.x(ukh0Var);
        Object obj2 = null;
        Object[] objArr = 0;
        if (ukh0Var instanceof rkh0) {
            int i = ((rkh0) ukh0Var).f30649a;
            if (i == 0) {
                secretQuestionModel = new SecretQuestionModel(0, "");
            } else {
                for (Object obj3 : ((elh0) D()).b) {
                    if (((SecretQuestionModel) obj3).f46923a == i) {
                        obj2 = obj3;
                        break;
                    }
                }
                secretQuestionModel = (SecretQuestionModel) obj2;
                if (secretQuestionModel == null) {
                    return;
                }
            }
            G(new clh0(secretQuestionModel));
            return;
        }
        if (ukh0Var instanceof skh0) {
            c4m0 c4m0Var = this.q;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.q = sac.T(new fnq(((hmh0) this.p.f31050a.d).f13307a, new tye0(this, objArr == true ? 1 : 0, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), this.o.f22085a), glh0.h);
                return;
            }
            return;
        }
        if (!(ukh0Var instanceof tkh0)) {
            if (ukh0Var instanceof qkh0) {
                E();
            }
        } else {
            c4m0 c4m0Var2 = this.q;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
        }
    }
}
