package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.impl.navigation.PasswordScreenFactoryImpl$getPasswordChangeFragment$1;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.security.impl.presentation.otp_authenticator.OtpScreens$AddTwoFactoryAuthenticationScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class frh0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ irh0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ frh0(irh0 irh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = irh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        irh0 irh0Var = this.k;
        switch (b) {
            case 0:
                return new frh0(irh0Var, yjeVar, (byte) 0);
            case 1:
                return new frh0(irh0Var, yjeVar, (byte) 1);
            case 2:
                return new frh0(irh0Var, yjeVar, (byte) 2);
            case 3:
                return new frh0(irh0Var, yjeVar, (byte) 3);
            case 4:
                return new frh0(irh0Var, yjeVar, (byte) 4);
            default:
                return new frh0(irh0Var, yjeVar, (byte) 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((frh0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        jqt0 jqt0Var;
        byte b = this.i;
        byte b2 = 0;
        irh0 irh0Var = this.k;
        yje yjeVar = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarL = ulb.L(new p6d(irh0Var.v.b(), new vsg0(new erh0(irh0Var, yjeVar, b2)), new ib60(irh0Var, yjeVar, (byte) 12), (byte) 1), irh0Var.r.f22085a);
                    this.j = true;
                    if (slb.N(gmqVarL, this) == wneVar) {
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
                    rou rouVar = irh0Var.i;
                    this.j = true;
                    obj = rouVar.a(true, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                String str = ((m2c0) obj).Z;
                mi70 mi70Var = irh0Var.q;
                xbi0 xbi0Var = new xbi0(str, 6, false);
                mi70Var.getClass();
                SecurityNavigationScreen sendConfirmationSMSScreen = new SendConfirmationSMSScreen(xbi0Var);
                i1w0 i1w0Var = irh0Var.z;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (sendConfirmationSMSScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) sendConfirmationSMSScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(sendConfirmationSMSScreen)));
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
                zn00 zn00Var = irh0Var.o;
                i1w0 i1w0Var2 = irh0Var.z;
                ol60 ol60Var = irh0Var.I;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rou rouVar2 = irh0Var.i;
                    this.j = true;
                    obj = rouVar2.a(true, this);
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
                m2c0 m2c0Var = (m2c0) obj;
                boolean z4 = irh0Var.h.a().k.f;
                if (z4 && (jqt0Var = m2c0Var.k) != jqt0.c && jqt0Var != jqt0.d) {
                    ol60Var.f(rqh0.f30931a);
                } else if (z4) {
                    k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                    we50 we50Var = we50.b;
                    zn00Var.getClass();
                    k0w0VarI.h(new PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00Var, we50Var));
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                } else if (kotlin.text.c.r(m2c0Var.Z, Separators.DOT, "", false).length() == 0) {
                    ol60Var.f(uqh0.f36119a);
                } else {
                    jqt0 jqt0Var2 = m2c0Var.k;
                    if (jqt0Var2 == jqt0.e || jqt0Var2 == jqt0.d || kotlin.text.c.r(m2c0Var.Z, Separators.DOT, "", false).length() <= 0) {
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var2, i1w0Var2);
                        we50 we50Var2 = we50.b;
                        zn00Var.getClass();
                        k0w0VarI2.h(new PasswordScreenFactoryImpl$getPasswordChangeFragment$1(zn00Var, we50Var2));
                        ListIterator listIteratorO3 = b1j.o(i1w0Var2, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO3;
                            if (pawVar3.hasNext()) {
                                i1w0Var2.a((oe50) pawVar3.next());
                            }
                        }
                    } else {
                        ol60Var.f(sqh0.f32630a);
                    }
                }
                return Unit.f46060a;
            case 3:
                qgd qgdVar = irh0Var.y;
                i1w0 i1w0Var3 = irh0Var.z;
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    rou rouVar3 = irh0Var.i;
                    this.j = true;
                    obj = rouVar3.a(true, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                m2c0 m2c0Var2 = (m2c0) obj;
                if (kotlin.text.c.r(m2c0Var2.Z, Separators.DOT, "", false).length() == 0) {
                    irh0Var.n.b();
                    i1w0Var3.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    SecurityNavigationScreen securityNavigationScreenG = qgdVar.g();
                    if (securityNavigationScreenG instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securityNavigationScreenG)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(securityNavigationScreenG)));
                    }
                    ListIterator listIteratorO4 = b1j.o(i1w0Var3, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO4;
                        if (pawVar4.hasNext()) {
                            i1w0Var3.a((oe50) pawVar4.next());
                        }
                    }
                } else {
                    jqt0 jqt0Var3 = m2c0Var2.k;
                    if (jqt0Var3 != jqt0.e && jqt0Var3 != jqt0.d) {
                        mi70 mi70Var2 = irh0Var.q;
                        xbi0 xbi0Var2 = new xbi0(m2c0Var2.Z, 1, false);
                        mi70Var2.getClass();
                        SecurityNavigationScreen sendConfirmationSMSScreen2 = new SendConfirmationSMSScreen(xbi0Var2);
                        i1w0Var3.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                        if (sendConfirmationSMSScreen2 instanceof DialogScreen) {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) sendConfirmationSMSScreen2)));
                        } else {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(sendConfirmationSMSScreen2)));
                        }
                        ListIterator listIteratorO5 = b1j.o(i1w0Var3, copyOnWriteArrayList2, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO5;
                            if (pawVar5.hasNext()) {
                                i1w0Var3.a((oe50) pawVar5.next());
                            }
                        }
                    } else if (m2c0Var2.c.length() > 0 && irh0Var.g.f3488a.a().g) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var3);
                        SecurityNavigationScreen securityNavigationScreenP = qgdVar.p();
                        if (securityNavigationScreenP instanceof DialogScreen) {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) securityNavigationScreenP)));
                        } else {
                            copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(securityNavigationScreenP)));
                        }
                        ListIterator listIteratorO6 = b1j.o(i1w0Var3, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar6 = (paw) listIteratorO6;
                            if (pawVar6.hasNext()) {
                                i1w0Var3.a((oe50) pawVar6.next());
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    jof0 jof0Var = irh0Var.f;
                    this.j = true;
                    obj = jof0Var.a(this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                irh0Var.I.f(new wqh0((String) obj));
                p7m0 p7m0Var = irh0Var.D;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            default:
                i1w0 i1w0Var4 = irh0Var.z;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    rou rouVar4 = irh0Var.i;
                    this.j = true;
                    obj = rouVar4.a(true, this);
                    if (obj == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((m2c0) obj).a0) {
                    i1w0Var4.d(new pqh0(irh0Var, b3));
                } else {
                    irh0Var.x.getClass();
                    FragmentScreen otpScreens$AddTwoFactoryAuthenticationScreen = new OtpScreens$AddTwoFactoryAuthenticationScreen();
                    i1w0Var4.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                    if (otpScreens$AddTwoFactoryAuthenticationScreen instanceof DialogScreen) {
                        copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) otpScreens$AddTwoFactoryAuthenticationScreen)));
                    } else {
                        copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(otpScreens$AddTwoFactoryAuthenticationScreen)));
                    }
                    ListIterator listIteratorO7 = b1j.o(i1w0Var4, copyOnWriteArrayList3, 0);
                    while (true) {
                        paw pawVar7 = (paw) listIteratorO7;
                        if (pawVar7.hasNext()) {
                            i1w0Var4.a((oe50) pawVar7.next());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
