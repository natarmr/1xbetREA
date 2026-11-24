package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class yp10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zp10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp10(zp10 zp10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zp10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zp10 zp10Var = this.k;
        switch (b) {
            case 0:
                yp10 yp10Var = new yp10(zp10Var, yjeVar, (byte) 0);
                yp10Var.j = obj;
                return yp10Var;
            default:
                yp10 yp10Var2 = new yp10(zp10Var, yjeVar, (byte) 1);
                yp10Var2.j = obj;
                return yp10Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yp10) create((kq10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yp10) create((gq10) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                zp10 zp10Var = this.k;
                a8z a8zVar = zp10Var.S1;
                kq10 kq10Var = (kq10) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (kq10Var != null) {
                    if (kq10Var instanceof hq10) {
                        htz htzVar = zp10.U1;
                        zp10Var.G0().b.setFirstButtonEnabled(false);
                        zp10Var.G0().d.setVisibility(8);
                        zp10Var.G0().e.setVisibility(8);
                        DSLottieEmptyContainer dSLottieEmptyContainer = zp10Var.G0().c;
                        jkm jkmVar = ((hq10) kq10Var).f13466a;
                        int i = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                        dSLottieEmptyContainer.setVisibility(0);
                    } else if (kq10Var instanceof iq10) {
                        htz htzVar2 = zp10.U1;
                        zp10Var.G0().d.setVisibility(0);
                        zp10Var.G0().c.setVisibility(8);
                    } else if (kq10Var instanceof jq10) {
                        htz htzVar3 = zp10.U1;
                        zp10Var.G0().d.setVisibility(8);
                        zp10Var.G0().c.setVisibility(8);
                        zp10Var.G0().e.setVisibility(0);
                        jq10 jq10Var = (jq10) kq10Var;
                        zp10Var.G0().b.setFirstButtonEnabled(jq10Var.b);
                        ((vp10) a8zVar.getValue()).A(jq10Var.f16928a);
                        if (jq10Var.c) {
                            ((vp10) a8zVar.getValue()).g();
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                gq10 gq10Var = (gq10) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (gq10Var != null) {
                    boolean z = gq10Var instanceof eq10;
                    zp10 zp10Var2 = this.k;
                    if (z) {
                        d7a d7aVar = ((eq10) gq10Var).f8213a;
                        htz htzVar4 = zp10.U1;
                        if (zp10Var2.N1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH = zp10Var2.H(R.string.mailing_management_title);
                        strH.getClass();
                        gl5.q(zp10Var2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                    } else if (gq10Var instanceof fq10) {
                        wdk0 wdk0Var = zp10Var2.P1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        fq10 fq10Var = (fq10) gq10Var;
                        wdk0.k(wdk0Var, new xdk0(fq10Var.b, fq10Var.f9954a, null, null, null, null, 124), zp10Var2, null, null, false, null, 1020);
                    } else if (gq10Var instanceof dq10) {
                        htz htzVar5 = zp10.U1;
                        ii iiVar = zp10Var2.O1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = zp10Var2.H(R.string.attention);
                        String strH3 = zp10Var2.H(R.string.close_the_activation_process_new);
                        String strH4 = zp10Var2.H(R.string.interrupt);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, zp10Var2.H(R.string.cancel), (String) null, "INTERRUPT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = zp10Var2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (gq10Var instanceof cq10) {
                        mi70 mi70Var = ox70.n2;
                        androidx.fragment.app.e eVarC2 = zp10Var2.C();
                        eVarC2.getClass();
                        jvp0 jvp0Var = jvp0.b;
                        mi70Var.getClass();
                        ox70 ox70Var = new ox70();
                        ox70Var.m2.u(ox70Var, ox70.o2[0], jvp0Var);
                        ox70Var.H0(eVarC2, "OpenTelegramBotBottomSheet");
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
