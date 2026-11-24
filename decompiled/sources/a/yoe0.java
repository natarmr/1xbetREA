package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$networkScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class yoe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zoe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yoe0(zoe0 zoe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zoe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zoe0 zoe0Var = this.k;
        switch (b) {
            case 0:
                yoe0 yoe0Var = new yoe0(zoe0Var, yjeVar, (byte) 0);
                yoe0Var.j = ((Boolean) obj).booleanValue();
                return yoe0Var;
            default:
                return new yoe0(zoe0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yoe0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yoe0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zoe0 zoe0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                twn.A(z, zoe0Var.u, null);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    epi0 epi0Var = zoe0Var.c;
                    this.j = true;
                    if (((z220) epi0Var.b).P(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                zoe0Var.f.f44833a.a(xun.f41520a, 3328L);
                zoe0Var.j.f42966a.c("promo_referal_done");
                pzu pzuVar = zoe0Var.e;
                ReferralNetworkParams referralNetworkParams = new ReferralNetworkParams(new ReferralNetworkInfo(0.0d, 0.0d, 0.0d, "", iun.f15405a));
                i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                FragmentScreen referralProgramScreenFactoryImpl$networkScreen$1 = new ReferralProgramScreenFactoryImpl$networkScreen$1(referralNetworkParams);
                if (referralProgramScreenFactoryImpl$networkScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) referralProgramScreenFactoryImpl$networkScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(referralProgramScreenFactoryImpl$networkScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
