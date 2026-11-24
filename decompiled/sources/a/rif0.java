package a;

import android.content.ComponentCallbacks2;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rif0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30540a;
    public final /* synthetic */ vif0 b;

    public /* synthetic */ rif0(vif0 vif0Var, byte b) {
        this.f30540a = b;
        this.b = vif0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30540a;
        vif0 vif0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = vif0.Q1;
                ComponentCallbacks2 application = vif0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(wif0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof wif0)) {
                        ze3Var = null;
                    }
                    wif0 wif0Var = (wif0) ze3Var;
                    if (wif0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(vif0Var);
                        Boolean boolN = vif0Var.M1.n(vif0Var, vif0.R1[0]);
                        i1w0VarF.getClass();
                        return new vri(wif0Var.b, wif0Var.f39212a, boolN, i1w0VarF);
                    }
                }
                jf4.n(b1j.i(wif0.class, "Cannot create dependency "));
                return null;
            case 1:
                cge0 cge0Var2 = vif0.Q1;
                return (uri) ((vri) vif0Var.O1.getValue()).e.get();
            case 2:
                cge0 cge0Var3 = vif0.Q1;
                vif0 vif0Var2 = this.b;
                wdk0 wdk0Var = (wdk0) ((vri) vif0Var2.O1.getValue()).f37899a.e;
                x1x.y(wdk0Var);
                rek0 rek0Var = rek0.b;
                String strH = vif0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), vif0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 3:
                cge0 cge0Var4 = vif0.Q1;
                gjf0 gjf0VarH0 = vif0Var.H0();
                i1w0 i1w0Var = gjf0VarH0.g;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenB = gjf0VarH0.b.b();
                if (fragmentScreenB instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
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
            case 4:
                cge0 cge0Var5 = vif0.Q1;
                i1w0 i1w0Var2 = vif0Var.H0().g;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            default:
                cge0 cge0Var6 = vif0.Q1;
                gjf0 gjf0VarH1 = vif0Var.H0();
                if (((ejf0) gjf0VarH1.i.getValue()).d) {
                    bby bbyVar = gjf0VarH1.k;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        gjf0VarH1.k = sac.V(jiu0.a(gjf0VarH1), new aif0(1, gjf0VarH1, gjf0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 2), new tie0(gjf0VarH1, (byte) 18), gjf0VarH1.d.b, new fjf0(gjf0VarH1, null, (byte) 0), 8);
                    }
                } else {
                    gjf0VarH1.j.f(yif0.f42687a);
                }
                return Unit.f46060a;
        }
    }
}
