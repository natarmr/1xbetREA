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
public final class oq10 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ vq10 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq10(vq10 vq10Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = vq10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new oq10(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        vq10 vq10Var = this.j;
        if (!z) {
            z1x.P(obj);
            rou rouVar = vq10Var.p;
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
        sek sekVar = vq10Var.r;
        ConfirmSendEmailScreenParams.BindEmail bindEmail = new ConfirmSendEmailScreenParams.BindEmail(new SendEmailIntention.Bind(str, EndFlowNavigation.ToMailingManagementScreen.f46925a, 23));
        sekVar.getClass();
        SecurityNavigationScreen sendConfirmationEmailScreen = new SendConfirmationEmailScreen(bindEmail);
        i1w0 i1w0Var = vq10Var.q;
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
