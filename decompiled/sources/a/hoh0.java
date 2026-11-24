package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.impl.navigation.EmailScreenFactoryImpl$getBindEmailScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hoh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13394a;
    public final /* synthetic */ joh0 b;

    public /* synthetic */ hoh0(joh0 joh0Var, byte b) {
        this.f13394a = b;
        this.b = joh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f13394a;
        yje yjeVar = null;
        byte b2 = 0;
        joh0 joh0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = joh0.N1;
                return (wsi) joh0Var.G0().j.get();
            case 1:
                eke0 eke0Var2 = joh0.N1;
                iph0 iph0VarH0 = joh0Var.H0();
                bby bbyVar = iph0VarH0.H;
                byte b3 = 1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var = iph0VarH0.D;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    iph0VarH0.H = sac.V(jiu0.a(iph0VarH0), new jjh0(1, iph0VarH0, iph0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, iph0VarH0.s.f22085a, new fph0(iph0VarH0, yjeVar, b3), 10);
                }
                return Unit.f46060a;
            case 2:
                eke0 eke0Var3 = joh0.N1;
                iph0 iph0VarH1 = joh0Var.H0();
                BindEmailScreenParams bindEmailScreenParams = new BindEmailScreenParams(EndFlowNavigation.ToPersonalDataScreen.f46926a, false, 21);
                i1w0 i1w0Var = iph0VarH1.A;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                iph0VarH1.B.getClass();
                FragmentScreen emailScreenFactoryImpl$getBindEmailScreen$1 = new EmailScreenFactoryImpl$getBindEmailScreen$1(bindEmailScreenParams);
                if (emailScreenFactoryImpl$getBindEmailScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) emailScreenFactoryImpl$getBindEmailScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(emailScreenFactoryImpl$getBindEmailScreen$1)));
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
            case 3:
                eke0 eke0Var4 = joh0.N1;
                iph0 iph0VarH2 = joh0Var.H0();
                i1w0 i1w0Var2 = iph0VarH2.A;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                SecurityNavigationScreen securityNavigationScreenG = iph0VarH2.z.g();
                if (securityNavigationScreenG instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securityNavigationScreenG)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(securityNavigationScreenG)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 4:
                eke0 eke0Var5 = joh0.N1;
                joh0Var.H0().x();
                return Unit.f46060a;
            case 5:
                eke0 eke0Var6 = joh0.N1;
                iph0 iph0VarH3 = joh0Var.H0();
                iph0VarH3.A.d(new qoh0(iph0VarH3, b2));
                return Unit.f46060a;
            case 6:
                eke0 eke0Var7 = joh0.N1;
                iph0 iph0VarH4 = joh0Var.H0();
                iph0VarH4.b.e(pu.OK);
                iph0VarH4.c.b(r54.OK);
                return Unit.f46060a;
            case 7:
                eke0 eke0Var8 = joh0.N1;
                joh0 joh0Var2 = this.b;
                iph0 iph0VarH5 = joh0Var2.H0();
                iph0VarH5.b.e(pu.COPY);
                iph0VarH5.c.b(r54.COPY);
                Bundle bundle = joh0Var2.g;
                if (bundle == null || (string = bundle.getString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", "")) == null) {
                    return Unit.f46060a;
                }
                wdk0 wdk0VarB = joh0Var2.G0().b();
                String strH = joh0Var2.H(R.string.data_copied_to_clipboard);
                strH.getClass();
                Integer numValueOf = Integer.valueOf(R.drawable.data_copy_icon);
                Object objN = joh0Var2.L1.n(joh0.O1[0], joh0Var2);
                objN.getClass();
                j120.M(joh0Var2, wdk0VarB, string, string, strH, null, numValueOf, ((aid) objN).f919a, 16);
                return Unit.f46060a;
            default:
                eke0 eke0Var9 = joh0.N1;
                ComponentCallbacks2 application = joh0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(pph0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof pph0)) {
                        ze3Var = null;
                    }
                    pph0 pph0Var = (pph0) ze3Var;
                    if (pph0Var != null) {
                        return pph0Var.a(a4n0.f(joh0Var));
                    }
                }
                jf4.n(b1j.i(pph0.class, "Cannot create dependency "));
                return null;
        }
    }
}
