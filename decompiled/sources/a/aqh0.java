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
public final /* synthetic */ class aqh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1296a;
    public final /* synthetic */ cqh0 b;

    public /* synthetic */ aqh0(cqh0 cqh0Var, byte b) {
        this.f1296a = b;
        this.b = cqh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f1296a;
        yje yjeVar = null;
        byte b2 = 0;
        cqh0 cqh0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = cqh0.N1;
                return (ysi) cqh0Var.G0().l.get();
            case 1:
                gne0 gne0Var2 = cqh0.N1;
                irh0 irh0VarH0 = cqh0Var.H0();
                i1w0 i1w0Var = irh0VarH0.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                SecurityNavigationScreen securityNavigationScreenG = irh0VarH0.y.g();
                if (securityNavigationScreenG instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securityNavigationScreenG)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(securityNavigationScreenG)));
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
            case 2:
                gne0 gne0Var3 = cqh0.N1;
                irh0 irh0VarH1 = cqh0Var.H0();
                p7m0 p7m0Var = irh0VarH1.D;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                sac.V(jiu0.a(irh0VarH1), new jjh0(1, irh0VarH1, irh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, irh0VarH1.r.f22085a, new frh0(irh0VarH1, yjeVar, (byte) 1), 10);
                return Unit.f46060a;
            case 3:
                gne0 gne0Var4 = cqh0.N1;
                irh0 irh0VarH2 = cqh0Var.H0();
                BindEmailScreenParams bindEmailScreenParams = new BindEmailScreenParams(EndFlowNavigation.ToPersonalDataScreen.f46926a, false, 21);
                i1w0 i1w0Var2 = irh0VarH2.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                irh0VarH2.A.getClass();
                FragmentScreen emailScreenFactoryImpl$getBindEmailScreen$1 = new EmailScreenFactoryImpl$getBindEmailScreen$1(bindEmailScreenParams);
                if (emailScreenFactoryImpl$getBindEmailScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) emailScreenFactoryImpl$getBindEmailScreen$1)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(emailScreenFactoryImpl$getBindEmailScreen$1)));
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
                gne0 gne0Var5 = cqh0.N1;
                irh0 irh0VarH3 = cqh0Var.H0();
                irh0VarH3.b.e(pu.OK);
                irh0VarH3.B.b(r54.OK);
                return Unit.f46060a;
            case 5:
                gne0 gne0Var6 = cqh0.N1;
                cqh0 cqh0Var2 = this.b;
                irh0 irh0VarH4 = cqh0Var2.H0();
                irh0VarH4.b.e(pu.COPY);
                irh0VarH4.B.b(r54.COPY);
                Bundle bundle = cqh0Var2.g;
                if (bundle == null || (string = bundle.getString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", "")) == null) {
                    return Unit.f46060a;
                }
                wdk0 wdk0VarB = cqh0Var2.G0().b();
                String strH = cqh0Var2.H(R.string.data_copied_to_clipboard);
                strH.getClass();
                Integer numValueOf = Integer.valueOf(R.drawable.data_copy_icon);
                Object objN = cqh0Var2.K1.n(cqh0.O1[0], cqh0Var2);
                objN.getClass();
                j120.M(cqh0Var2, wdk0VarB, string, string, strH, null, numValueOf, ((aid) objN).f919a, 16);
                return Unit.f46060a;
            case 6:
                gne0 gne0Var7 = cqh0.N1;
                cqh0Var.H0().y();
                return Unit.f46060a;
            case 7:
                gne0 gne0Var8 = cqh0.N1;
                irh0 irh0VarH5 = cqh0Var.H0();
                irh0VarH5.z.d(new pqh0(irh0VarH5, b2));
                return Unit.f46060a;
            default:
                gne0 gne0Var9 = cqh0.N1;
                ComponentCallbacks2 application = cqh0Var.n0().getApplication();
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
                        return pph0Var.a(a4n0.f(cqh0Var));
                    }
                }
                jf4.n(b1j.i(pph0.class, "Cannot create dependency "));
                return null;
        }
    }
}
