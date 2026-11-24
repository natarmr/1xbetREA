package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;
import org.xplatform.app_update.impl.navigation.AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class w1q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ x1q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1q0(x1q0 x1q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x1q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new w1q0(this.k, yjeVar, (byte) 0);
            case 1:
                return new w1q0(this.k, yjeVar, (byte) 1);
            default:
                return new w1q0(this.k, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((w1q0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        x1q0 x1q0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var = x1q0Var.u;
                    vd9 vd9Var = vd9.c;
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, vd9Var);
                    if (Unit.f46060a == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    rl40 rl40VarI = ((xr) ((uii) x1q0Var.e.f43005a).j().f30901a).i();
                    p7m0 p7m0Var2 = x1q0Var.u;
                    yd9 yd9Var = new yd9(rl40VarI.name());
                    this.j = true;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, yd9Var);
                    if (Unit.f46060a == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nhf0 nhf0Var = x1q0Var.r;
                    this.j = true;
                    obj = nhf0Var.f(true, false, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                gm3 gm3Var = (gm3) obj;
                rek0 rek0Var = x1q0Var.q;
                AppUpdateScreenParams appUpdateScreenParams = new AppUpdateScreenParams(gm3Var.f11523a, gm3Var.b, gm3Var.c);
                rek0Var.getClass();
                FragmentScreen appUpdateScreenFactoryImpl$getAppUpdateScreen$1 = new AppUpdateScreenFactoryImpl$getAppUpdateScreen$1(appUpdateScreenParams);
                i1w0 i1w0Var = x1q0Var.l;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (appUpdateScreenFactoryImpl$getAppUpdateScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(appUpdateScreenFactoryImpl$getAppUpdateScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
