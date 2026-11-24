package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class fzd extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ kzd j;
    public final /* synthetic */ lie0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzd(kzd kzdVar, lie0 lie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = kzdVar;
        this.k = lie0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        fzd fzdVar = new fzd(this.j, this.k, yjeVar);
        fzdVar.i = obj;
        return fzdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fzd) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kzd kzdVar = this.j;
        ConfirmSendEmailScreenParams confirmSendEmailScreenParams = kzdVar.c;
        e7a e7aVar = (e7a) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (e7aVar instanceof d7a) {
            if (confirmSendEmailScreenParams instanceof ConfirmSendEmailScreenParams.BindEmail) {
                int i = ((ConfirmSendEmailScreenParams.BindEmail) confirmSendEmailScreenParams).f46932a.c;
                String str = (i == 22 || i == 23) ? "link_email_mailing" : "user_activation_email";
                kzdVar.i.e(str);
                kzdVar.j.h(str);
            }
            this.k.f20100a = System.currentTimeMillis();
            SendEmailIntention sendEmailIntentionW = confirmSendEmailScreenParams.w();
            ctf0 ctf0Var = kzdVar.q;
            sendEmailIntentionW.getClass();
            ctf0Var.getClass();
            kzdVar.r.f(new yyd((d7a) e7aVar, ctf0Var.f(sendEmailIntentionW instanceof SendEmailIntention.RestorePassword ? R.string.confirmation : R.string.email_activ, new Object[0])));
        }
        return Unit.f46060a;
    }
}
