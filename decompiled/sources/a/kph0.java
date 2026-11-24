package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoListScreen$1;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.impl.navigation.EmailScreenFactoryImpl$getBindEmailScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kph0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18676a;
    public final /* synthetic */ oph0 b;

    public /* synthetic */ kph0(oph0 oph0Var, byte b) {
        this.f18676a = b;
        this.b = oph0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f18676a;
        byte b2 = 21;
        byte b3 = 4;
        yje yjeVar = null;
        byte b4 = 2;
        final byte b5 = 1;
        final byte b6 = 0;
        oph0 oph0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = oph0.Q1;
                zuh0 zuh0VarI0 = oph0Var.I0();
                BindEmailScreenParams bindEmailScreenParams = new BindEmailScreenParams(EndFlowNavigation.ToPersonalDataScreen.f46926a, false, 21);
                i1w0 i1w0Var = zuh0VarI0.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                zuh0VarI0.A.getClass();
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
            case 1:
                gle0 gle0Var2 = oph0.Q1;
                zuh0 zuh0VarI1 = oph0Var.I0();
                zuh0VarI1.m.f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_safety"), new Pair("element", "allert_activate_phone")));
                zuh0VarI1.D.f14907a.a(tx3.l0(new k1p[]{new j1p("acc_safety", (byte) 0), new j1p("allert_activate_phone", (byte) 1)}), 3231L);
                p7m0 p7m0Var = zuh0VarI1.F;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                sac.V(jiu0.a(zuh0VarI1), new jjh0(1, zuh0VarI1, zuh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, zuh0VarI1.q.f22085a, new xuh0(zuh0VarI1, yjeVar, b5), 10);
                return Unit.f46060a;
            case 2:
                gle0 gle0Var3 = oph0.Q1;
                i1w0 i1w0Var2 = oph0Var.I0().z;
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
            case 3:
                gle0 gle0Var4 = oph0.Q1;
                zuh0 zuh0VarI2 = oph0Var.I0();
                bby bbyVar = zuh0VarI2.L;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var2 = zuh0VarI2.F;
                    Boolean bool2 = Boolean.TRUE;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool2);
                    zuh0VarI2.L = sac.V(jiu0.a(zuh0VarI2), new jjh0(1, zuh0VarI2, zuh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, zuh0VarI2.q.f22085a, new xuh0(zuh0VarI2, yjeVar, b3), 10);
                }
                return Unit.f46060a;
            case 4:
                gle0 gle0Var5 = oph0.Q1;
                oph0Var.I0().y();
                return Unit.f46060a;
            case 5:
                gle0 gle0Var6 = oph0.Q1;
                zuh0 zuh0VarI3 = oph0Var.I0();
                i1w0 i1w0Var3 = zuh0VarI3.z;
                k0w0 k0w0VarI = cs0.i(i1w0Var3, i1w0Var3);
                zuh0VarI3.v.getClass();
                k0w0VarI.h(new PromoScreenFactoryImpl$getPromoListScreen$1());
                ListIterator listIteratorO2 = b1j.o(i1w0Var3, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar3.next());
                }
                break;
            case 6:
                gle0 gle0Var7 = oph0.Q1;
                zuh0 zuh0VarI4 = oph0Var.I0();
                zuh0VarI4.m.c();
                zuh0VarI4.D.f14907a.a(tx3.l0(new k1p[]{new j1p("acc_safety", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                i1w0 i1w0Var4 = zuh0VarI4.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var4);
                SecurityNavigationScreen securityNavigationScreenG = zuh0VarI4.y.g();
                if (securityNavigationScreenG instanceof DialogScreen) {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securityNavigationScreenG)));
                } else {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(securityNavigationScreenG)));
                }
                ListIterator listIteratorO3 = b1j.o(i1w0Var4, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO3;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var4.a((oe50) pawVar4.next());
                }
                break;
            case 7:
                gle0 gle0Var8 = oph0.Q1;
                zuh0 zuh0VarI5 = oph0Var.I0();
                zuh0VarI5.b.e(pu.OK);
                zuh0VarI5.B.b(r54.OK);
                return Unit.f46060a;
            case 8:
                gle0 gle0Var9 = oph0.Q1;
                oph0 oph0Var2 = this.b;
                zuh0 zuh0VarI6 = oph0Var2.I0();
                zuh0VarI6.b.e(pu.COPY);
                zuh0VarI6.B.b(r54.COPY);
                Bundle bundle = oph0Var2.g;
                if (bundle == null || (string = bundle.getString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", "")) == null) {
                    return Unit.f46060a;
                }
                wdk0 wdk0VarB = oph0Var2.G0().b();
                String strH = oph0Var2.H(R.string.tfa_key_copied_to_clipboard);
                strH.getClass();
                j120.M(oph0Var2, wdk0VarB, string, string, strH, null, Integer.valueOf(R.drawable.data_copy_icon), oph0Var2.H0().f22911a, 16);
                return Unit.f46060a;
            case 9:
                gle0 gle0Var10 = oph0.Q1;
                ComponentCallbacks2 application = oph0Var.n0().getApplication();
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
                        return pph0Var.a(a4n0.f(oph0Var));
                    }
                }
                jf4.n(b1j.i(pph0.class, "Cannot create dependency "));
                return null;
            case 10:
                gle0 gle0Var11 = oph0.Q1;
                return (xsi) oph0Var.G0().k.get();
            default:
                gle0 gle0Var12 = oph0.Q1;
                byte b7 = 15;
                final gwg0 gwg0Var = new gwg0(oph0Var, b7);
                xnh0 xnh0Var = new xnh0(ek5.h);
                byte b8 = 3;
                gbn gbnVar = new gbn(new x0h0((byte) 18), new o5c0(b8, (byte) 27), new eoh0((byte) 2), ynh0.d);
                dp dpVar = xnh0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new x0h0((byte) 19), new o5c0(b8, (byte) 28), new eoh0((byte) 3), ynh0.e));
                dpVar.b(new gbn(new x0h0((byte) 23), new gsh0(b8, b4), new Function1() { // from class: a.lth0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (b6) {
                            case 0:
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                dyb.b0(view, ymx.INTERVAL_500, new dff0(gwg0Var, cpVar, (byte) 29));
                                cpVar.t(new ui80(cpVar, (byte) 24));
                                break;
                            default:
                                cp cpVar2 = (cp) obj;
                                cpVar2.getClass();
                                gwg0 gwg0Var2 = gwg0Var;
                                cpVar2.t(new if6(cpVar2, gwg0Var2, cpVar2, gwg0Var2, (byte) 9));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.i));
                dpVar.b(new gbn(new x0h0((byte) 24), new gsh0(b8, b8), new Function1() { // from class: a.lth0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (b5) {
                            case 0:
                                cp cpVar = (cp) obj;
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                dyb.b0(view, ymx.INTERVAL_500, new dff0(gwg0Var, cpVar, (byte) 29));
                                cpVar.t(new ui80(cpVar, (byte) 24));
                                break;
                            default:
                                cp cpVar2 = (cp) obj;
                                cpVar2.getClass();
                                gwg0 gwg0Var2 = gwg0Var;
                                cpVar2.t(new if6(cpVar2, gwg0Var2, cpVar2, gwg0Var2, (byte) 9));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.j));
                dpVar.b(new gbn(new x0h0((byte) 22), new gsh0(b8, b5), new eoh0((byte) 6), ynh0.h));
                byte b9 = 29;
                dpVar.b(new gbn(new x0h0((byte) 20), new o5c0(b8, b9), new eoh0((byte) 4), ynh0.f));
                dpVar.b(new gbn(new x0h0((byte) 17), new o5c0(b8, (byte) 26), new eoh0((byte) 1), ynh0.c));
                dpVar.b(new gbn(new x0h0(b7), new o5c0(b8, (byte) 25), new w0h0(b9), ynh0.b));
                dpVar.b(new gbn(new x0h0(b2), new gsh0(b8, b6), new eoh0((byte) 5), ynh0.g));
                return xnh0Var;
        }
    }
}
