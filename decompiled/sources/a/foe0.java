package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$networkScreen$1;
import org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$takePartScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class foe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hoe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ foe0(hoe0 hoe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hoe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new foe0(this.k, yjeVar, (byte) 0);
            default:
                foe0 foe0Var = new foe0(this.k, yjeVar, (byte) 1);
                foe0Var.j = ((Boolean) obj).booleanValue();
                return foe0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((foe0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((foe0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        hoe0 hoe0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hnu hnuVar = hoe0Var.b;
                    this.j = true;
                    obj = hnu.i(hnuVar, 0, this, 3);
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
                ReferralNetworkInfo referralNetworkInfo = (ReferralNetworkInfo) obj;
                if (referralNetworkInfo.d.length() == 0) {
                    i1w0 i1w0VarC = ((oeg0) hoe0Var.c.f27863a).c();
                    k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                    k0w0VarI.h(new ReferralProgramScreenFactoryImpl$takePartScreen$1());
                    ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    pzu pzuVar = hoe0Var.c;
                    ReferralNetworkParams referralNetworkParams = new ReferralNetworkParams(referralNetworkInfo);
                    i1w0 i1w0VarC2 = ((oeg0) pzuVar.f27863a).c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC2);
                    FragmentScreen referralProgramScreenFactoryImpl$networkScreen$1 = new ReferralProgramScreenFactoryImpl$networkScreen$1(referralNetworkParams);
                    if (referralProgramScreenFactoryImpl$networkScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) referralProgramScreenFactoryImpl$networkScreen$1)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(referralProgramScreenFactoryImpl$networkScreen$1)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0VarC2, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0VarC2.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    p7m0 p7m0Var = hoe0Var.h;
                    p7m0Var.getClass();
                    p7m0Var.o(null, kn00.f18563a);
                    sac.V(jiu0.a(hoe0Var), new d8e0(1, hoe0Var.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, null, new foe0(hoe0Var, yjeVar, b2), 14);
                } else {
                    p7m0 p7m0Var2 = hoe0Var.h;
                    ln00 ln00Var = new ln00(sa10.b(hoe0Var.f, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, ln00Var);
                }
                return Unit.f46060a;
        }
    }
}
