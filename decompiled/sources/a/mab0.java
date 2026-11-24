package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;
import org.xplatform.security.impl.presentation.otp_authenticator.OtpScreens$AddTwoFactoryAuthenticationScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class mab0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sbb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mab0(sbb0 sbb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sbb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sbb0 sbb0Var = this.k;
        switch (b) {
            case 0:
                return new mab0(sbb0Var, yjeVar, (byte) 0);
            case 1:
                return new mab0(sbb0Var, yjeVar, (byte) 1);
            case 2:
                return new mab0(sbb0Var, yjeVar, (byte) 2);
            case 3:
                return new mab0(sbb0Var, yjeVar, (byte) 3);
            case 4:
                return new mab0(sbb0Var, yjeVar, (byte) 4);
            case 5:
                return new mab0(sbb0Var, yjeVar, (byte) 5);
            case 6:
                return new mab0(sbb0Var, yjeVar, (byte) 6);
            case 7:
                return new mab0(sbb0Var, yjeVar, (byte) 7);
            default:
                return new mab0(sbb0Var, yjeVar, (byte) 8);
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((mab0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        sbb0 sbb0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sd60 sd60Var = sbb0Var.v;
                    this.j = true;
                    if (sd60Var.i("", this) == wneVar) {
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
                    rou rouVar = sbb0Var.h0;
                    this.j = true;
                    obj = rouVar.a(false, this);
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
                if (((m2c0) obj).t0) {
                    sbb0Var.H();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rf0 rf0Var = new rf0(new fnq(sbb0Var.k.a(), new ebb0(sbb0Var, yjeVar, (byte) 5), (byte) 4), (byte) 10);
                    o6b0 o6b0Var = new o6b0(sbb0Var, (byte) 13);
                    this.j = true;
                    if (rf0Var.c(o6b0Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                svs0 svs0Var = sbb0Var.g0;
                i1w0 i1w0Var = sbb0Var.h;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    rou rouVar2 = sbb0Var.h0;
                    this.j = true;
                    obj = rouVar2.a(true, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((m2c0) obj).a0) {
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    svs0Var.getClass();
                    k0w0Var.h(new TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1(true));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    svs0Var.getClass();
                    FragmentScreen otpScreens$AddTwoFactoryAuthenticationScreen = new OtpScreens$AddTwoFactoryAuthenticationScreen();
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (otpScreens$AddTwoFactoryAuthenticationScreen instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) otpScreens$AddTwoFactoryAuthenticationScreen)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(otpScreens$AddTwoFactoryAuthenticationScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((bad) ((cad) sbb0Var.D.f40284a).b).f2252a;
                    this.j = true;
                    obj = ntb.M(p7m0Var, this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (Intrinsics.d(obj, Boolean.TRUE)) {
                    sbb0Var.E0.f(iab0.f14430a);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    if (((r9b0) sbb0Var.B0.getValue()).c == s9b0.AGGREGATOR) {
                        ytt yttVar = sbb0Var.l0;
                        aue0 aue0Var = aue0.d;
                        this.j = true;
                        if (yttVar.a(aue0Var, this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var2 = sbb0Var.h;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var2);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var2, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar3 = (paw) listIterator;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar3.next());
                }
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    sd60 sd60Var2 = sbb0Var.v;
                    this.j = true;
                    if (sd60Var2.i("", this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (((r9b0) sbb0Var.B0.getValue()).c == s9b0.AGGREGATOR) {
                        ytt yttVar2 = sbb0Var.l0;
                        aue0 aue0Var2 = aue0.d;
                        this.j = true;
                        if (yttVar2.a(aue0Var2, this) == wneVar8) {
                            return wneVar8;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var3 = sbb0Var.h;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var3);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0Var3, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar4 = (paw) listIterator2;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar4.next());
                }
                break;
            default:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    rou rouVar3 = sbb0Var.h0;
                    this.j = true;
                    obj = rouVar3.a(false, this);
                    if (obj == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((m2c0) obj).t0) {
                    sbb0Var.H();
                }
                return Unit.f46060a;
        }
    }
}
