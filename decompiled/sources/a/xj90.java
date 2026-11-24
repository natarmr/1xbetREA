package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;
import org.xplatform.security.impl.presentation.email.confirmation.screen.SendConfirmationEmailScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class xj90 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ kk90 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj90(kk90 kk90Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = kk90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new xj90(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xj90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        kk90 kk90Var = this.j;
        if (!z) {
            z1x.P(obj);
            rou rouVar = kk90Var.d;
            this.i = true;
            obj = rouVar.a(false, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        String str = ((m2c0) obj).T;
        sek sekVar = kk90Var.q;
        ConfirmSendEmailScreenParams.BindEmail bindEmail = new ConfirmSendEmailScreenParams.BindEmail(new SendEmailIntention.Bind(str, EndFlowNavigation.ToPersonalDataScreen.f46926a, 21));
        sekVar.getClass();
        SecurityNavigationScreen sendConfirmationEmailScreen = new SendConfirmationEmailScreen(bindEmail);
        i1w0 i1w0Var = kk90Var.p;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (sendConfirmationEmailScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) sendConfirmationEmailScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(sendConfirmationEmailScreen)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }
}
